package fr.inti.service.client;

import java.util.List;

import fr.inti.model.client.Client;

/**
 * Emilie
 * @author inti
 *
 */

public interface IClientService {
	
	public void ajouterClient(Client client);
	public void supprimerClient(Long idClient);
	public List<Client>findAll();
	public Client findById(Long IdClient);
	public void update(Client client);

}
