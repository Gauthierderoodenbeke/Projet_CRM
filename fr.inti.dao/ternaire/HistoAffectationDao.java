package fr.inti.dao.ternaire;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.inti.model.commercial.HistoAffectation;

@Repository
@Qualifier(value = "histoAffectationDao")
public interface HistoAffectationDao extends
		CrudRepository<HistoAffectation, Long> {

}
