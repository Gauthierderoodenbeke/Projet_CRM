package fr.inti.dao.commercial;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.inti.model.commercial.PropositionCommerciale;

@Repository
public interface IPropositionCommercialeDao extends
		CrudRepository<PropositionCommerciale, Long> {

	
	@Query(value="SELECT pc FROM PropositionCommerciale pc WHERE pc.statut like :statut")
	public List<PropositionCommerciale> findByStatut(@Param("statut") String Statut);
	
	@Query(value="SELECT pc FROM PropositionCommerciale pc WHERE pc.idPropal in (SELECT p.id.idpropal FROM PropalProduit p "
																				+ "WHERE p.id.idproduit = :idProduit)")
	public List<PropositionCommerciale> findByProduit(@Param("idProduit") Long idProd);
}
