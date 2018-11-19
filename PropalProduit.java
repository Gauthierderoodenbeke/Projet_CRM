package fr.inti.model.produit;

import fr.inti.model.commercial.PropositionCommerciale;

/**
 * 
 * @author Gauthier
 *
 */

public class PropalProduit {
	
	private int quantite;
	private double tauxReduction;
	private PropositionCommerciale propCom;
	private Produit produit;
	
	/**
	 * CTORS
	 */
	
	public PropalProduit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public PropalProduit(int quantite, double tauxReduction,
			PropositionCommerciale propCom, Produit produit) {
		super();
		this.quantite = quantite;
		this.tauxReduction = tauxReduction;
		this.propCom = propCom;
		this.produit = produit;
	}


	public PropalProduit(int quantite, double tauxReduction) {
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
	public PropositionCommerciale getPropCom() {
		return propCom;
	}
	public void setPropCom(PropositionCommerciale propCom) {
		this.propCom = propCom;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	
	/**
	 * TO STRING
	 */

	@Override
	public String toString() {
		return "PropalProduit [quantite=" + quantite + ", tauxReduction="
				+ tauxReduction + ", propCom=" + propCom + ", produit="
				+ produit + "]";
	}
	
	
}
