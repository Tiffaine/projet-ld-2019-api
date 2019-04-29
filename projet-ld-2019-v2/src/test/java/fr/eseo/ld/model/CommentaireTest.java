package fr.eseo.ld.model;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.lang.reflect.Field;

import org.junit.Test;

import com.model.Commentaire;

/**
 * Classe de tests unitaires JUnit 4 de la classe Commentaire.
 *
 * <p>Utilisation de la réflexivité.</p>
 *
 * @version 1.0
 * @author Hugo Menard
 *
 * @see fr.eseo.ld.beans.Commentaire
 * @see org.junit
 */
public class CommentaireTest {
	
	private static final String STRING_TEST = "test";
	private static final Long LONG_TEST = 1L;
	
	private static final String ATT_ID_COMMENTAIRE = "idCommentaire";
	private static final String ATT_ID_UTILISATEUR = "idUtilisateur";
	private static final String ATT_ID_SUJET = "idSujet";
	private static final String ATT_ID_OBSERVATION = "idObservation";
	private static final String ATT_CONTENU = "contenu";
	
	/**
	 * Teste le constructeur par défaut de la classe.
	 */
	@Test
	public void testConstructeurParDefaut() {
		final Commentaire commentaire = new Commentaire();

		assertNull("L'attribut n'est pas nul", commentaire.getIdCommentaire());
	}
	
	/**
	 * Teste la méthode public Long getIdCommentaire().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetIdCommentaire() throws NoSuchFieldException, IllegalAccessException {
		final Commentaire commentaire = new Commentaire();
		
        final Field idCommentaire = commentaire.getClass().getDeclaredField(ATT_ID_COMMENTAIRE);
        idCommentaire.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        idCommentaire.set(commentaire, resultatAttendu);
        final Long resultatTrouve = commentaire.getIdCommentaire();
		
		assertEquals("Mauvais idCommentaire", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setIdCommentaire(Long idCommentaire).
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testSetIdCommentaire() throws NoSuchFieldException, IllegalAccessException {
		final Commentaire commentaire = new Commentaire();
		
        final Field idCommentaire = commentaire.getClass().getDeclaredField(ATT_ID_COMMENTAIRE);
        idCommentaire.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        commentaire.setIdCommentaire(resultatAttendu);
        final Long resultatTrouve = (Long) idCommentaire.get(commentaire);
		
		assertEquals("Mauvais idCommentaire", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public Long getIdUtilisateur().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetIdUtilisateur() throws NoSuchFieldException, IllegalAccessException {
		final Commentaire commentaire = new Commentaire();
		
        final Field idUtilisateur = commentaire.getClass().getDeclaredField(ATT_ID_UTILISATEUR);
        idUtilisateur.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        idUtilisateur.set(commentaire, resultatAttendu);
        final Long resultatTrouve = commentaire.getIdUtilisateur();
		
		assertEquals("Mauvais idUtilisateur", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setIdUtilisateur(Long idUtilisateur).
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testSetIdUtilisateur() throws NoSuchFieldException, IllegalAccessException {
		final Commentaire commentaire = new Commentaire();
		
        final Field idUtilisateur = commentaire.getClass().getDeclaredField(ATT_ID_UTILISATEUR);
        idUtilisateur.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        commentaire.setIdUtilisateur(resultatAttendu);
        final Long resultatTrouve = (Long) idUtilisateur.get(commentaire);
		
		assertEquals("Mauvais idUtilisateur", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public Long getIdSujet().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetIdSujet() throws NoSuchFieldException, IllegalAccessException {
		final Commentaire commentaire = new Commentaire();
		
        final Field idSujet = commentaire.getClass().getDeclaredField(ATT_ID_SUJET);
        idSujet.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        idSujet.set(commentaire, resultatAttendu);
        final Long resultatTrouve = commentaire.getIdSujet();
		
		assertEquals("Mauvais idSujet", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setIdSujet(Long idSujet).
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testSetIdSujet() throws NoSuchFieldException, IllegalAccessException {
		final Commentaire commentaire = new Commentaire();
		
        final Field idSujet = commentaire.getClass().getDeclaredField(ATT_ID_SUJET);
        idSujet.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        commentaire.setIdSujet(resultatAttendu);
        final Long resultatTrouve = (Long) idSujet.get(commentaire);
		
		assertEquals("Mauvais idSujet", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public Long getIdObservation().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetIdObservation() throws NoSuchFieldException, IllegalAccessException {
		final Commentaire commentaire = new Commentaire();
		
        final Field idObservation = commentaire.getClass().getDeclaredField(ATT_ID_OBSERVATION);
        idObservation.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        idObservation.set(commentaire, resultatAttendu);
        final Long resultatTrouve = commentaire.getIdObservation();
		
		assertEquals("Mauvais idObservation", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setIdObservation(Long idObservation).
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testSetIdObservation() throws NoSuchFieldException, IllegalAccessException {
		final Commentaire commentaire = new Commentaire();
		
        final Field idObservation = commentaire.getClass().getDeclaredField(ATT_ID_OBSERVATION);
        idObservation.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        commentaire.setIdObservation(resultatAttendu);
        final Long resultatTrouve = (Long) idObservation.get(commentaire);
		
		assertEquals("Mauvais idObservation", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public String getContenu().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetContenu() throws NoSuchFieldException, IllegalAccessException {
		final Commentaire commentaire = new Commentaire();

		final Field contenu = commentaire.getClass().getDeclaredField(ATT_CONTENU);
		contenu.setAccessible(true);

		final String resultatAttendu = STRING_TEST;
		contenu.set(commentaire, resultatAttendu);
		final String resultatTrouve = commentaire.getContenu();

		assertEquals("Mauvais contenu", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setContenu(String contenu).
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testSetContenu() throws NoSuchFieldException, IllegalAccessException {
		final Commentaire commentaire = new Commentaire();

		final Field contenu = commentaire.getClass().getDeclaredField(ATT_CONTENU);
		contenu.setAccessible(true);

		final String resultatAttendu = STRING_TEST;
		commentaire.setContenu(resultatAttendu);
		final String resultatTrouve = (String) contenu.get(commentaire);

		assertEquals("Mauvais contenu", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public String toString().
	 */
	@Test
	public void testToString() {
		final Commentaire commentaire = new Commentaire();
		commentaire.setIdCommentaire(LONG_TEST);
		commentaire.setIdUtilisateur(LONG_TEST);
		commentaire.setIdSujet(LONG_TEST);
		commentaire.setIdObservation(LONG_TEST);
		commentaire.setContenu(STRING_TEST);

		final String resultatAttendu = "Commentaire [idCommentaire=" + LONG_TEST + ", idUtilisateur=" + LONG_TEST
				+ ", idSujet=" + LONG_TEST + ", idObservation=" + LONG_TEST + ", contenu=" + STRING_TEST + "]";
		final String resultatTrouve = commentaire.toString();

		assertEquals("Mauvais toString()", resultatAttendu, resultatTrouve);
	}
	
}
