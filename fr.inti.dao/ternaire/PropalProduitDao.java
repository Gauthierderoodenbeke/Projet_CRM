package fr.inti.dao.ternaire;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.inti.model.produit.PropalProduit;

@Repository
@Qualifier(value = "propalProduitDao")
public interface PropalProduitDao extends CrudRepository<PropalProduit, Long> {

}
