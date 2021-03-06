package fr.inti.dao.client;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.inti.model.client.Client;

@Repository
@Qualifier(value = "clientDao")

public interface ClientDao extends CrudRepository<Client, Long> {

}
