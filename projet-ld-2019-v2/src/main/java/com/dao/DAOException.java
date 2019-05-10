package com.dao;

/**
 * Classe de l'Exception liée à un DAO.
 * 
 * <p>Cette classe permet d'encapsuler les exceptions liées à SQL ou JDBC.</p>
 * 
 * @author Thomas MENARD et Maxime LENORMAND
 */
public class DAOException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/**
	 * Redéfinition d'un constructeur de RuntimeException.
	 * 
	 * @param message le message de l'exception levée.
	 */
	public DAOException(String message) {
		super(message);
	}
	
	/**
	 * Redéfinition d'un constructeur de RuntimeException.
	 * 
	 * @param message le message de l'exception levée.
	 * @param cause la cause de l'exception levée.
	 */
	public DAOException(String message, Throwable cause) {
		super(message, cause);
	}
	
}