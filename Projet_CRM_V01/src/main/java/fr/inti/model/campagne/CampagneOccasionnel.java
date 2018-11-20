package fr.inti.model.campagne;

import java.util.Date;

import fr.inti.model.commercial.EquipeCampagne;
import fr.inti.model.produit.Produit;

/**
 * 
 * @author Alison
 *
 */
public class CampagneOccasionnel extends Campagne {

	/**
	 * ATTRIBUTS
	 */
	
	private Date dateDebut;
	private Date dateFin;

	/**
	 * CONSTRUCTEURS
	 */
	public CampagneOccasionnel() {
		super();
	}

	public CampagneOccasionnel(int idCampagne, String type, String objectifCom,
			String lieu, String typeClient, String formeAnnonce,
			String message, String status, EquipeCampagne equipeCampagne,
			Produit produit) {
		super(idCampagne, type, objectifCom, lieu, typeClient, formeAnnonce,
				message, status, equipeCampagne, produit);
	}

	public CampagneOccasionnel(String type, String objectifCom, String lieu,
			String typeClient, String formeAnnonce, String message,
			String status, EquipeCampagne equipeCampagne, Produit produit) {
		super(type, objectifCom, lieu, typeClient, formeAnnonce, message,
				status, equipeCampagne, produit);
	}

	public CampagneOccasionnel(String type, String objectifCom, String lieu,
			String typeClient, String formeAnnonce, String message,
			String status) {
		super(type, objectifCom, lieu, typeClient, formeAnnonce, message,
				status);
	}

	public CampagneOccasionnel(Date dateDebut, Date dateFin) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	/**
	 * GET&SET
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	
	@Override
	public String toString() {
		return "CampagneOccasionnel [dateDebut=" + dateDebut + ", dateFin="
				+ dateFin + "]";
	}

}