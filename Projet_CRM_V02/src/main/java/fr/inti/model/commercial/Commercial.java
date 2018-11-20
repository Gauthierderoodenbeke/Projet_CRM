package fr.inti.model.commercial;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author Saï
 *
 */
@Entity
@Table(name = "commerciaux")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "niveau")
public class Commercial implements Serializable {

	/**
	 * SERIALIZABLE
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ATTRIBUTS
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long idCommercial;
	protected String nom;
	protected String prenom;
	protected String fonction;
	protected Date dateRecrutement;
	protected long salaireBase;
	protected String password;
	protected double tauxComission;

	@OneToMany(mappedBy = "commercial")
	protected List<HistoAffectation> histoAffectations;
	@OneToMany(mappedBy = "commercial")
	protected List<Communication> communications;
	@ManyToOne
	@JoinColumn(name = "Equipe", referencedColumnName = "idEquipeCmp")
	protected EquipeCampagne equipeCampagne;
	@ManyToOne
	@JoinColumn(name = "EquipeCom", referencedColumnName = "idEquipe")
	protected EquipeCom equipeCom;

	// G&S
	public Long getIdCommercial() {
		return idCommercial;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setIdCommercial(Long idCommercial) {
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

	public Commercial(Long idCommercial, String nom, String prenom,
			String fonction, Date dateRecrutement, long salaireBase,
			String password, double tauxComission,
			List<HistoAffectation> histoAffectations,
			List<Communication> communications, EquipeCampagne equipeCampagne,
			EquipeCom equipeCom) {
		super();
		this.idCommercial = idCommercial;
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
		this.dateRecrutement = dateRecrutement;
		this.salaireBase = salaireBase;
		this.password = password;
		this.tauxComission = tauxComission;
		this.histoAffectations = histoAffectations;
		this.communications = communications;
		this.equipeCampagne = equipeCampagne;
		this.equipeCom = equipeCom;
	}

	public Commercial(String nom, String prenom, String fonction,
			Date dateRecrutement, long salaireBase, String password,
			double tauxComission, List<HistoAffectation> histoAffectations,
			List<Communication> communications, EquipeCampagne equipeCampagne,
			EquipeCom equipeCom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
		this.dateRecrutement = dateRecrutement;
		this.salaireBase = salaireBase;
		this.password = password;
		this.tauxComission = tauxComission;
		this.histoAffectations = histoAffectations;
		this.communications = communications;
		this.equipeCampagne = equipeCampagne;
		this.equipeCom = equipeCom;
	}

	public Commercial(String nom, String prenom, String fonction,
			Date dateRecrutement, long salaireBase, String password,
			double tauxComission) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
		this.dateRecrutement = dateRecrutement;
		this.salaireBase = salaireBase;
		this.password = password;
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
