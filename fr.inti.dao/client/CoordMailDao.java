package fr.inti.dao.client;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.inti.model.client.CoordMail;

@Repository
@Qualifier(value = "coordMailDao")
public interface CoordMailDao extends CrudRepository<CoordMail, Long> {

}
