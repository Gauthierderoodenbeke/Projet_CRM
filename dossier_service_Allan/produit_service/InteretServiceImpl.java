package fr.inti.service.produit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.dao.client.IClientDao;
import fr.inti.dao.produit.IProduitDao;
import fr.inti.dao.ternaire.IInteretDao;
import fr.inti.model.produit.Interet;

/**
 * 
 * @author Alison
 *
 */

@Service
@Transactional
public class InteretServiceImpl implements IInteretService {

	@Autowired
	IInteretDao interetDao;

	@Autowired
	IClientDao clientDao;

	@Autowired
	IProduitDao produitDao;

	@Override
	public void ajouterInteret(Interet in) {
		if (in.getProduit() != null) {
			if (in.getProduit().getIdProduit() == null) {
				produitDao.save(in.getProduit());
			}

		}
		if (in.getClient() != null) {
			if (in.getClient().getIdClient() == null) {
				clientDao.save(in.getClient());
			}
		}
		interetDao.save(in);
	}

	@Transactional(readOnly = true)
	@Override
	public Interet findById(Long idInteret) {
		return interetDao.findOne(idInteret);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Interet> findAll() {
		return (List<Interet>) interetDao.findAll();
	}

	@Override
	public void deleteById(Long idInteret) {
		interetDao.delete(idInteret);

	}

	@Override
	public void update(Interet in) {
		interetDao.save(in);

	}

}
