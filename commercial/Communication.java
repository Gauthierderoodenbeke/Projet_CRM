package fr.inti.model.commercial;

import java.util.Date;

/**
 * 
 * @author Saï
 *
 */
public class Communication {
	
	private Date date;
	private int heure;
	private String sens;
	private String moyCom;
	private String objet;
	private Commercial commercial;
	private Contact contact;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getHeure() {
		return heure;
	}
	public void setHeure(int heure) {
		this.heure = heure;
	}
	public String getSens() {
		return sens;
	}
	public void setSens(String sens) {
		this.sens = sens;
	}
	public String getMoyCom() {
		return moyCom;
	}
	public void setMoyCom(String moyCom) {
		this.moyCom = moyCom;
	}
	public String getObjet() {
		return objet;
	}
	public void setObjet(String objet) {
		this.objet = objet;
	}
	public Commercial getCommercial() {
		return commercial;
	}
	public void setCommercial(Commercial commercial) {
		this.commercial = commercial;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public Communication() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Communication(Date date, int heure, String sens, String moyCom,
			String objet, Commercial commercial, Contact contact) {
		super();
		this.date = date;
		this.heure = heure;
		this.sens = sens;
		this.moyCom = moyCom;
		this.objet = objet;
		this.commercial = commercial;
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Communication [date=" + date + ", heure=" + heure + ", sens="
				+ sens + ", moyCom=" + moyCom + ", objet=" + objet + "]";
	}

	
}
