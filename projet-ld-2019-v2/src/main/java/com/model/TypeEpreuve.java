package com.model;

/**
 * Classe du bean TypeEpreuve.
 * 
 * <p>Définition des attributs de l'objet TypeEpreuve ainsi que des accesseurs et des mutateurs.</p>
 * 
 * @author Lilian BRAUD
 */
public class TypeEpreuve {
	
	private Long idTypeEpreuve;	
	private String nom;
	private Semestre semestre;
	
	// Type epreuve spécial
	public static final String POSTER = "poster"; 
	public static final String MI_AVANCEMENT = "miAvancement";
	public static final String SOUTENANCE = "soutenance";
	public static final String PROJET = "projet";
		
	/**
	 * Constructeur par défaut
	 */
	public TypeEpreuve() {
		super();
	}

	public Long getIdTypeEpreuve() {
		return idTypeEpreuve;
	}

	public void setIdTypeEpreuve(Long idTypeEpreuve) {
		this.idTypeEpreuve = idTypeEpreuve;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Semestre getSemestre() {
		return semestre;
	}

	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}

	/**
	 * Redéfinition de la méthode toString()
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TypeEpreuve [idTypeEpreuve=" + this.idTypeEpreuve + ", nom=" + this.nom + ", semestre="+this.semestre.getNom()+"]";
	}

	
}
