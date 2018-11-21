package fr.inti.dao.campagne;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.inti.model.campagne.Campagne;

@Repository
public interface ICampagneDao extends CrudRepository<Campagne, Long> {
	
	@Query(value="SELECT c FROM Campagne c WHERE c.statut like :statut")
	public List<Campagne> findByStatut(@Param("statut") String statut);
	
	@Query(value="SELECT c FROM Campagne c WHERE c.equipeCampagne = :equipeCmp")
	public List<Campagne> findByEquipe(@Param("equipeCmp") Long idEquipeCmp);
	
}
