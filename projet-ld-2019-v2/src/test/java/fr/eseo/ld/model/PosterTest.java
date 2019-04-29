package fr.eseo.ld.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.lang.reflect.Field;

import org.junit.Test;

import com.model.Poster;

/**
 * Classe de tests unitaires JUnit 4 de la classe Poster.
 *
 * <p>Utilisation de la réflexivité.</p>
 *
 * @version 1.0
 * @author Julie Avizou
 *
 * @see fr.eseo.ld.beans.Poster
 * @see org.junit
 */
public class PosterTest {
	
	private static final String STRING_TEST = "test";
	private static final Long LONG_TEST = 1L;
	
	private static final String ATT_ID_POSTER = "idPoster";
	private static final String ATT_CHEMIN = "chemin";
	private static final String ATT_DATE = "date";
	private static final String ATT_ID_SUJET = "idSujet";
	private static final String ATT_VALIDE = "valide";
	private static final String ATT_ID_EQUIPE = "idEquipe";
	
	/**
	 * Teste le constructeur par défaut de la classe. 
	 */
	@Test
	public void testConstructeurParDefaut() {
		final Poster poster = new Poster();

		assertNull("L'attribut n'est pas nul", poster.getIdPoster());
	}
	
	/**
	 * Teste la méthode public Long getIdPoster().
	 * 
	 * @throws NoSuchFieldException
	 * @throws IllegalAccessException
	 */
	@Test
	public void testGetIdPoster() throws NoSuchFieldException, IllegalAccessException {
		final Poster poster = new Poster();
		final Long resultatAttendu = LONG_TEST;

		final Field field = poster.getClass().getDeclaredField(ATT_ID_POSTER);
		field.setAccessible(true);
		field.set(poster, resultatAttendu);

		final Long resultatTrouve = poster.getIdPoster();
		assertEquals("Mauvais idPoster", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setIdPoster(Long idPoster).
	 * 
	 * @throws NoSuchFieldException
	 * @throws IllegalAccessException
	 */
	@Test
	public void testSetIdPoster() throws NoSuchFieldException, IllegalAccessException {
		final Poster poster = new Poster();
		final Long idPoster = LONG_TEST;
		poster.setIdPoster(idPoster);

		final Field field = poster.getClass().getDeclaredField(ATT_ID_POSTER);
		field.setAccessible(true);

		assertEquals("Mauvais idPoster", idPoster, field.get(poster));
	}
	
	/**
	 * Teste la méthode public Long getIdSujet().
	 * 
	 * @throws NoSuchFieldException
	 * @throws IllegalAccessException
	 */
	@Test
	public void testGetIdSujet() throws NoSuchFieldException, IllegalAccessException {
		final Poster poster = new Poster();
		final Long resultatAttendu = LONG_TEST;

		final Field field = poster.getClass().getDeclaredField(ATT_ID_SUJET);
		field.setAccessible(true);
		field.set(poster, resultatAttendu);

		final Long resultatTrouve = poster.getIdSujet();
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
		final Poster poster = new Poster();
		final Long idSujet = LONG_TEST;
		poster.setIdSujet(idSujet);

		final Field field = poster.getClass().getDeclaredField(ATT_ID_SUJET);
		field.setAccessible(true);

		assertEquals("Mauvais idSujet", idSujet, field.get(poster));
	}
	
	/**
	 * Teste la méthode public String getChemin().
	 * 
	 * @throws NoSuchFieldException
	 * @throws IllegalAccessException
	 */
	@Test
	public void testGetChemin() throws NoSuchFieldException, IllegalAccessException {
		final Poster poster = new Poster();
		final String resultatAttendu = STRING_TEST;

		final Field field = poster.getClass().getDeclaredField(ATT_CHEMIN);
		field.setAccessible(true);
		field.set(poster, resultatAttendu);

		final String resultatTrouve = poster.getChemin();
		assertEquals("Mauvais chemin", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setChemin(String chemin).
	 * 
	 * @throws NoSuchFieldException
	 * @throws IllegalAccessException
	 */
	@Test
	public void testSetChemin() throws NoSuchFieldException, IllegalAccessException {
		final Poster poster = new Poster();
		final String chemin = STRING_TEST;
		poster.setChemin(chemin);

		final Field field = poster.getClass().getDeclaredField(ATT_CHEMIN);
		field.setAccessible(true);

		assertEquals("Mauvais chemin", chemin, field.get(poster));
	}
	
	/**
	 * Teste la méthode public String getDate().
	 * 
	 * @throws NoSuchFieldException
	 * @throws IllegalAccessException
	 */
	@Test
	public void testGetDate() throws NoSuchFieldException, IllegalAccessException {
		final Poster poster = new Poster();
		final String resultatAttendu = STRING_TEST;

		final Field field = poster.getClass().getDeclaredField(ATT_DATE);
		field.setAccessible(true);
		field.set(poster, resultatAttendu);

		final String resultatTrouve = poster.getDate();
		assertEquals("Mauvaise date", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setDate(String date).
	 * 
	 * @throws NoSuchFieldException
	 * @throws IllegalAccessException
	 */
	@Test
	public void testSetDate() throws NoSuchFieldException, IllegalAccessException {
		final Poster poster = new Poster();
		final String date = STRING_TEST;
		poster.setDate(date);

		final Field field = poster.getClass().getDeclaredField(ATT_DATE);
		field.setAccessible(true);

		assertEquals("Mauvaise date", date, field.get(poster));
	}
	
	/**
	 * Teste la méthode public String getValide().
	 * 
	 * @throws NoSuchFieldException
	 * @throws IllegalAccessException
	 */
	@Test
	public void testGetValide() throws NoSuchFieldException, IllegalAccessException {
		final Poster poster = new Poster();
		final String resultatAttendu = STRING_TEST;

		final Field field = poster.getClass().getDeclaredField(ATT_VALIDE);
		field.setAccessible(true);
		field.set(poster, resultatAttendu);

		final String resultatTrouve = poster.getValide();
		assertEquals("Mauvais valide", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setValide(String valide).
	 * 
	 * @throws NoSuchFieldException
	 * @throws IllegalAccessException
	 */
	@Test
	public void testSetValide() throws NoSuchFieldException, IllegalAccessException {
		final Poster poster = new Poster();
		final String valide = STRING_TEST;
		poster.setValide(valide);

		final Field field = poster.getClass().getDeclaredField(ATT_VALIDE);
		field.setAccessible(true);

		assertEquals("Mauvais valide", valide, field.get(poster));
	}
	
	/**
	 * Teste la méthode public String getIdEquipe().
	 * 
	 * @throws NoSuchFieldException
	 * @throws IllegalAccessException
	 */
	@Test
	public void testGetIdEquipe() throws NoSuchFieldException, IllegalAccessException {
		final Poster poster = new Poster();
		final String resultatAttendu = STRING_TEST;

		final Field field = poster.getClass().getDeclaredField(ATT_ID_EQUIPE);
		field.setAccessible(true);
		field.set(poster, resultatAttendu);

		final String resultatTrouve = poster.getIdEquipe();
		assertEquals("Mauvais idEquipe", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setIdEquipe(String idEquipe).
	 * 
	 * @throws NoSuchFieldException
	 * @throws IllegalAccessException
	 */
	@Test
	public void testSetIdEquipe() throws NoSuchFieldException, IllegalAccessException {
		final Poster poster = new Poster();
		final String idEquipe = STRING_TEST;
		poster.setIdEquipe(idEquipe);

		final Field field = poster.getClass().getDeclaredField(ATT_ID_EQUIPE);
		field.setAccessible(true);

		assertEquals("Mauvais idEquipe", idEquipe, field.get(poster));
	}
	
	/**
	 * Teste la méthode public String toString().
	 */
	@Test
	public void testToString() {
		final Poster poster = new Poster();
		poster.setIdPoster(LONG_TEST);
		poster.setIdSujet(LONG_TEST);
		poster.setDate(STRING_TEST);
		poster.setChemin(STRING_TEST);
		poster.setValide(STRING_TEST);
		poster.setIdEquipe(STRING_TEST);

		final String resultatAttendu = "Poster [idPoster=" + LONG_TEST + ", chemin=" + STRING_TEST + ", date="
				+ STRING_TEST + ", idSujet=" + LONG_TEST + ", valide=" + STRING_TEST + ", idEquipe=" + STRING_TEST
				+ "]";
		final String resultatTrouve = poster.toString();

		assertEquals("Mauvais toString()", resultatAttendu, resultatTrouve);
	}
	
}