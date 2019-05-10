package com.utilitaire;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.dao.DAOException;

public class Utilitaire {
	private static String check = "SELECT idUtilisateur from `Utilisateur`";
	private static final String FICHIER_PROPERTIES_INTROUVABLE = "Le fichier properties %s est introuvable.";
	public static final String FICHIER_PROPERTIES = "com/utilitaire/dao.properties";
	public static final String FICHIER_DEFAULT_PROPERTIES = "com/utilitaire/daoDefault.properties";
	public static final String PROPERTY_URL = "URL";
	public static final String PROPERTY_DRIVER = "DRIVER";
	public static final String PROPERTY_NOM_UTILISATEUR = "UTILISATEUR";
	public static final String PROPERTY_MOT_DE_PASSE = "MOT_DE_PASSE";
	public static Connection connect;
	
	 
	private String driver;
	private String url ;
	private String user ;
	private String pwd ;
	
	public Utilitaire()
	{
		String[] proprietes = chargerProprietes();
		this.url = proprietes[0];
		this.driver = proprietes[1];
		this.user = proprietes[2];
		this.pwd = proprietes[3];
	}
	
	public static String[] chargerProprietes() {
		return chargerProprietes(FICHIER_PROPERTIES);
	}
	
	public static String[] chargerProprietes(String cheminProperties) {
		Properties properties = new Properties();
		String url;
		String driver;
		String user;
		String pwd;

		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

		InputStream fichierProperties = classLoader.getResourceAsStream(cheminProperties);

		if (fichierProperties == null) {
			throw new DAOException(String.format(FICHIER_PROPERTIES_INTROUVABLE, cheminProperties));
		}
		try {
			properties.load(fichierProperties);
			url = properties.getProperty(PROPERTY_URL);
			driver = properties.getProperty(PROPERTY_DRIVER);
			user = properties.getProperty(PROPERTY_NOM_UTILISATEUR,"");
			pwd = properties.getProperty(PROPERTY_MOT_DE_PASSE,"");
		} catch (FileNotFoundException e) {
			throw new DAOException(String.format(FICHIER_PROPERTIES_INTROUVABLE, cheminProperties), e);
		} catch (IOException e) {
			throw new DAOException("Impossible de charger le fichier properties " + cheminProperties, e);
		}

		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			throw new DAOException("Le driver est introuvable dans le classpath.", e);
		}
		
		return new String[] { url, driver, user, pwd};
	}
	public static Connection connectBDD() throws SQLException {
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		Utilitaire util = new Utilitaire();
		connect = DriverManager.getConnection(util.url, util.user, util.pwd);
		return connect;
	}

	public static Boolean checkUserConnected(String identifiantUtilisateur) throws SQLException {
		Statement stmt = connect.createStatement();
		ResultSet result = stmt.executeQuery(check);
		Boolean verification = false;
		while (result.next()) {
			if (result.getString("idUtilisateur").equals(identifiantUtilisateur)) {
				verification = true;
			}
		}
		return verification;
	}
}
