package fr.inti.model.commercial;

import java.util.Date;
import java.util.List;

/**
 * 
 * @author Saï
 *
 */
public class RespCommercial extends Commercial{

	public long primeEncadrement;
	private EquipeCom equipeCom;
	private List<Commercial> commerciaux;
	
	//G&S
	public long getPrimeEncadrement() {
		return primeEncadrement;
	}
	public void setPrimeEncadrement(long primeEncadrement) {
		this.primeEncadrement = primeEncadrement;
	}
	public EquipeCom getEquipeCom() {
		return equipeCom;
	}
	public void setEquipeCom(EquipeCom equipeCom) {
		this.equipeCom = equipeCom;
	}
	public List<Commercial> getCommerciaux() {
		return commerciaux;
	}
	public void setCommerciaux(List<Commercial> commerciaux) {
		this.commerciaux = commerciaux;
	}
	
	//Constructeurs
	public RespCommercial(int idCommercial, String nom, String prenom,
			String fonction, Date dateRecrutement, long salaireBase,
			double tauxComission, List<Client> clients, Contact contact,
			EquipeCampagne equipeCampagne, RespCommercial respCommercial,
			EquipeCom equipeCom, long primeEncadrement, EquipeCom equipeCom2,
			List<Commercial> commerciaux) {
		super(idCommercial, nom, prenom, fonction, dateRecrutement,
				salaireBase, tauxComission, clients, contact, equipeCampagne,
				respCommercial, equipeCom);
		this.primeEncadrement = primeEncadrement;
		equipeCom = equipeCom2;
		this.commerciaux = commerciaux;
	}
	public RespCommercial() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RespCommercial(String nom, String prenom, String fonction,
			Date dateRecrutement, long salaireBase, double tauxComission) {
		super(nom, prenom, fonction, dateRecrutement, salaireBase, tauxComission);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Resp_Commercial [primeEncadrement=" + primeEncadrement
				+ ", commerciaux=" + commerciaux + "]";
	}
	
	
}
