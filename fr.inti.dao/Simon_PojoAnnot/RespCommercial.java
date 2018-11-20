package fr.inti.model.commercial;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author Saï
 *
 */
@Entity
@Table(name="ResponsableCom")
public class RespCommercial extends Commercial implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public long primeEncadrement;
	@OneToOne
	@JoinColumn(name="equipeCom",referencedColumnName="idEquipe")
	private EquipeCom equipeCom;
	
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
	
	//Constructeurs
	public RespCommercial(int idCommercial, String nom, String prenom,
			String fonction, Date dateRecrutement, long salaireBase,
			double tauxComission, List<HistoAffectation> histoAffectations,
			EquipeCampagne equipeCampagne, RespCommercial respCommercial,
			EquipeCom equipeCom, long primeEncadrement, EquipeCom equipeCom2,
			List<Commercial> commerciaux) {
		this.primeEncadrement = primeEncadrement;
		equipeCom = equipeCom2;
	}
	public RespCommercial() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RespCommercial(String nom, String prenom, String fonction,
			Date dateRecrutement, long salaireBase, double tauxComission) {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Resp_Commercial [primeEncadrement=" + primeEncadrement
				+ ", commerciaux=" + "]";
	}
	
	
}
