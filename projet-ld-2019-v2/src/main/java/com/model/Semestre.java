package com.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe du bean Semestre.
 * 
 * <p>Définition des attributs de l'objet Semestre ainsi que des accesseurs et des mutateurs.</p>
 * 
 * @author Lilian BRAUD
 */
public class Semestre {
	
	public static final String SEMESTRE_GL = "S8";
	public static final String SEMESTRE_PFE = "S9";

	private Long idSemestre;
	private Date dateDebut;	
	private Date dateFin;
	private Date dateRemisePoster;	
	private Date dateJuryPresPoster;
	private Date dateContratPro;	
	private Date dateRemiseNote;
	private Date dateDebutSprint1;	
	private Date dateFinSprint1;
	private Date dateDebutSprint2;	
	private Date dateFinSprint2;
	private Date dateDebutSprint3;	
	private Date dateFinSprint3;
	private String nom;
	
	private static final String FORMAT_DATE = "yyy-MM-dd";
	
	/**
	 * Constructeur par défaut.
	 */
	public Semestre() {
		super();
	}
	
	public Long getIdSemestre() {
		return idSemestre;
	}
	
	public void setIdSemestre(Long idSemestre) {
		this.idSemestre = idSemestre;
	}
	
	public Date getDateDebut() {
		return dateDebut;
	}

