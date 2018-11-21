package fr.inti.dao.ternaire;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.inti.model.produit.Composition;

@Repository
@Qualifier(value = "compositionDao")
public interface ICompositionDao extends CrudRepository<Composition, Long> {

}
