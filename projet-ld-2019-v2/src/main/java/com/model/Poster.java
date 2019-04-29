package com.model;

/**
 * Classe du bean Poster.
 * 
 * <p>Définition des attributs de l'objet Poster ainsi que des accesseurs et des mutateurs.</p>
 */
public class Poster {

	/* Attributs */ 
	private Long idPoster;
	private String chemin;
	private String date;
	private Long idSujet;
	private String valide;
	private String idEquipe;

	/**
	 * Constructeur par défaut.
	 */
	public Poster() {
		super();
	}

	/* Accesseurs et Mutateurs */
	/**
	 * Accessseur pour récupérer l'ID du poster
	 * @return idPoster
	 */
	public Long getIdPoster() {
		return this.idPoster;
	}

	/**
	 * Mutateur pour modifier l'ID du poster
	 * @param idPoster
	 */
	public void setIdPoster(Long idPoster) {
		this.idPoster = idPoster;
	}

	/**
	 * Accessseur pour récupérer l'ID du sujet que concerne le poster
	 * @return idSujet
	 */
	public Long getIdSujet() {
		return this.idSujet;
	}

	/**
	 * Mutateur pour modifier l'ID du sujet que concerne le poster
	 * @param idSujet
	 */
	public void setIdSujet(Long idSujet) {
		this.idSujet = idSujet;
	}

	/**
	 * Accessseur pour récupérer le chemin vers le stockage du poster
	 * @return chemin
	 */
	public String getChemin() {
		return this.chemin;
	}

	/**
	 * Mutateur pour modifier le chemin vers le stockage du poster
	 * @param chemin
	 */
	public void setChemin(String chemin) {
		this.chemin = chemin;
	}

	/**
	 * Accessseur pour récupérer la date de dépôt du poster
	 * @return date
	 */
	public String getDate() {
		return this.date;
	}

	/**
	 * Mutateur pour modifier la date de dépôt du poster
	 * @param date
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * Accessseur pour récupérer si le poster a été validé ou non
	 * @return valide
	 */
	public String getValide() {
		return this.valide;
	}

	/**
	 * Mutateur pour modifier si le poster a été validé ou non
	 * @param valide
	 */
	public void setValide(String valide) {
		this.valide = valide;
	}

	/**
	 * Accessseur pour récupérer l'ID de l'équipe qui a déposé le poster
	 * @return idEquipe
	 */
	public String getIdEquipe() {
		return this.idEquipe;
	}
	
	/**
	 * Mutateur pour modifier l'ID de l'équipe qui a déposé le poster
	 * @param idEquipe
	 */
	public void setIdEquipe(String idEquipe) {
		this.idEquipe = idEquipe;
	}

	/**
	 * Redéfinition de la méthode toString().
	 */
	public String toString() {
		return "Poster [idPoster=" + this.idPoster + ", chemin=" + this.chemin + ", date=" + this.date + ", idSujet="
				+ this.idSujet + ", valide=" + this.valide + ", idEquipe=" + this.idEquipe + "]";
	}

}