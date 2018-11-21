package fr.inti.service.produit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.dao.produit.IProduitDao;
import fr.inti.model.produit.Produit;

@Service
@Transactional(readOnly=false)
public class ProduitServiceImpl implements IProduitService {

	@Autowired
	IProduitDao produitDao;
	
	@Override
	public void ajouterProduit(Produit p) {
		produitDao.save(p);

	}

	@Transactional(readOnly=true)
	@Override
	public Produit findById(Long idProduit) {
		return produitDao.findOne(idProduit);
	}

	@Transactional(readOnly=true)
	@Override
	public List<Produit> findAll() {
		return (List<Produit>) produitDao.findAll();
	}

	@Override
	public void deleteById(Long idProduit) {
		produitDao.delete(idProduit);

	}

	@Override
	public void update(Produit p) {
		produitDao.save(p);

	}

}
