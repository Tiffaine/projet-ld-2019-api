package com.model;

/**
 * Classe du bean Equipe.
 * 
 * <p>Définition des attributs de l'objet Equipe ainsi que des accesseurs et des mutateurs.</p>
 * 
 * @author Cécilia Pinsard
 */
public class Equipe {
	
	/* Attributs */
	private String idEquipe;
	private Semestre semestre;
	private Integer taille;
	private Long idSujet;
	private String valide;
	
	/**
	 * Constructeur par défaut.
	 */
	public Equipe() {
		super();
	}

	/* Accesseurs et Mutateurs */
	/**
	 * Accessseur pour récupérer l'ID de l'équipe
	 * @return idEquipe
	 */
	public String getIdEquipe() {
		return this.idEquipe;
	}

	/**
	 * Mutateur pour modifier l'ID de l'équipe
	 * @param idEquipe
	 */
	public void setIdEquipe(String idEquipe) {
		this.idEquipe = idEquipe;
	}
	
	/**
	 * Accessseur pour récupérer le semestre de l'équipe
	 * @return semestre
	 */
	public Semestre getSemestre() {
		return this.semestre;
	}

	/**
	 * Mutateur pour modifier le semestre de l'équipe
	 * @param semestre
	 */
	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}
	
	/**
	 * Accessseur pour récupérer la taille de l'équipe (nombre d'élèves)
	 * @return taille
	 */
	public Integer getTaille() {
		return this.taille;
	}
	
	/**
	 * Mutateur pour modifier la taille de l'équipe (nombre d'élèves)
	 * @param taille
	 */
	public void setTaille(Integer taille) {
		this.taille = taille;
	}
	
	/**
	 * Accessseur pour récupérer l'ID du sujet sur lequel est l'équipe
	 * @return idSujet
	 */
	public Long getIdSujet() {
		return this.idSujet;
	}

	/**
	 * Mutateur pour modifier l'ID du sujet sur lequel est l'équipe
	 * @param idSujet
	 */
	public void setIdSujet(Long idSujet) {
		this.idSujet = idSujet;
	}
	
	/**
	 * Accessseur pour récupérer si l'équipe a été validée ou non
	 * @return valide
	 */
	public String getValide() {
		return this.valide;
	}
	
	/**
	 * Mutateur pour modifier si l'équipe a été validée ou non
	 * @param valide
	 */
	public void setValide(String valide) {
		this.valide = valide;
	}

	/**
	 * Redéfinition de la méthode toString().
	 */
	@Override
	public String toString() {
		return "Equipe [idEquipe=" + this.idEquipe + ", semestre=" + this.semestre + ", taille=" + this.taille + ", idSujet="
				+ this.idSujet + ", valide=" + this.valide + "]";
	}

}