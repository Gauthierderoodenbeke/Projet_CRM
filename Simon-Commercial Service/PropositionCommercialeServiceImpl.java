package fr.inti.service.commercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.inti.dao.commercial.IEquipeComDao;
import fr.inti.dao.commercial.IPropositionCommercialeDao;
import fr.inti.model.commercial.PropositionCommerciale;

public class PropositionCommercialeServiceImpl implements
		IPropositionCommercialeService {
	@Autowired
	IPropositionCommercialeDao pcDao;

	@Autowired
	IEquipeComDao ecDao;

	// Setters
	public void setPcDao(IPropositionCommercialeDao pcDao) {
		this.pcDao = pcDao;
	}

	public void setEcDao(IEquipeComDao ecDao) {
		this.ecDao = ecDao;
	}

	// Methodes
	@Override
	public void ajouterPropositionCommerciale(PropositionCommerciale pc) {
		if (pc.getEqCom() != null) {
			if (pc.getEqCom().getIdEquipe() == null) {
				ecDao.save(pc.getEqCom());
			}
			pcDao.save(pc);
		}
	}

	@Override
	public void supprimerPropositionCommerciale(Long Idpc) {
		pcDao.delete(Idpc);

	}

	@Override
	public List<PropositionCommerciale> findAll() {
		return (List<PropositionCommerciale>) pcDao.findAll();
	}

	@Override
	public PropositionCommerciale findById(Long Idpc) {
		return pcDao.findOne(Idpc);
	}

	@Override
	public void update(PropositionCommerciale pc) {
		pcDao.save(pc);

	}

}
