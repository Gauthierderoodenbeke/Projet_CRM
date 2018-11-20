package fr.inti.dao.ternaire;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.inti.model.produit.Interet;

@Repository
@Qualifier(value = "interetDao")
public interface IInteretDao extends CrudRepository<Interet, Long> {

}
