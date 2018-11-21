package fr.inti.service.produit;

import java.util.List;

import fr.inti.model.produit.Produit;

/**
 * 
 * @author Alison
 *
 */


public interface IProduitService {
	
	public void ajouterProduit(Produit p);
	public Produit findById(Long idProduit); 
	public List<Produit> findAll();
	public void deleteById(Long idProduit);
	public void update(Produit p);
}
