package fr.inti.model.produit;

import java.util.List;

import fr.inti.model.campagne.Campagne;
import fr.inti.model.client.Client;
import fr.inti.model.client.FicheClient;
import fr.inti.model.commande.Commande;
import fr.inti.model.commercial.PropositionCommerciale;

/***
 * 
 * @author Gauthier
 *
 */

public class Produit {
	
	private int idProduit;
	private String libelle;
	private String type;
	private String uniteMesure; // à changer en Enumeration si possible
	private double tauxTVA;
	private String fournisseur;
	private String marque;
	private String modele;
	private int quantiteStock;
	private List<Client> clients;
	private List<HistoTarification> histos;
	private List<PropositionCommerciale> propsCommerciales;
	private List<Commande> commandes;
	private List<FicheClient> fiches;
	private List<Campagne> campagnes;
	private List<Produit> composition;
	
	/**
	 * CTORS
	 */
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Produit(String libelle, String type, String uniteMesure,
			double tauxTVA, String fournisseur, String marque, String modele,
			int quantiteStock, List<Client> clients,
			List<HistoTarification> histos,
			List<PropositionCommerciale> propsCommerciales,
			List<Commande> commandes, List<FicheClient> fiches,
			List<Campagne> campagnes, List<Produit> composition) {
		super();
		this.libelle = libelle;
		this.type = type;
		this.uniteMesure = uniteMesure;
		this.tauxTVA = tauxTVA;
		this.fournisseur = fournisseur;
		this.marque = marque;
		this.modele = modele;
		this.quantiteStock = quantiteStock;
		this.clients = clients;
		this.histos = histos;
		this.propsCommerciales = propsCommerciales;
		this.commandes = commandes;
		this.fiches = fiches;
		this.campagnes = campagnes;
		this.composition = composition;
	}

	public Produit(int idProduit, String libelle, String type,
			String uniteMesure, double tauxTVA, String fournisseur,
			String marque, String modele, int quantiteStock,
			List<Client> clients, List<HistoTarification> histos,
			List<PropositionCommerciale> propsCommerciales,
			List<Commande> commandes, List<FicheClient> fiches,
			List<Campagne> campagnes,List<Produit> composition) {
		super();
		this.idProduit = idProduit;
		this.libelle = libelle;
		this.type = type;
		this.uniteMesure = uniteMesure;
		this.tauxTVA = tauxTVA;
		this.fournisseur = fournisseur;
		this.marque = marque;
		this.modele = modele;
		this.quantiteStock = quantiteStock;
		this.clients = clients;
		this.histos = histos;
		this.propsCommerciales = propsCommerciales;
		this.commandes = commandes;
		this.fiches = fiches;
		this.campagnes = campagnes;
		this.composition = composition;
	}

	
	

	public Produit(int idProduit, String libelle, String type,
			String uniteMesure, double tauxTVA, String fournisseur,
			String marque, String modele, int quantiteStock) {
		super();
		this.idProduit = idProduit;
		this.libelle = libelle;
		this.type = type;
		this.uniteMesure = uniteMesure;
		this.tauxTVA = tauxTVA;
		this.fournisseur = fournisseur;
		this.marque = marque;
		this.modele = modele;
		this.quantiteStock = quantiteStock;
	}


	
	
	public Produit(String libelle, String type,
			String uniteMesure, double tauxTVA, String fournisseur,
			String marque, String modele, int quantiteStock) {
		super();
		this.libelle = libelle;
		this.type = type;
		this.uniteMesure = uniteMesure;
		this.tauxTVA = tauxTVA;
		this.fournisseur = fournisseur;
		this.marque = marque;
		this.modele = modele;
		this.quantiteStock = quantiteStock;
	}


	/**
	 * GET & SET 
	 */
	
	
	public int getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUniteMesure() {
		return uniteMesure;
	}
	public void setUniteMesure(String uniteMesure) {
		this.uniteMesure = uniteMesure;
	}
	public double getTauxTVA() {
		return tauxTVA;
	}
	public void setTauxTVA(double tauxTVA) {
		this.tauxTVA = tauxTVA;
	}
	public String getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public int getQuantiteStock() {
		return quantiteStock;
	}
	public void setQuantiteStock(int quantiteStock) {
		this.quantiteStock = quantiteStock;
	}
	

	public List<HistoTarification> getHistos() {
		return histos;
	}


	public void setHistos(List<HistoTarification> histos) {
		this.histos = histos;
	}


	public List<PropositionCommerciale> getPropsCommerciales() {
		return propsCommerciales;
	}


	public void setPropsCommerciales(List<PropositionCommerciale> propsCommerciales) {
		this.propsCommerciales = propsCommerciales;
	}


	public List<Commande> getCommandes() {
		return commandes;
	}


	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}



	public List<Campagne> getCampagnes() {
		return campagnes;
	}


	public void setCampagnes(List<Campagne> campagnes) {
		this.campagnes = campagnes;
	}

	
	public List<Client> getClients() {
		return clients;
	}


	public void setClients(List<Client> clients) {
		this.clients = clients;
	}


	public List<FicheClient> getFiches() {
		return fiches;
	}


	public void setFiches(List<FicheClient> fiches) {
		this.fiches = fiches;
	}

	public List<Produit> getComposition() {
		return composition;
	}


	public void setComposition(List<Produit> composition) {
		this.composition = composition;
	}


	/**
	 * TO STRING
	 */
	
	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", libelle=" + libelle
				+ ", type=" + type + ", uniteMesure=" + uniteMesure
				+ ", tauxTVA=" + tauxTVA + ", fournisseur=" + fournisseur
				+ ", marque=" + marque + ", modele=" + modele
				+ ", quantiteStock=" + quantiteStock + "]";
	}
	
	
}
