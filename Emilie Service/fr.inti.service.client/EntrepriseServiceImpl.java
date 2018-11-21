package fr.inti.service.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.dao.client.IEntrepriseDao;
import fr.inti.model.client.Entreprise;

/**
 * Emilie
 * @author inti
 *
 */

@Service
@Transactional
public class EntrepriseServiceImpl implements IEntrepriseServiceImpl{

	@Autowired
	private IEntrepriseDao entrepriseDao;
	
	//setter
	public void setEntrepriseDao(IEntrepriseDao entrepriseDao) {
		this.entrepriseDao = entrepriseDao;
	}
	
	@Override
	public void ajouterEntreprise(Entreprise entreprise) {
		entrepriseDao.save(entreprise);
	}

	@Override
	public void supprimerEntreprise(Long idEntreprise) {
		entrepriseDao.delete(idEntreprise);
	}

	@Override
	public List<Entreprise> findAll() {
		return (List<Entreprise>) entrepriseDao.findAll();
	}
	@Transactional(readOnly=true)
	@Override
	public Entreprise findById(Long IdEntreprise) {
		return entrepriseDao.findOne(IdEntreprise);
	}

	@Override
	public void update(Entreprise entreprise) {
		entrepriseDao.save(entreprise);
	}

}
