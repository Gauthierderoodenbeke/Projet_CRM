package fr.inti.model.commande;

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

import fr.inti.model.client.Client;

/**
 * 
 * @author Emilie
 *
 */
@Entity
@Table(name="commandes")
public class Commande implements Serializable {

	/**
	 * SERAILIZABLE
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * ATTRIBUTS
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCommande;
	private Date dateCommande;
	private Date dateLivraison;
	private String conditionsLivraison;
	private String modalitePaiement;
	private int dureeValidite;
	private String statut;
	private Date dateReception;
	
	@ManyToOne
	@JoinColumn(name="client",referencedColumnName="idClient")
	private Client client;
	
	@OneToMany(mappedBy="commande")
	private List<CommandeProduit> produits;
	@OneToMany(mappedBy="commande")
	private List<Facture> factures;

	/**
	 * CONSTRUCTEURS
	 */
	//constructeur sans arg
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}

	//constructeur avec arg (all)
	public Commande(Long numCommande, Date dateCommande, Date dateLivraison,
			String conditionsLivraison, String modalitePaiement,
			int dureeValidite, String statut, Date dateReception,
			List<CommandeProduit> produits) {
		super();
		this.idCommande = numCommande;
		this.dateCommande = dateCommande;
		this.dateLivraison = dateLivraison;
		this.conditionsLivraison = conditionsLivraison;
		this.modalitePaiement = modalitePaiement;
		this.dureeValidite = dureeValidite;
		this.statut = statut;
		this.dateReception = dateReception;
		this.produits = produits;
	}

	//constructeur avec arg (sans id, sans liste produits)
	public Commande(Date dateCommande, Date dateLivraison,
			String conditionsLivraison, String modalitePaiement,
			int dureeValidite, String statut, Date dateReception) {
		super();
		this.dateCommande = dateCommande;
		this.dateLivraison = dateLivraison;
		this.conditionsLivraison = conditionsLivraison;
		this.modalitePaiement = modalitePaiement;
		this.dureeValidite = dureeValidite;
		this.statut = statut;
		this.dateReception = dateReception;
	}
	//constructeur avec arg (sans id)
	public Commande(Date dateCommande, Date dateLivraison,
			String conditionsLivraison, String modalitePaiement,
			int dureeValidite, String statut, Date dateReception,
			List<CommandeProduit> produits, List<Facture> factures) {
		super();
		this.dateCommande = dateCommande;
		this.dateLivraison = dateLivraison;
		this.conditionsLivraison = conditionsLivraison;
		this.modalitePaiement = modalitePaiement;
		this.dureeValidite = dureeValidite;
		this.statut = statut;
		this.dateReception = dateReception;
		this.produits = produits;
		this.factures = factures;
	}

	
	/**
	 * TO STRING
	 */
	//toString
	@Override
	public String toString() {
		return "Commande [numCommande=" + idCommande + ", dateCommande="
				+ dateCommande + ", dateLivraison=" + dateLivraison
				+ ", conditionsLivraison=" + conditionsLivraison
				+ ", modalitePaiement=" + modalitePaiement + ", dureeValidite="
				+ dureeValidite + ", statut=" + statut + ", dateReception="
				+ dateReception + "]";
	}

	
	/**
	 * GET&SET
	 */
	public Long getNumCommande() {
		return idCommande;
	}
	public void setNumCommande(Long numCommande) {
		this.idCommande = numCommande;
	}
	public Date getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
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
	public Date getDateReception() {
		return dateReception;
	}
	public void setDateReception(Date dateReception) {
		this.dateReception = dateReception;
	}
	public List<CommandeProduit> getProduits() {
		return produits;
	}
	public void setProduits(List<CommandeProduit> produits) {
		this.produits = produits;
	}
	public List<Facture> getFactures() {
		return factures;
	}
	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}
	
	
	
	
}
