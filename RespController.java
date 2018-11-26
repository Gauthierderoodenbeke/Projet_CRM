package fr.inti.controller;

import java.io.File;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import fr.inti.model.campagne.CampagneOccasionnel;
import fr.inti.model.campagne.CampagneReg;
import fr.inti.model.campagne.Questionnaire;
import fr.inti.model.commercial.Commercial;
import fr.inti.model.commercial.RespCommercial;
import fr.inti.model.produit.Composition;
import fr.inti.model.produit.Produit;
import fr.inti.service.campagne.ICampagneService;
import fr.inti.service.commande.ICommandeProduitService;
import fr.inti.service.commercial.ICommercialService;
import fr.inti.service.commercial.IEquipeCampagneService;
import fr.inti.service.commercial.IEquipeComService;
import fr.inti.service.commercial.IPropositionCommercialeService;
import fr.inti.service.produit.ICompositionService;
import fr.inti.service.produit.IFicheClientProduitService;
import fr.inti.service.produit.IFicheClientService;
import fr.inti.service.produit.IHistoTarificationService;
import fr.inti.service.produit.IInteretService;
import fr.inti.service.produit.IProduitService;
import fr.inti.service.produit.IPropalProduitService;
import fr.inti.xml.ProduitsL;

@Controller
@RequestMapping(value = { "/resp", "/{locale:en|fr}/resp" })
public class RespController {

	private Commercial respCurrent = new RespCommercial();
	@Autowired
	private ICommercialService serviceCommer;
	@Autowired
	private IProduitService serviceProd;
	@Autowired
	private IInteretService serviceInt;
	@Autowired
	private IHistoTarificationService serviceHisto;
	@Autowired
	private IPropalProduitService servicePropalP;
	@Autowired
	private ICommandeProduitService serviceCommandeP;
	@Autowired
	private IFicheClientProduitService serviceFicheClientProd;
	@Autowired
	private ICampagneService serviceCampagne;
	@Autowired
	private ICompositionService serviceComp;
	@Autowired
	private IEquipeComService equipeComServ;
	@Autowired
	private IFicheClientService ficheClientServ;
	@Autowired
	private IPropositionCommercialeService propComServ;
	@Autowired
	private IEquipeCampagneService serviceEquipe;


	/**
	 * 
	 * PAGE D ACCUEIL DU RESPONSABLE recuperation du responsable courant
	 * 
	 */
	@RequestMapping(value = { "/accueil", "/{locale:en|fr}/accueil" })
	public String accueilRespo(ModelMap model, HttpSession maSession) {
		System.out.println("\n\n\n dans accueil respo :"+maSession.getAttribute("comCurrent"));
		respCurrent = (RespCommercial) maSession.getAttribute("comCurrent");
		System.out.println(respCurrent);
		model.addAttribute("resp", respCurrent);
		return "accueilResponsable";
	}

	/**
	 * 
	 * PAGE CAMPAGNES
	 * 
	 */
	@RequestMapping(value={"/campagnes","/{locale:en|fr}/campagnes"})
	public String pageCampagnes(ModelMap model){
	model.addAttribute("campagne", new CampagneOccasionnel());
	model.addAttribute("listeCampagnes", serviceCampagne.findAll());
	model.addAttribute("listeEquipes", serviceEquipe.findAll());
		return "campagnes";
	}
	
	@RequestMapping(value={"/campagnesRecherche","/{locale:en|fr}/campagnesRecherche"})
	public String pageCampagnesRecherche(ModelMap model, CampagneOccasionnel c){
	model.addAttribute("campagne", new CampagneOccasionnel());
	model.addAttribute("listeCampagnes", serviceCampagne.findByGenre(c.getType()));
	model.addAttribute("listeEquipes", serviceEquipe.findAll());
		return "campagnes";
	}
	
