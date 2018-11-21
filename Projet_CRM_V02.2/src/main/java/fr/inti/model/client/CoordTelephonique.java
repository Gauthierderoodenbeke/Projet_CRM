package fr.inti.model.client;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author Allan
 *
 */
@Entity
@Table(name="telephones")
public class CoordTelephonique implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ATTRIBUTS
	 */

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTel;
	private String numero;
	private String type;
	private String nature;
	private String categorie;
	private String priorite;
	
	@ManyToOne
	@JoinColumn(name="contact", referencedColumnName="idContact")
	private Contact contact;
	
	/**
	 * CONSTRUCTEURS
	 */
	public CoordTelephonique() {
		super();
	}
	public CoordTelephonique( String numero,
			String type, String nature, String categorie, String priorite) {
		super();
		this.numero = numero;
		this.type = type;
		this.nature = nature;
		this.categorie = categorie;
		this.priorite = priorite;
	}
	
	/**
	 * GET&SET
	 */
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getPriorite() {
		return priorite;
	}
	public void setPriorite(String priorite) {
		this.priorite = priorite;
	}
	public Long getIdTel() {
		return idTel;
	}
	public void setIdTel(Long idTel) {
		this.idTel = idTel;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	/**
	 * TO STRING 
	 */
	@Override
	public String toString() {
		return "CoordTelephonique [numero=" + numero + ", type=" + type
				+ ", nature=" + nature + ", categorie=" + categorie
				+ ", priorite=" + priorite + "]";
	}
	
	

}
