package fr.inti.clesPrimaires;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CleHistoaffec implements Serializable {

	/**
	 * SERIALIZABLE
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * ATTRIBUTS
	 */
	@Column(name="idClient")
	private Long idclient;
	@Column(name="idCommercial")
	private Long idcommercial;
	
	/**
	 * GET&SET
	 */
	public Long getIdclient() {
		return idclient;
	}
	public void setIdclient(Long idclient) {
		this.idclient = idclient;
	}
	public Long getIdcommercial() {
		return idcommercial;
	}
	public void setIdcommercial(Long idcommercial) {
		this.idcommercial = idcommercial;
	}
	
	/**
	 * CONSTRUCTEURS
	 */
	public CleHistoaffec(Long idclient, Long idcommercial) {
		super();
		this.idclient = idclient;
		this.idcommercial = idcommercial;
	}
	public CleHistoaffec() {
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
