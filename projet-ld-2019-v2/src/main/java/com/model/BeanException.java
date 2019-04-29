package com.model;

/**
 * Classe de l'Exception liée à un Bean.
 * 
 * <p>Cette classe permet d'encapsuler les exceptions liées au traitement des beans.</p>
 * 
 * @author Maxime LENORMAND
 */
public class BeanException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/**
	 * Redéfinition d'un constructeur de RuntimeException.
	 * 
	 * @param message le message de l'exception levée.
	 */
	public BeanException(String message) {
		super(message);
	}
	
}