package fr.inti.dao.produit;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.inti.model.produit.Produit;

@Repository
@Qualifier(value = "produitDao")

public interface ProduitDao extends CrudRepository<Produit, Long> {

	
	
}
