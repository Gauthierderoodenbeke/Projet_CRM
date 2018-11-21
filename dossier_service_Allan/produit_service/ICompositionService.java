package fr.inti.service.produit;

import java.util.List;

import fr.inti.model.produit.Composition;

/**
 * 
 * @author Alison
 *
 */

public interface ICompositionService {

	
	public void ajouterComposition(Composition comp);
	public Composition findById(Long idComp); 
	public List<Composition> findAll();
	public void deleteById(Long idComp);
	public void update(Composition comp);
	
	
}
