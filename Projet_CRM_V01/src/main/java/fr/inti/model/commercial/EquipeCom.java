package fr.inti.model.commercial;

import java.util.List;

import fr.inti.model.produit.FicheClient;

/**
 * 
 * @author Saï
 *
 */

public class EquipeCom {

	public int idEquipe;
	public List<Commercial> commerciaux;
	private List<FicheClient> fichesClient;
	private List<PropositionCommerciale> propositionCommerciales;
	private RespCommercial respCommercial;

	// G&S
	public int getIdEquipe() {
		return idEquipe;
	}

	public void setIdEquipe(int idEquipe) {
		this.idEquipe = idEquipe;
	}

	public List<Commercial> getCommerciaux() {
		return commerciaux;
	}

	public void setCommerciaux(List<Commercial> commerciaux) {
		this.commerciaux = commerciaux;
	}

	public List<FicheClient> getFichesClient() {
		return fichesClient;
	}

	public void setFichesClient(List<FicheClient> fichesClient) {
		this.fichesClient = fichesClient;
	}

	public List<PropositionCommerciale> getPropositionCommerciales() {
		return propositionCommerciales;
	}

	public void setPropositionCommerciales(
			List<PropositionCommerciale> propositionCommerciales) {
		this.propositionCommerciales = propositionCommerciales;
	}

	public RespCommercial getRespCommercial() {
		return respCommercial;
	}

	public void setRespCommercial(RespCommercial respCommercial) {
		this.respCommercial = respCommercial;
	}

	// Constructeurs
	public EquipeCom() {
		super();
		// TODO Auto-generated constructor stub

	}

	public EquipeCom(List<Commercial> commerciaux,
			List<FicheClient> fichesClient,
			List<PropositionCommerciale> propositionCommerciales,
			RespCommercial respCommercial) {
		super();
		this.commerciaux = commerciaux;
		this.fichesClient = fichesClient;
		this.propositionCommerciales = propositionCommerciales;
		this.respCommercial = respCommercial;
	}

	public EquipeCom(int idEquipe, List<Commercial> commerciaux,
			List<FicheClient> fichesClient,
			List<PropositionCommerciale> propositionCommerciales,
			RespCommercial respCommercial) {
		super();
		this.idEquipe = idEquipe;
		this.commerciaux = commerciaux;
		this.fichesClient = fichesClient;
		this.propositionCommerciales = propositionCommerciales;
		this.respCommercial = respCommercial;
	}

}
