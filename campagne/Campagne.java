package fr.inti.model.campagne;

import fr.inti.model.commercial.EquipeCampagne;
import fr.inti.model.produit.Produit;

public class Campagne {

	/**
	 * Alison
	 */
	
	//***Attributs***//
	protected int idCampagne;
	protected String type;
	protected String objectifCom;
	protected String lieu;
	protected String typeClient;
	protected String formeAnnonce;
	protected String message;
	protected String status;
	
	
	protected EquipeCampagne equipeCampagne;
	protected Produit produit;
	
	//***Constructeurs***//
	public Campagne() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Campagne(int idCampagne, String type, String objectifCom,
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

	

	//***Gettters and Setters***//
	public int getIdCampagne() {
		return idCampagne;
	}


	public void setIdCampagne(int idCampagne) {
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


	//***toString***//
	@Override
	public String toString() {
		return "Campagne [idCampagne=" + idCampagne + ", type=" + type
				+ ", objectifCom=" + objectifCom + ", lieu=" + lieu
				+ ", typeClient=" + typeClient + ", formeAnnonce="
				+ formeAnnonce + ", message=" + message + ", status=" + status
				+ "]";
	}
	
	
	
}
