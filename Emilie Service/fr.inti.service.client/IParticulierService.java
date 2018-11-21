package fr.inti.service.client;

import java.util.List;

import fr.inti.model.client.Particulier;

/**
 * Emilie
 * @author inti
 *
 */

public interface IParticulierService {
	
	public void ajouterParticulier(Particulier particulier);
	public void supprimerParticulier(Long idParticulier);
	public List<Particulier>findAll();
	public Particulier findById(Long IdParticulier);
	public void update(Particulier particulier);

}
