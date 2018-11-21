package fr.inti.service.produit;

import java.util.List;

import fr.inti.model.produit.FicheClientProduit;

/**
 * 
 * @author Alison
 *
 */

public interface IFicheClientProduitService {

	public void ajouterFicheClientProduit(FicheClientProduit fcp);
	public FicheClientProduit findById(Long idFcp); 
	public List<FicheClientProduit> findAll();
	public void deleteById(Long idFcp);
	public void update(FicheClientProduit fcp);
	
}
