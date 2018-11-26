package fr.inti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.inti.model.client.Entreprise;
import fr.inti.model.client.Particulier;
import fr.inti.model.commercial.Commercial;
import fr.inti.service.client.IClientService;
import fr.inti.service.client.IEntrepriseServiceImpl;
import fr.inti.service.client.IParticulierService;
import fr.inti.service.commercial.ICommercialService;
import fr.inti.service.commercial.IPropositionCommercialeService;
import fr.inti.service.produit.IFicheClientService;

@Controller
@RequestMapping(value = { "/com", "/{locale:en|fr}/com" })
@SessionAttributes("comCurrent")
public class ComController {

	private Commercial comCurrent = new Commercial();
	@Autowired
	private ICommercialService serviceCommer;
	@Autowired
	private IFicheClientService ficheClientServ;
	@Autowired
	private IPropositionCommercialeService propComServ;
	@Autowired
	private IEntrepriseServiceImpl serviceEntr;
	@Autowired
	private IParticulierService servicePart;
	@Autowired
	private IClientService serviceClient;

	/**
	 * 
	 * PAGE D ACCUEIL DU Commercial recuperation du commercial courant
	 * 
	 */
	@RequestMapping("/accueil")
	public String accueilCom(ModelMap model,
			@SessionAttribute("comCurrent") Commercial comm) {
		comCurrent = comm;
		System.out.println("\n\n\nle resp : " + comCurrent);
		model.addAttribute("com", comCurrent);
		return "accueilCommerciaux";
	}

	/**
	 * 
	 * PAGE INFO PERSO
	 * 
	 */
	// Arrive sur la page
	@RequestMapping(value = { "/infoP", "/{locale:en|fr}/infoP" })
	public String infosPerso(ModelMap model) {
		model.addAttribute("resp", comCurrent);
		model.addAttribute("respMDP", new Commercial());
		return "infoP";
	}

	// Modification du mot de passe perso
	@RequestMapping(value = { "/modifierMdp", "/{locale:en|fr}/modifierMdp" })
	public String modifierMotDePasse(ModelMap model,
			@ModelAttribute("respMDP") Commercial mdp) {
		comCurrent.setPassword(mdp.getPassword());
		serviceCommer.update(comCurrent);
		model.addAttribute("resp", comCurrent);
		model.addAttribute("respMDP", new Commercial());
		return "infoP";
	}

	/**
	 * 
	 * Emilie --- PAGE EqCom
	 * 
	 */
	// Arrive sur la page
	@RequestMapping(value = { "/equipesCom", "/{locale:en|fr}/equipesCom" })
	public String equipesCom(ModelMap model) {
		model.addAttribute("com", comCurrent);
		model.addAttribute("commerciaux", new Commercial());
		model.addAttribute("commerciaux", serviceCommer.findAll());
		// model.addAttribute("propCom",propComServ.findAll());
		model.addAttribute("ficheClient", ficheClientServ.findAll());
		return "equipesCom";
	}

	/**
	 * 
	 * SIMON --- PAGE Clients
	 * 
	 */
	// Arrive sur la page de la liste/ajout de clients
	@RequestMapping(value = { "/listeC", "/{locale:en|fr}/listeC" })
	public String infosClient(ModelMap model) {

		Entreprise entr0 = new Entreprise();
		entr0.setFamilleClient("entreprise");
		model.addAttribute("client", entr0);
		System.out.println(entr0.getIdClient());
		model.addAttribute("listEntr",
				serviceClient.findByFamille("entreprise"));
		model.addAttribute("listPart",
				serviceClient.findByFamille("particulier"));
		model.addAttribute("listCli", serviceClient.findAll());
		return "clientsCom";
	}

	@RequestMapping(value = { "/choixp", "/{locale:en|fr}/choixp" })
	public String choixPart(ModelMap model) {
		Particulier part = new Particulier();
		part.setFamilleClient("particulier");
		model.addAttribute("client", part);
		model.addAttribute("listEntr",
				serviceClient.findByFamille("entreprise"));
		model.addAttribute("listPart",
				serviceClient.findByFamille("particulier"));
		model.addAttribute("listCli", serviceClient.findAll());
		return "clientsCom";
	}

	@RequestMapping(value = { "/choixe", "/{locale:en|fr}/choixe" })
	public String choixEnt(ModelMap model) {
		Entreprise ent = new Entreprise();
		ent.setFamilleClient("entreprise");
		model.addAttribute("client", ent);
		model.addAttribute("listEntr",
				serviceClient.findByFamille("entreprise"));
		model.addAttribute("listPart",
				serviceClient.findByFamille("particulier"));
		model.addAttribute("listCli", serviceClient.findAll());
		return "clientsCom";
	}