	@RequestMapping(value={"/campagnesRechercheEquipe","/{locale:en|fr}/campagnesRechercheEquipe"})
	public String pageCampagnesRechercheEquipe(ModelMap model, CampagneOccasionnel c){
	model.addAttribute("campagne", new CampagneOccasionnel());
	model.addAttribute("listeCampagnes", serviceCampagne.findByEquipe(serviceEquipe.findById(c.getEquipeCampagne().getIdEquipeCmp())));
	model.addAttribute("listeEquipes", serviceEquipe.findAll());
		return "campagnes";
	}
	
//	@RequestMapping(value={"/campagnesCreerCamp","/{locale:en|fr}/campagnesCreerQuest"})
//	public String pageCampagnesCreerCamp(ModelMap model){
//	Questionnaire quest = new Questionnaire();
//	model.addAttribute("questionnaire", quest);
//	
//	if (quest.getType().equalsIgnoreCase("questionnaire")) {
//		serviceCamp.ajouterCampagne(quest);
//		return "newQuest";	
//	} 
//	else if (quest.getType().equalsIgnoreCase("occasionnelle")) {
//		serviceCamp.ajouterCampagne(quest);
//		return "newOccas";
//	}
//	else {
//		serviceCamp.ajouterCampagne(quest);
//		return "newReg";
//	}
//	}
	///////////////////////////////////////////////////QUESTIONNAIRE
	@RequestMapping(value={"/campagnesCreerQuest","/{locale:en|fr}/campagnesCreerQuest"})
	public String pageCampagnesCreerQuest(ModelMap model, Questionnaire q){
		q.setType("questionnaire");
		model.addAttribute("questionnaire", new Questionnaire());
		model.addAttribute("listeEquipes", serviceEquipe.findAll());
		model.addAttribute("listeProduits", serviceProd.findAll());
	
	serviceCampagne.ajouterCampagne(q);
		return "newQuest";
	}
	
	@RequestMapping(value={"/questCreer","/{locale:en|fr}/campagnesCreerQuest"})
	public String pageQuestCreer(ModelMap model, Questionnaire quest){
		
		quest.setEquipeCampagne(serviceEquipe.findById(quest.getEquipeCampagne().getIdEquipeCmp()));
		quest.setProduit(serviceProd.findById(quest.getProduit().getIdProduit()));
		quest.setType("occasionnelle");
		model.addAttribute("campagne", new CampagneOccasionnel());
		model.addAttribute("listeCampagnes", serviceCampagne.findAll());
		model.addAttribute("listeEquipes", serviceEquipe.findAll());
		serviceCampagne.ajouterCampagne(quest);
		
		return "campagnes";
	}
	
///////////////////////////////////////////////////OCCASIONNELLE
	@RequestMapping(value={"/campagnesCreerOccas","/{locale:en|fr}/campagnesCreerOccas"})
	public String pageCampagnesCreerOccas(ModelMap model){
	CampagneOccasionnel occas = new CampagneOccasionnel();
	model.addAttribute("occasionnelle", occas);
	model.addAttribute("listeEquipes", serviceEquipe.findAll());
	model.addAttribute("listeProduits", serviceProd.findAll());
		return "newOccas";
	}
	
	@RequestMapping(value={"/occasionnelleCreer","/{locale:en|fr}/campagnesCreerReg"})
	public String pageOccasionnelleCreer(ModelMap model, CampagneOccasionnel occas){
		
		occas.setEquipeCampagne(serviceEquipe.findById(occas.getEquipeCampagne().getIdEquipeCmp()));
		occas.setProduit(serviceProd.findById(occas.getProduit().getIdProduit()));
		occas.setType("occasionnelle");
		model.addAttribute("campagne", new CampagneOccasionnel());
		model.addAttribute("listeCampagnes", serviceCampagne.findAll());
		model.addAttribute("listeEquipes", serviceEquipe.findAll());
		serviceCampagne.ajouterCampagne(occas);
		
		return "campagnes";
	}
///////////////////////////////////////////////////REGULIERE
	@RequestMapping(value={"/campagnesCreerReg","/{locale:en|fr}/campagnesCreerReg"})
	public String pageCampagnesCreerReg(ModelMap model){
		CampagneReg reg = new CampagneReg();
		model.addAttribute("reguliere", reg);
		model.addAttribute("listeEquipes", serviceEquipe.findAll());
		model.addAttribute("listeProduits", serviceProd.findAll());
		return "newReg";
	}
	
