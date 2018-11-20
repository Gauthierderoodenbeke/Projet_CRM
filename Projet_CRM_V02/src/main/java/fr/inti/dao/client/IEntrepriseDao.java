package fr.inti.dao.client;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.inti.model.client.Entreprise;

@Repository
@Qualifier(value = "entrepriseDao")

public interface IEntrepriseDao extends CrudRepository<Entreprise, Long> {

}
