package fr.inti.service.commande;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.inti.dao.client.IClientDao;
import fr.inti.dao.commande.ICommandeDao;
import fr.inti.model.commande.Commande;

public class CommandeServiceImpl implements ICommandeService {

	@Autowired
	ICommandeDao cDao;
	
	@Autowired
	IClientDao clDao;
	
	@Override
	public void ajouterCommande(Commande c) {
		if (c.getClient() != null) {
			if (c.getClient().getIdClient() == null) {
				clDao.save(c.getClient());
			}
		}
		cDao.save(c);
	}
	
	@Override
	public void supprimerCommande(Long Idc) {
		cDao.delete(Idc);

	}

	@Override
	public List<Commande> findAll() {
		return (List<Commande>) cDao.findAll();
	}

	@Override
	public Commande findById(Long Idc) {
		return cDao.findOne(Idc);
	}

	@Override
	public void update(Commande c) {
		cDao.save(c);

	}

}
