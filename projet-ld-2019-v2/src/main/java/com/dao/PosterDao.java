package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.utilitaire.Utilitaire;

public class PosterDao {
	
	public static String SQL_IDPOSTER = "SELECT chemin FROM poster WHERE idPoster = ";
	
	public String getPathImagePoster(String idPoster) throws SQLException {
		
		Statement stmt = Utilitaire.connect.createStatement();
		ResultSet result = stmt.executeQuery(SQL_IDPOSTER + idPoster);
		result.next();
		String path = result.getString("chemin");
		
		return path;
	}
}
