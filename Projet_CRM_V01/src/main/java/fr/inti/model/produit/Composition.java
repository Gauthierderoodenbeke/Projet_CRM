package fr.inti.model.produit;

import java.util.List;

/**
 * 
 * @author Gauthier
 *
 */
public class Composition {

	/**
	 * ATT
	 */

	private int quantite;
	private List<Produit> produitsCompo;

	/**
	 * CTORS
	 */

	public Composition() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Composition(int quantite, List<Produit> produitsCompo) {
		super();
		this.quantite = quantite;
		this.produitsCompo = produitsCompo;
	}

	public Composition(int quantite) {
		super();
		this.quantite = quantite;
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

	public List<Produit> getProduitsCompo() {
		return produitsCompo;
	}

	public void setProduitsCompo(List<Produit> produitsCompo) {
		this.produitsCompo = produitsCompo;
	}

	/**
	 * TO STRING
	 */

	@Override
	public String toString() {
		return "Composition [quantite=" + quantite + ", produitsCompo="
				+ produitsCompo + "]";
	}
}
