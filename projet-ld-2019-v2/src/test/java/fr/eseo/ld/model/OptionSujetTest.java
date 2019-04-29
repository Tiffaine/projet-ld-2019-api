package fr.eseo.ld.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.lang.reflect.Field;

import org.junit.Test;

import com.model.OptionSujet;

/**
 * Classe de tests unitaires JUnit 4 de la classe OptionSujet.
 *
 * <p>Utilisation de la réflexivité.</p>
 *
 * @version 1.0
 * @author Maxime LENORMAND
 *
 * @see fr.eseo.ld.beans.OptionSujet
 * @see org.junit
 */
public class OptionSujetTest {
	
	private static final Long LONG_TEST = 1L;
	
	private static final String ATT_ID_OPTION = "idOption";
	private static final String ATT_ID_SUJET = "idSujet";

	/**
	 * Teste le constructeur par défaut de la classe. 
	 */
	@Test
	public void testConstructeurParDefaut() {
		final OptionSujet optionSujet = new OptionSujet();

		assertNull("L'attribut n'est pas nul", optionSujet.getIdOption());
	}
	
	/**
	 * Teste la méthode public Long getIdOption().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetIdOption() throws NoSuchFieldException, IllegalAccessException {
		final OptionSujet optionSujet = new OptionSujet();
		
        final Field idOption = optionSujet.getClass().getDeclaredField(ATT_ID_OPTION);
        idOption.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        idOption.set(optionSujet, resultatAttendu);
        final Long resultatTrouve = optionSujet.getIdOption();
		
		assertEquals("Mauvais idOption", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setIdOption(Long idOption).
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testSetIdOption() throws NoSuchFieldException, IllegalAccessException {
		final OptionSujet optionSujet = new OptionSujet();
		
        final Field idOption = optionSujet.getClass().getDeclaredField(ATT_ID_OPTION);
        idOption.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        optionSujet.setIdOption(resultatAttendu);
        final Long resultatTrouve = (Long) idOption.get(optionSujet);
		
		assertEquals("Mauvais idOption", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public Long getIdSujet().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetIdSujet() throws NoSuchFieldException, IllegalAccessException {
		final OptionSujet optionSujet = new OptionSujet();
		
        final Field idSujet = optionSujet.getClass().getDeclaredField(ATT_ID_SUJET);
        idSujet.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        idSujet.set(optionSujet, resultatAttendu);
        final Long resultatTrouve = optionSujet.getIdSujet();
		
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
		final OptionSujet optionSujet = new OptionSujet();
		
        final Field idSujet = optionSujet.getClass().getDeclaredField(ATT_ID_SUJET);
        idSujet.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        optionSujet.setIdSujet(resultatAttendu);
        final Long resultatTrouve = (Long) idSujet.get(optionSujet);
		
		assertEquals("Mauvais idSujet", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public String toString().
	 */
	@Test
	public void testToString() {
		final OptionSujet optionSujet = new OptionSujet();
		optionSujet.setIdOption(LONG_TEST);
		optionSujet.setIdSujet(LONG_TEST);

		final String resultatAttendu = "OptionSujet [idOption=" + LONG_TEST + ", idSujet=" + LONG_TEST + "]";
		final String resultatTrouve = optionSujet.toString();

		assertEquals("Mauvais toString()", resultatAttendu, resultatTrouve);
	}

}