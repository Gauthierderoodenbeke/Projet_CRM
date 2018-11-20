package fr.inti.dao.commande;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.inti.model.commande.Commande;

@Repository
@Qualifier(value = "commandeDao")
public interface CommandeDao extends CrudRepository<Commande, Long> {

}
