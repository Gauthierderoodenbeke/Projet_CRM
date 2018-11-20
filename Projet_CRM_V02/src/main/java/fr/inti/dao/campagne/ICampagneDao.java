package fr.inti.dao.campagne;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.inti.model.campagne.Campagne;

@Repository
@Qualifier(value = "campagneDao")
public interface ICampagneDao extends CrudRepository<Campagne, Long> {

}
