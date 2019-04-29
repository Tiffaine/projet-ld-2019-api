package fr.eseo.ld.model;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Field;

import org.junit.Test;

import com.model.FonctionProfesseurSujet;

/**
 * Classe de tests unitaires JUnit 4 de l'énumération FonctionProfesseurSujet.
 *
 * <p>Utilisation de la réflexivité.</p>
 *
 * @version 1.0
 * @author Maxime LENORMAND
 *
 * @see fr.eseo.ld.beans.FonctionProfesseurSujet
 * @see org.junit
 */
public class FonctionProfesseurSujetTest {

	private static final String CONSULTANT = "consultant";
	
	private static final String ATT_FONCTION = "fonction";
	
	/**
	 * Teste le constructeur de l'énumération.
	 * 
	 * @throws NoSuchFieldException
	 * @throws IllegalAccessException
	 */
	@Test
	public void testConstructeur() throws NoSuchFieldException, IllegalAccessException {
		final FonctionProfesseurSujet fonctionProfesseurSujet = FonctionProfesseurSujet.CONSULTANT;

		final Field fonction = fonctionProfesseurSujet.getClass().getDeclaredField(ATT_FONCTION);
		fonction.setAccessible(true);
		
		final String resultatAttendu = CONSULTANT;
		final String resultatTrouve = (String) fonction.get(fonctionProfesseurSujet);

		assertEquals("Mauvaise fonction", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public String getFonction().
	 */
	@Test
	public void testGetFonction() {
		final FonctionProfesseurSujet fonctionProfesseurSujet = FonctionProfesseurSujet.CONSULTANT;

		final String resultatAttendu = CONSULTANT;
		final String resultatTrouve = fonctionProfesseurSujet.getFonction();

		assertEquals("Mauvaise fonction", resultatAttendu, resultatTrouve);
	}

}