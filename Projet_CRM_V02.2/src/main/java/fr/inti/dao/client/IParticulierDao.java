package fr.inti.dao.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.inti.model.client.Client;
import fr.inti.model.client.Particulier;

@Repository
@Qualifier(value = "particulierDao")

public interface IParticulierDao extends CrudRepository<Particulier, Long> {

	@Query(value = "SELECT c FROM Client c WHERE c.nom like :nom")
	public List<Client> findByNom(@Param("nom") String nom);
	
}
