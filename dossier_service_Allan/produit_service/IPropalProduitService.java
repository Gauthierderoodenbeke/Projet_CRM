package fr.inti.service.produit;

import java.util.List;

import fr.inti.model.produit.PropalProduit;

/**
 * 
 * @author Alison
 *
 */


public interface IPropalProduitService {

	public void ajouterPropalProduit(PropalProduit pp);
	public PropalProduit findById(Long idPp); 
	public List<PropalProduit> findAll();
	public void deleteById(Long idPp);
	public void update(PropalProduit pp);
	
}
