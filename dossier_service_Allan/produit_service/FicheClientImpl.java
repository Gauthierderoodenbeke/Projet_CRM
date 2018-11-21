package fr.inti.service.produit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.dao.commercial.IEquipeComDao;
import fr.inti.dao.produit.IFicheClientDao;
import fr.inti.model.produit.FicheClient;

/**
 * 
 * @author Alison
 *
 */

@Service
@Transactional
public class FicheClientImpl implements IFicheClientService {

	@Autowired
	IFicheClientDao ficheClientDao;
	
	@Autowired
	IEquipeComDao equipeComDao;
	
	
	@Override
	public void ajouterFicheClient(FicheClient fc) {
		if (fc.getEquipeCom()!=null) {
			if(fc.getEquipeCom().getIdEquipe()==null){
				equipeComDao.save(fc.getEquipeCom());
			}
		}

		ficheClientDao.save(fc);
	}

	@Transactional(readOnly=true)
	@Override
	public FicheClient findById(Long idFc) {
		return ficheClientDao.findOne(idFc);
	}

	@Transactional(readOnly=true)
	@Override
	public List<FicheClient> findAll() {
		return (List<FicheClient>) ficheClientDao.findAll();
	}

	@Override
	public void deleteById(Long idFc) {
		ficheClientDao.delete(idFc);

	}

	@Override
	public void update(FicheClient fc) {
		ficheClientDao.save(fc);

	}

}
