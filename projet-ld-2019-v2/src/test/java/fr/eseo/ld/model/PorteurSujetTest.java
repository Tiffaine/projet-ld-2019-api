package fr.eseo.ld.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.lang.reflect.Field;

import org.junit.Test;

import com.model.PorteurSujet;

/**
 * Classe de tests unitaires JUnit 4 de la classe PorteurSujet.
 *
 * <p>Utilisation de la réflexivité.</p>
 *
 * @version 1.0
 * @author Maxime LENORMAND
 *
 * @see fr.eseo.ld.beans.PorteurSujet
 * @see org.junit
 */
public class PorteurSujetTest {
	
	private static final Long LONG_TEST = 1L;
	private static final Integer INTEGER_TEST = 1;
	
	private static final String ATT_ID_SUJET = "idSujet";
	private static final String ATT_ID_UTILISATEUR = "idUtilisateur";
	private static final String ATT_ANNEE = "annee";

	/**
	 * Teste le constructeur par défaut de la classe.
	 */
	@Test
	public void testConstructeurParDefaut() {
		final PorteurSujet porteurSujet = new PorteurSujet();

		assertNull("L'attribut n'est pas nul", porteurSujet.getIdSujet());
	}
	
	/**
	 * Teste la méthode public Long getIdSujet().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetIdSujet() throws NoSuchFieldException, IllegalAccessException {
		final PorteurSujet porteurSujet = new PorteurSujet();
		
        final Field idSujet = porteurSujet.getClass().getDeclaredField(ATT_ID_SUJET);
        idSujet.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        idSujet.set(porteurSujet, resultatAttendu);
        final Long resultatTrouve = porteurSujet.getIdSujet();
		
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
		final PorteurSujet porteurSujet = new PorteurSujet();
		
        final Field idSujet = porteurSujet.getClass().getDeclaredField(ATT_ID_SUJET);
        idSujet.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        porteurSujet.setIdSujet(resultatAttendu);
        final Long resultatTrouve = (Long) idSujet.get(porteurSujet);
		
		assertEquals("Mauvais idSujet", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public Long getIdUtilisateur().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetIdUtilisateur() throws NoSuchFieldException, IllegalAccessException {
		final PorteurSujet porteurSujet = new PorteurSujet();
		
        final Field idUtilisateur = porteurSujet.getClass().getDeclaredField(ATT_ID_UTILISATEUR);
        idUtilisateur.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        idUtilisateur.set(porteurSujet, resultatAttendu);
        final Long resultatTrouve = porteurSujet.getIdUtilisateur();
		
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
		final PorteurSujet porteurSujet = new PorteurSujet();
		
        final Field idUtilisateur = porteurSujet.getClass().getDeclaredField(ATT_ID_UTILISATEUR);
        idUtilisateur.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        porteurSujet.setIdUtilisateur(resultatAttendu);
        final Long resultatTrouve = (Long) idUtilisateur.get(porteurSujet);
		
		assertEquals("Mauvais idUtilisateur", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public Integer getAnnee().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetAnnee() throws NoSuchFieldException, IllegalAccessException {
		final PorteurSujet porteurSujet = new PorteurSujet();
		
        final Field annee = porteurSujet.getClass().getDeclaredField(ATT_ANNEE);
        annee.setAccessible(true);
        
        final Integer resultatAttendu = INTEGER_TEST;
        annee.set(porteurSujet, resultatAttendu);
        final Integer resultatTrouve = porteurSujet.getAnnee();
		
		assertEquals("Mauvaise annee", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setAnnee(Integer annee).
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testSetAnnee() throws NoSuchFieldException, IllegalAccessException {
		final PorteurSujet porteurSujet = new PorteurSujet();
		
        final Field annee = porteurSujet.getClass().getDeclaredField(ATT_ANNEE);
        annee.setAccessible(true);
        
        final Integer resultatAttendu = INTEGER_TEST;
        porteurSujet.setAnnee(resultatAttendu);
        final Integer resultatTrouve = (Integer) annee.get(porteurSujet);
		
		assertEquals("Mauvaise annee", resultatAttendu, resultatTrouve);
	}

	/**
	 * Teste la méthode public String toString().
	 */
	@Test
	public void testToString() {
		final PorteurSujet porteurSujet = new PorteurSujet();
		porteurSujet.setIdSujet(LONG_TEST);
		porteurSujet.setIdUtilisateur(LONG_TEST);
		porteurSujet.setAnnee(INTEGER_TEST);

		final String resultatAttendu = "PorteurSujet [idSujet=" + LONG_TEST + ", idUtilisateur=" + LONG_TEST
				+ ", annee=" + INTEGER_TEST + "]";
		final String resultatTrouve = porteurSujet.toString();

		assertEquals("Mauvais toString()", resultatAttendu, resultatTrouve);
	}

}