package fr.inti.dao.client;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.inti.model.client.Client;

@Repository
public interface IClientDao extends CrudRepository<Client, Long> {
	
	@Query(value = "SELECT c FROM Client c WHERE c.idClient in "
							+ "(Select ct.client from Contact ct "
							+ "WHERE ct.idContact in "
							+ "(SELECT commu.id.idcontact from Communication commu "
							+ "WHERE commu.id.idcommercial = :idcommercial )) "
							+ "GROUP BY c.idClient")
	public List<Client> findByCommercial(@Param("idcommercial")Long idCommercial);
	
	@Query(value="SELECT c FROM Client c WHERE c.familleClient like :famille")
	public List<Client> findByFamille(@Param("famille") String famille);
	
	@Query(value="SELECT c FROM Client c WHERE c.niveauClient like :niveau")
	public List<Client> findByNiveau(@Param("niveau") String niveau);
	

}
