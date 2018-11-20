package fr.inti.dao.commercial;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.inti.model.commercial.EquipeCom;

@Repository
@Qualifier(value = "equipeComDao")
public interface EquipeComDao extends CrudRepository<EquipeCom, Long> {

}
