package com.model;

import java.io.Serializable;

/**
 * Classe du bean OptionESEO.
 * 
 * <p>Définition des attributs de l'objet OptionESEO ainsi que des accesseurs et des mutateurs.</p>
 */
public class OptionESEO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4366304175505967889L;
	/* Attributs */
	private Long idOption;
	private String nomOption;

	/**
	 * Constructeur par défaut.
	 */
	public OptionESEO() {
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
	 * Accessseur pour récupérer le nom de l'option
	 * @return nomOption
	 */
	public String getNomOption() {
		return this.nomOption;
	}
	
	/**
	 * Mutateur pour modifier le nom de l'option
	 * @param nomOption
	 */
	public void setNomOption(String nomOption) {
		this.nomOption = nomOption;
	}

	/**
	 * Redéfinition de la méthode toString().
	 */
	public String toString() {
		return "Option [idOption=" + this.idOption + ", nomOption=" + this.nomOption + "]";
	}

}