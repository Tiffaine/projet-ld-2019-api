package com.model;

/**
 * Classe du bean PorteurSujet.
 * 
 * <p>Définition des attributs de l'objet PorteurSujet ainsi que des accesseurs et des mutateurs.</p>
 */
public class PorteurSujet {

	/* Attributs */ 
	private Long idSujet;
	private Long idUtilisateur;
	private Integer annee;
	
	/**
	 * Constructeur par défaut.
	 */
	public PorteurSujet() {
		super();
	}

	/* Accesseurs et Mutateurs */
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
	 * Accessseur pour récupérer l'ID du porteur du sujet
	 * @return idUtilisateur
	 */
	public Long getIdUtilisateur() {
		return this.idUtilisateur;
	}

	/**
	 * Mutateur pour modifier l'ID du porteur du sujet
	 * @param idUtilisateur
	 */
	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	/**
	 * Accessseur pour récupérer l'année durant laquelle cet utilisateur porte ce sujet
	 * @return annee
	 */
	public Integer getAnnee() {
		return this.annee;
	}

	/**
	 * Mutateur pour modifier l'année durant laquelle cet utilisateur porte ce sujet
	 * @param annee
	 */
	public void setAnnee(Integer annee) {
		this.annee = annee;
	}

	/**
	 * Redéfinition de la méthode toString().
	 */
	public String toString() {
		return "PorteurSujet [idSujet=" + this.idSujet + ", idUtilisateur=" + this.idUtilisateur + ", annee="
				+ this.annee + "]";
	}

}