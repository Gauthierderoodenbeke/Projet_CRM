package fr.inti.model.commande;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import fr.inti.clesPrimaires.CleCommande;
import fr.inti.model.produit.Produit;

/**
 * 
 * @author Emilie
 *
 */
@Entity
@Table(name="commandesproduit")
public class CommandeProduit implements Serializable {


	/**
	 * SERIALIZABLE
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ATTRIBUTS
	 */
	@EmbeddedId
	private CleCommande id;
	private int quantite;
	private double tauxReduction;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="commande", insertable=false, updatable=false)
	private Commande commande;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="produit", insertable=false, updatable=false)
	private Produit produit;
	
	
	/**
	 * CONSTRUCTEURS
	 */
	//constructeur sans arg
	public CommandeProduit() {
		super();
		// TODO Auto-generated constructor stub
	}
	//constructeur avec arg (all)
	public CommandeProduit(int quantite, double tauxReduction,
			Commande commande, Produit produit) {
		super();
		this.quantite = quantite;
		this.tauxReduction = tauxReduction;
		this.commande = commande;
		this.produit = produit;
	}
	//constructeur avec arg (sans commande, sans produit)
	public CommandeProduit(int quantite, double tauxReduction) {
		super();
		this.quantite = quantite;
		this.tauxReduction = tauxReduction;
	}

	@Override
	public String toString() {
		return "CommandeProduit [quantite=" + quantite + ", tauxReduction="
				+ tauxReduction + "]";
	}

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

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	
}
