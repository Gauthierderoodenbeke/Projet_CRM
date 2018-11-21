package fr.inti.service.produit;

import java.util.List;

import fr.inti.model.produit.FicheClient;

/**
 * 
 * @author Alison
 *
 */

public interface IFicheClientService {

	public void ajouterFicheClient(FicheClient fc);
	public FicheClient findById(Long idFc); 
	public List<FicheClient> findAll();
	public void deleteById(Long idFc);
	public void update(FicheClient fc);
	
}