	@RequestMapping(value={"/reguliereCreer","/{locale:en|fr}/campagnesCreerReg"})
	public String pageReguliereCreer(ModelMap model, CampagneReg reg){
		
		reg.setProduit(serviceProd.findById(reg.getProduit().getIdProduit()));
		reg.setEquipeCampagne(serviceEquipe.findById(reg.getEquipeCampagne().getIdEquipeCmp()));
		reg.setType("reguliere");
		model.addAttribute("campagne", new CampagneOccasionnel());
		model.addAttribute("listeCampagnes", serviceCampagne.findAll());
		model.addAttribute("listeEquipes", serviceEquipe.findAll());
		serviceCampagne.ajouterCampagne(reg);
		
		return "campagnes";
	}

	/**
	 * 
	 * PAGE CLIENTS
	 * 
	 */
	@RequestMapping(value = { "/clients", "/{locale:en|fr}/clients" })
	public String pageClients(ModelMap model) {
		return "clients";
	}



	/**
	 * 
	 * PAGE INFO PERSO
	 * 
	 */
	// Arrive sur la page
	@RequestMapping(value = { "/infoP", "/{locale:en|fr}/infoP" })
	public String infosPerso(ModelMap model) {
		model.addAttribute("resp", respCurrent);
		model.addAttribute("respMDP", new Commercial());
		return "infoP";
	}

	// Modification du mot de passe perso
	@RequestMapping(value = { "/modifierMdp", "/{locale:en|fr}/modifierMdp" })
	public String modifierMotDePasse(ModelMap model,
			@ModelAttribute("respMDP") Commercial mdp) {
		respCurrent.setPassword(mdp.getPassword());
		serviceCommer.update(respCurrent);
		model.addAttribute("resp", respCurrent);
		model.addAttribute("respMDP", new Commercial());
		return "infoP";
	}

	/**
	 * 
	 * PAGE PRODUITS
	 * 
	 */

	// Arrive sur la page
	@RequestMapping(value = { "/produits", "/{locale:en|fr}/produits" })
	public String produits(ModelMap model) {

		model.addAttribute("produit", new Produit());
		model.addAttribute("produits", serviceProd.findAll());
		return "produits";
	}

	/////////////////////////////////////////////////RECHERCHE
	// recherche de produits par Libelle
	@RequestMapping("/rechercheLibelle")
	public String produitLibelle(Model model, Produit p) {

		String libelle = p.getLibelle();
		model.addAttribute("produit", new Produit());
		model.addAttribute("produits", serviceProd.findByLibelle(libelle));
		return "produits";
	}

	// recherche de produits par Fournisseur
	@RequestMapping("/rechercheFournisseur")
	public String produitFournisseur(Model model, Produit p) {

		String fournisseur = p.getFournisseur();
		model.addAttribute("produit", new Produit());
		model.addAttribute("produits",
				serviceProd.findByFournisseur(fournisseur));
		return "produits";
	}

	// recherche de produits par marque
	@RequestMapping("/rechercheMarque")
	public String produitMarque(Model model, Produit p) {

		String marque = p.getMarque();
		model.addAttribute("produit", new Produit());
		model.addAttribute("produits", serviceProd.findByMarque(marque));
		return "produits";
	}
	
	/////////////////////////////////////////////////////Suppr
	// supprimer produit
	@RequestMapping(value = { "/suppProd", "/{locale:en|fr}/suppProd" })
	public String suppProd(@RequestParam("idProd") Long idProd, Model model) {

		serviceProd.deleteById(idProd);
		model.addAttribute("produit", new Produit());
		model.addAttribute("produits", serviceProd.findAll());
		return "produits";
	}
	
