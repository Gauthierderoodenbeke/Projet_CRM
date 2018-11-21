package fr.inti.service.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import fr.inti.dao.client.IContactDao;
import fr.inti.dao.client.ICoordPostaleDao;
import fr.inti.model.client.CoordPostale;


/**
 * Emilie
 * @author inti
 *
 */

@Service
@Transactional
public class CoordPostaleServiceImpl implements ICoordPostaleService{

	
	@Autowired
	private ICoordPostaleDao coordPostaleDao;
	
	@Autowired
	private IContactDao contactDao;
	
	//Setters
	public void setCoordPostaleDao(ICoordPostaleDao coordPostaleDao) {
		this.coordPostaleDao = coordPostaleDao;
	}
	public void setContactDao(IContactDao contactDao) {
		this.contactDao = contactDao;
	}
	
	@Override
	public void ajouterCoordPostale(CoordPostale coordPostale) {
		if (coordPostale.getContact() != null) {	
			if (coordPostale.getContact().getIdContact()== null) {
				contactDao.save(coordPostale.getContact());
			}
		coordPostaleDao.save(coordPostale);
		}
	}


	@Override
	public void supprimerCoordPostale(Long idCoordPostale) {
		coordPostaleDao.delete(idCoordPostale);
		
	}

	@Override
	public List<CoordPostale> findAll() {
		return (List<CoordPostale>) coordPostaleDao.findAll();
	}
	@Transactional(readOnly=true)
	@Override
	public CoordPostale findById(Long IdCoordPostale) {
		return coordPostaleDao.findOne(IdCoordPostale);
	}

	@Override
	public void update(CoordPostale coordPostale) {
		coordPostaleDao.save(coordPostale);
		
	}

}
