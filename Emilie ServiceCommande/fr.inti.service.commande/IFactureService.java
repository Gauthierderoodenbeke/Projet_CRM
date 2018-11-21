package fr.inti.service.commande;

import java.util.List;

import fr.inti.model.commande.Facture;

/**
 * Emilie
 * @author inti
 *
 */

public interface IFactureService {
	
	public void ajouterFacture(Facture facture);
	public void supprimerFacture(Long idFacture);
	public List<Facture>findAll();
	public Facture findById(Long IdFacture);
	public void update(Facture facture);

}
