package fr.eseo.ld.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.model.NoteInteretTechno;

/**
 * Classe de tests unitaires JUnit 4 de la classe NoteInteretTechno.
 *
 * @version 1.0
 * @author Maxime LENORMAND
 *
 * @see fr.eseo.ld.beans.NoteInteretTechno
 * @see org.junit
 */
public class NoteInteretTechnoTest {

	private static final Long LONG_TEST = 1L;
	private static final Integer INTEGER_TEST = 1;
	
	/**
	 * Teste le constructeur par défaut de la classe. 
	 */
	@Test
	public void testConstructeurParDefaut() {
		final NoteInteretTechno noteInteretTechno = new NoteInteretTechno();

		assertNull("L'attribut n'est pas nul", noteInteretTechno.getIdProfesseur());
	}
	
	/**
	 * Teste la méthode public Long getIdProfesseur().
	 */
	@Test
	public void testGetIdProfesseur() {
		final NoteInteretTechno noteInteretTechno = new NoteInteretTechno();
        
        final Long resultatAttendu = LONG_TEST;
        noteInteretTechno.setIdProfesseur(resultatAttendu);
        final Long resultatTrouve = noteInteretTechno.getIdProfesseur();
		
		assertEquals("Mauvais idProfesseur", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setIdProfesseur(Long idProfesseur).
	 */
	@Test
	public void testSetIdProfesseur() {
		final NoteInteretTechno noteInteretTechno = new NoteInteretTechno();
        
        final Long resultatAttendu = LONG_TEST;
        noteInteretTechno.setIdProfesseur(resultatAttendu);
        final Long resultatTrouve = noteInteretTechno.getIdProfesseur();
		
		assertEquals("Mauvais idProfesseur", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public Long getIdSujet().
	 */
	@Test
	public void testGetIdSujet() {
		final NoteInteretTechno noteInteretTechno = new NoteInteretTechno();
        
        final Long resultatAttendu = LONG_TEST;
        noteInteretTechno.setIdSujet(resultatAttendu);
        final Long resultatTrouve = noteInteretTechno.getIdSujet();
		
		assertEquals("Mauvais idSujet", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setIdSujet(Long idSujet).
	 */
	@Test
	public void testSetIdSujet() {
		final NoteInteretTechno noteInteretTechno = new NoteInteretTechno();
		
        final Long resultatAttendu = LONG_TEST;
        noteInteretTechno.setIdSujet(resultatAttendu);
        final Long resultatTrouve = noteInteretTechno.getIdSujet();
		
		assertEquals("Mauvais idSujet", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public Integer getNote().
	 */
	@Test
	public void testGetNote() {
		final NoteInteretTechno noteInteretTechno = new NoteInteretTechno();
		
        final Integer resultatAttendu = INTEGER_TEST;
        noteInteretTechno.setNote(resultatAttendu);
        final Integer resultatTrouve = noteInteretTechno.getNote();
		
		assertEquals("Mauvaise note", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setNote(Integer note).
	 */
	@Test
	public void testSetNote() {
		final NoteInteretTechno noteInteretTechno = new NoteInteretTechno();
		
        final Integer resultatAttendu = INTEGER_TEST;
        noteInteretTechno.setNote(resultatAttendu);
        final Integer resultatTrouve = noteInteretTechno.getNote();
		
		assertEquals("Mauvaise note", resultatAttendu, resultatTrouve);
	}

	/**
	 * Teste la méthode public String toString().
	 */
	@Test
	public void testToString() {
		final NoteInteretTechno noteInteretTechno = new NoteInteretTechno();
		noteInteretTechno.setIdProfesseur(LONG_TEST);
		noteInteretTechno.setIdSujet(LONG_TEST);
		noteInteretTechno.setNote(INTEGER_TEST);

		final String resultatAttendu = "NoteInteretTechno [idProfesseur=" + LONG_TEST + ", idSujet=" + LONG_TEST
				+ ", note=" + INTEGER_TEST + "]";
		final String resultatTrouve = noteInteretTechno.toString();
		
		assertEquals("Mauvais toString()", resultatAttendu, resultatTrouve);
	}
	
}