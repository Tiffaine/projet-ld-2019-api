package fr.eseo.ld.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.lang.reflect.Field;

import org.junit.Test;

import com.model.Participant;

/**
 * Classe de tests unitaires JUnit 4 de la classe Participant.
 *
 * <p>Utilisation de la réflexivité.</p>
 *
 * @version 1.0
 * @author Mathéo GIRBAL
 *
 * @see fr.eseo.ld.beans.Participant
 * @see org.junit
 */
public class ParticipantTest {
	
	private static final Long LONG_TEST = 1L;
	private static final String STRING_TEST = "test";
	
	private static final String ATT_ID_REUNION = "idReunion";
	private static final String ATT_ID_UTILISATEUR = "idUtilisateur";
	private static final String ATT_VALIDATION = "validation";

	/**
	 * Teste le constructeur par défaut de la classe.
	 */
	@Test
	public void testConstructeurParDefaut() {
		final Participant participant = new Participant();

		assertNull("L'attribut n'est pas nul", participant.getIdReunion());
	}
	
	/**
	 * Teste la méthode public Long getIdReunion().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetIdReunion() throws NoSuchFieldException, IllegalAccessException {
		final Participant participant = new Participant();
		
        final Field idReunion = participant.getClass().getDeclaredField(ATT_ID_REUNION);
        idReunion.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        idReunion.set(participant, resultatAttendu);
        final Long resultatTrouve = participant.getIdReunion();
		
		assertEquals("Mauvais idReunion", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setIdReunion(Long idReunion).
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testSetIdReunion() throws NoSuchFieldException, IllegalAccessException {
		final Participant participant = new Participant();
		
        final Field idReunion = participant.getClass().getDeclaredField(ATT_ID_REUNION);
        idReunion.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        participant.setIdReunion(resultatAttendu);
        final Long resultatTrouve = (Long) idReunion.get(participant);
		
		assertEquals("Mauvais idReunion", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public Long getIdUtilisateur().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetIdUtilisateur() throws NoSuchFieldException, IllegalAccessException {
		final Participant participant = new Participant();
		
        final Field idUtilisateur = participant.getClass().getDeclaredField(ATT_ID_UTILISATEUR);
        idUtilisateur.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        idUtilisateur.set(participant, resultatAttendu);
        final Long resultatTrouve = participant.getIdUtilisateur();
		
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
		final Participant participant = new Participant();
		
        final Field idUtilisateur = participant.getClass().getDeclaredField(ATT_ID_UTILISATEUR);
        idUtilisateur.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        participant.setIdUtilisateur(resultatAttendu);
        final Long resultatTrouve = (Long) idUtilisateur.get(participant);
		
		assertEquals("Mauvais idUtilisateur", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public String getValidation().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetValidation() throws NoSuchFieldException, IllegalAccessException {
		final Participant participant = new Participant();
		
        final Field validation = participant.getClass().getDeclaredField(ATT_VALIDATION);
        validation.setAccessible(true);
        
        final String resultatAttendu = STRING_TEST;
        validation.set(participant, resultatAttendu);
        final String resultatTrouve = participant.getValidation();
		
		assertEquals("Mauvaise validation", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setValidation(String validation).
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testSetValidation() throws NoSuchFieldException, IllegalAccessException {
		final Participant participant = new Participant();
		
        final Field validation = participant.getClass().getDeclaredField(ATT_VALIDATION);
        validation.setAccessible(true);
        
        final String resultatAttendu = STRING_TEST;
        participant.setValidation(resultatAttendu);
        final String resultatTrouve = (String) validation.get(participant);
		
		assertEquals("Mauvaise validation", resultatAttendu, resultatTrouve);
	}
}