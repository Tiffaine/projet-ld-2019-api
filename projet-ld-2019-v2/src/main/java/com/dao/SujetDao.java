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
	private static String check = "SELECT idUtilisateur from `Utilisateur`";
	private static String selectSubject = "SELECT titre, confidentialite from `sujet` where idSujet=?";
	private static String selectSubjectDescription = "SELECT description from `sujet` where idSujet=?";
	private static String selectPosterWhereSubject = "SELECT idPoster from `poster` where idSujet=?";
	private static String SQL_selectSujetsProffesseur_DEBUT = "SELECT s.* FROM (sujet s, professeur p, professeursujet ps) WHERE s.idSujet = ps.idSujet AND p.idProfesseur = ps.idProfesseur AND p.idProfesseur=";
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

	public List<Sujet> selectAll() throws SQLException {
		List<Sujet> listeSujets = new ArrayList<Sujet>();
		Statement stmt = connect.createStatement();
		ResultSet result = stmt.executeQuery(selectAll);
		
		
		while (result.next()) {
			Sujet sujet = new Sujet();
			sujet.setConfidentialite(result.getBoolean("confidentialite"));
			sujet.setContratPro(result.getBoolean("contratPro"));
			sujet.setDescription(result.getString("description"));
			sujet.setEtatString((result.getString("etat")));
			sujet.setIdentifiant(result.getString("identifiant"));
			sujet.setIdSujet(result.getLong("idSujet"));
			sujet.setInterets(result.getString("interets"));
			sujet.setLiens(result.getString("liens"));
			sujet.setNbrMaxEleves(result.getInt("nbrMaxEleves"));
			sujet.setNbrMinEleves(result.getInt("nbrMinEleves"));
			sujet.setNoteInteretSujet(result.getFloat("noteInteretSujet"));
			sujet.setTitre("titre");
			
			listeSujets.add(sujet);
		}
		return listeSujets;
	}

	/**
	 * Initialise une requête préparée.
	 * 
	 * @param connection          la connexion à la BDD.
	 * @param sql                 la requête SQL.
	 * @param returnGeneratedKeys le boolean qui permet de générer des ID ou pas.
	 * @param objets              la liste d'objets à insérer dans la requête.
	 * @return preparedStatement la requête préparée initialisée.
	 * @throws SQLException
	 */
	protected static String initialisationRequetePreparee(String sql, Object... objets) {
		String[] listeSQL = (sql + " ").split("\\?");
		StringBuilder newSQL = new StringBuilder(listeSQL[0]);
		for (int i = 0; i < objets.length; i++) {
			newSQL.append("\"" + objets[i] + "\"" + listeSQL[i + 1]);
		}
		return newSQL.toString().replaceAll("\"null\"", "null");
	}

	public List<String> selectASubject(String idSujet) throws SQLException {
		List<String> listeInformations = new ArrayList<String>();
		PreparedStatement preparedStatement = null;
		PreparedStatement preparedStatement2 = null;
		PreparedStatement preparedStatement3 = null;
		preparedStatement = (PreparedStatement) connect
				.prepareStatement(initialisationRequetePreparee(selectSubject, idSujet));
		ResultSet result = preparedStatement.executeQuery();
		listeInformations.add(idSujet);
		result.next();
		listeInformations.add(result.getString("titre"));
		listeInformations.add(result.getString("confidentialite"));
		
		//Le descriptif seulement si confidentialite = 1
		if (result.getString("confidentialite").contentEquals("0")) {
			preparedStatement2 = (PreparedStatement) connect
					.prepareStatement(initialisationRequetePreparee(selectSubjectDescription, idSujet));
			ResultSet result2 = preparedStatement2.executeQuery();
			result2.next();
			listeInformations.add(result2.getString("description"));
		}
		//Le descriptif si l'utilisateur est lié au sujet 
		System.out.println("Milieu"+listeInformations);

		//Si oui ou non un poster a ete depose 
		preparedStatement3 = (PreparedStatement) connect
				.prepareStatement(initialisationRequetePreparee(selectPosterWhereSubject, idSujet));
		ResultSet result3 = preparedStatement3.executeQuery();
		if (result3 == null) {
			listeInformations.add("NoPoster");
		}
		else {
			listeInformations.add("PosterDepose");
		}
		System.out.println("Fin"+listeInformations);

		return listeInformations;
	}

	public List<Sujet> selectSujetsProffesseur(String idProfesseur) throws SQLException {
		List<Sujet> listeSujets = new ArrayList<Sujet>();
		Statement stmt = connect.createStatement();
		ResultSet result = stmt.executeQuery(SQL_selectSujetsProffesseur_DEBUT + idProfesseur);
		while (result.next()) {
			Sujet sujet = new Sujet();
			
			
			sujet.setConfidentialite(result.getBoolean("confidentialite"));
			sujet.setContratPro(result.getBoolean("contratPro"));
			sujet.setDescription(result.getString("description"));
			sujet.setEtatString((result.getString("etat")));
			sujet.setIdentifiant(result.getString("identifiant"));
			sujet.setIdSujet(result.getLong("idSujet"));
			sujet.setInterets(result.getString("interets"));
			sujet.setLiens(result.getString("liens"));
			sujet.setNbrMaxEleves(result.getInt("nbrMaxEleves"));
			sujet.setNbrMinEleves(result.getInt("nbrMinEleves"));
			sujet.setNoteInteretSujet(result.getFloat("noteInteretSujet"));
			sujet.setTitre("titre");
			
			listeSujets.add(sujet);
		}
		return listeSujets;
	}
	
}
