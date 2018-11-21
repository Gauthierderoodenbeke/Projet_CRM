package fr.inti.service.produit;

import java.util.List;

import fr.inti.model.produit.Interet;

/**
 * 
 * @author Alison
 *
 */

public interface IInteretService {

	public void ajouterInteret(Interet in);
	public Interet findById(Long idInteret); 
	public List<Interet> findAll();
	public void deleteById(Long idInteret);
	public void update(Interet in);
	
}
