package fr.inti.model.client;

/**
 * 
 * @author Allan
 *
 */
public class CoordTelephonique extends Coordonne {
	
	/**
	 * ATTRIBUTS
	 */
	
	private String numero;
	private String type;
	private String nature;
	private String categorie;
	private String priorite;
	
	/**
	 * CONSTRUCTEURS
	 */
	public CoordTelephonique() {
		super();
	}
	public CoordTelephonique(int idCoord, String numero,
			String type, String nature, String categorie, String priorite) {
		super(idCoord);
		this.numero = numero;
		this.type = type;
		this.nature = nature;
		this.categorie = categorie;
		this.priorite = priorite;
	}
	public CoordTelephonique( String numero,
			String type, String nature, String categorie, String priorite) {
		super();
		this.numero = numero;
		this.type = type;
		this.nature = nature;
		this.categorie = categorie;
		this.priorite = priorite;
	}
	
	/**
	 * GET&SET
	 */
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getPriorite() {
		return priorite;
	}
	public void setPriorite(String priorite) {
		this.priorite = priorite;
	}
	
	
	/**
	 * TO STRING 
	 */
	@Override
	public String toString() {
		return "CoordTelephonique [numero=" + numero + ", type=" + type
				+ ", nature=" + nature + ", categorie=" + categorie
				+ ", priorite=" + priorite + "]";
	}
	
	

}
