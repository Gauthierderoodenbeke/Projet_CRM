package fr.inti.service.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.dao.client.IContactDao;
import fr.inti.dao.client.ICoordTelelephoniqueDao;
import fr.inti.model.client.CoordTelephonique;


/**
 * Emilie
 * @author inti
 *
 */

@Service
@Transactional
public class CoordTelephoniqueServiceImpl implements ICoordTelephoniqueService{

	@Autowired
	private ICoordTelelephoniqueDao coordTelDao;
	
	@Autowired
	private IContactDao contactDao;
	
	//setter
	public void setContactDao(IContactDao contactDao) {
		this.contactDao = contactDao;
	}
	public void setCoordTelDao(ICoordTelelephoniqueDao coordTelDao) {
		this.coordTelDao = coordTelDao;
	}


	@Override
	public void ajouterCoordTel(CoordTelephonique coordTel) {
		coordTelDao.save(coordTel);
		
	}

	@Override
	public void supprimerCoordTel(Long idCoordTel) {
		coordTelDao.delete(idCoordTel);
		
	}

	@Override
	public List<CoordTelephonique> findAll() {
		return (List<CoordTelephonique>) coordTelDao.findAll();
	}
	@Transactional(readOnly=true)
	@Override
	public CoordTelephonique findById(Long IdCoordTel) {
		return coordTelDao.findOne(IdCoordTel);
	}

	@Override
	public void update(CoordTelephonique coordTel) {
		coordTelDao.save(coordTel);
		
	}
	
	

}
