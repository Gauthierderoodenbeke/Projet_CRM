package fr.inti.clesPrimaires;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
/**
 * 
 * @author Allan
 *
 */
@Embeddable
public class CleCommande implements Serializable{

	/**
	 * SERIALIZABLE
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * ATTRIBUTS
	 */
	@Column(name="idCommande")
	private Long idcommande;
	@Column(name="idProduit")
	private Long idproduit;
	
	/**
	 * GET&SET
	 */
	public Long getIdcommande() {
		return idcommande;
	}
	public void setIdcommande(Long idcommande) {
		this.idcommande = idcommande;
	}
	public Long getIdproduit() {
		return idproduit;
	}
	public void setIdproduit(Long idproduit) {
		this.idproduit = idproduit;
	}
	
	/**
	 * CONSTRUCTEURS
	 */
	public CleCommande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CleCommande(Long idcommande, Long idproduit) {
		super();
		this.idcommande = idcommande;
		this.idproduit = idproduit;
	}
	
	/**
	 * Methodes
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	
	
	
}