	/////////////////////////////////////////////////////XML
	//Export en xml de la liste des produits
	@RequestMapping(value = { "/impressionProduits", "/{locale:en|fr}/impressionProduits" })
	public String exportXML(Model model) {
		ProduitsL ps = new ProduitsL(serviceProd.findAll());

		try {
			File file = new File("C:\\Users\\inti\\Desktop\\exportProduit.xml");
			JAXBContext jax = JAXBContext.newInstance(ProduitsL.class);
			Marshaller mrl = jax.createMarshaller();
			mrl.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			mrl.marshal(ps, file);
			mrl.marshal(ps, System.out);
			model.addAttribute("produit", new Produit());
			model.addAttribute("produits", serviceProd.findAll());
			return "exportReussi";
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		model.addAttribute("produit", new Produit());
		model.addAttribute("produits", serviceProd.findAll());
		return "produit";
	}
	
	

	/**
	 * 
	 * PAGE SAVEPRODUITS
	 * 
	 */

	// Arrive sur la page
	@RequestMapping(value = { "/saveproduits", "/{locale:en|fr}/saveproduits" })
	public String saveproduits(ModelMap model) {
		model.addAttribute("resp", respCurrent);
		model.addAttribute("respMDP", new Commercial());
		model.addAttribute("produit", new Produit());
		model.addAttribute("composants", new Composition());
		model.addAttribute("composes", new Composition());
		return "saveproduits";
	}

	// enregistrer produit
	@RequestMapping(value = { "/saveProd", "/{locale:en|fr}/saveProd" })
	public String saveProd(@Valid Produit p, BindingResult bindingResult,
			Model model, MultipartFile file) throws Exception {

		if (bindingResult.hasErrors()) {
			model.addAttribute("respMDP", new Commercial());
			model.addAttribute("resp", respCurrent);
			model.addAttribute("respMDP", new Commercial());
			model.addAttribute("produits", serviceProd.findAll());
			return "saveproduits";
		}
		if (p.getIdProduit() == null) {

			model.addAttribute("produit", new Produit());
			model.addAttribute("produits", serviceProd.findAll());
			serviceProd.ajouterProduit(p);
		} else
			serviceProd.update(p);
		;
		model.addAttribute("respMDP", new Commercial());
		model.addAttribute("resp", respCurrent);
		model.addAttribute("respMDP", new Commercial());
		model.addAttribute("produit", new Produit());
		model.addAttribute("produits", serviceProd.findAll());
		model.addAttribute("composants", serviceComp.findAll());
		model.addAttribute("composes", serviceComp.findAll());
		return "saveproduits";
	}

	/**
	 * 
	 * PAGE EDITPRODUITS
	 * 
	 */

	// Arrive sur la page
	@RequestMapping(value = { "/editproduits", "/{locale:en|fr}/editproduits" })
	public String editproduits(ModelMap model) {

		model.addAttribute("resp", respCurrent);
		model.addAttribute("respMDP", new Commercial());
		model.addAttribute("produit", new Produit());
		model.addAttribute("composants", new Composition());
		model.addAttribute("composes", new Composition());
		return "editproduits";
	}

	// edit produit
	@RequestMapping(value = { "/editProd", "/{locale:en|fr}/editProd" })
	public String editProd(Produit p, Model model) {

		model.addAttribute("respMDP", new Commercial());
		model.addAttribute("resp", respCurrent);
		model.addAttribute("editedProd", p);
		model.addAttribute("produit", p);
		model.addAttribute("produits", serviceProd.findAll());

		return "produits";
	}
	
	/**
	 * 
	 * Emilie  --- PAGE EqCom
	 * 
	 */
		//Arrive sur la page
		@RequestMapping(value={"/equipesResp","/{locale:en|fr}/equipesResp"})
		public String equipesCom(ModelMap model){
			model.addAttribute("resp", respCurrent);
//			model.addAttribute("commerciaux",new Commercial());
			model.addAttribute("commerciaux",serviceCommer.findAll());
//			model.addAttribute("propCom",propComServ.findAll());
			model.addAttribute("ficheClient",ficheClientServ.findAll());
			return "equipesResp";
		} 
//		//Ajout d'un commerciale
//		@RequestMapping(value={"/saveCom","/{locale:en|fr}/saveCom"})
//		public String saveCom(ModelMap model, Commercial c){
//			model.addAttribute("resp", respCurrent);
			//serviceCommer.ajouterCommercial(c);
//			model.addAttribute("commercial",new Commercial());
//			model.addAttribute("commerciaux",serviceCommer.findAll());
//			model.addAttribute("ficheClient",ficheClientServ.findAll());
//			return "equipesResp";
//		} 
		
		//Ajout d'une ficheClient
//		@RequestMapping(value={"/saveFicheClient","/{locale:en|fr}/saveFicheClient"})
//		public String saveFicheClient(ModelMap model, FicheClient fc){
//			model.addAttribute("resp", respCurrent);
//			ficheClientServ.ajouterFicheClient(fc);;
//			model.addAttribute("fc",new FicheClient());
//			model.addAttribute("ficheClient",ficheClientServ.findAll());
//			model.addAttribute("commerciaux",serviceCommer.findAll());
//			return "equipesResp";
//		} 
	
}
