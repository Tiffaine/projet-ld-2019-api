package com.model;

/**
 * Classe du bean Sujet.
 * 
 * <p>D�finition des attributs de l'objet Sujet ainsi que des accesseurs et des mutateurs.</p>
 */
public class Sujet {

	/* Attributs */
	private Long idSujet;
	private String identifiant;
	private String titre;
	private String description;
	private Integer nbrMinEleves;
	private Integer nbrMaxEleves;
	private Boolean contratPro;
	private Boolean confidentialite;
	private String optionsConcernees;
	private EtatSujet etat;
	private String liens;
	private String interets;
	private Float noteInteretTechno;
	private Float noteInteretSujet;
	
	/**
	 * Constructeur par d�faut.
	 */
	public Sujet() {
		super();
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	/* Accesseurs et Mutateurs */
	/**
	 * Accessseur pour r�cup�rer l'ID du sujet
	 * @return idSujet
	 */
	public Long getIdSujet() {
		return this.idSujet;
	}

	/**
	 * Mutateur pour modifier l'ID du sujet
	 * @param idSujet
	 */
	public void setIdSujet(Long idSujet) {
		this.idSujet = idSujet;
	}

	/**
	 * Accessseur pour r�cup�rer le titre du sujet
	 * @return titre
	 */
	public String getTitre() {
		return this.titre;
	}

	/**
	 * Mutateur pour modifier le titre du sujet 
	 * @param titre
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * Accessseur pour r�cup�rer la description du sujet
	 * @return description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Mutateur pour modifier la description du sujet
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Accessseur pour r�cup�rer le nombre minimum d'�l�ves dans une �quipe sur ce sujet
	 * @return nbrMinEleves
	 */
	public Integer getNbrMinEleves() {
		return this.nbrMinEleves;
	}

	/**
	 * Mutateur pour modifier le nombre minimum d'�l�ves dans une �quipe sur ce sujet
	 * @param nbrMinEleves
	 */
	public void setNbrMinEleves(Integer nbrMinEleves) {
		this.nbrMinEleves = nbrMinEleves;
	}

	/**
	 * Accessseur pour r�cup�rer le nombre maximum d'�l�ves dans une �quipe sur ce sujet
	 * @return nbrMaxEleves
	 */
	public Integer getNbrMaxEleves() {
		return this.nbrMaxEleves;
	}

	/**
	 * Mutateur pour modifier le nombre maximum d'�l�ves dans une �quipe sur ce sujet
	 * @param nbrMaxEleves
	 */
	public void setNbrMaxEleves(Integer nbrMaxEleves) {
		this.nbrMaxEleves = nbrMaxEleves;
	}

	/**
	 * Accessseur pour r�cup�rer si le sujet est pour des �l�ves en contrat pro ou non
	 * @return contratPro
	 */
	public Boolean getContratPro() {
		return this.contratPro;
	}

	/**
	 * Accessseur pour r�cup�rer si le sujet est pour des �l�ves en contrat pro ou non
	 * sous forme d'un entier
	 * @return contratPro avec une valeur de 0 ou 1 ou bien NULL
	 */
	public Integer getContratProInt() {
		if (this.contratPro != null) {
			return this.contratPro ? 1 : 0;
		} else {
			return null;
		}
	}

	/**
	 * Mutateur pour modifier si le sujet est pour des �l�ves en contrat pro ou non
	 * @param contratPro
	 */
	public void setContratPro(Boolean contratPro) {
		this.contratPro = contratPro;
	}

	/**
	 * Accessseur pour r�cup�rer si le sujet est confidentiel ou non
	 * @return confidentialite
	 */
	public Boolean getConfidentialite() {
		return this.confidentialite;
	}

	/**
	 * Accessseur pour r�cup�rer si le sujet est confidentiel ou non sous forme d'un entier
	 * @return confidentialite avec une valeur de 0 ou 1 ou bien NULL
	 */
	public Integer getConfidentialiteInt() {
		if (this.confidentialite != null) {
			return this.confidentialite ? 1 : 0;
		} else {
			return null;
		}
	}

	/**
	 * Mutateur pour modifier si le sujet est confidentiel ou non
	 * @param confidentialite
	 */
	public void setConfidentialite(Boolean confidentialite) {
		this.confidentialite = confidentialite;
	}

	/**
	 * Accessseur pour r�cup�rer l'�tat du sujet
	 * @return etat
	 */
	public EtatSujet getEtat() {
		return this.etat;
	}

	/**
	 * Mutateur pour modifier l'�tat du sujet
	 * @param etat
	 */
	public void setEtat(EtatSujet etat) {
		this.etat = etat;
	}

	/**
	 * Donne un �tat au Sujet.
	 * 
	 * @param etat l'�tat donn� au Sujet.
	 */
	public void setEtatString(String etat) {
		if ("depose".equals(etat)) {
			this.etat = EtatSujet.DEPOSE;
		} else if ("valide".equals(etat)) {
			this.etat = EtatSujet.VALIDE;
		} else if ("attribue".equals(etat)) {
			this.etat = EtatSujet.ATTRIBUE;
		} else if ("refuse".equals(etat)) {
			this.etat = EtatSujet.REFUSE;
		} else if ("publie".equals(etat)) {
			this.etat = EtatSujet.PUBLIE;
		} else {
			throw new BeanException("L'�tat entr� en param�tre n'existe pas !");
		}
	}

	/**
	 * Accessseur pour r�cup�rer les liens vers lesquels renvoie le sujet
	 * @return liens
	 */
	public String getLiens() {
		return this.liens;
	}

	/**
	 * Mutateur pour modifier les liens vers lesquels renvoie le sujet
	 * @param liens
	 */
	public void setLiens(String liens) {
		this.liens = liens;
	}

	/**
	 * Accessseur pour r�cup�rer les int�r�ts du sujet
	 * @return interets
	 */
	public String getInterets() {
		return this.interets;
	}

	/**
	 * Mutateur pour modifier les int�r�ts du sujet
	 * @param interets
	 */
	public void setInterets(String interets) {
		this.interets = interets;
	}

	/**
	 * Accessseur pour r�cup�rer la note d'int�r�t technologique du sujet
	 * @return noteInteretTechno
	 */
	public Float getNoteInteretTechno() {
		return this.noteInteretTechno;
	}

	/**
	 * Mutateur pour modifier la note d'int�r�t technologique du sujet
	 * @param noteInteretTechno
	 */
	public void setNoteInteretTechno(Float noteInteretTechno) {
		this.noteInteretTechno = noteInteretTechno;
	}

	/**
	 * Accessseur pour r�cup�rer la note d'int�r�t du sujet
	 * @return noteInteretSujet
	 */
	public Float getNoteInteretSujet() {
		return this.noteInteretSujet;
	}

	/**
	 * Mutateur pour modifier la note d'int�r�t du sujet
	 * @param noteInteretSujet
	 */
	public void setNoteInteretSujet(Float noteInteretSujet) {
		this.noteInteretSujet = noteInteretSujet;
	}
	
	/**
	 * Red�finition de la m�thode toString().
	 */
	public String toString() {
		return "Sujet [idSujet=" + this.idSujet + ", identifiant =" + this.identifiant +", titre=" + this.titre + ", description=" + this.description
				+ ", nbrMinEleves=" + this.nbrMinEleves + ", nbrMaxEleves=" + this.nbrMaxEleves + ", contratPro="
				+ this.contratPro + ", confidentialite=" + this.confidentialite + ", etat=" + this.etat + ", liens="
				+ this.liens + ", interets=" + this.interets + ", noteInteretTechno=" + this.noteInteretTechno
				+ ", noteInteretSujet=" + this.noteInteretSujet + "]";
	}


	public String getOptionsConcernees() {
		return optionsConcernees;
	}

	public void setOptionsConcernees(String optionsConcernees) {
		this.optionsConcernees = optionsConcernees;
	}
	
}