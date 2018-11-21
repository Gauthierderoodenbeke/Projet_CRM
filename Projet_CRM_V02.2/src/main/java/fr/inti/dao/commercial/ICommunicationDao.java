package fr.inti.dao.commercial;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.inti.model.commercial.Communication;

@Repository
@Qualifier(value = "communicationDao")

public interface ICommunicationDao extends CrudRepository<Communication, Long> {

}
