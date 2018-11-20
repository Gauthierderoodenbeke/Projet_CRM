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
public class CleCompo implements Serializable{

	/**
	 * SERIALIZABLE
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ATTRIBUTS
	 */
	@Column(name="compose")
	private Long  idprodcompose;
	@Column(name="composant")
	private Long idprodcomposant;
	
	/**
	 * GET&SET
	 */
	public Long getIdprodcompose() {
		return idprodcompose;
	}
	public void setIdprodcompose(Long idprodcompose) {
		this.idprodcompose = idprodcompose;
	}
	public Long getIdprodcomposant() {
		return idprodcomposant;
	}
	public void setIdprodcomposant(Long idprodcomposant) {
		this.idprodcomposant = idprodcomposant;
	}
	
	/**
	 * CONSTRUCTEURS
	 */
	public CleCompo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CleCompo(Long idprodcompose, Long idprodcomposant) {
		super();
		this.idprodcompose = idprodcompose;
		this.idprodcomposant = idprodcomposant;
	}
	
	/**
	 * METHODES
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
