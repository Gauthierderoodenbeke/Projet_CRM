package fr.inti.service.produit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.dao.produit.IFicheClientDao;
import fr.inti.dao.produit.IProduitDao;
import fr.inti.dao.ternaire.IFicheClientProduitDao;
import fr.inti.model.produit.FicheClientProduit;

/**
 * 
 * @author Alison
 *
 */

@Service
@Transactional
public class FicheClientProduitServiceImpl implements
		IFicheClientProduitService {

	@Autowired
	IFicheClientProduitDao ficheClientProduitDao;
	
	@Autowired
	IFicheClientDao ficheClientDao;
	
	@Autowired
	IProduitDao produitDao;
	
	@Override
	public void ajouterFicheClientProduit(FicheClientProduit fcp) {
		if (fcp.getProduit()!=null) {
			if(fcp.getProduit().getIdProduit()==null){
				produitDao.save(fcp.getProduit());
			}
		}
		if (fcp.getFicheClient()!=null) {
			if (fcp.getFicheClient().getIdFicheClient()==null) {
				ficheClientDao.save(fcp.getFicheClient());
			}
		}

		ficheClientProduitDao.save(fcp);
	}

	@Transactional(readOnly=true)
	@Override
	public FicheClientProduit findById(Long idFcp) {
		return ficheClientProduitDao.findOne(idFcp);
	}

	@Transactional(readOnly=true)
	@Override
	public List<FicheClientProduit> findAll() {
		return (List<FicheClientProduit>) ficheClientProduitDao.findAll();
	}

	@Override
	public void deleteById(Long idFcp) {
		ficheClientProduitDao.delete(idFcp);

	}

	@Override
	public void update(FicheClientProduit fcp) {
		ficheClientProduitDao.save(fcp);

	}

}
