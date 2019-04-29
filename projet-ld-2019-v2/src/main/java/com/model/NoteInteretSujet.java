package com.model;

/**
 * Classe du bean NoteInteretSujet.
 * 
 * <p>Définition des attributs de l'objet NoteInteretSujet ainsi que des accesseurs et des mutateurs.</p>
 * 
 * @see NoteInteret
 */
public class NoteInteretSujet extends NoteInteret {
	
	/**
	 * Constructeur par défaut.
	 */
	public NoteInteretSujet() {
		super();
	}

	/**
	 * Redéfinition de la méthode toString().
	 */
	@Override
	public String toString() {
		return "NoteInteretSujet [idProfesseur=" + this.getIdProfesseur() + ", idSujet=" + this.getIdSujet() + ", note="
				+ this.getNote() + "]";
	}
	
}