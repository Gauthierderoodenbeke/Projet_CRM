package fr.inti.model.campagne;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author Alison
 *
 */
@Entity
@Table(name="reponses")
public class Reponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// ***Attributs***//
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idReponse;
	private String intituleReponse;

	@ManyToOne
	@JoinColumn(name="question", referencedColumnName="idQuestion")
	private Question question;

	// ***Constructeurs***//
	public Reponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reponse(Long idReponse, String intituleReponse) {
		super();
		this.idReponse = idReponse;
		this.intituleReponse = intituleReponse;
	}

	public Reponse(Long idReponse, String intituleReponse, Question question) {
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
	public Long getIdReponse() {
		return idReponse;
	}

	public void setIdReponse(Long idReponse) {
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
