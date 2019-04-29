package com.model;

/**
 * Classe du bean OptionSujet.
 * 
 * <p>Définition des attributs de l'objet OptionSujet ainsi que des accesseurs et des mutateurs.</p>
 */
public class OptionSujet {

	/* Attributs */ 
	private Long idOption;
	private Long idSujet;
	
	/**
	 * Constructeur par défaut.
	 */
	public OptionSujet() {
		super();
	}

	/* Accesseurs et Mutateurs */
	/**
	 * Accessseur pour récupérer l'ID de l'option
	 * @return idOption
	 */
	public Long getIdOption() {
		return this.idOption;
	}

	/**
	 * Mutateur pour modifier l'ID de l'option
	 * @param idOption
	 */
	public void setIdOption(Long idOption) {
		this.idOption = idOption;
	}

	/**
	 * Accessseur pour récupérer l'ID du sujet
	 * @return idSujet
	 */
	public Long getIdSujet() {
		return this.idSujet;
	}

	/**
	 * Mutateur pour modifier l'ID du sujet
	 * @param idSujet
	 */
	public void setIdSujet(Long idSujet) {
		this.idSujet = idSujet;
	}

	/**
	 * Redéfinition de la méthode toString().
	 */
	public String toString() {
		return "OptionSujet [idOption=" + this.idOption + ", idSujet=" + this.idSujet + "]";
	}

}