package fr.inti.model.client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import fr.inti.model.commercial.Commercial;
import fr.inti.model.commercial.Communication;

/**
 * 
 * @author Allan
 *
 */

@Entity
@Table(name="contacts")
public class Contact implements Serializable {

	/**
	 * SERIALIZABLE
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ATTRIUBTS
	 */
	@Id
	@GeneratedValue
	private Long idContact;
	private String nomContact;
	private String prenomContact;
	private String fonction;
	
	@ManyToOne
	@JoinColumn(name="contacts",referencedColumnName="idClient")
	private Client client;
	@OneToMany(mappedBy="contact")
	private List<CoordTelephonique> tels = new ArrayList<CoordTelephonique>();
	@OneToMany(mappedBy="contact")
	private List<CoordMail> mails = new ArrayList<CoordMail>();
	@OneToMany(mappedBy="contact")
	private List<CoordPostale> postales = new ArrayList<CoordPostale>();
	@OneToOne
	@JoinColumn(name="horaire",referencedColumnName="idHoraire")
	private HoraireContact horaire;
	@OneToMany(mappedBy="contact")
	private List<Communication> communications;
	
	
	/**
	 * CONSTRUCTEURS
	 */
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(Long idContact, String nomContact, String prenomContact,
			String fonction, Client client, List<CoordTelephonique> tels,
			List<CoordMail> mails, List<CoordPostale> postales,
			Commercial commercial) {
		super();
		this.idContact = idContact;
		this.nomContact = nomContact;
		this.prenomContact = prenomContact;
		this.fonction = fonction;
		this.client = client;
		this.tels = tels;
		this.mails = mails;
		this.postales = postales;
	}
	public Contact(String nomContact, String prenomContact, String fonction) {
		super();
		this.nomContact = nomContact;
		this.prenomContact = prenomContact;
		this.fonction = fonction;
	}
	
	/**
	 * GET&SET
	 */
	public Long getIdContact() {
		return idContact;
	}
	public void setIdClient(Long idContact) {
		this.idContact = idContact;
	}
	public String getNomContact() {
		return nomContact;
	}
	public void setNomContact(String nomContact) {
		this.nomContact = nomContact;
	}
	public String getPrenomContact() {
		return prenomContact;
	}
	public void setPrenomContact(String prenomContact) {
		this.prenomContact = prenomContact;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<CoordTelephonique> getTels() {
		return tels;
	}
	public void setTels(List<CoordTelephonique> tels) {
		this.tels = tels;
	}
	public List<CoordMail> getMails() {
		return mails;
	}
	public void setMails(List<CoordMail> mails) {
		this.mails = mails;
	}
	public List<CoordPostale> getPostales() {
		return postales;
	}
	public void setPostales(List<CoordPostale> postales) {
		this.postales = postales;
	}
	public HoraireContact getHoraire() {
		return horaire;
	}
	public void setHoraire(HoraireContact horaire) {
		this.horaire = horaire;
	}

	public List<Communication> getCommunications() {
		return communications;
	}
	public void setCommunications(List<Communication> communications) {
		this.communications = communications;
	}
	public void setIdContact(Long idContact) {
		this.idContact = idContact;
	}
	/**
	 * TO STRING
	 */
	@Override
	public String toString() {
		return "Contact [idClient=" + idContact + ", nomContact=" + nomContact
				+ ", prenomContact=" + prenomContact + ", fonction=" + fonction
				+ "]";
	}
	
	
	
	
	
	
}
