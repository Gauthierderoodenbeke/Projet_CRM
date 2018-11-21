package fr.inti.service.client;

import java.util.List;


import fr.inti.model.client.CoordTelephonique;

/**
 * Emilie
 * @author inti
 *
 */

public interface ICoordTelephoniqueService {
	
	public void ajouterCoordTel(CoordTelephonique coordTel);
	public void supprimerCoordTel(Long idCoordTel);
	public List<CoordTelephonique>findAll();
	public CoordTelephonique findById(Long IdCoordTel);
	public void update(CoordTelephonique coordTel);

}
