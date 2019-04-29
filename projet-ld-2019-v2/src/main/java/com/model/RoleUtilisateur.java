package com.model;

/**
 * Classe du bean RoleUtilisateur.
 * 
 * <p>Définition des attributs de l'objet RoleUtilisateur ainsi que des accesseurs et des mutateurs.</p>
 */
public class RoleUtilisateur {

	/* Attributs */
	private Long idUtilisateur;
	private Long idRole;
	private Long idOption;
	
	/**
	 * Constructeur par défaut.
	 */
	public RoleUtilisateur() {
		super();
	}

	/* Accesseurs et Mutateurs */
	/**
	 * Accessseur pour récupérer l'ID de l'utlisateur qui a un rôle
	 * @return idUtilisateur
	 */
	public Long getIdUtilisateur() {
		return this.idUtilisateur;
	}

	/**
	 * Mutateur pour modifier l'ID de l'utlisateur qui a un rôle
	 * @param idUtilisateur
	 */
	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	/**
	 * Accessseur pour récupérer l'ID du rôle qu'à l'utilisateur
	 * @return idRole
	 */
	public Long getIdRole() {
		return this.idRole;
	}

	/**
	 * Mutateur pour modifier l'ID du rôle qu'à l'utilisateur
	 * @param idRole
	 */
	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	/**
	 * Accessseur pour récupérer l'ID de l'option pour laquelle s'applique ce rôle
	 * @return idOption
	 */
	public Long getIdOption() {
		return this.idOption;
	}

	/**
	 * Mutateur pour modifier l'ID de l'option pour laquelle s'applique ce rôle
	 * @param idOption
	 */
	public void setIdOption(Long idOption) {
		this.idOption = idOption;
	}

	/**
	 * Redéfinition de la méthode toString().
	 */
	public String toString() {
		return "RoleUtilisateur [idUtilisateur=" + this.idUtilisateur + ", idRole=" + this.idRole + ", idOption="
				+ this.idOption + "]";
	}

}