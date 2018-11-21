package fr.inti.service.campagne;

import java.util.List;

import fr.inti.model.campagne.Campagne;


/**
 * 
 * @author Alison
 *
 */

public interface ICampagneService {

	public void ajouterCampagne(Campagne c);
	public Campagne findById(Long idCampagne); 
	public List<Campagne> findAll();
	public void deleteById(Long idCampagne);
	public void update(Campagne c);
	
		
	
	
		
	
	
	
}
