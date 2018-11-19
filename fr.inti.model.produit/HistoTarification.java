package fr.inti.model.produit;

import java.util.Date;

/***
 * 
 * @author Gauthier
 *
 */

public class HistoTarification {
	
	/**
	 * ATTRIBUTS
	 */
	
	private int idTarification;
	private String formuleCom;
	private Date dateDebut;
	private Date dateFin;
	private Produit produitHisto;
	
	/**
	 * CTORS
	 */
	
	public HistoTarification() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public HistoTarification(String formuleCom, Date dateDebut, Date dateFin,
			Produit produitHisto) {
		super();
		this.formuleCom = formuleCom;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.produitHisto = produitHisto;
	}

	public HistoTarification(int idTarification, String formuleCom,
			Date dateDebut, Date dateFin, Produit produitHisto) {
		super();
		this.idTarification = idTarification;
		this.formuleCom = formuleCom;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.produitHisto = produitHisto;
	}

	public HistoTarification(int idTarification, String formuleCom,
			Date dateDebut, Date dateFin) {
		super();
		this.idTarification = idTarification;
		this.formuleCom = formuleCom;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}


	public HistoTarification(String formuleCom, Date dateDebut, Date dateFin) {
		super();
		this.formuleCom = formuleCom;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}


	/**
	 * GET & SET
	 */
	
	public int getIdTarification() {
		return idTarification;
	}
	public void setIdTarification(int idTarification) {
		this.idTarification = idTarification;
	}
	public String getFormuleCom() {
		return formuleCom;
	}
	public void setFormuleCom(String formuleCom) {
		this.formuleCom = formuleCom;
	}
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
	public Produit getProduitHisto() {
		return produitHisto;
	}
	public void setProduitHisto(Produit produitHisto) {
		this.produitHisto = produitHisto;
	}
	
	/**
	 * TO STRING
	 */

	@Override
	public String toString() {
		return "HistoTarification [idTarification=" + idTarification
				+ ", formuleCom=" + formuleCom + ", dateDebut=" + dateDebut
				+ ", dateFin=" + dateFin + "]";
	}
	
	/**
	 * METHODES
	 */
	
	public double calculPrixBase() {
		
	return 0;}
	
}
