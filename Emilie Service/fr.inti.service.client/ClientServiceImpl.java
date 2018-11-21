package fr.inti.service.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.dao.client.IClientDao;
import fr.inti.model.client.Client;

/**
 * Emilie
 * @author inti
 *
 */


@Service
@Transactional
public class ClientServiceImpl implements IClientService{

	@Autowired
	private IClientDao clientDao;
	
	//Setter
	public void setClientDao(IClientDao clientDao) {
		this.clientDao = clientDao;
	}
	
	@Override
	public void ajouterClient(Client client) {
		clientDao.save(client);
		
	}

	@Override
	public void supprimerClient(Long idClient) {
		clientDao.delete(idClient);
		
	}

	@Override
	public List<Client> findAll() {
		return (List<Client>) clientDao.findAll();
	}
	
	@Transactional(readOnly=true)
	@Override
	public Client findById(Long IdClient) {
		return clientDao.findOne(IdClient);
	}

	@Override
	public void update(Client client) {
		clientDao.save(client);
		
	}

}
