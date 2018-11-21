package fr.inti.service.commercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.inti.dao.client.IClientDao;
import fr.inti.dao.commercial.ICommercialDao;
import fr.inti.dao.ternaire.IHistoAffectationDao;
import fr.inti.model.commercial.HistoAffectation;

public class HistoAffectationServiceImpl implements IHistoAffectationService {

	@Autowired
	IHistoAffectationDao haDao;

	@Autowired
	IClientDao cDao;

	@Autowired
	ICommercialDao comDao;

	// Setters
	public void setHaDao(IHistoAffectationDao haDao) {
		this.haDao = haDao;
	}

	public void setcDao(IClientDao cDao) {
		this.cDao = cDao;
	}

	public void setComDao(ICommercialDao comDao) {
		this.comDao = comDao;
	}

	@Override
	public void ajouterHistoAffectation(HistoAffectation ha) {
		if (ha.getClient() != null) {
			if (ha.getClient().getIdClient() == null) {
				cDao.save(ha.getClient());
			}
		}
		if (ha.getCommercial() != null) {
			if (ha.getCommercial().getIdCommercial() == null) {
				comDao.save(ha.getCommercial());
			}
		}
		haDao.save(ha);
	}

	@Override
	public void supprimerHistoAffectation(Long IdhA) {
		haDao.delete(IdhA);

	}

	@Override
	public List<HistoAffectation> findAll() {
		return (List<HistoAffectation>) haDao.findAll();
	}

	@Override
	public HistoAffectation findById(Long IdhA) {
		return haDao.findOne(IdhA);
	}

	@Override
	public void update(HistoAffectation ha) {
		haDao.save(ha);

	}

}
