package com.model;

public class Sujet {
	String idSujet; 
	String titre; 
	String description; 
	String nbrMinEleves; 
	String nbrMaxEleves; 
	String contratPro; 
	String confidentialite; 
	String etat; 
	
	public Sujet(String idSujet,String titre, String description, String nbrMinEleves, String nbrMaxEleves, String contratPro, String confidentialite, String etat ) {
		super(); 
		this.idSujet=idSujet; 
		this.titre=titre;
		this.description=description; 
		this.nbrMinEleves=nbrMinEleves; 
		this.nbrMaxEleves=nbrMaxEleves; 
		this.contratPro=contratPro; 
		this.confidentialite=confidentialite; 
		this.etat=etat; 
	}

	public String getIdSujet() {
		return idSujet;
	}

	public void setIdSujet(String idSujet) {
		this.idSujet = idSujet;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNbrMinEleves() {
		return nbrMinEleves;
	}

	public void setNbrMinEleves(String nbrMinEleves) {
		this.nbrMinEleves = nbrMinEleves;
	}

	public String getNbrMaxEleves() {
		return nbrMaxEleves;
	}

	public void setNbrMaxEleves(String nbrMaxEleves) {
		this.nbrMaxEleves = nbrMaxEleves;
	}

	public String getContratPro() {
		return contratPro;
	}

	public void setContratPro(String contratPro) {
		this.contratPro = contratPro;
	}

	public String getConfidentialite() {
		return confidentialite;
	}

	public void setConfidentialite(String confidentialite) {
		this.confidentialite = confidentialite;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	

}
