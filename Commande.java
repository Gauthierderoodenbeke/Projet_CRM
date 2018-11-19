package fr.inti.model.commande;

import java.util.List;
import java.util.Date;

public class Commande {
	
	/**
	 * Emilie
	 */
	
	private int numCommande;
	private Date dateCommande;
	private Date dateLivraison;
	private String conditionsLivraison;
	private String modalitePaiement;
	private int dureeValidite;
	private String statut;
	private Date dateReception;
	
	private List<Produit> produits;
	private List<Facture> factures;

	//constructeur sans arg
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}

	//constructeur avec arg (all)
	public Commande(int numCommande, Date dateCommande, Date dateLivraison,
			String conditionsLivraison, String modalitePaiement,
			int dureeValidite, String statut, Date dateReception,
			List<Produit> produits) {
		super();
		this.numCommande = numCommande;
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
			List<Produit> produits, List<Facture> factures) {
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

	
	
	//toString
	@Override
	public String toString() {
		return "Commande [numCommande=" + numCommande + ", dateCommande="
				+ dateCommande + ", dateLivraison=" + dateLivraison
				+ ", conditionsLivraison=" + conditionsLivraison
				+ ", modalitePaiement=" + modalitePaiement + ", dureeValidite="
				+ dureeValidite + ", statut=" + statut + ", dateReception="
				+ dateReception + "]";
	}

   //getters and setters
	public int getNumCommande() {
		return numCommande;
	}


	public void setNumCommande(int numCommande) {
		this.numCommande = numCommande;
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


	public List<Produit> getProduits() {
		return produits;
	}


	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	public List<Facture> getFactures() {
		return factures;
	}

	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}
	
	
	
	

}
