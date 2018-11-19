package fr.inti.model.client;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Allan
 *
 */


public class HoraireContact {

	
	/**
	 * ATTRIUBTS
	 */
	private int idHoraire;
	private String hDebut;
	private String hFin;
	private List<String> journees = new ArrayList<String>();
	private String saison;
	private List<Contact> contacts = new ArrayList<Contact>();
	
	
	/**
	 * CONSTRUCTEURS
	 */
	public HoraireContact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HoraireContact(int idHoraire, String hDebut, String hFin,
			List<String> journees, String saison, List<Contact> contacts) {
		super();
		this.idHoraire = idHoraire;
		this.hDebut = hDebut;
		this.hFin = hFin;
		this.journees = journees;
		this.saison = saison;
		this.contacts = contacts;
	}
	public HoraireContact(String hDebut, String hFin, List<String> journees,
			String saison) {
		super();
		this.hDebut = hDebut;
		this.hFin = hFin;
		this.journees = journees;
		this.saison = saison;
	}
	
	/**
	 * GET&SET
	 */
	public int getIdHoraire() {
		return idHoraire;
	}
	public void setIdHoraire(int idHoraire) {
		this.idHoraire = idHoraire;
	}
	public String gethDebut() {
		return hDebut;
	}
	public void sethDebut(String hDebut) {
		this.hDebut = hDebut;
	}
	public String gethFin() {
		return hFin;
	}
	public void sethFin(String hFin) {
		this.hFin = hFin;
	}
	public List<String> getJournees() {
		return journees;
	}
	public void setJournees(List<String> journees) {
		this.journees = journees;
	}
	public String getSaison() {
		return saison;
	}
	public void setSaison(String saison) {
		this.saison = saison;
	}
	public List<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	@Override
	public String toString() {
		return "HoraireContact [idHoraire=" + idHoraire + ", hDebut=" + hDebut
				+ ", hFin=" + hFin + ", journees=" + journees + ", saison="
				+ saison + "]";
	}
	
	
	
	
}
