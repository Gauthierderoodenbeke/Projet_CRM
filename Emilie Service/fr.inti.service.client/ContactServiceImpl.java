package fr.inti.service.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.dao.client.IContactDao;
import fr.inti.model.client.Contact;

/**
 * Emilie
 * @author inti
 *
 */

@Service
@Transactional
public class ContactServiceImpl implements IContactService{
	
	@Autowired
	private IContactDao contactDao;

	//Setter
	public void setContactDao(IContactDao contactDao) {
		this.contactDao = contactDao;
	}

	@Override
	public void ajouterContact(Contact contact) {
		contactDao.save(contact);	
	}

	@Override
	public void supprimerContact(Long idContact) {
		contactDao.delete(idContact);
	}

	@Override
	public List<Contact> findAll() {
		return (List<Contact>) contactDao.findAll();
	}

	@Transactional(readOnly=true)
	@Override
	public Contact findById(Long IdContact) {
		return contactDao.findOne(IdContact);
	}

	@Override
	public void update(Contact contact) {
		contactDao.save(contact);
		
	}

	
	
}
