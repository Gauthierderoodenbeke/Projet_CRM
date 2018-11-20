package fr.inti.model.client;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Particulier")
public class Particulier extends Client {

	/**
	 * SERIALIZABLE
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ATTRIBUTS
	 */
	@Column(unique=true)
	private String numSecu;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private int nbEnfants;
	private String situationFam;
	private String catSocio;
	private int age;
	
	
	/**
	 * CONSTRUCTEURS
	 */
	public Particulier() {
		super();
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
