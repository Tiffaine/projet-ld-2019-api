package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Epreuve;
import com.model.Equipe;

import com.model.Jury;




public class JuryDao {
	private static String check = "SELECT idUtilisateur from `Utilisateur`";
	private static String selectAll = "SELECT * FROM `jury`";
	private static String url = "jdbc:mysql://localhost/somanager?useLegacyDatetimeCode=false&serverTimezone=Europe/Paris&useSSL=false";
	private static String user = "root";
	private static String pwd = "";
	private static Connection connect;
	
	
	public Connection connectBDD() throws SQLException {
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		connect = DriverManager.getConnection(url, user, pwd);
		return connect;
	}
	
	public Boolean checkUserConnected(String identifiantUtilisateur) throws SQLException {
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
	
	public List<Jury> selectAll() throws SQLException {
		List<Jury> listeJurys = new ArrayList<Jury>();
		Statement stmt = connect.createStatement();
		ResultSet result = stmt.executeQuery(selectAll);
		while (result.next()) {
			Jury jury = new Jury();
			Equipe equipe = new Equipe();
			equipe.setIdEquipe(result.getString("idEpreuve"));
			Epreuve epreuve = new Epreuve();
			epreuve.setIdEpreuve(result.getLong("idEpreuve"));
			jury.setDate(result.getDate("date"));
			jury.setEpreuve(epreuve);
			jury.setEquipe(equipe);
			jury.setIdJury(result.getLong("idJury"));
			
			listeJurys.add(jury);
		}
		return listeJurys;
	}
}
