package fr.inti.dao.campagne;

import java.util.List;

import fr.inti.model.campagne.Campagne;

public interface ICampagnePersoDao {

	public List<Campagne> findByGenre(String genre);
	
}
