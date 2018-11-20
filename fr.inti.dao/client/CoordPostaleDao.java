package fr.inti.dao.client;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.inti.model.client.CoordPostale;

@Repository
@Qualifier(value = "coordPostaleDao")
public interface CoordPostaleDao extends CrudRepository<CoordPostale, Long> {

}