	// ///////////////////////////////////////////////////Suppr
	// supprimer Client
	@RequestMapping(value = { "/suppClient", "/{locale:en|fr}/suppClient" })
	public String suppProd(@RequestParam("idClient") Long idClient, Model model) {

		serviceClient.supprimerClient(idClient);
		Entreprise ent = new Entreprise();
		ent.setFamilleClient("entreprise");
		model.addAttribute("client", ent);
		model.addAttribute("listEntr",
				serviceClient.findByFamille("entreprise"));
		model.addAttribute("listPart",
				serviceClient.findByFamille("particulier"));
		model.addAttribute("listCli", serviceClient.findAll());
		return "clientsCom";
	}
	
	// ///////////////////////////////////////////////////Ajout
	// Ajouter Client
	@RequestMapping(value = { "/saveEntreprise", "/{locale:en|fr}/saveClient" })
	public String saveClient(ModelMap model, @ModelAttribute("client") Entreprise cl) {
		cl.setFamilleClient("entreprise");
		serviceClient.ajouterClient(cl);
		
		Entreprise ent = new Entreprise();
		ent.setFamilleClient("entreprise");
		model.addAttribute("client", ent);
		model.addAttribute("listEntr",
				serviceClient.findByFamille("entreprise"));
		model.addAttribute("listPart",
				serviceClient.findByFamille("particulier"));
		model.addAttribute("listCli", serviceClient.findAll());
		return "clientsCom";
	}
	@RequestMapping(value = { "/saveParticulier", "/{locale:en|fr}/saveParticulier" })
	public String saveClient(ModelMap model, @ModelAttribute("client") Particulier cl) {
		cl.setFamilleClient("particulier");
		serviceClient.ajouterClient(cl);
		
		Entreprise ent = new Entreprise();
		ent.setFamilleClient("entreprise");
		model.addAttribute("client", ent);
		model.addAttribute("listEntr",
				serviceClient.findByFamille("entreprise"));
		model.addAttribute("listPart",
				serviceClient.findByFamille("particulier"));
		model.addAttribute("listCli", serviceClient.findAll());
		return "clientsCom";
	}
	
	// ///////////////////////////////////////////////////Edit
	// retour avec valeur du Client
	@RequestMapping(value = { "/editionEnt", "/{locale:en|fr}/editionEnt" })
	public String editionEnt(ModelMap model,@RequestParam("idClient") Long idClient) {
		Entreprise cl = (Entreprise) serviceClient.findById(idClient);
		System.out.println("\n\n\n\n\n"+cl);
		model.addAttribute("client", cl);
		model.addAttribute("listEntr",
				serviceClient.findByFamille("entreprise"));
		model.addAttribute("listPart",
				serviceClient.findByFamille("particulier"));
		model.addAttribute("listCli", serviceClient.findAll());
		System.out.println("\fin editionCl");
		return "clientsCom";
	}
	@RequestMapping(value = { "/editionPart", "/{locale:en|fr}/editionPart" })
	public String editionPart(ModelMap model,@RequestParam("idClient") Long idClient) {
		Particulier cl =  (Particulier) serviceClient.findById(idClient);
		System.out.println("\n\n\n\n\n"+cl);
		model.addAttribute("client", cl);
		model.addAttribute("listEntr",
				serviceClient.findByFamille("entreprise"));
		model.addAttribute("listPart",
				serviceClient.findByFamille("particulier"));
		model.addAttribute("listCli", serviceClient.findAll());
		System.out.println("\fin editionCl"+cl.getIdClient());
		return "clientsCom";
	}
	@RequestMapping(value = { "/editEnt", "/{locale:en|fr}/editEnt" })
	public String editEnt(ModelMap model,  Entreprise client) {
		client.setFamilleClient("entreprise");
		System.out.println("dans editEnt");
		serviceClient.update(client);
		Entreprise cl1 = new Entreprise();
		cl1.setFamilleClient("entreprise");
		model.addAttribute("client", cl1);
		model.addAttribute("listEntr",
				serviceClient.findByFamille("entreprise"));
		model.addAttribute("listPart",
				serviceClient.findByFamille("particulier"));
		model.addAttribute("listCli", serviceClient.findAll());
		return "clientsCom";
	}
	@RequestMapping(value = { "/editPart", "/{locale:en|fr}/editPart" })
	public String editPart(ModelMap model, @ModelAttribute("client") Particulier client) {
		client.setFamilleClient("particulier");
		System.out.println("dans editPArt" + client+client.getIdClient());
		System.out.println(serviceClient.findById(client.getIdClient()));
		serviceClient.update(client);
		Entreprise cl1 = new Entreprise();
		cl1.setFamilleClient("entreprise");
		model.addAttribute("client", cl1);
		model.addAttribute("listEntr",
				serviceClient.findByFamille("entreprise"));
		model.addAttribute("listPart",
				serviceClient.findByFamille("particulier"));
		model.addAttribute("listCli", serviceClient.findAll());
		return "clientsCom";
	}

}
