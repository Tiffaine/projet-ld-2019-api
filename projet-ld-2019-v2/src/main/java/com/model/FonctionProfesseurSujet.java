package com.model;

/**
 * Enumération des fonctions du bean ProfesseurSujet.
 * 
 * <p>Définition de toutes les fonctions possibles du bean ProfesseurSujet.</p>
 * 
 * @author Cécilia Pinsard
 */
public enum FonctionProfesseurSujet {
	
	/* Fonctions possibles du bean ProfesseurSujet */
	COENCADRANT("co-encadrant"),
	INTERESSE("interessé"),
	CONSULTANT("consultant"),
	REFERENT("référent");

	private String fonction;

	/**
	 * Constructeur.
	 * 
	 * @param fonction la fonction possible du bean ProfesseurSujet.
	 */
	FonctionProfesseurSujet(String fonction) {
		this.fonction = fonction;
	}
	
	/* Accesseurs et Mutateurs */
	/**
	 * Accesseur pour récupérer la fonction d'un professeur
	 * @return fonction
	 */
	public String getFonction() {
		return this.fonction;
	}

}