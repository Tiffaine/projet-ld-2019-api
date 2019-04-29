package com.model;

/**
 * Enumération des états du bean Sujet.
 * 
 * <p>Définition de tous les états possibles du bean Sujet.</p>
 * 
 * @author Maxime LENORMAND
 */
public enum EtatSujet {
	
	/* Etats possibles du bean Sujet */
	DEPOSE("déposé"),
	VALIDE("validé"),
	REFUSE("refusé"),
	ATTRIBUE("attribué"),
	PUBLIE("publié");

	private String etat;

	/**
	 * Constructeur.
	 * 
	 * @param etat l'état possible du bean Sujet.
	 */
	EtatSujet(String etat) {
		this.etat = etat;
	}

	/* Accesseurs et Mutateurs */
	/**
	 * Accesseur pour récupérer l'état d'un sujet
	 * @return etat
	 */
	public String getEtat() {
		return this.etat;
	}
	
}