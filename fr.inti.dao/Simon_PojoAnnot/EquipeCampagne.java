package fr.inti.model.commercial;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.inti.model.campagne.Campagne;

/**
 * 
 * @author Saï
 *
 */
@Entity
@Table(name="equipeCampagne")
public class EquipeCampagne implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEquipe;
	
	@OneToMany(mappedBy="equipeCampagne")
	private List<Commercial> commerciaux;
	
	@OneToMany(mappedBy="equipeCampagne")
	private List<Campagne> campagnes;
	
	//G&S
	public Long getIdEquipe() {
		return idEquipe;
	}
	public void setIdEquipe(Long idEquipe) {
		this.idEquipe = idEquipe;
	}
	public List<Commercial> getCommerciaux() {
		return commerciaux;
	}
	public void setCommerciaux(List<Commercial> commerciaux) {
		this.commerciaux = commerciaux;
	}
	public List<Campagne> getCampagnes() {
		return campagnes;
	}
	public void setCampagnes(List<Campagne> campagnes) {
		this.campagnes = campagnes;
	}
	
	//Constructeurs
	public EquipeCampagne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EquipeCampagne(Long idEquipe, List<Commercial> commerciaux,
			List<Campagne> campagnes) {
		super();
		this.idEquipe = idEquipe;
		this.commerciaux = commerciaux;
		this.campagnes = campagnes;
	}
	public EquipeCampagne(List<Commercial> commerciaux, List<Campagne> campagnes) {
		super();
		this.commerciaux = commerciaux;
		this.campagnes = campagnes;
	}
	@Override
	public String toString() {
		return "EquipeCampagne [idEquipe=" + idEquipe + "]";
	}
	
	
}
