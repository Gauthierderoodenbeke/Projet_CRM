package fr.inti.model.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author Allan
 *
 */

public class Entreprise extends Client {

	/**
	 * ATTRIBUTS
	 */
	
	private String idFiscal;
	private String raisonSociale;
	private Date dateCreation;
	private int nbEmployes;
	private String formeJuridique;
	private Long capital;
	private byte[] sigle;
	private List<Contact> contacts = new ArrayList<Contact>();
	
	
	/**
	 * CONTRUCTEURS
	 */
	
	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Entreprise(int idClient, Coordonne coordPrefere,
			String familleClient, String niveauClient) {
		super(idClient, coordPrefere, familleClient, niveauClient);
		// TODO Auto-generated constructor stub
	}
	public Entreprise(String familleClient, String niveauClient) {
		super(familleClient, niveauClient);
		// TODO Auto-generated constructor stub
	}
	public Entreprise(String familleClient, String niveauClient,
			String idFiscal, String raisonSociale, Date dateCreation,
			int nbEmployes, String formeJuridique, Long capital) {
		super(familleClient, niveauClient);
		this.idFiscal = idFiscal;
		this.raisonSociale = raisonSociale;
		this.dateCreation = dateCreation;
		this.nbEmployes = nbEmployes;
		this.formeJuridique = formeJuridique;
		this.capital = capital;
	}
	
	/**
	 * GET&SET
	 */
	public String getIdFiscal() {
		return idFiscal;
	}
	public void setIdFiscal(String idFiscal) {
		this.idFiscal = idFiscal;
	}
	public String getRaisonSociale() {
		return raisonSociale;
	}
	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public int getNbEmployes() {
		return nbEmployes;
	}
	public void setNbEmployes(int nbEmployes) {
		this.nbEmployes = nbEmployes;
	}
	public String getFormeJuridique() {
		return formeJuridique;
	}
	public void setFormeJuridique(String formeJuridique) {
		this.formeJuridique = formeJuridique;
	}
	public Long getCapital() {
		return capital;
	}
	public void setCapital(Long capital) {
		this.capital = capital;
	}
	public byte[] getSigle() {
		return sigle;
	}
	public void setSigle(byte[] sigle) {
		this.sigle = sigle;
	}
	public List<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	
	
	/**
	 * TO STRING
	 */
	@Override
	public String toString() {
		return "Entreprise [idFiscal=" + idFiscal + ", raisonSociale="
				+ raisonSociale + ", dateCreation=" + dateCreation
				+ ", nbEmployes=" + nbEmployes + ", formeJuridique="
				+ formeJuridique + ", capital=" + capital + ", sigle="
				+ Arrays.toString(sigle) + ", idClient=" + idClient
				+  ", familleClient="
				+ familleClient + ", niveauClient=" + niveauClient + "]";
	}
	
	
	
	
	
}
