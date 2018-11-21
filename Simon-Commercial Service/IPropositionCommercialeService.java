package fr.inti.service.commercial;

import java.util.List;

import fr.inti.model.commercial.PropositionCommerciale;

public interface IPropositionCommercialeService {

	public void ajouterPropositionCommerciale (PropositionCommerciale pc);
	  public void supprimerPropositionCommerciale (Long Idpc);
	  public List<PropositionCommerciale>findAll();
	  public PropositionCommerciale findById(Long Idpc);
	  public void update (PropositionCommerciale pc);
}