	public String getDateDebutString() {
		String dateDebutString = null;
		if(dateDebut != null) {
			SimpleDateFormat formatDate = new SimpleDateFormat(FORMAT_DATE);
			dateDebutString = formatDate.format(dateDebut);
		}
		return dateDebutString;
	}
	
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}
	
	public String getDateFinString() {
		String dateFinString = null;
		if(dateFin != null) {
			SimpleDateFormat formatDate = new SimpleDateFormat(FORMAT_DATE);
			dateFinString = formatDate.format(dateFin);
		}
		return dateFinString;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
	public Date getDateRemisePoster() {
		return dateRemisePoster;
	}
	
	public String getDateRemisePosterString() {
		String dateRemisePosterString = null;
		if(dateRemisePoster != null) {
			SimpleDateFormat formatDate = new SimpleDateFormat(FORMAT_DATE);
			dateRemisePosterString = formatDate.format(dateRemisePoster);
		}
		return dateRemisePosterString;
	}

	public void setDateRemisePoster(Date dateRemisePoster) {
		this.dateRemisePoster = dateRemisePoster;
	}

	public Date getDateJuryPresPoster() {
		return dateJuryPresPoster;
	}
	
	public String getDateJuryPresPosterString() {
		String dateJuryPresPosterString = null;
		if(dateJuryPresPoster != null) {
			SimpleDateFormat formatDate = new SimpleDateFormat(FORMAT_DATE);
			dateJuryPresPosterString = formatDate.format(dateJuryPresPoster);
		}
		return dateJuryPresPosterString;
	}

	public void setDateJuryPresPoster(Date dateJuryPresPoster) {
		this.dateJuryPresPoster = dateJuryPresPoster;
	}

	public Date getDateContratPro() {
		return dateContratPro;
	}
	
	public String getDateContratProString() {
		String dateContratProString = null;
		if(dateContratPro != null) {
			SimpleDateFormat formatDate = new SimpleDateFormat(FORMAT_DATE);
			dateContratProString = formatDate.format(dateContratPro);
		}
		return dateContratProString;
	}

	public void setDateContratPro(Date dateContratPro) {
		this.dateContratPro = dateContratPro;
	}

	public Date getDateRemiseNote() {
		return dateRemiseNote;
	}
	
	public String getDateRemiseNoteString() {
		String dateRemiseNoteString = null;
		if(dateRemisePoster != null) {
			SimpleDateFormat formatDate = new SimpleDateFormat(FORMAT_DATE);
			dateRemiseNoteString = formatDate.format(dateRemiseNote);
		}
		return dateRemiseNoteString;
	}

	public void setDateRemiseNote(Date dateRemiseNote) {
		this.dateRemiseNote = dateRemiseNote;
	}

	public Date getDateDebutSprint1() {
		return dateDebutSprint1;
	}
	
	public String getDateDebutSprint1String() {
		String dateDebutSprint1String = null;
		if(dateDebutSprint1 != null) {
			SimpleDateFormat formatDate = new SimpleDateFormat(FORMAT_DATE);
			dateDebutSprint1String = formatDate.format(dateDebutSprint1);
		}
		return dateDebutSprint1String;
	}

	public void setDateDebutSprint1(Date dateDebutSprint1) {
		this.dateDebutSprint1 = dateDebutSprint1;
	}

	public Date getDateFinSprint1() {
		return dateFinSprint1;
	}
	
	public String getDateFinSprint1String() {
		String dateFinSprint1String = null;
		if(dateFinSprint1 != null) {
			SimpleDateFormat formatDate = new SimpleDateFormat(FORMAT_DATE);
			dateFinSprint1String = formatDate.format(dateFinSprint1);
		}
		return dateFinSprint1String;
	}

	public void setDateFinSprint1(Date dateFinSprint1) {
		this.dateFinSprint1 = dateFinSprint1;
	}

	public Date getDateDebutSprint2() {
		return dateDebutSprint2;
	}
	
	public String getDateDebutSprint2String() {
		String dateDebutSprint2String = null;
		if(dateDebutSprint2 != null) {
			SimpleDateFormat formatDate = new SimpleDateFormat(FORMAT_DATE);
			dateDebutSprint2String = formatDate.format(dateDebutSprint2);
		}
		return dateDebutSprint2String;
	}

	public void setDateDebutSprint2(Date dateDebutSprint2) {
		this.dateDebutSprint2 = dateDebutSprint2;
	}

	public Date getDateFinSprint2() {
		return dateFinSprint2;
	}
	
	public String getDateFinSprint2String() {
		String dateFinSprint2String = null;
		if(dateFinSprint2 != null) {
			SimpleDateFormat formatDate = new SimpleDateFormat(FORMAT_DATE);
			dateFinSprint2String = formatDate.format(dateFinSprint2);
		}
		return dateFinSprint2String;
	}

	public void setDateFinSprint2(Date dateFinSprint2) {
		this.dateFinSprint2 = dateFinSprint2;
	}

	public Date getDateDebutSprint3() {
		return dateDebutSprint3;
	}
	
	public String getDateDebutSprint3String() {
		String dateDabutSprint3String = null;
		if(dateDebutSprint3 != null) {
			SimpleDateFormat formatDate = new SimpleDateFormat(FORMAT_DATE);
			dateDabutSprint3String = formatDate.format(dateDebutSprint3);
		}
		return dateDabutSprint3String;
	}

	public void setDateDebutSprint3(Date dateDebutSprint3) {
		this.dateDebutSprint3 = dateDebutSprint3;
	}

	public Date getDateFinSprint3() {
		return dateFinSprint3;
	}
	
	public String getDateFinSprint3String() {
		String dateFinSprint3String = null;
		if(dateFinSprint3 != null) {
			SimpleDateFormat formatDate = new SimpleDateFormat(FORMAT_DATE);
			dateFinSprint3String = formatDate.format(dateFinSprint3);
		}
		return dateFinSprint3String;
	}

	public void setDateFinSprint3(Date dateFinSprint3) {
		this.dateFinSprint3 = dateFinSprint3;
	}	
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}	
	
	/**
	 * Redéfinition de la méthode toString().
	 */
	@Override
	public String toString() {
		return "Semestre [idSemestre=" + this.idSemestre + ", dateDebut=" + this.dateDebut + ", dateFin=" + this.dateFin 
				+ ", nom=" + this.nom + "]";
	}
}
