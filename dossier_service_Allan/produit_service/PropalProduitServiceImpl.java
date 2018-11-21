package fr.inti.service.produit;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.dao.commercial.IPropositionCommercialeDao;
import fr.inti.dao.produit.IProduitDao;
import fr.inti.dao.ternaire.IPropalProduitDao;
import fr.inti.model.produit.PropalProduit;

/**
 * 
 * @author Alison
 *
 */

@Service
@Transactional
public class PropalProduitServiceImpl implements IPropalProduitService {

	IPropalProduitDao ppProduitDao;
	IProduitDao produitDao;
	IPropositionCommercialeDao propComDao;
	
	
	@Override
	public void ajouterPropalProduit(PropalProduit pp) {
		if (pp.getProduit() != null) {
			if (pp.getProduit().getIdProduit() == null) {
				produitDao.save(pp.getProduit());
			}

		}
		if (pp.getPropCom()!=null) {
			if (pp.getPropCom().getIdPropal()==null) {
				propComDao.save(pp.getPropCom());
			}
		}
		ppProduitDao.save(pp);

	}

	@Transactional(readOnly=true)
	@Override
	public PropalProduit findById(Long idPp) {
		return ppProduitDao.findOne(idPp);
	}

	@Transactional(readOnly=true)
	@Override
	public List<PropalProduit> findAll() {
		return (List<PropalProduit>) ppProduitDao.findAll();
	}

	@Override
	public void deleteById(Long idPp) {
		ppProduitDao.delete(idPp);

	}

	@Override
	public void update(PropalProduit pp) {
		ppProduitDao.save(pp);

	}

}
