package fr.inti.service.client;

import java.util.List;


import fr.inti.model.client.Entreprise;

/**
* Emilie
* @author inti
*
*/

public interface IEntrepriseServiceImpl {
	
	public void ajouterEntreprise(Entreprise entreprise);
	public void supprimerEntreprise(Long idEntreprise);
	public List<Entreprise>findAll();
	public Entreprise findById(Long IdEntreprise);
	public void update(Entreprise entreprise);

}
