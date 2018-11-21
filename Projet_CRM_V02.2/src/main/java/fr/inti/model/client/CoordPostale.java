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
@Table(name="postales")
public class CoordPostale implements Serializable {

	/**
	 * SERIALIZABLE
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ATTRIBUTS
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPostale;
	private int numero;
	private String complementNum;
	private String rue;
	private String type;
	private int codePostal;
	private String ville;
	private String region;
	private String pays;
	
	@ManyToOne
	@JoinColumn(name="contact", referencedColumnName="idContact")
	private Contact contact;
	/**
	 * CONSTRUCTEURS
	 */
	public CoordPostale() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CoordPostale(int numero, String complementNum, String rue,
			String type, int codePostal, String ville, String region,
			String pays) {
		super();
		this.numero = numero;
		this.complementNum = complementNum;
		this.rue = rue;
		this.type = type;
		this.codePostal = codePostal;
		this.ville = ville;
		this.region = region;
		this.pays = pays;
	}
	
	/**
	 * GET&SET
	 */
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplementNum() {
		return complementNum;
	}
	public void setComplementNum(String complementNum) {
		this.complementNum = complementNum;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public Long getIdPostale() {
		return idPostale;
	}
	public void setIdPostale(Long idPostale) {
		this.idPostale = idPostale;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	/**
	 * TO STRING
	 */
	@Override
	public String toString() {
		return "CoordPostale [numero=" + numero + ", complementNum="
				+ complementNum + ", rue=" + rue + ", type=" + type
				+ ", codePostal=" + codePostal + ", ville=" + ville
				+ ", region=" + region + ", pays=" + pays + "]";
	}
	
	
	
}
