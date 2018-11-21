package fr.inti.service.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.dao.client.IParticulierDao;
import fr.inti.model.client.Particulier;

/**
 * Emilie
 * @author inti
 *
 */

@Service
@Transactional
public class ParticulierServiceImpl implements IParticulierService{

	@Autowired
	private IParticulierDao particulierDao;
	
	//setter
	public void setParticulierDao(IParticulierDao particulierDao) {
		this.particulierDao = particulierDao;
	}

	@Override
	public void ajouterParticulier(Particulier particulier) {
	 particulierDao.save(particulier);	
	}

	@Override
	public void supprimerParticulier(Long idParticulier) {
		particulierDao.delete(idParticulier);		
	}

	@Override
	public List<Particulier> findAll() {
		return (List<Particulier>) particulierDao.findAll();
	}
	
	@Transactional(readOnly=true)
	@Override
	public Particulier findById(Long IdParticulier) {
		return particulierDao.findOne(IdParticulier);
	}

	@Override
	public void update(Particulier particulier) {
		particulierDao.save(particulier);	
	}

}
