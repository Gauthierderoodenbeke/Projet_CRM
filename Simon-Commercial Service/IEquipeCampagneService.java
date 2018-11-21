package fr.inti.service.commercial;

import java.util.List;

import fr.inti.model.commercial.EquipeCampagne;

public interface IEquipeCampagneService {

	public void ajouterEqCamp (EquipeCampagne ec);
	  public void supprimerEqCamp (Long IdEc);
	  public List<EquipeCampagne>findAll();
	  public EquipeCampagne findById(Long IdEc);
	  public void update (EquipeCampagne ec);
}
