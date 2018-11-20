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
public class CleCommunication implements Serializable {

	/**
	 * SERIALIZABLE
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * ATTRIBUTS
	 */
	@Column(name="idContact")
	private Long idcontact;
	@Column(name="idCommercial")
	private Long idcommercial;
	
	/**
	 * GET&SET
	 */
	public Long getIdcontact() {
		return idcontact;
	}
	public void setIdcontact(Long idcontact) {
		this.idcontact = idcontact;
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
	public CleCommunication() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CleCommunication(Long idcontact, Long idcommercial) {
		super();
		this.idcontact = idcontact;
		this.idcommercial = idcommercial;
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
