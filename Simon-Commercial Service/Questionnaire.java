package fr.inti.model.campagne;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.inti.model.commercial.EquipeCampagne;
import fr.inti.model.produit.Produit;

/**
 * 
 * @author Alison
 *
 */
@Entity
@Table(name="questionnaires")
public class Questionnaire extends Campagne {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// ***Attributs***//
	private String typeQuestionnaire;
	
	@OneToMany(mappedBy="questionnaire")
	private List<Question> questions;

	// ***Constructeurs***//
	public Questionnaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Questionnaire(Long idCampagne, String type, String objectifCom,
			String lieu, String typeClient, String formeAnnonce,
			String message, String status, EquipeCampagne equipeCampagne,
			Produit produit) {
		super(idCampagne, type, objectifCom, lieu, typeClient, formeAnnonce,
				message, status, equipeCampagne, produit);
		// TODO Auto-generated constructor stub
	}

	public Questionnaire(String type, String objectifCom, String lieu,
			String typeClient, String formeAnnonce, String message,
			String status, EquipeCampagne equipeCampagne, Produit produit) {
		super(type, objectifCom, lieu, typeClient, formeAnnonce, message,
				status, equipeCampagne, produit);
		// TODO Auto-generated constructor stub
	}

	public Questionnaire(String type, String objectifCom, String lieu,
			String typeClient, String formeAnnonce, String message,
			String status) {
		super(type, objectifCom, lieu, typeClient, formeAnnonce, message,
				status);
		// TODO Auto-generated constructor stub
	}

	public Questionnaire(String typeQuestionnaire, List<Question> questions) {
		super();
		this.typeQuestionnaire = typeQuestionnaire;
		this.questions = questions;
	}

	// ***Getters and Setters***//
	public String getTypeQuestionnaire() {
		return typeQuestionnaire;
	}

	public void setTypeQuestionnaire(String typeQuestionnaire) {
		this.typeQuestionnaire = typeQuestionnaire;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	// ***toString***//
	@Override
	public String toString() {
		return "Questionnaire [typeQuestionnaire=" + typeQuestionnaire + "]";
	}

}
