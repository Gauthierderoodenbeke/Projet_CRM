package fr.inti.model.commande;

import java.util.Date;
import java.util.List;

public class Facture {

	/**
	 * Emilie
	 */
	
	private int numFacture;
	private Date datePaiement;
	private int nbRelances;
	private Date dateEmission;
	private double montantTtc;
	private int delaiPaiement;
	
	private List<Commande> commandes;
	
	//constructeur sans arg
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Facture(int numFacture, Date datePaiement, int nbRelances,
			Date dateEmission, double montantTtc, int delaiPaiement,
			List<Commande> commandes) {
		super();
		this.numFacture = numFacture;
		this.datePaiement = datePaiement;
		this.nbRelances = nbRelances;
		this.dateEmission = dateEmission;
		this.montantTtc = montantTtc;
		this.delaiPaiement = delaiPaiement;
		this.commandes = commandes;
	}

	public Facture(Date datePaiement, int nbRelances, Date dateEmission,
			double montantTtc, int delaiPaiement, List<Commande> commandes) {
		super();
		this.datePaiement = datePaiement;
		this.nbRelances = nbRelances;
		this.dateEmission = dateEmission;
		this.montantTtc = montantTtc;
		this.delaiPaiement = delaiPaiement;
		this.commandes = commandes;
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

	@Override
	public String toString() {
		return "Facture [numFacture=" + numFacture + ", datePaiement="
				+ datePaiement + ", nbRelances=" + nbRelances
				+ ", dateEmission=" + dateEmission + ", montantTtc="
				+ montantTtc + ", delaiPaiement=" + delaiPaiement + "]";
	}

	public int getNumFacture() {
		return numFacture;
	}

	public void setNumFacture(int numFacture) {
		this.numFacture = numFacture;
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

	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}
	
	
	
}
