package fr.inti.service.produit;

import java.util.List;

import fr.inti.model.produit.HistoTarification;

/**
 * 
 * @author Alison
 *
 */

public interface IHistoTarificationService {

	public void ajouterHistoTarification(HistoTarification ht);
	public HistoTarification findById(Long idHt); 
	public List<HistoTarification> findAll();
	public void deleteById(Long idHt);
	public void update(HistoTarification ht);
	
}
