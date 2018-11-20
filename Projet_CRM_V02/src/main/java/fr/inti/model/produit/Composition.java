package fr.inti.model.produit;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import fr.inti.clesPrimaires.CleCompo;

/**
 * 
 * @author Gauthier
 *
 */
@Entity
@Table(name="compositions")
public class Composition implements Serializable {

	/**
	 * SERIALIZABLE
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ATT
	 */
	@EmbeddedId
	private CleCompo id;
	private int quantite;
	
	
	@ManyToOne
	@JoinColumn(name="compose",insertable=false, updatable=false)
	private Produit compose;
	@ManyToOne
	@JoinColumn(name="composant",insertable=false, updatable=false)
	private Produit composant;
	
	/**
	 * GET&SET
	 */
	public CleCompo getId() {
		return id;
	}
	public void setId(CleCompo id) {
		this.id = id;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Produit getCompose() {
		return compose;
	}
	public void setCompose(Produit compose) {
		this.compose = compose;
	}
	public Produit getComposant() {
		return composant;
	}
	public void setComposant(Produit composant) {
		this.composant = composant;
	}
	
	/**
	 * CONSTRUCTEUR
	 */
	public Composition() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Composition(CleCompo id, int quantite, Produit compose,
			Produit composant) {
		super();
		this.id = id;
		this.quantite = quantite;
		this.compose = compose;
		this.composant = composant;
	}
	public Composition(int quantite) {
		super();
		this.quantite = quantite;
	}
	
	/**
	 * TO STRING
	 */
	@Override
	public String toString() {
		return "Composition [id=" + id + ", quantite=" + quantite + "]";
	}
	
	
	
	

	
}
