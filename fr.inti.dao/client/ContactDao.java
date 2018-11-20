package fr.inti.dao.client;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.inti.model.client.Contact;

@Repository
@Qualifier(value = "contactDao")
public interface ContactDao extends CrudRepository<Contact, Long> {

}
