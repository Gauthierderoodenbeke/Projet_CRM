package fr.inti.dao.commercial;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.inti.model.commercial.PropositionCommerciale;

@Repository
@Qualifier(value = "propComDao")

public interface IPropositionCommercialeDao extends
		CrudRepository<PropositionCommerciale, Long> {

}
