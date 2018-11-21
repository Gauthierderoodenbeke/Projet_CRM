package fr.inti.model.client;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Lob;

/**
 * 
 * @author Allan
 *
 */

@Entity
@DiscriminatorValue("Entreprise")
public class Entreprise extends Client {

	/**
	 * SERIALIZABLE
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ATTRIBUTS
	 */
	
	@Column(unique=true)
	private String idFiscal;
	private String raisonSociale;
	private Date dateCreation;
	private int nbEmployes;
	private String formeJuridique;
	private Long capital;
	@Lob
	private byte[] sigle;
	

	
	
	/**
	 * CONTRUCTEURS
	 */
	
	public Entreprise() {
		super();
	}
	public Entreprise(String familleClient, String niveauClient) {
		super(familleClient, niveauClient);
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
	
	/**
	 * TO STRING
	 */
	@Override
	public String toString() {
		return "Entreprise [idFiscal=" + idFiscal + ", raisonSociale="
				+ raisonSociale + ", dateCreation=" + dateCreation
				+ ", nbEmployes=" + nbEmployes + ", formeJuridique="
				+ formeJuridique + ", capital=" + capital + ", idClient=" + idClient
				+  ", familleClient="
				+ familleClient + ", niveauClient=" + niveauClient + "]";
	}
	
	
	
	
	
}
