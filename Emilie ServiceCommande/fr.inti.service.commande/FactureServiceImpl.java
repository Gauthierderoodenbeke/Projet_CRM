package fr.inti.service.commande;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.dao.commande.ICommandeDao;
import fr.inti.dao.commande.IFactureDao;
import fr.inti.model.commande.Facture;


/**
 * Emilie
 * @author inti
 *
 */

@Service
@Transactional
public class FactureServiceImpl implements IFactureService{

	@Autowired
	private IFactureDao factureDao;
	
	@Autowired
	private ICommandeDao commandeDao;
	
	//setter
	public void setFactureDao(IFactureDao factureDao) {
		this.factureDao = factureDao;
	}
	public void setCommandeDao(ICommandeDao commandeDao) {
		this.commandeDao = commandeDao;
	}


	@Override
	public void ajouterFacture(Facture facture) {
		if (facture.getCommande() != null) {	
			if (facture.getCommande().getIdCommande()== null) {
				commandeDao.save(facture.getCommande());
			}
		factureDao.save(facture);
		}
	}

	@Override
	public void supprimerFacture(Long idFacture) {
		factureDao.delete(idFacture);
	}

	@Override
	public List<Facture> findAll() {
		return (List<Facture>) factureDao.findAll();
	}
	@Transactional(readOnly=true)
	@Override
	public Facture findById(Long IdFacture) {
		return factureDao.findOne(IdFacture);
	}

	@Override
	public void update(Facture facture) {
		factureDao.save(facture);
	}

}
