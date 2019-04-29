package com.model;

/**
 * Classe du bean NoteInteret.
 * 
 * <p>Cette classe centralise des attributs et des méthodes utilisés par NoteInteretTechno et NoteInteretSujet.</p>
 */
public class NoteInteret {

	/* Attributs */ 
	private Long idProfesseur;
	private Long idSujet;
	private Integer note;
	
	/**
	 * Constructeur par défaut.
	 */
	public NoteInteret() {
		super();
	}

	/* Accesseurs et Mutateurs */
	/**
	 * Accessseur pour récupérer l'ID du professeur qui met la note
	 * @return idProfesseur
	 */
	public Long getIdProfesseur() {
		return this.idProfesseur;
	}

	/**
	 * Mutateur pour modifier l'ID du professeur qui met la note
	 * @param idProfesseur
	 */
	public void setIdProfesseur(Long idProfesseur) {
		this.idProfesseur = idProfesseur;
	}

	/**
	 * Accessseur pour récupérer l'ID du sujet noté
	 * @return idSujet
	 */
	public Long getIdSujet() {
		return this.idSujet;
	}

	/**
	 * Mutateur pour modifier l'ID du sujet noté
	 * @param idSujet
	 */
	public void setIdSujet(Long idSujet) {
		this.idSujet = idSujet;
	}

	/**
	 * Accessseur pour récupérer la note attribuée
	 * @return note
	 */
	public Integer getNote() {
		return this.note;
	}

	/**
	 * Mutateur pour modifier la note attribuée
	 * @param note
	 */
	public void setNote(Integer note) {
		this.note = note;
	}
	
}