package fr.inti.model.produit;

public class FicheClientProduit {
	
	/**
	 * Emilie package produit
	 */
	
	private FicheClient ficheClient;
	private Produit produit;
	
	private int quantite;

	//Constructeur sans arg
	public FicheClientProduit() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Constructeur avec arg
	public FicheClientProduit(FicheClient ficheClient, Produit produit,
			int quantite) {
		super();
		this.ficheClient = ficheClient;
		this.produit = produit;
		this.quantite = quantite;
	}
	//constructeur avec arg (sans ficheClient et sans produit)
	public FicheClientProduit(int quantite) {
		super();
		this.quantite = quantite;
	}
	//toString
	@Override
	public String toString() {
		return "FicheClientProduit [quantite=" + quantite + "]";
	}
	//Getters and setters
	public FicheClient getFicheClient() {
		return ficheClient;
	}
	public void setFicheClient(FicheClient ficheClient) {
		this.ficheClient = ficheClient;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	

}
