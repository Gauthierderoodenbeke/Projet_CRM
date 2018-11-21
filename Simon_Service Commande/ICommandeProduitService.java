package fr.inti.service.commande;

import java.util.List;

import fr.inti.model.commande.CommandeProduit;

public interface ICommandeProduitService {

	 public void ajouterCommandeProduit (CommandeProduit cp);
	  public void supprimerCommandeProduit (Long Idcp);
	  public List<CommandeProduit>findAll();
	  public CommandeProduit findById(Long Idcp);
	  public void update (CommandeProduit cp);
}
