package fr.inti.dao.client;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.inti.model.client.CoordTelephonique;

@Repository
@Qualifier(value = "coordTelDao")
public interface CoordTelelephoniqueDao extends
		CrudRepository<CoordTelephonique, Long> {

}
