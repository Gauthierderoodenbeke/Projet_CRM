package fr.inti.dao.commercial;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.inti.model.commercial.EquipeCampagne;

@Repository
@Qualifier(value = "equipeCampagneDao")
public interface IEquipeCampagneDao extends CrudRepository<EquipeCampagne, Long> {

}
