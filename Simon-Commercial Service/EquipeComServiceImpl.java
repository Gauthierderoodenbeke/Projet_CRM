package fr.inti.service.commercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.inti.dao.commercial.IEquipeComDao;
import fr.inti.model.commercial.EquipeCom;

public class EquipeComServiceImpl implements IEquipeComService {

	@Autowired
	IEquipeComDao eqComDao;
	
	
	//Setter
	public void setEqComDao(IEquipeComDao eqComDao) {
		this.eqComDao = eqComDao;
	}

	//Methodes
	@Override
	public void ajouterEquipeCom(EquipeCom eqCom) {
		eqComDao.save(eqCom);
	}

	@Override
	public void supprimerEquipeCom(Long IdEqCom) {
		eqComDao.delete(IdEqCom);
	}

	@Override
	public List<EquipeCom> findAll() {
		return (List<EquipeCom>) eqComDao.findAll();
	}

	@Override
	public EquipeCom findById(Long IdEqCom) {
		return eqComDao.findOne(IdEqCom);
	}

	@Override
	public void update(EquipeCom eqCom) {
		eqComDao.save(eqCom);
	}

}
