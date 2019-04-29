package com.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe du bean Epreuve.
 * 
 * @author Lilian BRAUD
 */
public class Epreuve {
	
	private Long idEpreuve;
	private OptionESEO option;
	private TypeEpreuve typeEpreuve;
	private Date dateIndicative;
	private Integer coefficient;
	
	private static final String FORMAT_DATE = "yyyy-MM-dd";
	
	/**
	 * Constructeur par défaut
	 */
	public Epreuve() {
		super();
	}
	
	/**
	 * 
	 * @return Identifiant de l'épreuve
	 */
	public Long getIdEpreuve() {
		return idEpreuve;
	}
	
	/**
	 * 
	 * @param idEpreuve
	 */
	public void setIdEpreuve(Long idEpreuve) {
		this.idEpreuve = idEpreuve;
	}
	
	/**
	 * 
	 * @return Option concernée par l'épreuve 
	 */
	public OptionESEO getOption() {
		return option;
	}
	
	/**
	 * 
	 * @param option
	 */
	public void setOption(OptionESEO option) {
		this.option = option;
	}
	
	/**
	 * 
	 * @return Type de l'épreuve
	 */
	public TypeEpreuve getTypeEpreuve() {
		return typeEpreuve;
	}
	
	/**
	 * 
	 * @param typeEpreuve
	 */
	public void setTypeEpreuve(TypeEpreuve typeEpreuve) {
		this.typeEpreuve = typeEpreuve;
	}
	
	/**
	 * 
	 * @return Date indicative de l'épreuve
	 */
	public Date getDateIndicative() {
		return dateIndicative;
	}
	
	/**
	 * 
	 * @return Date indicative de l'épreuve au format YYYY-MM-dd
	 */
	public String getDateIndicativeString() {
		String date = null;
		if (this.dateIndicative != null) 
		{
			date = new SimpleDateFormat(FORMAT_DATE).format(this.dateIndicative);
		}
		return date;
	}
	
	/**
	 * 
	 * @param dateIndicative
	 */
	public void setDateIndicative(Date dateIndicative) {
		this.dateIndicative = dateIndicative;
	}
	
	/**
	 * 
	 * @return Coefficient de l'épreuve
	 */
	public Integer getCoefficient() {
		return coefficient;
	}
	
	/**
	 * 
	 * @param coefficient
	 */
	public void setCoefficient(Integer coefficient) {
		this.coefficient = coefficient;
	}
	
	
	
	@Override
	public String toString() {
		return "Epreuve [idEpreuve=" + idEpreuve + ", option=" + option + ", typeEpreuve=" + typeEpreuve + ", semestre="
				 + ", dateIndicative=" + dateIndicative + ", coefficient=" + coefficient + "]";
	}
	
	
}
