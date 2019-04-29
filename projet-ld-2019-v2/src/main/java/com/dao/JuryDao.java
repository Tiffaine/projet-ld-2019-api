package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JuryDao {
	
	private static String selectAll = "SELECT * FROM `sujet`";
	private static String check = "SELECT idUtilisateur from `Utilisateur`";
	
	private static String selectSubject = "SELECT titre, confidentialite from `sujet` where idSujet=?";
	private static String selectSubjectDescription = "SELECT description from `sujet` where idSujet=?";
	private static String selectPosterWhereSubject = "SELECT idPoster from `poster` where idSujet=?";
	
	private static String url = "jdbc:mysql://localhost/somanager?useLegacyDatetimeCode=false&serverTimezone=Europe/Paris&useSSL=false";
	private static String user = "root";
	private static String pwd = "";
	private static Connection connect;
	
	public Connection connectBDD() throws SQLException {
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		connect = DriverManager.getConnection(url, user, pwd);
		return connect;
	}

}
