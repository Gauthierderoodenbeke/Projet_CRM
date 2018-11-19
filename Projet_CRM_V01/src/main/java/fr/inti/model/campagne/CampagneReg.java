package fr.inti.model.campagne;

import fr.inti.model.commercial.EquipeCampagne;
import fr.inti.model.produit.Produit;

/**
 * 
 * @author Alison
 *
 */
public class CampagneReg extends Campagne {

	// ***Attributs***//
	private String evenement;
	private int duree;

	// ***Constructeurs***//
	public CampagneReg() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CampagneReg(int idCampagne, String type, String objectifCom,
			String lieu, String typeClient, String formeAnnonce,
			String message, String status, EquipeCampagne equipeCampagne,
			Produit produit) {
		super(idCampagne, type, objectifCom, lieu, typeClient, formeAnnonce,
				message, status, equipeCampagne, produit);
		// TODO Auto-generated constructor stub
	}

	public CampagneReg(String type, String objectifCom, String lieu,
			String typeClient, String formeAnnonce, String message,
			String status, EquipeCampagne equipeCampagne, Produit produit) {
		super(type, objectifCom, lieu, typeClient, formeAnnonce, message,
				status, equipeCampagne, produit);
		// TODO Auto-generated constructor stub
	}

	public CampagneReg(String type, String objectifCom, String lieu,
			String typeClient, String formeAnnonce, String message,
			String status) {
		super(type, objectifCom, lieu, typeClient, formeAnnonce, message,
				status);
		// TODO Auto-generated constructor stub
	}

	public CampagneReg(String evenement, int duree) {
		super();
		this.evenement = evenement;
		this.duree = duree;
	}

	// ***Getters and Setters***//
	public String getEvenement() {
		return evenement;
	}

	public void setEvenement(String evenement) {
		this.evenement = evenement;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	// ***toString***//
	@Override
	public String toString() {
		return "CampagneReg [evenement=" + evenement + ", duree=" + duree + "]";
	}

}
