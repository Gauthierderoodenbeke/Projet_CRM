package fr.inti.dao.ternaire;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.inti.model.produit.FicheClientProduit;

@Repository
@Qualifier(value = "ficheClientProduitDao")
public interface IFicheClientProduitDao extends
		CrudRepository<FicheClientProduit, Long> {

}
