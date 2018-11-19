package fr.inti.model.campagne;

/**
 * 
 * @author Alison
 *
 */
public class Reponse {

	// ***Attributs***//
	private int idReponse;
	private String intituleReponse;

	private Question question;

	// ***Constructeurs***//
	public Reponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reponse(int idReponse, String intituleReponse) {
		super();
		this.idReponse = idReponse;
		this.intituleReponse = intituleReponse;
	}

	public Reponse(int idReponse, String intituleReponse, Question question) {
		super();
		this.idReponse = idReponse;
		this.intituleReponse = intituleReponse;
		this.question = question;
	}

	public Reponse(String intituleReponse) {
		super();
		this.intituleReponse = intituleReponse;
	}

	// ***Getters and Setters***//
	public int getIdReponse() {
		return idReponse;
	}

	public void setIdReponse(int idReponse) {
		this.idReponse = idReponse;
	}

	public String getIntituleReponse() {
		return intituleReponse;
	}

	public void setIntituleReponse(String intituleReponse) {
		this.intituleReponse = intituleReponse;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	// ***toString***//
	@Override
	public String toString() {
		return "Reponse [idReponse=" + idReponse + ", intituleReponse="
				+ intituleReponse + "]";
	}

}
