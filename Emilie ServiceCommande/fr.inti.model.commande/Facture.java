package fr.inti.model.commande;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author Emilie
 *
 */
@Entity
@Table(name="factures")
public class Facture implements Serializable{

	/**
	 * SERIALIZABLE
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ATTRIBUTS
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idFacture;
	private Date datePaiement;
	private int nbRelances;
	private Date dateEmission;
	private double montantTtc;
	private int delaiPaiement;

	/**
	 * Emilie_Ajout cascade=CascadeType.ALL
	 */
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="commande", referencedColumnName="idCommande")
	private Commande commande;

	/**
	 * CONSTRUCTEURS
	 */
	// constructeur sans arg
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Facture(Long idFacture, Date datePaiement, int nbRelances,
			Date dateEmission, double montantTtc, int delaiPaiement,
			Commande commande) {
		super();
		this.idFacture = idFacture;
		this.datePaiement = datePaiement;
		this.nbRelances = nbRelances;
		this.dateEmission = dateEmission;
		this.montantTtc = montantTtc;
		this.delaiPaiement = delaiPaiement;
		this.commande = commande;
	}

	public Facture(Date datePaiement, int nbRelances, Date dateEmission,
			double montantTtc, int delaiPaiement, Commande commande) {
		super();
		this.datePaiement = datePaiement;
		this.nbRelances = nbRelances;
		this.dateEmission = dateEmission;
		this.montantTtc = montantTtc;
		this.delaiPaiement = delaiPaiement;
		this.commande = commande;
	}

	public Facture(Date datePaiement, int nbRelances, Date dateEmission,
			double montantTtc, int delaiPaiement) {
		super();
		this.datePaiement = datePaiement;
		this.nbRelances = nbRelances;
		this.dateEmission = dateEmission;
		this.montantTtc = montantTtc;
		this.delaiPaiement = delaiPaiement;
	}

	/**
	 * TO STRING
	 */
	@Override
	public String toString() {
		return "Facture [numFacture=" + idFacture + ", datePaiement="
				+ datePaiement + ", nbRelances=" + nbRelances
				+ ", dateEmission=" + dateEmission + ", montantTtc="
				+ montantTtc + ", delaiPaiement=" + delaiPaiement + "]";
	}

	/**
	 * GET&SET
	 */
	public Long getNumFacture() {
		return idFacture;
	}

	public void setNumFacture(Long idFacture) {
		this.idFacture = idFacture;
	}

	public Date getDatePaiement() {
		return datePaiement;
	}

	public void setDatePaiement(Date datePaiement) {
		this.datePaiement = datePaiement;
	}

	public int getNbRelances() {
		return nbRelances;
	}

	public void setNbRelances(int nbRelances) {
		this.nbRelances = nbRelances;
	}

	public Date getDateEmission() {
		return dateEmission;
	}

	public void setDateEmission(Date dateEmission) {
		this.dateEmission = dateEmission;
	}

	public double getMontantTtc() {
		return montantTtc;
	}

	public void setMontantTtc(double montantTtc) {
		this.montantTtc = montantTtc;
	}

	public int getDelaiPaiement() {
		return delaiPaiement;
	}

	public void setDelaiPaiement(int delaiPaiement) {
		this.delaiPaiement = delaiPaiement;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

}
