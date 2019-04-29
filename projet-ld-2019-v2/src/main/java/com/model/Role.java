package com.model;

import java.io.Serializable;

/**
 * Classe du bean Role.
 * 
 * <p>Définition des attributs de l'objet Role ainsi que des accesseurs et des mutateurs.</p>
 */
public class Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/* Attributs */ 
	private Long idRole;
	private String nomRole;

	/**
	 * Constructeur par défaut.
	 */
	public Role() {
		super();
	}

	/* Accesseurs et Mutateurs */
	/**
	 * Mutateur pour modifier l'ID du rôle
	 * @param idRole
	 */
	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	/**
	 * Accessseur pour récupérer l'ID du rôle
	 * @return idRole
	 */
	public Long getIdRole() {
		return this.idRole;
	}

	/**
	 * Mutateur pour modifier le nom du rôle
	 * @param nomRole
	 */
	public void setNomRole(String nomRole) {
		this.nomRole = nomRole;
	}

	/**
	 * Accessseur pour récupérer le nom du rôle
	 * @return nomRole
	 */
	public String getNomRole() {
		return this.nomRole;
	}

	/**
	 * Redéfinition de la méthode toString().
	 */
	public String toString() {
		return "Role [idRole=" + this.idRole + ", nomRole=" + this.nomRole + "]";
	}

}