package fr.eseo.ld.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.lang.reflect.Field;

import org.junit.Test;

import com.model.OptionESEO;

/**
 * Classe de tests unitaires JUnit 4 de la classe OptionESEO.
 *
 * <p>Utilisation de la réflexivité.</p>
 *
 * @version 1.0
 * @author Maxime LENORMAND
 *
 * @see fr.eseo.ld.beans.OptionESEO
 * @see org.junit
 */
public class OptionESEOTest {
	
	private static final String STRING_TEST = "test";
	private static final Long LONG_TEST = 1L;
	
	private static final String ATT_ID_OPTION = "idOption";
	private static final String ATT_NOM_OPTION = "nomOption";

	/**
	 * Teste le constructeur par défaut de la classe. 
	 */
	@Test
	public void testConstructeurParDefaut() {
		final OptionESEO optionESEO = new OptionESEO();

		assertNull("L'attribut n'est pas nul", optionESEO.getIdOption());
	}
	
	/**
	 * Teste la méthode public Long getIdOption().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetIdOption() throws NoSuchFieldException, IllegalAccessException {
		final OptionESEO optionESEO = new OptionESEO();
		
        final Field idOption = optionESEO.getClass().getDeclaredField(ATT_ID_OPTION);
        idOption.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        idOption.set(optionESEO, resultatAttendu);
        final Long resultatTrouve = optionESEO.getIdOption();
		
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
		final OptionESEO optionESEO = new OptionESEO();
		
        final Field idOption = optionESEO.getClass().getDeclaredField(ATT_ID_OPTION);
        idOption.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        optionESEO.setIdOption(resultatAttendu);
        final Long resultatTrouve = (Long) idOption.get(optionESEO);
		
		assertEquals("Mauvais idOption", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public String getNomOption().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetNomOption() throws NoSuchFieldException, IllegalAccessException {
		final OptionESEO optionESEO = new OptionESEO();

		final Field nomOption = optionESEO.getClass().getDeclaredField(ATT_NOM_OPTION);
		nomOption.setAccessible(true);

		final String resultatAttendu = STRING_TEST;
		nomOption.set(optionESEO, resultatAttendu);
		final String resultatTrouve = optionESEO.getNomOption();

		assertEquals("Mauvais nomOption", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setNomOption(String nomOption).
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testSetNomOption() throws NoSuchFieldException, IllegalAccessException {
		final OptionESEO optionESEO = new OptionESEO();

		final Field nomOption = optionESEO.getClass().getDeclaredField(ATT_NOM_OPTION);
		nomOption.setAccessible(true);

		final String resultatAttendu = STRING_TEST;
		optionESEO.setNomOption(resultatAttendu);
		final String resultatTrouve = (String) nomOption.get(optionESEO);

		assertEquals("Mauvais nomOption", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public String toString().
	 */
	@Test
	public void testToString() {
		final OptionESEO optionESEO = new OptionESEO();
		optionESEO.setIdOption(LONG_TEST);
		optionESEO.setNomOption(STRING_TEST);

		final String resultatAttendu = "Option [idOption=" + LONG_TEST + ", nomOption=" + STRING_TEST + "]";
		final String resultatTrouve = optionESEO.toString();

		assertEquals("Mauvais toString()", resultatAttendu, resultatTrouve);
	}

}