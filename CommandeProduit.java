package fr.inti.model.commande;

import fr.inti.model.produit.Produit;


/**
 * 
 * @author Gauthier
 *
 */

public class CommandeProduit { 
	
	/**
	 * ATTRIBUTs
	 */
	
	private int quantite;
	private double tauxReduction;
	private Produit produit;
	private Commande commande;
	
	/**
	 * CTORS
	 */
	
	public CommandeProduit() {
		super();
		
	}
	
	public CommandeProduit(int quantite, double tauxReduction, Produit produit,
			Commande commande) {
		super();
		this.quantite = quantite;
		this.tauxReduction = tauxReduction;
		this.produit = produit;
		this.commande = commande;
	}


	public CommandeProduit(int quantite, double tauxReduction) {
		super();
		this.quantite = quantite;
		this.tauxReduction = tauxReduction;
	}

	/**
	 * GET & SET
	 */
	
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public double getTauxReduction() {
		return tauxReduction;
	}
	public void setTauxReduction(double tauxReduction) {
		this.tauxReduction = tauxReduction;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	/**
	 * TO STRING
	 */
	
	@Override
	public String toString() {
		return "CommandeProduit [quantite=" + quantite + ", tauxReduction="
				+ tauxReduction + ", produit=" + produit + ", commande="
				+ commande + "]";
	}
	
}
