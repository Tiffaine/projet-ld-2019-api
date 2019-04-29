package com.model;

/**
 * Classe du bean PartageRole.
 * 
 * <p>Définition des attributs de l'objet PartageRole ainsi que des accesseurs et des mutateurs.</p>
 */
public class PartageRole {
	
	/* Attributs */
	private Long idPartageRole;
	private Long idUtilisateur1;
	private Long idUtilisateur2;
	private Long idRole;
	private Long idOption;
	private String dateDebut;
	private String dateFin;
	private Long actif;
	
	/**
	 * Constructeur par défaut.
	 */
	public PartageRole() {
		super();
	}
	
	/* Accesseurs et Mutateurs */
	/**
	 * Accessseur pour récupérer l'ID du partage de rôle
	 * @return idPartageRole
	 */
	public Long getIdPartage() {
		return this.idPartageRole;
	}

	/**
	 * Mutateur pour modifier l'ID du partage de rôle
	 * @param idPartageRole
	 */
	public void setIdPartage(Long idPartage) {
		this.idPartageRole = idPartage;
	}

	/**
	 * Accessseur pour récupérer l'ID de l'utilisateur qui donne son rôle
	 * @return idUtilisateur1
	 */
	public Long getIdUtilisateur1() {
		return this.idUtilisateur1;
	}

	/**
	 * Mutateur pour modifier l'ID de l'utilisateur qui donne son rôle
	 * @param idUtilisateur1
	 */
	public void setIdUtilisateur1(Long idUtilisateur1) {
		this.idUtilisateur1 = idUtilisateur1;
	}

	/**
	 * Accessseur pour récupérer l'ID de l'utilisateur à qui il donne son rôle
	 * @return idUtilisateur2
	 */
	public Long getIdUtilisateur2() {
		return this.idUtilisateur2;
	}

	/**
	 * Mutateur pour modifier l'ID de l'utilisateur à qui il donne son rôle
	 * @param idUtilisateur2
	 */
	public void setIdUtilisateur2(Long idUtilisateur2) {
		this.idUtilisateur2 = idUtilisateur2;
	}

	/**
	 * Accessseur pour récupérer le rôle donné par le partage
	 * @return idRole
	 */
	public Long getIdRole() {
		return this.idRole;
	}

	/**
	 * Mutateur pour modifier le rôle donné par le partage 
	 * @param idRole
	 */
	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	/**
	 * Accessseur pour récupérer l'option concernée par le partage de rôle
	 * @return idOption
	 */
	public Long getIdOption() {
		return this.idOption;
	}

	/**
	 * Mutateur pour modifier l'option concernée par le partage de rôle
	 * @param idOption
	 */
	public void setIdOption(Long idOption) {
		this.idOption = idOption;
	}

	/**
	 * Accessseur pour récupérer la date et l'heure du début de partage
	 * @return dateDebut
	 */
	public String getDateDebut() {
		return this.dateDebut;
	}

	/**
	 * Mutateur pour modifier la date et l'heure du début de partage
	 * @param dateDebut
	 */
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * Accessseur pour récupérer la date et l'heure de fin de partage
	 * @return dateFin
	 */
	public String getDateFin() {
		return this.dateFin;
	}

	/**
	 * Mutateur pour modifier la date et l'heure de fin de partage
	 * @param dateFin
	 */
	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * Accessseur pour récupérer si le partage est actuellement actif ou non
	 * @return actif 
	 */
	public Long getActif() {
		return this.actif;
	}

	/**
	 * Mutateur pour modifier si le partage est actuellement actif ou non
	 * @param actif
	 */
	public void setActif(Long actif) {
		this.actif = actif;
	}

	/**
	 * Redéfinition de la méthode toString().
	 */
	public String toString() {
		return "PartageRole [idPartage=" + this.idPartageRole + ", idUtilisateur1=" + this.idUtilisateur1
				+ ", idUtilisateur2=" + this.idUtilisateur2 + ", idRole=" + this.idRole + ", idOption=" + this.idOption
				+ ", dateDebut=" + this.dateDebut + ", dateFin=" + this.dateFin + ", actif=" + this.actif + "]";
	}
	
}