package fr.inti.model.produit;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import fr.inti.clesPrimaires.CleInteret;
import fr.inti.model.client.Client;


/**
 * 
 * @author Allan
 *
 */
@Entity
@Table(name="interets")
public class Interet implements Serializable {

	/**
	 *  SERIALIZABLE
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ATTRIBUTS
	 */
	@EmbeddedId
	private CleInteret id;
	private int niveau;
	
	@ManyToOne
	@JoinColumn(name="idClient", insertable=false, updatable=false)
	private Client client;
	@ManyToOne
	@JoinColumn(name="idProduit", insertable=false, updatable=false)
	private Produit produit;
	
	/**
	 * CONSTRUCTEURS
	 */
	public Interet() {
		super();
	}
	public Interet(CleInteret id, int niveau, Client client, Produit produit) {
		super();
		this.id = id;
		this.niveau = niveau;
		this.client = client;
		this.produit = produit;
	}
	public Interet(int niveau) {
		super();
		this.niveau = niveau;
	}
	
	/**
	 * GET&SET
	 */
	public CleInteret getId() {
		return id;
	}
	public void setId(CleInteret id) {
		this.id = id;
	}
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
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
		return "Interet [id=" + id + ", niveau=" + niveau + "]";
	}
	
	
	
	
}
