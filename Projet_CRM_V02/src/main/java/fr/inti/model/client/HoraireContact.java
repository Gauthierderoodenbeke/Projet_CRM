package fr.inti.model.client;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author Allan
 *
 */

@Entity
@Table(name="horaires")
public class HoraireContact implements Serializable{

	
	/**
	 * SERAILIZABLE
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ATTRIUBTS
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idHoraire;
	private String hDebut;
	private String hFin;
	private String journees;
	private String saison;
	
	@OneToOne(mappedBy="horaire")
	private Contact contact;
	
	
	/**
	 * CONSTRUCTEURS
	 */
	public HoraireContact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HoraireContact(int idHoraire, String hDebut, String hFin,
			String journees, String saison, Contact contact) {
		super();
		this.idHoraire = idHoraire;
		this.hDebut = hDebut;
		this.hFin = hFin;
		this.journees = journees;
		this.saison = saison;
		this.contact = contact;
	}
	public HoraireContact(String hDebut, String hFin, String journees,
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
	public String getJournees() {
		return journees;
	}
	public void setJournees(String journees) {
		this.journees = journees;
	}
	public String getSaison() {
		return saison;
	}
	public void setSaison(String saison) {
		this.saison = saison;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "HoraireContact [idHoraire=" + idHoraire + ", hDebut=" + hDebut
				+ ", hFin=" + hFin + ", journees=" + journees + ", saison="
				+ saison + "]";
	}
	
	
	
	
}
