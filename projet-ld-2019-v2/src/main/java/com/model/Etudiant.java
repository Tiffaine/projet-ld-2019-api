package com.model;

/**
 * Classe du bean Etudiant.
 * 
 * <p>Définition des attributs de l'objet Etudiant ainsi que des accesseurs et des mutateurs.</p>
 * 
 * @author Lilian BRAUD
 */
public class Etudiant {
	
	public static final String CONTRAT_PRO_OUI = "oui";
	public static final String CONTRAT_PRO_NON = "non";
	
	private Long idEtudiant;
	private Semestre semestre;
	private String contratPro;
	
	/**
	 * Constructeur par défaut.
	 */
	public Etudiant() {
		super();
		semestre = new Semestre();
	}
	
	/**
	 * Accessseur pour récupérer l'ID de l'étudiant
	 * @return idEtudiant
	 */
	public Long getIdEtudiant() {
		return idEtudiant;
	}

	/**
	 * Mutateur pour modifier l'ID de l'étudiant
	 * @param idEtudiant
	 */
	public void setIdEtudiant(Long idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	/**
	 * Accessseur pour récupérer l'ID du semestre de l'�quipe
	 * @return idSemestre
	 */
	public Semestre getSemestre() {
		return semestre;
	}

	/**
	 * Mutateur pour modifier l'ID du semestre de l'�tudiant
	 * @param idSemestre
	 */
	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}

	/**
	 * Accessseur pour récupérer le String et savoir si
	 * un �tudiant est en contrat pro
	 * @return contratPro
	 */
	public String getContratPro() {
		return contratPro;
	}

	/**
	 * Mutateur pour modifier le String contrat pro
	 * d'un �tudiant
	 * @param contratPro
	 */
	public void setContratPro(String contratPro) {
		this.contratPro = contratPro;
	}

	/**
	 * Redéfinition de la méthode toString().
	 */
	@Override
	public String toString() {
		return "Etudiant [idEtudiant=" + this.idEtudiant + ", semestre=" + this.semestre.toString() + ", contratPro=" + this.contratPro
				+ "]";
	}
	
}