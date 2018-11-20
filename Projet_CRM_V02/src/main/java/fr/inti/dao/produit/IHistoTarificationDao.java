package fr.inti.dao.produit;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.inti.model.produit.HistoTarification;

@Repository
@Qualifier(value = "histoTarifDao")

public interface IHistoTarificationDao extends
		CrudRepository<HistoTarification, Long> {

}
