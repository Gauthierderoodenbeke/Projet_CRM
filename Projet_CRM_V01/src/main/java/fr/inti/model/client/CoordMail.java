package fr.inti.model.client;

/**
 * 
 * @author Allan
 *
 */

public class CoordMail extends Coordonne {

	
	/**
	 * ATTRIBUTS
	 */
	private String mail;
	private String type;
	
	/**
	 * CONSTRUCTEURS
	 */
	public CoordMail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CoordMail(int idCoord) {
		super(idCoord);
		// TODO Auto-generated constructor stub
	}
	public CoordMail(String mail, String type) {
		super();
		this.mail = mail;
		this.type = type;
	}
	
	/**
	 * GET&SET
	 */
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "CoordMail [mail=" + mail + ", type=" + type + "]";
	}
	
	
	
	
	
}
