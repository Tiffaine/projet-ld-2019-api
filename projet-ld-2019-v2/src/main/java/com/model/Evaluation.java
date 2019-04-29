package com.model;

/**
 * Classe du bean Evaluation.
 * 
 * <p>Définition des attributs de l'objet Evaluation ainsi que des accesseurs et des mutateurs.</p>
 * 
 * @author Lilian BRAUD
 */
public class Evaluation {
	
	private Long idEvaluation;
	private Etudiant etudiant;
	private Professeur professeur;
	private Jury jury;
	private Integer note;
	
	/**
	 * Constructeur par défaut
	 */
	public Evaluation() {
		super();
		etudiant = new Etudiant();
		professeur = new Professeur();
		jury = new Jury();
	}
	
	/**
	 * @return Identifiant de l'évaluation
	 */
	public Long getIdEvaluation() {
		return idEvaluation;
	}

	/**
	 * @return Etudiant noté
	 */
	public Etudiant getEtudiant() {
		return etudiant;
	}

	/**
	 * @return Professeur notant
	 */
	public Professeur getProfesseur() {
		return professeur;
	}

	/**
	 * @return Jury de l'évaluation
	 */
	public Jury getJury() {
		return jury;
	}

	/**
	 * @return Note donnée par le professeur
	 */
	public Integer getNote() {
		return note;
	}

	/**
	 * @param idEvaluation Identifiant de l'évaluation
	 */
	public void setIdEvaluation(Long idEvaluation) {
		this.idEvaluation = idEvaluation;
	}

	/**
	 * @param etudiant
	 */
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	/**
	 * @param professeur
	 */
	public void setProfesseur(Professeur professeur) {
		this.professeur = professeur;
	}

	/**
	 * @param jury
	 */
	public void setJury(Jury jury) {
		this.jury = jury;
	}

	/**
	 * @param note
	 */
	public void setNote(Integer note) {
		this.note = note;
	}

	/**
	 * Redéfinition de la méthode toString()
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Evaluation [idEvaluation=" + idEvaluation + ", etudiant=" + etudiant + ", professeur=" + professeur
				+ ", jury=" + jury + ", note=" + note + "]";
	}

}