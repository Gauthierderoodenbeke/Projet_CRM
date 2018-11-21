package fr.inti.model.commercial;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import fr.inti.model.produit.FicheClient;

/**
 * 
 * @author Saï
 *
 */
@Entity
@Table(name="EquipeCom")
public class EquipeCom implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEquipe;
	private String nom;
	
	@OneToMany(mappedBy="equipeCampagne")
	private List<Commercial> commerciaux;
	@OneToMany(mappedBy="equipeCom")
	private List<FicheClient> fichesClient;
	@OneToMany(mappedBy="equipeCom")
	private List<PropositionCommerciale> propositionCommerciales;
	@OneToOne(mappedBy="equipeCom")
	private RespCommercial respCommercial;
	
	//G&S

	public List<Commercial> getCommerciaux() {
		return commerciaux;
	}

	public Long getIdEquipe() {
		return idEquipe;
	}

	public void setIdEquipe(Long idEquipe) {
		this.idEquipe = idEquipe;
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
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	//Constructeurs
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
	public EquipeCom(String nom) {
		super();
		this.nom = nom;
	}
	public EquipeCom(Long idEquipe, List<Commercial> commerciaux,
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
