package fr.eseo.ld.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.lang.reflect.Field;

import org.junit.Test;

import com.model.FonctionProfesseurSujet;
import com.model.ProfesseurSujet;

/**
 * Classe de tests unitaires JUnit 4 de la classe ProfesseurSujet.
 *
 * <p>Utilisation de la réflexivité.</p>
 *
 * @version 1.0
 * @author Maxime LENORMAND
 *
 * @see fr.eseo.ld.beans.ProfesseurSujet
 * @see org.junit
 */
public class ProfesseurSujetTest {
	
	private static final Long LONG_TEST = 1L;
	private static final FonctionProfesseurSujet FONCTION_TEST = FonctionProfesseurSujet.CONSULTANT;
	private static final String STRING_TEST = "test";
	
	private static final String ATT_ID_PROFESSEUR = "idProfesseur";
	private static final String ATT_ID_SUJET = "idSujet";
	private static final String ATT_FONCTION = "fonction";
	private static final String ATT_VALIDE = "valide";
	
	/**
	 * Teste le constructeur par défaut de la classe. 
	 */
	@Test
	public void testConstructeurParDefaut() {
		final ProfesseurSujet professeurSujet = new ProfesseurSujet();

		assertNull("L'attribut n'est pas nul", professeurSujet.getIdProfesseur());
	}
	
