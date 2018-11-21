package fr.inti.service.commercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.inti.dao.commercial.IEquipeCampagneDao;
import fr.inti.model.commercial.EquipeCampagne;

public class EquipeCampagneServiceImpl implements IEquipeCampagneService {

	@Autowired 
	IEquipeCampagneDao ecDao;

	
	//Setters
	public void setEcDao(IEquipeCampagneDao ecDao) {
		this.ecDao = ecDao;
	}

	
	//Methodes
	@Override
	public void ajouterEqCamp(EquipeCampagne ec) {
		ecDao.save(ec);
	}

	@Override
	public void supprimerEqCamp(Long IdEc) {
		ecDao.delete(IdEc);

	}

	@Override
	public List<EquipeCampagne> findAll() {
		return (List<EquipeCampagne>) ecDao.findAll();
	}

	@Override
	public EquipeCampagne findById(Long IdEc) {
		return ecDao.findOne(IdEc);
	}

	@Override
	public void update(EquipeCampagne ec) {
		ecDao.save(ec);

	}

}
