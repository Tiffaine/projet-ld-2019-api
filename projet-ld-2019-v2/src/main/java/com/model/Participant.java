package com.model;

/**
 * @author Mathéo GIRBAL
 *
 * Last updated on 13 avr. 2018
 */
public class Participant {

	private Long idReunion;
	private Long idUtilisateur;
	private String validation;
	
	/**
	 * Getter du paramètre idReunion de type Long
	 *
	 * @return idReunion
	 */
	public Long getIdReunion() {
		return idReunion;
	}
	
	/**
	 * Setter du paramètre idReunion de type Long
	 *
	 * @param idReunion
	 */
	public void setIdReunion(Long idReunion) {
		this.idReunion = idReunion;
	}

	/**
	 * Getter du paramètre idUtilisateur de type Long
	 *
	 * @return idUtilisateur
	 */
	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	/**
	 * Setter du paramètre idUtilisateur de type Long
	 *
	 * @param idUtilisateur
	 */
	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	/**
	 * Getter du paramètre validation de type String
	 *
	 * @return validation
	 */
	public String getValidation() {
		return validation;
	}

	/**
	 * Setter du paramètre validation de type String
	 *
	 * @param validation
	 */
	public void setValidation(String validation) {
		this.validation = validation;
	}
}
