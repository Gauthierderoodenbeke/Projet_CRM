package fr.inti.model.commercial;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private Long idEquipeCmp;
	
	@OneToMany(mappedBy="equipeCampagne")
	private List<Commercial> commerciaux;
	
	@OneToMany(mappedBy="equipeCampagne")
	private List<Campagne> campagnes;
	
	//G&S

	public List<Commercial> getCommerciaux() {
		return commerciaux;
	}
	public Long getIdEquipeCmp() {
		return idEquipeCmp;
	}
	public void setIdEquipeCmp(Long idEquipeCmp) {
		this.idEquipeCmp = idEquipeCmp;
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
	}
	public EquipeCampagne(Long idEquipe, List<Commercial> commerciaux,
			List<Campagne> campagnes) {
		super();
		this.idEquipeCmp = idEquipe;
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
		return "EquipeCampagne [idEquipe=" + idEquipeCmp + "]";
	}
	
	
}
