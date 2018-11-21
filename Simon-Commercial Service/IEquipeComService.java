package fr.inti.service.commercial;

import java.util.List;

import fr.inti.model.commercial.EquipeCom;

public interface IEquipeComService {

	public void ajouterEquipeCom (EquipeCom eqCom);
	  public void supprimerEquipeCom(Long IdEqCom);
	  public List<EquipeCom>findAll();
	  public EquipeCom findById(Long IdEqCom);
	  public void update (EquipeCom eqCom);
}
