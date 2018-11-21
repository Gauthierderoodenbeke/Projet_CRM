package fr.inti.service.commercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.inti.dao.commercial.IEquipeComDao;
import fr.inti.dao.commercial.IRespCommercialDao;
import fr.inti.model.commercial.RespCommercial;

public class RespCommercialServiceImpl implements IRespCommercialService {

	@Autowired
	IRespCommercialDao rcDao;

	@Autowired
	IEquipeComDao eqCoDao;

	// Setters
	public void setRcDao(IRespCommercialDao rcDao) {
		this.rcDao = rcDao;
	}

	public void setEqCoDao(IEquipeComDao eqCoDao) {
		this.eqCoDao = eqCoDao;
	}

	// Methodes
	@Override
	public void ajouterRespCommercial(RespCommercial rc) {
		if (rc.getEquipeCom() != null) {
			if (rc.getEquipeCom().getIdEquipe() == null) {
				eqCoDao.save(rc.getEquipeCom());
			}
		}

		rcDao.save(rc);
	}

	@Override
	public void supprimerRespCommercial(Long IdRc) {
		rcDao.delete(IdRc);

	}

	@Override
	public List<RespCommercial> findAll() {
		return (List<RespCommercial>) rcDao.findAll();
	}

	@Override
	public RespCommercial findById(Long IdRc) {
		return rcDao.findOne(IdRc);
	}

	@Override
	public void update(RespCommercial rc) {
		rcDao.save(rc);

	}

}
