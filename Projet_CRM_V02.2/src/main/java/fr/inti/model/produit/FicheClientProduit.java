package fr.inti.model.produit;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import fr.inti.clesPrimaires.CleFicheCP;


/**
 * 
 * @author Emilie
 *
 */
@Entity
@Table(name="ficheclientproduits")
public class FicheClientProduit implements Serializable{

	/**
	 * SERIALIZABLE
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ATTRIBUTS
	 */
	@EmbeddedId
	private CleFicheCP id;
	@ManyToOne
	@JoinColumn(name="fiche", insertable=false, updatable=false)
	private FicheClient ficheClient;
	@ManyToOne
	@JoinColumn(name="produit", insertable=false, updatable=false)
	private Produit produit;
	
	private int quantite;

	/**
	 * CONSTRUCTEURS
	 */
	//Constructeur sans arg
	public FicheClientProduit() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Constructeur avec arg
	public FicheClientProduit(FicheClient ficheClient, Produit produit,
			int quantite) {
		super();
		this.ficheClient = ficheClient;
		this.produit = produit;
		this.quantite = quantite;
	}
	//constructeur avec arg (sans ficheClient et sans produit)
	public FicheClientProduit(int quantite) {
		super();
		this.quantite = quantite;
	}
	/**
	 * TO STRING
	 */
	@Override
	public String toString() {
		return "FicheClientProduit [quantite=" + quantite + "]";
	}
	
	/**
	 * GET&SET
	 */
	public FicheClient getFicheClient() {
		return ficheClient;
	}
	public void setFicheClient(FicheClient ficheClient) {
		this.ficheClient = ficheClient;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public CleFicheCP getId() {
		return id;
	}
	public void setId(CleFicheCP id) {
		this.id = id;
	}
}
