package com.model;

/**
 * Classe du bean NoteInteretTechno.
 * 
 * <p>Définition des attributs de l'objet NoteInteretTechno ainsi que des accesseurs et des mutateurs.</p>
 * 
 * @see NoteInteret
 */
public class NoteInteretTechno extends NoteInteret {
	
	/**
	 * Constructeur par défaut.
	 */
	public NoteInteretTechno() {
		super();
	}

	/**
	 * Redéfinition de la méthode toString().
	 */
	public String toString() {
		return "NoteInteretTechno [idProfesseur=" + this.getIdProfesseur() + ", idSujet=" + this.getIdSujet()
				+ ", note=" + this.getNote() + "]";
	}

}