package fr.inti.service.produit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.dao.produit.IProduitDao;
import fr.inti.dao.ternaire.ICompositionDao;
import fr.inti.model.produit.Composition;

/**
 * 
 * @author Alison
 *
 */

@Service
@Transactional
public class CompositionServiceImpl implements ICompositionService {

	@Autowired
	ICompositionDao compositonDao;
	
	IProduitDao produitDao;
	
	@Override
	public void ajouterComposition(Composition comp) {
		if (comp.getComposant()!=null) {
			if (comp.getComposant().getIdProduit()==null) {
				produitDao.save(comp.getComposant());
			}
		}
		if (comp.getCompose()!=null) {
			if (comp.getCompose().getIdProduit()==null) {
				produitDao.save(comp.getCompose());
			}
		}

		compositonDao.save(comp);
	}

	@Transactional(readOnly=true)
	@Override
	public Composition findById(Long idComp) {
		return compositonDao.findOne(idComp);
	}

	@Transactional(readOnly=true)
	@Override
	public List<Composition> findAll() {
		return (List<Composition>) compositonDao.findAll();
	}

	@Override
	public void deleteById(Long idComp) {
		compositonDao.delete(idComp);

	}

	@Override
	public void update(Composition comp) {
		compositonDao.save(comp);

	}

}
