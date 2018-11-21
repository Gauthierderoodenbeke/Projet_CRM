package fr.inti.dao.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.inti.model.client.Client;
import fr.inti.model.client.Entreprise;

@Repository
@Qualifier(value = "entrepriseDao")

public interface IEntrepriseDao extends CrudRepository<Entreprise, Long> {

	@Query(value="SELECT c FROM Client c WHERE c.nom like :raisonSociale")
	public List<Client> findByRaisonSocial(@Param("raisonSociale") String raisonSociale);
}
