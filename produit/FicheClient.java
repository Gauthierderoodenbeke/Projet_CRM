package fr.inti.model.produit;

import java.util.Date;
import java.util.List;

public class FicheClient {
	
	/**
	 * Emilie *** package produit
	 */
	
	private int idFicheClient;
	private String type;
	private Date dateDecouverte;
	private double probAboutissement;
	private double caPrevisionnel;
	private Date dateParution;
	private Date dateLimiteReponse;
	
	private List<Produit> produits;
	private EquipeCom equipeCom;
	
	/**
	 * ficheClientProduit ajouté
	 */
	private FicheClientProduit ficheClientProduit;
	
	//Constructeur sans arg
	public FicheClient() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * ficheClientProduit ajouté
	 */
	//Constructeur avec arg (all)
	public FicheClient(int idFicheClient, String type, Date dateDecouverte,
			double probAboutissement, double caPrevisionnel, Date dateParution,
			Date dateLimiteReponse, List<Produit> produits,
			EquipeCom equipeCom, FicheClientProduit ficheClientProduit) {
		super();
		this.idFicheClient = idFicheClient;
		this.type = type;
		this.dateDecouverte = dateDecouverte;
		this.probAboutissement = probAboutissement;
		this.caPrevisionnel = caPrevisionnel;
		this.dateParution = dateParution;
		this.dateLimiteReponse = dateLimiteReponse;
		this.produits = produits;
		this.equipeCom = equipeCom;
		this.ficheClientProduit = ficheClientProduit;
	}
	
	
	//Constructeur avec arg (sans id, sans listes produit, equipeCom)
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
	/**
	 * ficheClientProduit ajouté
	 */
	//Constructeur avec arg (sans id)
	public FicheClient(String type, Date dateDecouverte,
			double probAboutissement, double caPrevisionnel, Date dateParution,
			Date dateLimiteReponse, List<Produit> produits,
			EquipeCom equipeCom, FicheClientProduit ficheClientProduit) {
		super();
		this.type = type;
		this.dateDecouverte = dateDecouverte;
		this.probAboutissement = probAboutissement;
		this.caPrevisionnel = caPrevisionnel;
		this.dateParution = dateParution;
		this.dateLimiteReponse = dateLimiteReponse;
		this.produits = produits;
		this.equipeCom = equipeCom;
		this.ficheClientProduit = ficheClientProduit;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "FicheClient [idFicheClient=" + idFicheClient + ", type=" + type
				+ ", dateDecouverte=" + dateDecouverte + ", probAboutissement="
				+ probAboutissement + ", caPrevisionnel=" + caPrevisionnel
				+ ", dateParution=" + dateParution + ", dateLimiteReponse="
				+ dateLimiteReponse + "]";
	}
	
	/**
	 * ficheClientProduit ajouté
	 */
	//Getters and setters
	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
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
	
	/**
	 * ficheClientProduit ajouté
	 */
	public FicheClientProduit getFicheClientProduit() {
		return ficheClientProduit;
	}
	public void setFicheClientProduit(FicheClientProduit ficheClientProduit) {
		this.ficheClientProduit = ficheClientProduit;
	}


	
	
	
	

}
