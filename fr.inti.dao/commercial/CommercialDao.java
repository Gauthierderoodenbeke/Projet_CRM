package fr.inti.dao.commercial;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.inti.model.commercial.Commercial;

@Repository
@Qualifier(value = "commercialDao")

public interface CommercialDao extends CrudRepository<Commercial, Long> {

}
