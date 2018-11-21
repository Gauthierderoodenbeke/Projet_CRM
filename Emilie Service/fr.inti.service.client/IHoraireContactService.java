package fr.inti.service.client;

import java.util.List;

import fr.inti.model.client.HoraireContact;

/**
 * Emilie
 * @author inti
 *
 */

public interface IHoraireContactService {
	
	public void ajouterHoraireContact(HoraireContact horaireContact);
	public void supprimerHoraireContact(Long idHoraireContact);
	public List<HoraireContact>findAll();
	public HoraireContact findById(Long IdHoraireContact);
	public void update(HoraireContact horaireContact);

}
