package fr.inti.service.campagne;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.dao.campagne.ICampagneDao;
import fr.inti.dao.commercial.IEquipeCampagneDao;
import fr.inti.dao.produit.IProduitDao;
import fr.inti.model.campagne.Campagne;

/**
 * 
 * @author Alison
 *
 */


@Service
@Transactional(readOnly = false)
public class CampagneServiceImpl implements ICampagneService {

	@Autowired
	private ICampagneDao campagneDao;

	@Autowired
	private IEquipeCampagneDao EqCampagneDao;

	@Autowired
	private IProduitDao produitDao;

	@Override
	public void ajouterCampagne(Campagne c) {
		if (c.getEquipeCampagne() != null) {
			if (c.getEquipeCampagne().getIdEquipeCmp() == null) {
				EqCampagneDao.save(c.getEquipeCampagne());
			}

		}
		if (c.getProduit() != null) {
			if (c.getProduit().getIdProduit() == null) {
				produitDao.save(c.getProduit());
			}

		}
		campagneDao.save(c);
	}

	@Transactional(readOnly = true)
	@Override
	public Campagne findById(Long idCampagne) {
		return campagneDao.findOne(idCampagne);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Campagne> findAll() {
		return (List<Campagne>) campagneDao.findAll();
	}

	@Override
	public void deleteById(Long idCampagne) {
		campagneDao.delete(idCampagne);

	}

	@Override
	public void update(Campagne c) {
		campagneDao.save(c);

	}

}
