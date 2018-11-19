package fr.inti.model.produit;

import java.util.Date;
import java.util.List;

import fr.inti.model.commercial.EquipeCom;

/**
 * 
 * @author Emilie
 *
 */
public class FicheClient {

	private int idFicheClient;
	private String type;
	private Date dateDecouverte;
	private double probAboutissement;
	private double caPrevisionnel;
	private Date dateParution;
	private Date dateLimiteReponse;

	private List<FicheClientProduit> produits;
	private EquipeCom equipeCom;

	// Constructeur sans arg
	public FicheClient() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Constructeur avec arg (all)
	public FicheClient(List<FicheClientProduit> produits, EquipeCom equipeCom,
			int idFicheClient, String type, Date dateDecouverte,
			double probAboutissement, double caPrevisionnel, Date dateParution,
			Date dateLimiteReponse) {
		super();
		this.produits = produits;
		this.equipeCom = equipeCom;
		this.idFicheClient = idFicheClient;
		this.type = type;
		this.dateDecouverte = dateDecouverte;
		this.probAboutissement = probAboutissement;
		this.caPrevisionnel = caPrevisionnel;
		this.dateParution = dateParution;
		this.dateLimiteReponse = dateLimiteReponse;
	}

	// Constructeur avec arg (sans id, sans listes produit, equipeCom)
	public FicheClient(String type, Date dateDecouverte,
			double probAboutissement, double caPrevisionnel, Date dateParution,
			Date dateLimiteReponse) {
		super();
		this.type = type;
		this.dateDecouverte = dateDecouverte;
		this.probAboutissement = probAboutissement;
		this.caPrevisionnel = caPrevisionnel;
		this.dateParution = dateParution;
		this.dateLimiteReponse = dateLimiteReponse;
	}

	// Constructeur avec arg (sans id)
	public FicheClient(List<FicheClientProduit> produits, EquipeCom equipeCom,
			String type, Date dateDecouverte, double probAboutissement,
			double caPrevisionnel, Date dateParution, Date dateLimiteReponse) {
		super();
		this.produits = produits;
		this.equipeCom = equipeCom;
		this.type = type;
		this.dateDecouverte = dateDecouverte;
		this.probAboutissement = probAboutissement;
		this.caPrevisionnel = caPrevisionnel;
		this.dateParution = dateParution;
		this.dateLimiteReponse = dateLimiteReponse;
	}

	// toString
	@Override
	public String toString() {
		return "FicheClient [idFicheClient=" + idFicheClient + ", type=" + type
				+ ", dateDecouverte=" + dateDecouverte + ", probAboutissement="
				+ probAboutissement + ", caPrevisionnel=" + caPrevisionnel
				+ ", dateParution=" + dateParution + ", dateLimiteReponse="
				+ dateLimiteReponse + "]";
	}

	// Getters and setters
	public List<FicheClientProduit> getProduits() {
		return produits;
	}

	public void setProduits(List<FicheClientProduit> produits) {
		this.produits = produits;
	}

	public EquipeCom getEquipeCom() {
		return equipeCom;
	}

	public void setEquipeCom(EquipeCom equipeCom) {
		this.equipeCom = equipeCom;
	}

	public int getIdFicheClient() {
		return idFicheClient;
	}

	public void setIdFicheClient(int idFicheClient) {
		this.idFicheClient = idFicheClient;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDateDecouverte() {
		return dateDecouverte;
	}

	public void setDateDecouverte(Date dateDecouverte) {
		this.dateDecouverte = dateDecouverte;
	}

	public double getProbAboutissement() {
		return probAboutissement;
	}

	public void setProbAboutissement(double probAboutissement) {
		this.probAboutissement = probAboutissement;
	}

	public double getCaPrevisionnel() {
		return caPrevisionnel;
	}

	public void setCaPrevisionnel(double caPrevisionnel) {
		this.caPrevisionnel = caPrevisionnel;
	}

	public Date getDateParution() {
		return dateParution;
	}

	public void setDateParution(Date dateParution) {
		this.dateParution = dateParution;
	}

	public Date getDateLimiteReponse() {
		return dateLimiteReponse;
	}

	public void setDateLimiteReponse(Date dateLimiteReponse) {
		this.dateLimiteReponse = dateLimiteReponse;
	}

}
