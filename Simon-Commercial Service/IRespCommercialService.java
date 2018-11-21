package fr.inti.service.commercial;

import java.util.List;

import fr.inti.model.commercial.RespCommercial;

public interface IRespCommercialService {

	public void ajouterRespCommercial (RespCommercial rc);
	  public void supprimerRespCommercial (Long IdRc);
	  public List<RespCommercial>findAll();
	  public RespCommercial findById(Long IdRc);
	  public void update (RespCommercial rc);
}
