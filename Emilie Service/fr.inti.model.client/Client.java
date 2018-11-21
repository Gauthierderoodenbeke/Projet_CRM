package fr.inti.model.client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import fr.inti.model.commande.Commande;
import fr.inti.model.commercial.HistoAffectation;
import fr.inti.model.produit.Interet;

/**
 * 
 * @author Allan
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Type")
public abstract class Client implements Serializable{

	/**
	 * SERIALIZABLE
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ATTRIUBTS
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected Long idClient;
	protected String coordPrefere;
	protected String familleClient;
	protected String niveauClient;
	
	/**
	 * Emilie_ ajout cascade=CascadeType.ALL
	 */
	@OneToMany(mappedBy="client", cascade=CascadeType.ALL)
	protected List<HistoAffectation> commerciaux = new ArrayList<HistoAffectation>();
	/**
	 * Emilie_ ajout cascade=CascadeType.ALL
	 */
	@OneToMany(mappedBy="client", cascade=CascadeType.ALL)
	protected List<Commande> commandes = new ArrayList<Commande>();
	/**
	 * Emilie_ ajout cascade=CascadeType.ALL
	 */
	@OneToMany(mappedBy="client", cascade=CascadeType.ALL)
	protected List<Interet> interets = new ArrayList<Interet>();
	/**
	 * Emilie_ ajout cascade=CascadeType.ALL
	 */
	@OneToMany(mappedBy="client", cascade=CascadeType.ALL)
	private List<Contact> contacts = new ArrayList<Contact>();
	
	
	/**
	 * CONSTRUCTEURS
	 */
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(Long idClient, String coordPrefere, String familleClient,
			String niveauClient) {
		super();
		this.idClient = idClient;
		this.coordPrefere = coordPrefere;
		this.familleClient = familleClient;
		this.niveauClient = niveauClient;
	}
	public Client(String familleClient, String niveauClient) {
		super();
		this.familleClient = familleClient;
		this.niveauClient = niveauClient;
	}

	
	/**
	 * GET&SET
	 */
	
	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	public String getCoordPrefere() {
		return coordPrefere;
	}
	public void setCoordPrefere(String coordPrefere) {
		this.coordPrefere = coordPrefere;
	}
	public String getFamilleClient() {
		return familleClient;
	}
	public void setFamilleClient(String familleClient) {
		this.familleClient = familleClient;
	}
	public String getNiveauClient() {
		return niveauClient;
	}
	public void setNiveauClient(String niveauClient) {
		this.niveauClient = niveauClient;
	}
	public List<HistoAffectation> getCommerciaux() {
		return commerciaux;
	}
	public void setCommerciaux(List<HistoAffectation> commerciaux) {
		this.commerciaux = commerciaux;
	}
	/**
	 * TO STRING
	 */
	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", coordPrefere="
				+ coordPrefere + ", familleClient=" + familleClient
				+ ", niveauClient=" + niveauClient + "]";
	}
	
	
}
