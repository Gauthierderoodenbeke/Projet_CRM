package fr.inti.service.client;

import java.util.List;

import fr.inti.model.client.CoordMail;

/**
 * Emilie
 * @author inti
 *
 */

public interface ICoordMailService {
	
	public void ajouterCoordMail(CoordMail coordMail);
	public void supprimerCoordMail(Long idCoordMail);
	public List<CoordMail>findAll();
	public CoordMail findById(Long IdCoordMail);
	public void update(CoordMail coordMail);

}
