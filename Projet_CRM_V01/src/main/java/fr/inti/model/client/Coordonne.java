package fr.inti.model.client;

/**
 * 
 * @author Allan
 *
 */

public abstract class Coordonne {

	/**
	 * ATTRIUBTS
	 */
	
	protected int idCoord;
	protected Contact contact;
	

	
	/**
	 * CONSTRUCTEURS
	 */
	
	public Coordonne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Coordonne(int idCoord) {
		super();
		this.idCoord = idCoord;
	}

	/**
	 * GET&SET
	 */
	
	public int getIdCoord() {
		return idCoord;
	}

	public void setIdCoord(int idCoord) {
		this.idCoord = idCoord;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	
	
	
	
}
