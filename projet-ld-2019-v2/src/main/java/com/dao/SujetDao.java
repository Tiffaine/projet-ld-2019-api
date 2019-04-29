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
	private static String selectProfesseurSujetWhereSubject = "SELECT idProfesseur from `professeursujet` where idSujet=?";
	private static String selectEquipeWhereSubject = "SELECT idEquipe from `equipe` where idSujet=?";
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

	public List<String> selectASubject(String idSujet, String identifiantUser) throws SQLException {
		List<String> listeInformations = new ArrayList<String>();
		PreparedStatement preparedStatement = null;
		PreparedStatement preparedStatement2 = null;
		PreparedStatement preparedStatement3 = null;
		PreparedStatement preparedStatement4 = null;
		PreparedStatement preparedStatement6 = null;
		boolean lieAuProjet = false;
		preparedStatement = (PreparedStatement) connect
				.prepareStatement(initialisationRequetePreparee(selectSubject, idSujet));
		ResultSet result = preparedStatement.executeQuery();
		listeInformations.add(" idSujet ");
		listeInformations.add(idSujet);
		result.next();
		listeInformations.add("titre");
		listeInformations.add(result.getString("titre"));
		listeInformations.add(" niveau confidentialite ");
		listeInformations.add(result.getString("confidentialite"));

// Si oui ou non un poster a ete depose
		preparedStatement3 = (PreparedStatement) connect
				.prepareStatement(initialisationRequetePreparee(selectPosterWhereSubject, idSujet));
		ResultSet result3 = preparedStatement3.executeQuery();
		if (result3 == null) {
			listeInformations.add("NoPoster");
		} else {
			listeInformations.add("PosterDepose");
		}

// Nom du prof qui suit le projet
		preparedStatement4 = (PreparedStatement) connect
				.prepareStatement(initialisationRequetePreparee(selectProfesseurSujetWhereSubject, idSujet));
		ResultSet result4 = preparedStatement4.executeQuery();
		result4.next();
		String idProfesseur = result4.getString("idProfesseur");
		if (idProfesseur == identifiantUser) {
			lieAuProjet = true;
		}
		String requeteProf = "SELECT nom,prenom from `utilisateur` where idUtilisateur=" + idProfesseur;
		Statement stmt = connect.createStatement();
		ResultSet result5 = stmt.executeQuery(requeteProf);
		result5.next();
		listeInformations.add(" Professeur qui suit le projet : ");
		listeInformations.add(result5.getString("nom"));
		listeInformations.add(result5.getString("prenom"));

// Nom des etudiants sur le projet
		preparedStatement6 = (PreparedStatement) connect
				.prepareStatement(initialisationRequetePreparee(selectEquipeWhereSubject, idSujet));
		ResultSet result6 = preparedStatement6.executeQuery();
		result6.next();
		String idEquipe = result6.getString("idEquipe");

		String requeteEquipe = "SELECT idEtudiant from `EtudiantEquipe` where idEquipe=\"" + idEquipe + "\"";
		ResultSet result7 = stmt.executeQuery(requeteEquipe);
		String idEtudiant = null;
		List<String> listeidEtudiant = new ArrayList<String>();
		while (result7.next()) {
			listeidEtudiant.add(result7.getString("idEtudiant"));
		}
		for (int j = 0; j < listeidEtudiant.size(); j++) {
			if (listeidEtudiant.get(j) == identifiantUser) {
				lieAuProjet = true;
			}
		}
		String requeteEtudiant = "SELECT nom,prenom from `utilisateur` where idUtilisateur=";
		for (int i = 0; i < listeidEtudiant.size(); i++) {
			if (i == 0) {
				requeteEtudiant = requeteEtudiant + listeidEtudiant.get(i);
			} else if (i > 0 && i < listeidEtudiant.size()) {
				requeteEtudiant = requeteEtudiant + " or idUtilisateur=" + listeidEtudiant.get(i);
			}
		}
		ResultSet result8 = stmt.executeQuery(requeteEtudiant);
		while (result8.next()) {
			listeInformations.add(" Etudiant membre du projet : ");

			listeInformations.add(result8.getString("nom"));
			listeInformations.add(result8.getString("prenom"));
		}
// Le descriptif seulement si confidentialite = 1
		if (result.getString("confidentialite").contentEquals("0") || lieAuProjet == true) {
			preparedStatement2 = (PreparedStatement) connect
					.prepareStatement(initialisationRequetePreparee(selectSubjectDescription, idSujet));
			ResultSet result2 = preparedStatement2.executeQuery();
			result2.next();
			listeInformations.add(" Description sujet : ");

			listeInformations.add(result2.getString("description"));
		}
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