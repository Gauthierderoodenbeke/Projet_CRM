package fr.inti.service.commercial;

import java.util.List;

import fr.inti.model.commercial.Communication;

public interface ICommunicationService {

	public void ajouterCommunication (Communication c);
	  public void supprimerCommunication (Long IdComm);
	  public List<Communication>findAll();
	  public Communication findById(Long IdComm);
	  public void update (Communication c);
}
