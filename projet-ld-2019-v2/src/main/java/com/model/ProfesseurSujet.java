package com.model;

/**
 * Classe du bean ProfesseurSujet.
 * 
 * <p>Définition des attributs de l'objet ProfesseurSujet ainsi que des accesseurs et des mutateurs.</p>
 */
public class ProfesseurSujet {

	/* Attributs */
	Long idProfesseur;
	Long idSujet;
	FonctionProfesseurSujet fonction;
	String valide;

	/**
	 * Constructeur par défaut.
	 */
	public ProfesseurSujet() {
		super();
	}

	/* Accesseurs et Mutateurs */
	/**
	 * Accessseur pour récupérer l'ID du professeur qui a un rôle sur ce sujet
	 * @return idProfesseur
	 */
	public Long getIdProfesseur() {
		return this.idProfesseur;
	}

	/**
	 * Mutateur pour modifier l'ID du professeur qui a un rôle sur ce sujet
	 * @param idProfesseur
	 */
	public void setIdProfesseur(Long idProfesseur) {
		this.idProfesseur = idProfesseur;
	}

	/**
	 * Accessseur pour récupérer l'ID du sujet sur lequel le professeur a postulé
	 * @return idSujet
	 */
	public Long getIdSujet() {
		return this.idSujet;
	}

	/**
	 * Mutateur pour modifier l'ID du sujet sur lequel le professeur a postulé
	 * @param idSujet
	 */
	public void setIdSujet(Long idSujet) {
		this.idSujet = idSujet;
	}

	/**
	 * Accessseur pour récupérer la fonction pour laquelle le professeur a postulé
	 * @return fonction
	 */
	public FonctionProfesseurSujet getFonction() {
		return this.fonction;
	}

	/**
	 * Mutateur pour modifier la fonction pour laquelle le professeur a postulé
	 * @param fonction
	 */
	public void setFonction(FonctionProfesseurSujet fonction) {
		this.fonction = fonction;
	}
	
	/**
	 * Donne une fonction au ProfesseurSujet.
	 * 
	 * @param fonction la fonction donnée au ProfesseurSujet.
	 */
	public void setFonctionString(String fonction) {
		if ("co-encadrant".equals(fonction)) {
			this.fonction = FonctionProfesseurSujet.COENCADRANT;
		} else if ("consultant".equals(fonction)) {
			this.fonction = FonctionProfesseurSujet.CONSULTANT;
		} else if ("interessé".equals(fonction)) {
			this.fonction = FonctionProfesseurSujet.INTERESSE;
		} else if ("référent".equals(fonction)) {
			this.fonction = FonctionProfesseurSujet.REFERENT;
		} else {
			throw new BeanException("La fonction professeur/sujet entrée en paramètre n'existe pas !");
		}
	}
	
	public String getValide() {
		return this.valide;
	}

	public void setValide(String valide) {
		this.valide = valide;
	}

	/**
	 * Redéfinition de la méthode toString().
	 */
	public String toString() {
		return "ProfesseurSujet [idProfesseur=" + this.idProfesseur + ", idSujet=" + this.idSujet + ", fonction="
				+ this.fonction + ", valide=" + this.valide + "]";
	}

}