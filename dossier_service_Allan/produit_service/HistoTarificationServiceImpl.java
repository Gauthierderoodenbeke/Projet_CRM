package fr.inti.service.produit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.dao.produit.IHistoTarificationDao;
import fr.inti.dao.produit.IProduitDao;
import fr.inti.model.produit.HistoTarification;

@Service
@Transactional
public class HistoTarificationServiceImpl implements IHistoTarificationService {

	@Autowired
	IHistoTarificationDao histoTarifDao;
	
	@Autowired
	IProduitDao produitDao;
	
	@Override
	public void ajouterHistoTarification(HistoTarification ht) {
		if (ht.getProduitHisto()!=null) {
			if (ht.getProduitHisto().getIdProduit()==null) {
				produitDao.save(ht.getProduitHisto());
			}
		}

		histoTarifDao.save(ht);
	}

	@Transactional(readOnly=true)
	@Override
	public HistoTarification findById(Long idHt) {
		return histoTarifDao.findOne(idHt);
	}

	@Transactional(readOnly=true)
	@Override
	public List<HistoTarification> findAll() {
		return (List<HistoTarification>) histoTarifDao.findAll();
	}

	@Override
	public void deleteById(Long idHt) {
		histoTarifDao.delete(idHt);

	}

	@Override
	public void update(HistoTarification ht) {
		histoTarifDao.save(ht);

	}

}
