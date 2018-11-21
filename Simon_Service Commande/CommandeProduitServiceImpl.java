package fr.inti.service.commande;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.inti.dao.commande.ICommandeDao;
import fr.inti.dao.commande.ICommandeProduitDao;
import fr.inti.dao.produit.IProduitDao;
import fr.inti.model.commande.CommandeProduit;

public class CommandeProduitServiceImpl implements ICommandeProduitService {

	@Autowired
	private ICommandeProduitDao cpDao;
	
	@Autowired
	private ICommandeDao cDao;
	
	@Autowired
	private IProduitDao pDao;
	
	@Override
	public void ajouterCommandeProduit(CommandeProduit cp) {
		if (cp.getCommande() != null) {
			if (cp.getCommande().getIdCommande() == null) {
				cDao.save(cp.getCommande());
			}
		}
		if (cp.getProduit() != null) {
			if (cp.getProduit().getIdProduit() == null) {
				pDao.save(cp.getProduit());
			}
		}
		cpDao.save(cp);
	}

	@Override
	public void supprimerCommandeProduit(Long Idcp) {
		cpDao.delete(Idcp);
	}

	@Override
	public List<CommandeProduit> findAll() {
		return (List<CommandeProduit>) cpDao.findAll();
	}

	@Override
	public CommandeProduit findById(Long Idcp) {
		return cpDao.findOne(Idcp);
	}

	@Override
	public void update(CommandeProduit cp) {
		cpDao.save(cp);

	}

}
