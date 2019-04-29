package com.utilitaire;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Utilitaire {
	private static String check = "SELECT idUtilisateur from `Utilisateur`";
	public static Connection connect;
	
	private static String url = "jdbc:mysql://localhost/somanager?useLegacyDatetimeCode=false&serverTimezone=Europe/Paris&useSSL=false";
	private static String user = "root";
	private static String pwd = "";
	
	public static Connection connectBDD() throws SQLException {
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		connect = DriverManager.getConnection(url, user, pwd);
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
