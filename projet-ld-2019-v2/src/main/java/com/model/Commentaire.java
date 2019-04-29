package com.model;

/**
 * Classe du bean Commentaire.
 * 
 * <p>Définition des attributs de l'objet Commentaire ainsi que des accesseurs et des mutateurs.</p>
 */
public class Commentaire {
	
	/* Attributs */
	private Long idCommentaire;
	private Long idUtilisateur;
	private Long idSujet;
	private Long idObservation;
	private String contenu;
	
	/**
	 * Constructeur par défaut.
	 */
	public Commentaire() {
		super();
	}
	
	/* Accesseurs et Mutateurs */
	/**
	 * Accessseur pour récupérer l'ID du commentaire
	 * @return idCommentaire
	 */
	public Long getIdCommentaire() {
		return this.idCommentaire;
	}
	
	/**
	 * Mutateur pour modifier l'ID du commentaire
	 * @param idCommentaire
	 */
	public void setIdCommentaire(Long idCommentaire) {
		this.idCommentaire = idCommentaire;
	}
	
	/**
	 * Accessseur pour récupérer l'ID de l'utilisateur qui écrit le commentaire
	 * @return idUtilisateur
	 */
	public Long getIdUtilisateur() {
		return this.idUtilisateur;
	}
	
	/**
	 * Mutateur pour modifier l'ID de l'utilisateur qui écrit le commentaire
	 * @param idUtilisateur
	 */
	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	
	/**
	 * Accessseur pour récupérer l'ID du sujet que concerne le commentaire
	 * @return idSujet
	 */
	public Long getIdSujet() {
		return this.idSujet;
	}
	
	/**
	 * Mutateur pour modifier l'ID du sujet que concerne le commentaire
	 * @param idSujet
	 */
	public void setIdSujet(Long idSujet) {
		this.idSujet = idSujet;
	}
	
	/**
	 * Accessseur pour récupérer l'ID du commentaire auquel répond le commentaire actuel
	 * @return idObservation
	 */
	public Long getIdObservation() {
		return this.idObservation;
	}
	
	/**
	 * Mutateur pour modifier l'ID du commentaire auquel répond le commentaire actuel
	 * @param idObservation
	 */
	public void setIdObservation(Long idObservation) {
		this.idObservation = idObservation;
	}
	
	/**
	 * Accessseur pour récupérer le contenu du commentaire
	 * @return contenu
	 */
	public String getContenu() {
		return this.contenu;
	}
	
	/**
	 * Mutateur pour modifier le contenu du commentaire
	 * @param contenu
	 */
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	/**
	 * Redéfinition de la méthode toString().
	 */
	@Override
	public String toString() {
		return "Commentaire [idCommentaire=" + this.idCommentaire + ", idUtilisateur=" + this.idUtilisateur
				+ ", idSujet=" + this.idSujet + ", idObservation=" + this.idObservation + ", contenu=" + this.contenu
				+ "]";
	}
	
}