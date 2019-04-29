package com.model;

/**
 * Classe du bean Notification.
 * 
 * <p>Définition des attributs de l'objet Notification ainsi que des accesseurs et des mutateurs.</p>
 */
public class Notification {

	/* Attributs */ 
	private Long idNotification;
	private Long idUtilisateur;
	private String commentaire;
	private String lien;
	private Integer vue;

	/**
	 * Constructeur par défaut.
	 */
	public Notification() {
		super();
	}

	/* Accesseurs et Mutateurs */
	/**
	 * Accessseur pour récupérer l'ID de la notification
	 * @return idNotification
	 */
	public Long getIdNotification() {
		return this.idNotification;
	}

	/**
	 * Mutateur pour modifier l'ID de la notification
	 * @param idNotification
	 */
	public void setIdNotification(Long idNotification) {
		this.idNotification = idNotification;
	}

	/**
	 * Accessseur pour récupérer l'ID de l'utilisateur qui reçoit la notification
	 * @return idUtilisateur
	 */
	public Long getIdUtilisateur() {
		return this.idUtilisateur;
	}

	/**
	 * Mutateur pour modifier l'ID de l'utilisateur qui reçoit la notification
	 * @param idUtilisateur
	 */
	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	/**
	 * Accessseur pour récupérer le contenu de la notification
	 * @return commentaire
	 */
	public String getCommentaire() {
		return this.commentaire;
	}

	/**
	 * Mutateur pour modifier le contenu de la notification
	 * @param commentaire
	 */
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	/**
	 * Accessseur pour récupérer le lien vers lequel redirige la notification
	 * @return lien
	 */
	public String getLien() {
		return this.lien;
	}

	/**
	 * Mutateur pour modifier le lien vers lequel redirige la notification
	 * @param lien
	 */
	public void setLien(String lien) {
		this.lien = lien;
	}

	/**
	 * Accessseur pour récupérer le nombre de fois où la notification a été vue
	 * @return vue
	 */
	public Integer getVue() {
		return this.vue;
	}

	/**
	 * Mutateur pour modifier le nombre de fois où la notification a été vue
	 * @param vue
	 */
	public void setVue(Integer vue) {
		this.vue = vue;
	}

	/**
	 * Redéfinition de la méthode toString().
	 */
	public String toString() {
		return "Notification [idNotification=" + this.idNotification + ", idUtilisateur=" + this.idUtilisateur
				+ ", commentaire=" + this.commentaire + ", lien=" + this.lien + ", vue=" + this.vue + "]";
	}

}