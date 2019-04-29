package fr.eseo.ld.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.lang.reflect.Field;

import org.junit.Test;

import com.model.Reunion;

/**
 * @author Mathéo GIRBAL
 *
 * Last updated on 10 avr. 2018
 */
public class ReunionTest {

	private static final Long LONG_TEST = 1L;
	private static final String STRING_TEST = "test";
	
	private static final String ATTRIBUT_ID = "id";
	private static final String ATTRIBUT_DATE = "date";
	private static final String ATTRIBUT_TITRE = "titre";
	private static final String ATTRIBUT_DESCRIPTION = "description";
	private static final String ATTRIBUT_COMPTE_RENDU = "compteRendu";
	private static final String ATTRIBUT_ETAT = "etat";
	
	/**
	 * Teste le constructeur par défaut de la classe.
	 */
	@Test
	public void testConstructeurParDefaut() {
		final Reunion reunion = new Reunion();

		assertNull("L'attribut n'est pas nul", reunion.getId());
	}
	
	/**
	 * Teste la méthode public Long getId().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException
	 */
	@Test
	public void testGetId() throws NoSuchFieldException, IllegalAccessException {
		final Reunion reunion = new Reunion();
		
        final Field id = reunion.getClass().getDeclaredField(ATTRIBUT_ID);
        id.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        id.set(reunion, resultatAttendu);
        final Long resultatTrouve = reunion.getId();
		
		assertEquals("Mauvais id", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setId(Long id).
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testSetId() throws NoSuchFieldException, IllegalAccessException {
		final Reunion reunion = new Reunion();
		
		final Field id = reunion.getClass().getDeclaredField(ATTRIBUT_ID);
        id.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        reunion.setId(resultatAttendu);
        final Long resultatTrouve = (Long) id.get(reunion);
		
		assertEquals("Mauvais id", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public String getDate().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException
	 */
	@Test
	public void testGetDate() throws NoSuchFieldException, IllegalAccessException {
		final Reunion reunion = new Reunion();
		
        final Field date = reunion.getClass().getDeclaredField(ATTRIBUT_DATE);
        date.setAccessible(true);
        
        final String resultatAttendu = STRING_TEST;
        date.set(reunion, resultatAttendu);
        final String resultatTrouve = reunion.getDate();
		
		assertEquals("Mauvais date", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setDate(Date date).
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testSetDate() throws NoSuchFieldException, IllegalAccessException {
		final Reunion reunion = new Reunion();
		
		final Field date = reunion.getClass().getDeclaredField(ATTRIBUT_DATE);
        date.setAccessible(true);
        
        final String resultatAttendu = STRING_TEST;
        reunion.setDate(resultatAttendu.toString());
        final String resultatTrouve = (String) date.get(reunion);
		
		assertEquals("Mauvais date", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public String getTitre().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException
	 */
	@Test
	public void testGetTitre() throws NoSuchFieldException, IllegalAccessException {
		final Reunion reunion = new Reunion();
		
        final Field titre = reunion.getClass().getDeclaredField(ATTRIBUT_TITRE);
        titre.setAccessible(true);
        
        final String resultatAttendu = STRING_TEST;
        titre.set(reunion, resultatAttendu);
        final String resultatTrouve = reunion.getTitre();
		
		assertEquals("Mauvais titre", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setTitre(String titre).
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testSetTitre() throws NoSuchFieldException, IllegalAccessException {
		final Reunion reunion = new Reunion();
		
		final Field titre = reunion.getClass().getDeclaredField(ATTRIBUT_TITRE);
		titre.setAccessible(true);
        
        final String resultatAttendu = STRING_TEST;
        reunion.setTitre(resultatAttendu);
        final String resultatTrouve = (String) titre.get(reunion);
		
		assertEquals("Mauvais titre", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public String getDescription().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException
	 */
	@Test
	public void testGetDescription() throws NoSuchFieldException, IllegalAccessException {
		final Reunion reunion = new Reunion();
		
        final Field description = reunion.getClass().getDeclaredField(ATTRIBUT_DESCRIPTION);
        description.setAccessible(true);
        
        final String resultatAttendu = STRING_TEST;
        description.set(reunion, resultatAttendu);
        final String resultatTrouve = reunion.getDescription();
		
		assertEquals("Mauvais description", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setDescription(String description).
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testSetDescription() throws NoSuchFieldException, IllegalAccessException {
		final Reunion reunion = new Reunion();
		
		final Field description = reunion.getClass().getDeclaredField(ATTRIBUT_DESCRIPTION);
		description.setAccessible(true);
        
        final String resultatAttendu = STRING_TEST;
        reunion.setDescription(resultatAttendu);
        final String resultatTrouve = (String) description.get(reunion);
		
		assertEquals("Mauvais description", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public String getCompteRendu().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException
	 */
	@Test
	public void testGetCompteRendu() throws NoSuchFieldException, IllegalAccessException {
		final Reunion reunion = new Reunion();
		
        final Field compteRendu = reunion.getClass().getDeclaredField(ATTRIBUT_COMPTE_RENDU);
        compteRendu.setAccessible(true);
        
        final String resultatAttendu = STRING_TEST;
        compteRendu.set(reunion, resultatAttendu);
        final String resultatTrouve = reunion.getCompteRendu();
		
		assertEquals("Mauvais compte-rendu", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setCompteRendu(String compteRendu).
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testSetCompteRendu() throws NoSuchFieldException, IllegalAccessException {
		final Reunion reunion = new Reunion();
		
		final Field compteRendu = reunion.getClass().getDeclaredField(ATTRIBUT_COMPTE_RENDU);
		compteRendu.setAccessible(true);
        
        final String resultatAttendu = STRING_TEST;
        reunion.setCompteRendu(resultatAttendu);
        final String resultatTrouve = (String) compteRendu.get(reunion);
		
		assertEquals("Mauvais compte-rendu", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public String getEtat().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException
	 */
	@Test
	public void testGetEtat() throws NoSuchFieldException, IllegalAccessException {
		final Reunion reunion = new Reunion();
		
        final Field etat = reunion.getClass().getDeclaredField(ATTRIBUT_ETAT);
        etat.setAccessible(true);
        
        final String resultatAttendu = STRING_TEST;
        etat.set(reunion, resultatAttendu);
        final String resultatTrouve = reunion.getEtat();
		
		assertEquals("Mauvais etat", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setEtat(String etat).
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testSetEtat() throws NoSuchFieldException, IllegalAccessException {
		final Reunion reunion = new Reunion();
		
		final Field etat = reunion.getClass().getDeclaredField(ATTRIBUT_ETAT);
		etat.setAccessible(true);
        
        final String resultatAttendu = STRING_TEST;
        reunion.setEtat(resultatAttendu);
        final String resultatTrouve = (String) etat.get(reunion);
		
		assertEquals("Mauvais etat", resultatAttendu, resultatTrouve);
	}
}
