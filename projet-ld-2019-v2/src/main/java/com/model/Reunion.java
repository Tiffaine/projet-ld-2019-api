package com.model;

/**
 * @author Mathéo GIRBAL
 *
 * Last updated on 10 avr. 2018
 */
public class Reunion {

	private Long id;
	private String date;
	private String titre;
	private String description;
	private String compteRendu;
	private String etat;
	
	/**
	 * Getter du paramètre id de type Long
	 *
	 * @return id
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * Setter du paramètre id de type Long
	 *
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * Getter du paramètre date de type String
	 *
	 * @return date
	 */
	public String getDate() {
		return date;
	}
	
	/**
	 * Setter du paramètre date de type String
	 *
	 * @param date
	 */
	public void setDate(String date) {
		this.date = date;
	}
	
	/**
	 * Getter du paramètre titre de type String
	 *
	 * @return titre
	 */
	public String getTitre() {
		return titre;
	}
	
	/**
	 * Setter du paramètre titre de type String
	 *
	 * @param titre
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	/**
	 * Getter du paramètre description de type String
	 *
	 * @return description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Setter du paramètre description de type String
	 *
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Getter du paramètre compteRendu de type String
	 *
	 * @return compteRendu
	 */
	public String getCompteRendu() {
		return compteRendu;
	}

	/**
	 * Setter du paramètre compteRendu de type String
	 *
	 * @param compteRendu
	 */
	public void setCompteRendu(String compteRendu) {
		this.compteRendu = compteRendu;
	}

	/**
	 * Getter du paramètre etat de type String
	 *
	 * @return etat
	 */
	public String getEtat() {
		return etat;
	}

	/**
	 * Setter du paramètre etat de type String
	 *
	 * @param etat
	 */
	public void setEtat(String etat) {
		this.etat = etat;
	}
}
