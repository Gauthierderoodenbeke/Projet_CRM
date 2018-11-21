package fr.inti.service.commercial;

import java.util.List;


import fr.inti.model.commercial.Commercial;

public interface ICommercialService {
	
	 public void ajouterCommercial (Commercial c);
	  public void supprimerCommercial (Long IdCom);
	  public List<Commercial>findAll();
	  public Commercial findById(Long IdCom);
	  public void update (Commercial c);

}
