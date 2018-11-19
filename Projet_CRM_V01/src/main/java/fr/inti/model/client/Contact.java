package fr.inti.model.client;

import java.util.ArrayList;
import java.util.List;

import fr.inti.model.commercial.Commercial;

/**
 * 
 * @author Allan
 *
 */

public class Contact {

	/**
	 * ATTRIUBTS
	 */
	
	private int idClient;
	private String nomContact;
	private String prenomContact;
	private String fonction;
	private Client client;
	private List<CoordTelephonique> tels = new ArrayList<CoordTelephonique>();
	private List<CoordMail> mails = new ArrayList<CoordMail>();
	private List<CoordPostale> postales = new ArrayList<CoordPostale>();
	private HoraireContact horaire;
	
	
	/**
	 * CONSTRUCTEURS
	 */
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(int idClient, String nomContact, String prenomContact,
			String fonction, Client client, List<CoordTelephonique> tels,
			List<CoordMail> mails, List<CoordPostale> postales,
			Commercial commercial) {
		super();
		this.idClient = idClient;
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
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
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
	/**
	 * TO STRING
	 */
	@Override
	public String toString() {
		return "Contact [idClient=" + idClient + ", nomContact=" + nomContact
				+ ", prenomContact=" + prenomContact + ", fonction=" + fonction
				+ "]";
	}
	
	
	
	
	
	
}
