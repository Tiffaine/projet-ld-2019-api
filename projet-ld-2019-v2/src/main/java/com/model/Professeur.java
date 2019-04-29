package com.model;

/**
 * Classe du bean Professeur.
 * 
 * <p>Définition des attributs de l'objet Professeur ainsi que des accesseurs et des mutateurs.</p>
 */
public class Professeur {
	
	/* Attributs */ 
	private Long idProfesseur;
	private String url;
	
	/**
	 * Constructeur par défaut.
	 */
	public Professeur (){
		super();
	}
	
	/* Accesseurs et Mutateurs */
	/**
	 * Accessseur pour récupérer l'ID du professeur
	 * @return idProfesseur
	 */
	public Long getIdProfesseur (){
		return this.idProfesseur;
	}
	
	/**
	 * Mutateur pour modifier l'ID du professeur
	 * @param idProfesseur
	 */
	public void setIdProfesseur (Long idProfesseur){
		this.idProfesseur = idProfesseur;
	}
	
	/**
	 * Accessseur pour récupérer l'url de l'edt du professeur
	 * @return url
	 */
	public String getUrl (){
		return this.url;
	}
	
	/**
	 * Mutateur pour modifier l'url de l'edt du professeur
	 * @param url
	 */
	public void setUrl (String url){
		this.url = url;
	}
	
	/**
	 * Redéfinition de la méthode toString().
	 */
	public String toString() {
		return "Professeur [idProfesseur = " + this.idProfesseur + "]";
	}
	
}