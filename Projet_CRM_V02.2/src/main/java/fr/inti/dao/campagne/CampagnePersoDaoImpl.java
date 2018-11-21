package fr.inti.dao.campagne;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import fr.inti.model.campagne.Campagne;

public class CampagnePersoDaoImpl implements ICampagnePersoDao {

	@Autowired
	// injection automatique
	private EntityManagerFactory entityManagerF;
	public void setEntityManagerF(EntityManagerFactory entityManagerF) {
		this.entityManagerF = entityManagerF;
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Campagne> findByGenre(String genre) {
		EntityManager em = entityManagerF.createEntityManager();
		
		String sqlrequest = "SELECT * FROM campagnes WHERE genre=?";
		Query sqlQuery = em.createNativeQuery(sqlrequest, Campagne.class);
		sqlQuery.setParameter(1, genre);
		
		try {
			return (List<Campagne>) sqlQuery.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

}
