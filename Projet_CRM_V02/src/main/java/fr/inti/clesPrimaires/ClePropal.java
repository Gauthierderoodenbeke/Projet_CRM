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
public class ClePropal implements Serializable{

	/**
	 * SERIALIZABLE
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ATTRIBUTS
	 */
	@Column(name="idProduit")
	private Long idproduit;
	@Column(name="idPropal")
	private Long idpropal;
	
	
	/**
	 * CONSTRUCTEURS
	 */
	public ClePropal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClePropal(Long idproduit, Long idpropal) {
		super();
		this.idproduit = idproduit;
		this.idpropal = idpropal;
	}
	
	
	/**
	 * GET&SET
	 */
	public Long getIdproduit() {
		return idproduit;
	}
	public void setIdproduit(Long idproduit) {
		this.idproduit = idproduit;
	}
	public Long getIdpropal() {
		return idpropal;
	}
	public void setIdpropal(Long idpropal) {
		this.idpropal = idpropal;
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
