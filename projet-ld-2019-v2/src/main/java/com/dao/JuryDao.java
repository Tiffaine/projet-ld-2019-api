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
import com.utilitaire.Utilitaire;




public class JuryDao {
	
	private static String selectAll = "SELECT * FROM `jury`";
	
	
	
	
	
	public List<Jury> selectAll() throws SQLException {
		List<Jury> listeJurys = new ArrayList<Jury>();
		Statement stmt = Utilitaire.connect.createStatement();
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
