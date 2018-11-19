package fr.inti.model.campagne;

import java.util.List;

public class Question {

	// ***Attributs***//
	private int idQuestion;
	private String label;

	private List<Reponse> reponses;

	// ***Constructeurs***//
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int idQuestion, String label, List<Reponse> reponses) {
		super();
		this.idQuestion = idQuestion;
		this.label = label;
		this.reponses = reponses;
	}

	public Question(String label) {
		super();
		this.label = label;
	}

	// ***Getters and Setters***//
	public int getIdQuestion() {
		return idQuestion;
	}

	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<Reponse> getReponses() {
		return reponses;
	}

	public void setReponses(List<Reponse> reponses) {
		this.reponses = reponses;
	}

	// ***toString***//
	@Override
	public String toString() {
		return "Question [idQuestion=" + idQuestion + ", label=" + label + "]";
	}

}
