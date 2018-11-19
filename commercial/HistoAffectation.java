package fr.inti.model.commercial;

import java.util.Date;
import java.util.List;

/**
 * 
 * @author Saï
 *
 */
public class HistoAffectation {
private Date dateDebut;
private Date dateFin;
private int numOrdre;
private List<Client> clients;
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
