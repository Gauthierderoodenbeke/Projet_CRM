package fr.inti.model.client;

import java.util.ArrayList;
import java.util.List;

import fr.inti.model.commande.Commande;
import fr.inti.model.commercial.Commercial;
import fr.inti.model.produit.Interet;

/**
 * 
 * @author Allan
 *
 */

public class Client {

	/**
	 * ATTRIUBTS
	 */
	
	protected int idClient;
	protected Coordonne coordPrefere;
	protected String familleClient;
	protected String niveauClient;
	protected List<Commercial> commerciaux = new ArrayList<Commercial>();
	protected List<Commande> commandes = new ArrayList<Commande>();
	protected List<Interet> interets = new ArrayList<Interet>();
	
	/**
	 * CONSTRUCTEURS
	 */
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(int idClient, Coordonne coordPrefere, String familleClient,
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
	
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public Coordonne getCoordPrefere() {
		return coordPrefere;
	}
	public void setCoordPrefere(Coordonne coordPrefere) {
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
	public List<Commercial> getCommerciaux() {
		return commerciaux;
	}
	public void setCommerciaux(List<Commercial> commerciaux) {
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
