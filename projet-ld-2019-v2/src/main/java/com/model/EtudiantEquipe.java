package com.model;

/**
 * Classe du bean EtudiantEquipe.
 * 
 * <p>Définition des attributs de l'objet EtudiantEquipe ainsi que des accesseurs et des mutateurs.</p>
 */
public class EtudiantEquipe {

	/* Attributs */ 
	private Long idEtudiant;
	private String idEquipe;
	
	/**
	 * Constructeur par défaut.
	 */
	public EtudiantEquipe() {
		super();
	}

	/* Accesseurs et Mutateurs */
	/**
	 * Accessseur pour récupérer l'ID de l'étudiant membre de l'équipe
	 * @return idEtudiant
	 */
	public Long getIdEtudiant() {
		return this.idEtudiant;
	}

	/**
	 * Mutateur pour modifier l'ID de l'étudiant membre de l'équipe
	 * @param idEtudiant
	 */
	public void setIdEtudiant(Long idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	/**
	 * Accessseur pour récupérer l'ID de l'équipe du membre
	 * @return idEquipe
	 */
	public String getIdEquipe() {
		return this.idEquipe;
	}

	/**
	 * Mutateur pour modifier l'ID de l'équipe du membre
	 * @param idEquipe
	 */
	public void setIdEquipe(String idEquipe) {
		this.idEquipe = idEquipe;
	}

	/**
	 * Redéfinition de la méthode toString().
	 */
	@Override
	public String toString() {
		return "EtudiantEquipe [idEtudiant=" + this.idEtudiant + ", idEquipe=" + this.idEquipe + "]";
	}

}