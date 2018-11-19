package fr.inti.model.campagne;

import java.util.List;

import fr.inti.model.commercial.EquipeCampagne;
import fr.inti.model.produit.Produit;

/**
 * 
 * @author Alison
 *
 */
public class Questionnaire extends Campagne {

	// ***Attributs***//
	private String typeQuestionnaire;
	private List<Question> questions;

	// ***Constructeurs***//
	public Questionnaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Questionnaire(int idCampagne, String type, String objectifCom,
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
