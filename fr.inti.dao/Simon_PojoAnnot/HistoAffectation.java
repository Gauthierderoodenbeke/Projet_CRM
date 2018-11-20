package fr.inti.model.commercial;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author Saï
 *
 */
@Entity
@Table(name="histoAffectation")
public class HistoAffectation implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
private Date dateDebut;
private Date dateFin;
private int numOrdre;

@ManyToOne
@JoinColumn(name="Clients",referencedColumnName="idClient")
private List<Client> clients;

@ManyToOne
@JoinColumn(name="Commerciaux",referencedColumnName="idCommercial")
private List<Commercial> commerciaux;

//G&S
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
public List<Client> getClients() {
	return clients;
}
public void setClients(List<Client> clients) {
	this.clients = clients;
}
public List<Commercial> getCommerciaux() {
	return commerciaux;
}
public void setCommerciaux(List<Commercial> commerciaux) {
	this.commerciaux = commerciaux;
}

//Constructeurs
public HistoAffectation() {
	super();
	// TODO Auto-generated constructor stub
}
public HistoAffectation(Date dateDebut, Date dateFin, int numOrdre,
		List<Client> clients, List<Commercial> commerciaux) {
	super();
	this.dateDebut = dateDebut;
	this.dateFin = dateFin;
	this.numOrdre = numOrdre;
	this.clients = clients;
	this.commerciaux = commerciaux;
}
@Override
public String toString() {
	return "HistoAffectation [dateDebut=" + dateDebut + ", dateFin=" + dateFin
			+ ", numOrdre=" + numOrdre + "]";
}


	
}
