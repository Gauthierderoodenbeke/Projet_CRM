package fr.inti.service.client;

import java.util.List;

import fr.inti.model.client.Contact;

/**
 * Emilie
 * @author inti
 *
 */

public interface IContactService {
	
	public void ajouterContact(Contact contact);
	public void supprimerContact(Long idContact);
	public List<Contact>findAll();
	public Contact findById(Long IdContact);
	public void update(Contact Contact);


}
