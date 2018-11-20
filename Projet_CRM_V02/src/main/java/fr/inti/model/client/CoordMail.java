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
@Table(name="mails")
public class CoordMail implements Serializable {

	
	/**
	 * SERIALIZABLE
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ATTRIBUTS
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idMail;
	
	private String mail;
	private String type;
	@ManyToOne
	@JoinColumn(name="contact",referencedColumnName="idContact")
	private Contact contact;
	
	
	/**
	 * CONSTRUCTEURS
	 */
	public CoordMail() {
		super();
	}
	public CoordMail(String mail, String type) {
		super();
		this.mail = mail;
		this.type = type;
	}
	
	/**
	 * GET&SET
	 */
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getIdMail() {
		return idMail;
	}
	public void setIdMail(Long idMail) {
		this.idMail = idMail;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "CoordMail [mail=" + mail + ", type=" + type + "]";
	}
	
	
	
	
	
}
