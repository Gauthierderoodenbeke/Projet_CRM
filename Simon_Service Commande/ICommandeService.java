package fr.inti.service.commande;

import java.util.List;

import fr.inti.model.commande.Commande;

public interface ICommandeService {

	 public void ajouterCommande (Commande c);
	  public void supprimerCommande (Long Idc);
	  public List<Commande>findAll();
	  public Commande findById(Long Idc);
	  public void update (Commande c);
}
