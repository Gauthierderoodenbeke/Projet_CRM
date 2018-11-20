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
public class CleInteret implements Serializable{

	/**
	 * ATTRIBUTS
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="idClient")
	private Long idclient;
	@Column(name="idProduit")
	private Long idproduit;
	
	
	public Long getIdclient() {
		return idclient;
	}
	public void setIdclient(Long idclient) {
		this.idclient = idclient;
	}
	public Long getIdproduit() {
		return idproduit;
	}
	public void setIdproduit(Long idproduit) {
		this.idproduit = idproduit;
	}
	public CleInteret() {
		super();
	}
	public CleInteret(Long idclient, Long idproduit) {
		super();
		this.idclient = idclient;
		this.idproduit = idproduit;
	}
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
