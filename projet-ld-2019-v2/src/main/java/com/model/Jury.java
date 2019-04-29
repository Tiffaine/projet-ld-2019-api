package com.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Classe du bean Jury.
 * 
 * @author Lilian BRAUD
 */
public class Jury {

	private Long idJury;
	private List<Utilisateur> professeurs;
	private Epreuve epreuve;
	private Equipe equipe;
	private Date date;
	
	private static final String FORMAT_HORAIRE = "yyy-MM-dd hh:mm";
	
	/**
	 * Constructeur par défaut
	 */
	public Jury() {
		super();
		professeurs = new ArrayList<>();
		epreuve = new Epreuve();
		equipe = new Equipe();
	}

	/**
	 * 
	 * @return Identifiant du jury
	 */
	public Long getIdJury() {
		return idJury;
	}

	/**
	 * 
	 */
	public void setIdJury(Long idJury) {
		this.idJury = idJury;
	}

	/**
	 * 
	 * @return Epreuve où le jury évalue le travail de l'équipe
	 */
	public Epreuve getEpreuve() {
		return epreuve;
	}

	/**
	 * 
	 * @param epreuve
	 */
	public void setEpreuve(Epreuve epreuve) {
		this.epreuve = epreuve;
	}

	/**
	 * 
	 * @return Equipe concernée par la soutenance
	 */
	public Equipe getEquipe() {
		return equipe;
	}

	/**
	 * 
	 * @param equipe
	 */
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}	

	/**
	 * 
	 * @return Liste des professeurs du jury
	 */
	public List<Utilisateur> getProfesseurs() {
		return professeurs;
	}
	
	/**
	 * 
	 * @param professeurs
	 */
	public void setProfesseurs(List<Utilisateur> professeurs) {
		this.professeurs = professeurs;
	}

	/**
	 * 
	 * @return
	 */
	public Date getDate() {
		return date;
	}
	
	/**
	 * 
	 * @return Date du jury au format YYYY-MM-dd hh:mm
	 */
	public String getDateString() {
		String dateString = null;
		if (this.date != null) 
		{
			dateString = new SimpleDateFormat(FORMAT_HORAIRE).format(this.date);
		}
		return dateString;
	}

	/**
	 * 
	 * @param date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Jury [idJury=" + idJury + ", professeurs=" + professeurs + ", epreuve=" + epreuve + ", equipe=" + equipe
				+ ", date=" + getDateString() + "]";
	}	
}