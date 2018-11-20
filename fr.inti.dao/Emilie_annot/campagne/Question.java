package fr.inti.model.campagne;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="question")
public class Question implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// ***Attributs***//
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idQuestion;
	private String label;

	@OneToMany(mappedBy="question")
	private List<Reponse> reponses;
	
	@ManyToOne
	@JoinColumn(name="Questionnaire", referencedColumnName="idCampagne")
	private Questionnaire questionnaire;

	// ***Constructeurs***//
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	//constructeur avec args (all)
	public Question(Long idQuestion, String label, List<Reponse> reponses,
			Questionnaire questionnaire) {
		super();
		this.idQuestion = idQuestion;
		this.label = label;
		this.reponses = reponses;
		this.setQuestionnaire(questionnaire);
	}
	//constructeur avec args (sans id)
	public Question(String label, List<Reponse> reponses,
			Questionnaire questionnaire) {
		super();
		this.label = label;
		this.reponses = reponses;
		this.setQuestionnaire(questionnaire);
	}
	public Question(String label) {
		super();
		this.label = label;
	}

	// ***Getters and Setters***//
	public Long getIdQuestion() {
		return idQuestion;
	}

	public void setIdQuestion(Long idQuestion) {
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
	public Questionnaire getQuestionnaire() {
		return questionnaire;
	}
	public void setQuestionnaire(Questionnaire questionnaire) {
		this.questionnaire = questionnaire;
	}

}
