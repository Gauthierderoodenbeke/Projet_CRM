package fr.inti.model.client;

import java.util.Date;

public class Particulier extends Client {

	/**
	 * ATTRIBUTS
	 */
	private String numSecu;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private int nbEnfants;
	private String situationFam;
	private String catSocio;
	private int age;
	private Contact contact;
	
	/**
	 * CONSTRUCTEURS
	 */
	public Particulier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Particulier(int idClient, Coordonne coordPrefere,
			String familleClient, String niveauClient) {
		super(idClient, coordPrefere, familleClient, niveauClient);
		// TODO Auto-generated constructor stub
	}
	public Particulier(String familleClient, String niveauClient) {
		super(familleClient, niveauClient);
		// TODO Auto-generated constructor stub
	}
	public Particulier(String familleClient, String niveauClient,
			String numSecu, String nom, String prenom, Date dateNaissance,
			int nbEnfants, String situationFam, String catSocio, int age) {
		super(familleClient, niveauClient);
		this.numSecu = numSecu;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.nbEnfants = nbEnfants;
		this.situationFam = situationFam;
		this.catSocio = catSocio;
		this.age = age;
	}
	
	/**
	 * GET&SET
	 */
	public String getNumSecu() {
		return numSecu;
	}
	public void setNumSecu(String numSecu) {
		this.numSecu = numSecu;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public int getNbEnfants() {
		return nbEnfants;
	}
	public void setNbEnfants(int nbEnfants) {
		this.nbEnfants = nbEnfants;
	}
	public String getSituationFam() {
		return situationFam;
	}
	public void setSituationFam(String situationFam) {
		this.situationFam = situationFam;
	}
	public String getCatSocio() {
		return catSocio;
	}
	public void setCatSocio(String catSocio) {
		this.catSocio = catSocio;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	/**
	 * GET&SET
	 */
	@Override
	public String toString() {
		return "Particulier [numSecu=" + numSecu + ", nom=" + nom + ", prenom="
				+ prenom + ", dateNaissance=" + dateNaissance + ", nbEnfants="
				+ nbEnfants + ", situationFam=" + situationFam + ", catSocio="
				+ catSocio + ", age=" + age + "]";
	}
	
	
	
	
	
}
