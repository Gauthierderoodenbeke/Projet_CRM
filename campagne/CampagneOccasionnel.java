package fr.inti.model.campagne;

import java.util.Date;

import fr.inti.model.commercial.EquipeCampagne;
import fr.inti.model.produit.Produit;

public class CampagneOccasionnel extends Campagne{

	//***Attributs***//
	private Date dateDebut;
	private Date dateFin;
	
	//***Constructeurs***//
	public CampagneOccasionnel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CampagneOccasionnel(int idCampagne, String type, String objectifCom,
			String lieu, String typeClient, String formeAnnonce,
			String message, String status, EquipeCampagne equipeCampagne,
			Produit produit) {
		super(idCampagne, type, objectifCom, lieu, typeClient, formeAnnonce, message,
				status, equipeCampagne, produit);
		// TODO Auto-generated constructor stub
	}
	public CampagneOccasionnel(String type, String objectifCom, String lieu,
			String typeClient, String formeAnnonce, String message,
			String status, EquipeCampagne equipeCampagne, Produit produit) {
		super(type, objectifCom, lieu, typeClient, formeAnnonce, message, status,
				equipeCampagne, produit);
		// TODO Auto-generated constructor stub
	}
	public CampagneOccasionnel(String type, String objectifCom, String lieu,
			String typeClient, String formeAnnonce, String message,
			String status) {
		super(type, objectifCom, lieu, typeClient, formeAnnonce, message, status);
		// TODO Auto-generated constructor stub
	}
	public CampagneOccasionnel(Date dateDebut, Date dateFin) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	
	//***Getters and Setters***//
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
	
	//***toString***//
	@Override
	public String toString() {
		return "CampagneOccasionnel [dateDebut=" + dateDebut + ", dateFin="
				+ dateFin + "]";
	}
	
	
	
	
	
	
	
	
}
