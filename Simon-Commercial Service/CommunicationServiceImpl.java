package fr.inti.service.commercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.inti.dao.client.IContactDao;
import fr.inti.dao.commercial.ICommercialDao;
import fr.inti.dao.commercial.ICommunicationDao;
import fr.inti.model.commercial.Communication;

public class CommunicationServiceImpl implements ICommunicationService {

	@Autowired
	ICommunicationDao cDao;
	
	@Autowired
	IContactDao contDao;
	
	@Autowired
	ICommercialDao comDao;
	
	//Setters
	public void setcDao(ICommunicationDao cDao) {
		this.cDao = cDao;
	}

	public void setContDao(IContactDao contDao) {
		this.contDao = contDao;
	}

	public void setComDao(ICommercialDao comDao) {
		this.comDao = comDao;
	}

	
	//Methodes
	@Override
	public void ajouterCommunication(Communication c) {
		if (c.getContact() != null) {
			if (c.getContact().getIdContact() == null) {
				contDao.save(c.getContact());
			}
		}
		if (c.getCommercial() != null) {
			if (c.getCommercial().getIdCommercial() == null) {
				comDao.save(c.getCommercial());
			}
		}
		cDao.save(c);
	}

	@Override
	public void supprimerCommunication(Long IdComm) {
		cDao.delete(IdComm);

	}

	@Override
	public List<Communication> findAll() {
		return (List<Communication>) cDao.findAll();
	}

	@Override
	public Communication findById(Long IdComm) {
		return cDao.findOne(IdComm);
	}

	@Override
	public void update(Communication c) {
		cDao.save(c);
	}

}
