package fr.inti.service.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.dao.client.IContactDao;
import fr.inti.dao.client.IHoraireContactDao;
import fr.inti.model.client.HoraireContact;


/**
 * Emilie
 * @author inti
 *
 */

@Service
@Transactional
public class HoraireContactServiceImpl implements IHoraireContactService{
	
	@Autowired
	private IHoraireContactDao horaireContactDao;
	
	@Autowired
	private IContactDao contactDao;

	//setter
	public void setHoraireContactDao(IHoraireContactDao horaireContactDao) {
		this.horaireContactDao = horaireContactDao;
	}
	public void setContactDao(IContactDao contactDao) {
		this.contactDao = contactDao;
	}

	@Override
	public void ajouterHoraireContact(HoraireContact horaireContact) {
		if (horaireContact.getContact() != null) {	
			if (horaireContact.getContact().getIdContact()== null) {
				contactDao.save(horaireContact.getContact());
			}
		horaireContactDao.save(horaireContact);
		}
	}

	@Override
	public void supprimerHoraireContact(Long idHoraireContact) {
		horaireContactDao.delete(idHoraireContact);
	}

	@Override
	public List<HoraireContact> findAll() {
		return (List<HoraireContact>) horaireContactDao.findAll();
	}
	@Transactional(readOnly=true)
	@Override
	public HoraireContact findById(Long IdHoraireContact) {
		return horaireContactDao.findOne(IdHoraireContact);
	}

	@Override
	public void update(HoraireContact horaireContact) {
		horaireContactDao.save(horaireContact);
	}

}
