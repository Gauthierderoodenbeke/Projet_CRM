package fr.inti.service.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.dao.client.IContactDao;
import fr.inti.dao.client.ICoordMailDao;
import fr.inti.model.client.CoordMail;

/**
 * Emilie
 * @author inti
 *
 */

@Service
@Transactional
public class CoordMailServiceImpl implements ICoordMailService{

	@Autowired
	private ICoordMailDao coordMailDao;
	
	@Autowired
	private IContactDao contactDao;
	
	//Setter
	public void setCoordMailDao(ICoordMailDao coordMailDao) {
		this.coordMailDao = coordMailDao;
	}
	
	public void setContactDao(IContactDao contactDao) {
		this.contactDao = contactDao;
	}

	@Override
	public void ajouterCoordMail(CoordMail coordMail) {
		if (coordMail.getContact() != null) {	
			if (coordMail.getContact().getIdContact()== null) {
				contactDao.save(coordMail.getContact());
			}
		coordMailDao.save(coordMail);	
		}
	}

	@Override
	public void supprimerCoordMail(Long idCoordMail) {
		coordMailDao.delete(idCoordMail);	
	}

	@Override
	public List<CoordMail> findAll() {
		return (List<CoordMail>) coordMailDao.findAll();
	}
	
	@Transactional(readOnly=true)
	@Override
	public CoordMail findById(Long IdCoordMail) {
		return coordMailDao.findOne(IdCoordMail);
	}

	@Override
	public void update(CoordMail coordMail) {
		coordMailDao.save(coordMail);	
	}
	
	
	
}
