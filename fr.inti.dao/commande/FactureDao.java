package fr.inti.dao.commande;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.inti.model.commande.Facture;

@Repository
@Qualifier(value = "factureDao")
public interface FactureDao extends CrudRepository<Facture, Long> {

}
