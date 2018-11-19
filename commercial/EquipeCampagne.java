package fr.inti.model.commercial;

import java.util.List;

/**
 * 
 * @author Saï
 *
 */
public class EquipeCampagne {

	private int idEquipe;
	private List<Commercial> commerciaux;
	private List<Campagne> campagnes;
	
	//G&S
	public int getIdEquipe() {
		return idEquipe;
	}
	public void setIdEquipe(int idEquipe) {
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
	public EquipeCampagne(int idEquipe, List<Commercial> commerciaux,
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
