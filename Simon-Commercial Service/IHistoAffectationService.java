package fr.inti.service.commercial;

import java.util.List;

import fr.inti.model.commercial.HistoAffectation;

public interface IHistoAffectationService {

	public void ajouterHistoAffectation (HistoAffectation ha);
	  public void supprimerHistoAffectation (Long IdhA);
	  public List<HistoAffectation>findAll();
	  public HistoAffectation findById(Long IdhA);
	  public void update (HistoAffectation ha);
}
