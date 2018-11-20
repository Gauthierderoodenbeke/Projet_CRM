package fr.inti.model.produit;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import fr.inti.clesPrimaires.ClePropal;
import fr.inti.model.commercial.PropositionCommerciale;

/**
 * 
 * @author Gauthier
 *
 */
@Entity
@Table(name="propalproduits")
public class PropalProduit {


	@EmbeddedId
	private ClePropal id;
	
	private int quantite;
	private double tauxReduction;
	@ManyToOne
	@JoinColumn(name="proposition", insertable=false, updatable=false)
	private PropositionCommerciale propCom;
	@ManyToOne
	@JoinColumn(name="produit",insertable=false, updatable=false)
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
	public ClePropal getId() {
		return id;
	}
	public void setId(ClePropal id) {
		this.id = id;
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
