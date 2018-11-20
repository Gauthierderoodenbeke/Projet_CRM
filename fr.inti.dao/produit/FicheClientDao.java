package fr.inti.dao.produit;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.inti.model.produit.FicheClient;

@Repository
@Qualifier(value = "ficheClientDao")

public interface FicheClientDao extends CrudRepository<FicheClient, Long> {

}
