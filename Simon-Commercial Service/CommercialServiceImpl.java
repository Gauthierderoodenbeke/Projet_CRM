package fr.inti.service.commercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.inti.dao.commercial.ICommercialDao;
import fr.inti.dao.commercial.ICommunicationDao;
import fr.inti.dao.commercial.IEquipeCampagneDao;
import fr.inti.dao.commercial.IEquipeComDao;
import fr.inti.dao.ternaire.IHistoAffectationDao;
import fr.inti.model.commercial.Commercial;

public class CommercialServiceImpl implements ICommercialService{

	@Autowired
	ICommercialDao cDao;
	
	@Autowired
	ICommunicationDao comDao;
	
	@Autowired
	IHistoAffectationDao hDao;
	
	@Autowired
	IEquipeCampagneDao eqCaDao;
	
	@Autowired
	IEquipeComDao eqCoDao;
	
	
	// Setters
	public void setcDao(ICommercialDao cDao) {
		this.cDao = cDao;
	}

	public void setComDao(ICommunicationDao comDao) {
		this.comDao = comDao;
	}

	public void sethDao(IHistoAffectationDao hDao) {
		this.hDao = hDao;
	}

	public void setEqCaDao(IEquipeCampagneDao eqCaDao) {
		this.eqCaDao = eqCaDao;
	}

	public void setEqCoDao(IEquipeComDao eqCoDao) {
		this.eqCoDao = eqCoDao;
	}

	//Methodes
	@Override
	public void ajouterCommercial(Commercial c) {
		if (c.getEquipeCampagne() != null) {
			if (c.getEquipeCampagne().getIdEquipeCmp() == null) {
				eqCaDao.save(c.getEquipeCampagne());
			}
		}
		if (c.getEquipeCom() != null) {
			if (c.getEquipeCom().getIdEquipe() == null) {
				eqCoDao.save(c.getEquipeCom());
			}
		}
		cDao.save(c);
	}
	
	@Override
	public void supprimerCommercial(Long IdCom) {
		cDao.delete(IdCom);
		
	}

	@Override
	public List<Commercial> findAll() {
		return (List<Commercial>) cDao.findAll();
	}

	@Override
	public Commercial findById(Long IdCom) {
		return cDao.findOne(IdCom);
	}

	@Override
	public void update(Commercial c) {
		cDao.save(c);
		
	}

}
