package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Sujet;
import com.mysql.jdbc.PreparedStatement;

public class SujetDao {

	private static String selectAll = "SELECT * FROM `sujet`";
	
	private static String url = "jdbc:mysql://localhost/somanager?useLegacyDatetimeCode=false&serverTimezone=Europe/Paris&useSSL=false";
	private static String user = "root";
	private static String pwd= "";
	private static Connection connect; 
	
	public static Connection connectBDD() {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection connect = DriverManager.getConnection(url,user,pwd);		
			
		}catch (SQLException e) {
			e.printStackTrace();
			
		}return connect;
		
	}
	
	public List<Sujet> selectAll() throws SQLException{
		List<Sujet> listeSujets = new ArrayList<Sujet>(); 
		Statement stmt = connect.createStatement(); 
		ResultSet result = stmt.executeQuery(selectAll);
		while(result.next()) { 		
			listeSujets.add(new Sujet(result.getString("Code_commune_INSEE"),result.getString("Nom_commune"),result.getString("Code_postal"),result.getString("Latitude"),result.getString("Longitude")));
		}	    
		return listeSujets;
	}
	
	
}
