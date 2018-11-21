package fr.inti.service.client;

import java.util.List;

import fr.inti.model.client.CoordMail;
import fr.inti.model.client.CoordPostale;

/**
* Emilie
* @author inti
*
*/

public interface ICoordPostaleService {
	
	public void ajouterCoordPostale(CoordPostale coordPostale);
	public void supprimerCoordPostale(Long idCoordPostale);
	public List<CoordPostale>findAll();
	public CoordPostale findById(Long IdCoordPostale);
	public void update(CoordPostale coordPostale);

}
