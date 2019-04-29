package fr.eseo.ld.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.lang.reflect.Field;

import org.junit.Test;

import com.model.Professeur;

/**
 * Classe de tests unitaires JUnit 4 de la classe Professeur.
 *
 * <p>Utilisation de la réflexivité.</p>
 *
 * @version 1.0
 * @author Maxime LENORMAND
 *
 * @see fr.eseo.ld.beans.Professeur
 * @see org.junit
 */
public class ProfesseurTest {

	private static final Long LONG_TEST = 1L;
	
	private static final String ATT_ID_PROFESSEUR = "idProfesseur";
	
	/**
	 * Teste le constructeur par défaut de la classe.
	 */
	@Test
	public void testConstructeurParDefaut() {
		final Professeur professeur = new Professeur();

		assertNull("L'attribut n'est pas nul", professeur.getIdProfesseur());
	}
	
	/**
	 * Teste la méthode public Long getIdProfesseur().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetIdProfesseur() throws NoSuchFieldException, IllegalAccessException {
		final Professeur professeur = new Professeur();
		
        final Field idProfesseur = professeur.getClass().getDeclaredField(ATT_ID_PROFESSEUR);
        idProfesseur.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        idProfesseur.set(professeur, resultatAttendu);
        final Long resultatTrouve = professeur.getIdProfesseur();
		
		assertEquals("Mauvais idProfesseur", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setIdProfesseur(Long idProfesseur).
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testSetIdProfesseur() throws NoSuchFieldException, IllegalAccessException {
		final Professeur professeur = new Professeur();
		
        final Field idProfesseur = professeur.getClass().getDeclaredField(ATT_ID_PROFESSEUR);
        idProfesseur.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        professeur.setIdProfesseur(resultatAttendu);
        final Long resultatTrouve = (Long) idProfesseur.get(professeur);
		
		assertEquals("Mauvais idProfesseur", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public String toString().
	 */
	@Test
	public void testToString() {
		final Professeur professeur = new Professeur();
		professeur.setIdProfesseur(LONG_TEST);
		
		final String resultatAttendu = "Professeur [idProfesseur = " + LONG_TEST + "]";
		final String resultatTrouve = professeur.toString();
		
		assertEquals("Mauvais toString()", resultatAttendu, resultatTrouve);
	}

}