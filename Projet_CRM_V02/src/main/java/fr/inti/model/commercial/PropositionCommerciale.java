package fr.inti.model.commercial;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.inti.model.produit.PropalProduit;

/**
 * 
 * @author Saï
 *
 */
@Entity
@Table(name="propCommerciales")
public class PropositionCommerciale implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ATTRIBUTS
	 */
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPropal;
	
	private Date date;
	private Date dateLivraison;
	private String conditionsLivraison;
	private String modalitePaiement;
	private int dureeValidite;
	private String statut;
	
	@OneToMany(mappedBy="propCom")
	private List<PropalProduit> propalProduits;
	
	@ManyToOne
	@JoinColumn(name="equipeCom", referencedColumnName="idEquipe")
	private EquipeCom equipeCom;

	
	/**
	 * GET&SET
	 */
	public Long getIdPropal() {
		return idPropal;
	}

	public void setIdPropal(Long idPropal) {
		this.idPropal = idPropal;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDateLivraison() {
		return dateLivraison;
	}

	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}

	public String getConditionsLivraison() {
		return conditionsLivraison;
	}

	public void setConditionsLivraison(String conditionsLivraison) {
		this.conditionsLivraison = conditionsLivraison;
	}

	public String getModalitePaiement() {
		return modalitePaiement;
	}

	public void setModalitePaiement(String modalitePaiement) {
		this.modalitePaiement = modalitePaiement;
	}

	public int getDureeValidite() {
		return dureeValidite;
	}

	public void setDureeValidite(int dureeValidite) {
		this.dureeValidite = dureeValidite;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}
	

	public List<PropalProduit> getPropalProduits() {
		return propalProduits;
	}

	public void setPropalProduits(List<PropalProduit> propalProduits) {
		this.propalProduits = propalProduits;
	}

	public EquipeCom getEqCom() {
		return equipeCom;
	}

	public void setEqCom(EquipeCom eqCom) {
		this.equipeCom = eqCom;
	}
	/**
	 * CONSTRUCTEURS
	 */
	public PropositionCommerciale() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PropositionCommerciale(Long idPropal, Date date, Date dateLivraison,
			String conditionsLivraison, String modalitePaiement,
			int dureeValidite, String statut,
			List<PropalProduit> propalProduits, EquipeCom eqCom) {
		super();
		this.idPropal = idPropal;
		this.date = date;
		this.dateLivraison = dateLivraison;
		this.conditionsLivraison = conditionsLivraison;
		this.modalitePaiement = modalitePaiement;
		this.dureeValidite = dureeValidite;
		this.statut = statut;
		this.propalProduits = propalProduits;
		this.equipeCom = eqCom;
	}

	public PropositionCommerciale(Date date, Date dateLivraison,
			String conditionsLivraison, String modalitePaiement,
			int dureeValidite, String statut) {
		super();
		this.date = date;
		this.dateLivraison = dateLivraison;
		this.conditionsLivraison = conditionsLivraison;
		this.modalitePaiement = modalitePaiement;
		this.dureeValidite = dureeValidite;
		this.statut = statut;
	}




}
