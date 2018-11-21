package fr.inti.dao.commercial;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.inti.model.commercial.RespCommercial;

@Repository
@Qualifier(value = "respComDao")

public interface IRespCommercialDao extends CrudRepository<RespCommercial, Long> {

}
