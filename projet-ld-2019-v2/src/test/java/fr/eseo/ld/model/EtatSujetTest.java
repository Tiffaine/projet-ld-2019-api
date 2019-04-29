package fr.eseo.ld.model;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Field;

import org.junit.Test;

import com.model.EtatSujet;

/**
 * Classe de tests unitaires JUnit 4 de l'énumération EtatSujet.
 *
 * <p>Utilisation de la réflexivité.</p>
 *
 * @version 1.0
 * @author Julie Avizou
 *
 * @see fr.eseo.ld.beans.EtatSujet
 * @see org.junit
 */
public class EtatSujetTest {
	
	private static final String DEPOSE = "déposé";
	
	private static final String ATT_ETAT = "etat";
	
	/**
	 * Teste le constructeur de l'énumération.
	 * 
	 * @throws NoSuchFieldException
	 * @throws IllegalAccessException
	 */
	@Test
	public void testConstructeur() throws NoSuchFieldException, IllegalAccessException {
		final EtatSujet etatSujet = EtatSujet.DEPOSE;

		final Field etat = etatSujet.getClass().getDeclaredField(ATT_ETAT);
		etat.setAccessible(true);
		
		final String resultatAttendu = DEPOSE;
		final String resultatTrouve = (String) etat.get(etatSujet);

		assertEquals("Mauvais etat", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public String getEtat().
	 */
	@Test
	public void testGetFonction() {
		final EtatSujet etatSujet = EtatSujet.DEPOSE;

		final String resultatAttendu = DEPOSE;
		final String resultatTrouve = etatSujet.getEtat();

		assertEquals("Mauvais etat", resultatAttendu, resultatTrouve);
	}
	
}