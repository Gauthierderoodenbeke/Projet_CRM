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
public class CleFicheCP implements Serializable {

	/**
	 * SERIALIZABLE
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ATTRIBUTS
	 */
	@Column(name="idFicheClient")
	private Long  idficheClient;
	@Column(name="idProduit")
	private Long idproduit;
	
	
	/**
	 * GET&SET
	 */
	public Long getIdficheClient() {
		return idficheClient;
	}
	public void setIdficheClient(Long idficheClient) {
		this.idficheClient = idficheClient;
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
	public CleFicheCP(Long idficheClient, Long idproduit) {
		super();
		this.idficheClient = idficheClient;
		this.idproduit = idproduit;
	}
	public CleFicheCP() {
		super();
		// TODO Auto-generated constructor stub
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
