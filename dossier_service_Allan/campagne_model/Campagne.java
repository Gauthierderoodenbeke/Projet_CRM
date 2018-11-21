package fr.inti.model.campagne;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import fr.inti.model.commercial.EquipeCampagne;
import fr.inti.model.produit.Produit;

/**
 * 
 * @author Alison ajouter méthode dans le supprimer
 *
 */

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="genre")
public abstract class Campagne implements Serializable{
	
	/**
	 * SERIALIZABLE
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * ATTRIBUTS
	 */
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected Long idCampagne;
	
	protected String type;
	protected String objectifCom;
	protected String lieu;
	protected String typeClient;
	protected String formeAnnonce;
	protected String message;
	protected String status;

	@ManyToOne
	@JoinColumn(name="Equipe", referencedColumnName="idEquipeCmp")
	protected EquipeCampagne equipeCampagne;
	
	@ManyToOne
	@JoinColumn(name="produit", referencedColumnName="idProduit")
	protected Produit produit;

	/**
	 * CONSTRUCTEURS
	 */
	public Campagne() {
		super();
	}
	public Campagne(Long idCampagne, String type, String objectifCom,
			String lieu, String typeClient, String formeAnnonce,
			String message, String status, EquipeCampagne equipeCampagne,
			Produit produit) {
		super();
		this.idCampagne = idCampagne;
		this.type = type;
		this.objectifCom = objectifCom;
		this.lieu = lieu;
		this.typeClient = typeClient;
		this.formeAnnonce = formeAnnonce;
		this.message = message;
		this.status = status;
		this.equipeCampagne = equipeCampagne;
		this.produit = produit;
	}
	public Campagne(String type, String objectifCom, String lieu,
			String typeClient, String formeAnnonce, String message,
			String status, EquipeCampagne equipeCampagne, Produit produit) {
		super();
		this.type = type;
		this.objectifCom = objectifCom;
		this.lieu = lieu;
		this.typeClient = typeClient;
		this.formeAnnonce = formeAnnonce;
		this.message = message;
		this.status = status;
		this.equipeCampagne = equipeCampagne;
		this.produit = produit;
	}
	public Campagne(String type, String objectifCom, String lieu,
			String typeClient, String formeAnnonce, String message,
			String status) {
		super();
		this.type = type;
		this.objectifCom = objectifCom;
		this.lieu = lieu;
		this.typeClient = typeClient;
		this.formeAnnonce = formeAnnonce;
		this.message = message;
		this.status = status;
	}

	/**
	 * GET&SET
	 */
	public Long getIdCampagne() {
		return idCampagne;
	}

	public void setIdCampagne(Long idCampagne) {
		this.idCampagne = idCampagne;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getObjectifCom() {
		return objectifCom;
	}

	public void setObjectifCom(String objectifCom) {
		this.objectifCom = objectifCom;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getTypeClient() {
		return typeClient;
	}

	public void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
	}

	public String getFormeAnnonce() {
		return formeAnnonce;
	}

	public void setFormeAnnonce(String formeAnnonce) {
		this.formeAnnonce = formeAnnonce;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public EquipeCampagne getEquipeCampagne() {
		return equipeCampagne;
	}

	public void setEquipeCampagne(EquipeCampagne equipeCampagne) {
		this.equipeCampagne = equipeCampagne;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	/**
	 * TO STRING
	 */
	@Override
	public String toString() {
		return "Campagne [idCampagne=" + idCampagne + ", type=" + type
				+ ", objectifCom=" + objectifCom + ", lieu=" + lieu
				+ ", typeClient=" + typeClient + ", formeAnnonce="
				+ formeAnnonce + ", message=" + message + ", status=" + status
				+ "]";
	}

}
