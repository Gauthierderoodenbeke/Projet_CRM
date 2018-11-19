package fr.inti.model.commercial;

import java.util.Date;

public class PropositionCommerciale {

	private int idPropal;
	private Date date;
	private Date dateLivraison;
	private String conditionsLivraison;
	private String modalitePaiement;
	private int dureeValidite;
	private String statut;
	public int getIdPropal() {
		return idPropal;
	}
	public void setIdPropal(int idPropal) {
		this.idPropal = idPropal;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getDateLivraison() {
		return dateLivraison;
	}
	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}
	public String getConditionsLivraison() {
		return conditionsLivraison;
	}
	public void setConditionsLivraison(String conditionsLivraison) {
		this.conditionsLivraison = conditionsLivraison;
	}
	public String getModalitePaiement() {
		return modalitePaiement;
	}
	public void setModalitePaiement(String modalitePaiement) {
		this.modalitePaiement = modalitePaiement;
	}
	public int getDureeValidite() {
		return dureeValidite;
	}
	public void setDureeValidite(int dureeValidite) {
		this.dureeValidite = dureeValidite;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public PropositionCommerciale() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PropositionCommerciale(int idPropal, Date date, Date dateLivraison,
			String conditionsLivraison, String modalitePaiement,
			int dureeValidite, String statut) {
		super();
		this.idPropal = idPropal;
		this.date = date;
		this.dateLivraison = dateLivraison;
		this.conditionsLivraison = conditionsLivraison;
		this.modalitePaiement = modalitePaiement;
		this.dureeValidite = dureeValidite;
		this.statut = statut;
	}
	public PropositionCommerciale(Date date, Date dateLivraison,
			String conditionsLivraison, String modalitePaiement,
			int dureeValidite, String statut) {
		super();
		this.date = date;
		this.dateLivraison = dateLivraison;
		this.conditionsLivraison = conditionsLivraison;
		this.modalitePaiement = modalitePaiement;
		this.dureeValidite = dureeValidite;
		this.statut = statut;
	}
	
}