	/**
	 * Teste la méthode public Long getIdProfesseur().
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetIdProfesseur() throws Exception {
		final ProfesseurSujet professeurSujet = ProfesseurSujet.class.getDeclaredConstructor().newInstance();

		final Field idProfesseur = professeurSujet.getClass().getDeclaredField(ATT_ID_PROFESSEUR);
		idProfesseur.setAccessible(true);

		final Long resultatAttendu = LONG_TEST;
		idProfesseur.set(professeurSujet, resultatAttendu);
		final Long resultatTrouve = professeurSujet.getIdProfesseur();

		assertEquals("Mauvais idProfesseur", resultatAttendu, resultatTrouve);
	}

	/**
	 * Teste la méthode public void setIdProfesseur(Long idProfesseur).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSetIdProfesseur() throws Exception {
		final ProfesseurSujet professeurSujet = ProfesseurSujet.class.getDeclaredConstructor().newInstance();

		final Field idProfesseur = professeurSujet.getClass().getDeclaredField(ATT_ID_PROFESSEUR);
		idProfesseur.setAccessible(true);

		final Long resultatAttendu = LONG_TEST;
		professeurSujet.setIdProfesseur(resultatAttendu);
		final Long resultatTrouve = (Long) idProfesseur.get(professeurSujet);

		assertEquals("Mauvais idProfesseur", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public Long getIdSujet().
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetIdSujet() throws Exception {
		final ProfesseurSujet professeurSujet = ProfesseurSujet.class.getDeclaredConstructor().newInstance();

		final Field idSujet = professeurSujet.getClass().getDeclaredField(ATT_ID_SUJET);
		idSujet.setAccessible(true);

		final Long resultatAttendu = LONG_TEST;
		idSujet.set(professeurSujet, resultatAttendu);
		final Long resultatTrouve = professeurSujet.getIdSujet();

		assertEquals("Mauvais idSujet", resultatAttendu, resultatTrouve);
	}

	/**
	 * Teste la méthode public void setIdSujet(Long idSujet).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSetIdSujet() throws Exception {
		final ProfesseurSujet professeurSujet = ProfesseurSujet.class.getDeclaredConstructor().newInstance();

		final Field idSujet = professeurSujet.getClass().getDeclaredField(ATT_ID_SUJET);
		idSujet.setAccessible(true);

		final Long resultatAttendu = LONG_TEST;
		professeurSujet.setIdSujet(resultatAttendu);
		final Long resultatTrouve = (Long) idSujet.get(professeurSujet);

		assertEquals("Mauvais idSujet", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public FonctionProfesseurSujet getFonction().
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetFonction() throws Exception {
		final ProfesseurSujet professeurSujet = ProfesseurSujet.class.getDeclaredConstructor().newInstance();

		final Field fonction = professeurSujet.getClass().getDeclaredField(ATT_FONCTION);
		fonction.setAccessible(true);

		final FonctionProfesseurSujet resultatAttendu = FONCTION_TEST;
		fonction.set(professeurSujet, resultatAttendu);
		final FonctionProfesseurSujet resultatTrouve = professeurSujet.getFonction();

		assertEquals("Mauvaise fonction", resultatAttendu, resultatTrouve);
	}

	/**
	 * Teste la méthode public void setFonction(FonctionProfesseurSujet fonction).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSetFonction() throws Exception {
		final ProfesseurSujet professeurSujet = ProfesseurSujet.class.getDeclaredConstructor().newInstance();

		final Field fonction = professeurSujet.getClass().getDeclaredField(ATT_FONCTION);
		fonction.setAccessible(true);

		final FonctionProfesseurSujet resultatAttendu = FONCTION_TEST;
		professeurSujet.setFonction(resultatAttendu);
		final FonctionProfesseurSujet resultatTrouve = (FonctionProfesseurSujet) fonction.get(professeurSujet);

		assertEquals("Mauvaise fonction", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setFonctionString(String fonction).
	 * @throws Exception 
	 */
	@Test
	public void testSetFonctionString() throws Exception {
		final ProfesseurSujet professeurSujet = new ProfesseurSujet();
		
		professeurSujet.setFonctionString("co-encadrant");
		final String resultatAttenduDepose = "co-encadrant";
		final String resultatTrouveDepose = professeurSujet.getFonction().getFonction();
		assertEquals("Mauvaise fonction", resultatAttenduDepose, resultatTrouveDepose);
		
		professeurSujet.setFonctionString("consultant");
		final String resultatAttenduValide = "consultant";
		final String resultatTrouveValide = professeurSujet.getFonction().getFonction();
		assertEquals("Mauvaise fonction", resultatAttenduValide, resultatTrouveValide);
		
		professeurSujet.setFonctionString("interessé");
		final String resultatAttenduAttribue = "interessé";
		final String resultatTrouveAttribue = professeurSujet.getFonction().getFonction();
		assertEquals("Mauvaise fonction", resultatAttenduAttribue, resultatTrouveAttribue);
		
		professeurSujet.setFonctionString("référent");
		final String resultatAttenduRefuse = "référent";
		final String resultatTrouveRefuse = professeurSujet.getFonction().getFonction();
		assertEquals("Mauvaise fonction", resultatAttenduRefuse, resultatTrouveRefuse);
	}
	
	
	/**
	 * Teste la méthode public String getValide().
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetValide() throws Exception {
		final ProfesseurSujet professeurSujet = ProfesseurSujet.class.getDeclaredConstructor().newInstance();

		final Field valide = professeurSujet.getClass().getDeclaredField(ATT_VALIDE);
		valide.setAccessible(true);

		final String resultatAttendu = STRING_TEST;
		valide.set(professeurSujet, resultatAttendu);
		final String resultatTrouve = professeurSujet.getValide();

		assertEquals("Mauvais valide", resultatAttendu, resultatTrouve);
	}

	/**
	 * Teste la méthode public void setValide(String valide).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSetValide() throws Exception {
		final ProfesseurSujet professeurSujet = ProfesseurSujet.class.getDeclaredConstructor().newInstance();

		final Field valide = professeurSujet.getClass().getDeclaredField(ATT_VALIDE);
		valide.setAccessible(true);

		final String resultatAttendu = STRING_TEST;
		professeurSujet.setValide(resultatAttendu);
		final String resultatTrouve = (String) valide.get(professeurSujet);

		assertEquals("Mauvais valide", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public String toString().
	 */
	@Test
	public void testToString() {
		final ProfesseurSujet professeurSujet = new ProfesseurSujet();
		professeurSujet.setIdProfesseur(LONG_TEST);
		professeurSujet.setIdSujet(LONG_TEST);
		professeurSujet.setFonction(FONCTION_TEST);
		professeurSujet.setValide(STRING_TEST);

		final String resultatAttendu = "ProfesseurSujet [idProfesseur=" + LONG_TEST + ", idSujet=" + LONG_TEST
				+ ", fonction=" + FONCTION_TEST + ", valide=" + STRING_TEST + "]";
		final String resultatTrouve = professeurSujet.toString();

		assertEquals("Mauvais toString()", resultatAttendu, resultatTrouve);
	}

}