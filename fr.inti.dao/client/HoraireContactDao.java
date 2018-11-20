package fr.inti.dao.client;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.inti.model.client.HoraireContact;

@Repository
@Qualifier(value = "horaireContactDao")
public interface HoraireContactDao extends CrudRepository<HoraireContact, Long> {

}
