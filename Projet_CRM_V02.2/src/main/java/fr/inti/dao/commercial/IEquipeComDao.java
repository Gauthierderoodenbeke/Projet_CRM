package fr.inti.dao.commercial;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.inti.model.commercial.EquipeCom;

@Repository
public interface IEquipeComDao extends CrudRepository<EquipeCom, Long> {

	@Query(value="SELECT ec FROM EquipeCom ec WHERE ec.nom like :nom")
	public List<EquipeCom> findByNom(@Param("nom") String nom);
	
	@Query(value="SELECT ec FROM EquipeCom ec WHERE ec.idEquipe in (SELECT rc.equipeCom FROM RespCommercial rc "
																	+ "WHERE rc.idCommercial = :idResponsable)")
	public List<EquipeCom> findByResponsable(@Param("idResponsable") Long idRc);
	
}
