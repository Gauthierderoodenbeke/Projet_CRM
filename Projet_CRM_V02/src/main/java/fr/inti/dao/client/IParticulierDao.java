package fr.inti.dao.client;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.inti.model.client.Particulier;

@Repository
@Qualifier(value = "particulierDao")

public interface IParticulierDao extends CrudRepository<Particulier, Long> {

}
