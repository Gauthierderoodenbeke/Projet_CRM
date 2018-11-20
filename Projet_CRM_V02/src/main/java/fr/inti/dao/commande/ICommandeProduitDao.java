package fr.inti.dao.commande;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.inti.model.commande.CommandeProduit;

@Repository
@Qualifier(value = "commandeProduitDao")
public interface ICommandeProduitDao extends
		CrudRepository<CommandeProduit, Long> {

}
