package fr.inti.model.commercial;

import java.util.Date;
import java.util.List;

/**
 * 
 * @author Saï
 *
 */

public class Commercial {

	protected int idCommercial;
	protected String nom;
	protected String prenom;
	protected String fonction;
	protected Date dateRecrutement;
	protected long salaireBase;
	protected double tauxComission;
	protected List<HistoAffectation> histoAffectations;
	protected List<Communication> communications;
	protected EquipeCampagne equipeCampagne;
	protected RespCommercial respCommercial;
	protected EquipeCom equipeCom;

	// G&S
	public int getIdCommercial() {
		return idCommercial;
	}

	public void setIdCommercial(int idCommercial) {
		this.idCommercial = idCommercial;
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

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public Date getDateRecrutement() {
		return dateRecrutement;
	}

	public void setDateRecrutement(Date dateRecrutement) {
		this.dateRecrutement = dateRecrutement;
	}

	public long getSalaireBase() {
		return salaireBase;
	}

	public void setSalaireBase(long salaireBase) {
		this.salaireBase = salaireBase;
	}

	public double getTauxComission() {
		return tauxComission;
	}

	public void setTauxComission(double tauxComission) {
		this.tauxComission = tauxComission;
	}

	public List<Communication> getCommunications() {
		return communications;
	}

	public void setCommunications(List<Communication> communications) {
		this.communications = communications;
	}

	public List<HistoAffectation> getHistoAffectations() {
		return histoAffectations;
	}

	public void setHistoAffectations(List<HistoAffectation> histoAffectations) {
		this.histoAffectations = histoAffectations;
	}

	public EquipeCampagne getEquipeCampagne() {
		return equipeCampagne;
	}

	public void setEquipeCampagne(EquipeCampagne equipeCampagne) {
		this.equipeCampagne = equipeCampagne;
	}

	public RespCommercial getRespCommercial() {
		return respCommercial;
	}

	public void setRespCommercial(RespCommercial respCommercial) {
		this.respCommercial = respCommercial;
	}

	public EquipeCom getEquipeCom() {
		return equipeCom;
	}

	public void setEquipeCom(EquipeCom equipeCom) {
		this.equipeCom = equipeCom;
	}

	// Constructors
	public Commercial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Commercial(int idCommercial, String nom, String prenom,
			String fonction, Date dateRecrutement, long salaireBase,
			double tauxComission, List<HistoAffectation> histoAffectations,
			List<Communication> communications, EquipeCampagne equipeCampagne,
			RespCommercial respCommercial, EquipeCom equipeCom) {
		super();
		this.idCommercial = idCommercial;
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
		this.dateRecrutement = dateRecrutement;
		this.salaireBase = salaireBase;
		this.tauxComission = tauxComission;
		this.histoAffectations = histoAffectations;
		this.communications = communications;
		this.equipeCampagne = equipeCampagne;
		this.respCommercial = respCommercial;
		this.equipeCom = equipeCom;
	}

	public Commercial(String nom, String prenom, String fonction,
			Date dateRecrutement, long salaireBase, double tauxComission) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
		this.dateRecrutement = dateRecrutement;
		this.salaireBase = salaireBase;
		this.tauxComission = tauxComission;
	}

	@Override
	public String toString() {
		return "Commercial [idCommercial=" + idCommercial + ", nom=" + nom
				+ ", prenom=" + prenom + ", fonction=" + fonction
				+ ", dateRecrutement=" + dateRecrutement + ", salaireBase="
				+ salaireBase + ", tauxComission=" + tauxComission + "]";
	}
}
