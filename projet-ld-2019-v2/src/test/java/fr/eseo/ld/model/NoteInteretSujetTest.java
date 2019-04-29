package fr.eseo.ld.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.model.NoteInteretSujet;

/**
 * Classe de tests unitaires JUnit 4 de la classe NoteInteretSujet.
 *
 * @version 1.0
 * @author Maxime LENORMAND
 *
 * @see fr.eseo.ld.beans.NoteInteretSujet
 * @see org.junit
 */
public class NoteInteretSujetTest {

	private static final Long LONG_TEST = 1L;
	private static final Integer INTEGER_TEST = 1;
	
	/**
	 * Teste le constructeur par défaut de la classe. 
	 */
	@Test
	public void testConstructeurParDefaut() {
		final NoteInteretSujet noteInteretSujet = new NoteInteretSujet();

		assertNull("L'attribut n'est pas nul", noteInteretSujet.getIdProfesseur());
	}
	
	/**
	 * Teste la méthode public Long getIdProfesseur().
	 */
	@Test
	public void testGetIdProfesseur() {
		final NoteInteretSujet noteInteretSujet = new NoteInteretSujet();
        
        final Long resultatAttendu = LONG_TEST;
        noteInteretSujet.setIdProfesseur(resultatAttendu);
        final Long resultatTrouve = noteInteretSujet.getIdProfesseur();
		
		assertEquals("Mauvais idProfesseur", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setIdProfesseur(Long idProfesseur). 
	 */
	@Test
	public void testSetIdProfesseur() {
		final NoteInteretSujet noteInteretSujet = new NoteInteretSujet();
        
        final Long resultatAttendu = LONG_TEST;
        noteInteretSujet.setIdProfesseur(resultatAttendu);
        final Long resultatTrouve = noteInteretSujet.getIdProfesseur();
		
		assertEquals("Mauvais idProfesseur", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public Long getIdSujet().
	 */
	@Test
	public void testGetIdSujet() {
		final NoteInteretSujet noteInteretSujet = new NoteInteretSujet();
		
        final Long resultatAttendu = LONG_TEST;
        noteInteretSujet.setIdSujet(resultatAttendu);
        final Long resultatTrouve = noteInteretSujet.getIdSujet();
		
		assertEquals("Mauvais idSujet", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setIdSujet(Long idSujet).
	 */
	@Test
	public void testSetIdSujet() {
		final NoteInteretSujet noteInteretSujet = new NoteInteretSujet();
		
        final Long resultatAttendu = LONG_TEST;
        noteInteretSujet.setIdSujet(resultatAttendu);
        final Long resultatTrouve = noteInteretSujet.getIdSujet();
		
		assertEquals("Mauvais idSujet", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public Integer getNote().
	 */
	@Test
	public void testGetNote() {
		final NoteInteretSujet noteInteretSujet = new NoteInteretSujet();
		
        final Integer resultatAttendu = INTEGER_TEST;
        noteInteretSujet.setNote(resultatAttendu);
        final Integer resultatTrouve = noteInteretSujet.getNote();
		
		assertEquals("Mauvaise note", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setNote(Integer note).
	 */
	@Test
	public void testSetNote() {
		final NoteInteretSujet noteInteretSujet = new NoteInteretSujet();
		
        final Integer resultatAttendu = INTEGER_TEST;
        noteInteretSujet.setNote(resultatAttendu);
        final Integer resultatTrouve = noteInteretSujet.getNote();
		
		assertEquals("Mauvaise note", resultatAttendu, resultatTrouve);
	}

	/**
	 * Teste la méthode public String toString().
	 */
	@Test
	public void testToString() {
		final NoteInteretSujet noteInteretSujet = new NoteInteretSujet();
		noteInteretSujet.setIdProfesseur(LONG_TEST);
		noteInteretSujet.setIdSujet(LONG_TEST);
		noteInteretSujet.setNote(INTEGER_TEST);

		final String resultatAttendu = "NoteInteretSujet [idProfesseur=" + LONG_TEST + ", idSujet=" + LONG_TEST
				+ ", note=" + INTEGER_TEST + "]";
		final String resultatTrouve = noteInteretSujet.toString();
		
		assertEquals("Mauvais toString()", resultatAttendu, resultatTrouve);
	}
	
}