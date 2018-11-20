package fr.inti.model.commercial;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import fr.inti.clesPrimaires.CleHistoaffec;
import fr.inti.model.client.Client;

/**
 * 
 * @author Saï
 *
 */

@Entity
@Table(name="joined_clientcommercial_histoaff")
public class HistoAffectation implements Serializable{

	/**
	 * ATTRIBUTS
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private CleHistoaffec  id;
	
	@ManyToOne
	@JoinColumn(name="idClient", insertable=false, updatable = false)
	private Client client; 
	@ManyToOne
	@JoinColumn(name="idCommercial", insertable=false, updatable=false)
	private Commercial commercial;
	
	private Date dateDebut;
	private Date dateFin;
	private int numOrdre;


	// G&S
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

	public int getNumOrdre() {
		return numOrdre;
	}

	public void setNumOrdre(int numOrdre) {
		this.numOrdre = numOrdre;
	}

	public Client getClient() {
		return client;
	}

	public void setClients(Client client) {
		this.client = client;
	}

	public Commercial getCommercial() {
		return commercial;
	}

	public void setCommercial(Commercial commercial) {
		this.commercial = commercial;
	}

	// Constructeurs
	public HistoAffectation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HistoAffectation(Date dateDebut, Date dateFin, int numOrdre,
			Client client, Commercial commercial) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.numOrdre = numOrdre;
		this.client = client;
		this.commercial = commercial;
	}

	@Override
	public String toString() {
		return "HistoAffectation [dateDebut=" + dateDebut + ", dateFin="
				+ dateFin + ", numOrdre=" + numOrdre + "]";
	}

}
