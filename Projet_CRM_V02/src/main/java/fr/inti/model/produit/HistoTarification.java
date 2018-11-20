package fr.inti.model.produit;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/***
 * 
 * @author Gauthier
 *
 */
@Entity
@Table(name="histotarigications")
public class HistoTarification implements Serializable{

	/**
	 * SERIALIZABLE
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ATTRIBUTS
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTarification;
	private String formuleCom;
	private Date dateDebut;
	private Date dateFin;
	@ManyToOne
	@JoinColumn(name="produit",referencedColumnName="idProduit")
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

	public HistoTarification(Long idTarification, String formuleCom,
			Date dateDebut, Date dateFin, Produit produitHisto) {
		super();
		this.idTarification = idTarification;
		this.formuleCom = formuleCom;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.produitHisto = produitHisto;
	}

	public HistoTarification(Long idTarification, String formuleCom,
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

	public Long getIdTarification() {
		return idTarification;
	}

	public void setIdTarification(Long idTarification) {
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

		return 0;
	}

}
