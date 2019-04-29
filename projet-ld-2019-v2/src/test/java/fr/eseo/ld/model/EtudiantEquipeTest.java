package fr.eseo.ld.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.lang.reflect.Field;

import org.junit.Test;

import com.model.EtudiantEquipe;

/**
 * Classe de tests unitaires JUnit 4 de la classe EtudiantEquipe.
 *
 * <p>Utilisation de la réflexivité.</p>
 *
 * @version 1.0
 * @author Cecilia Pinsard
 *
 * @see fr.eseo.ld.beans.EtudiantEquipe
 * @see org.junit
 */
public class EtudiantEquipeTest {
	
	private static final String STRING_TEST = "test";
	private static final Long LONG_TEST = 1L;
	
	private static final String ATT_ID_ETUDIANT = "idEtudiant";
	private static final String ATT_ID_EQUIPE = "idEquipe";
	
	/**
	 * Teste le constructeur par défaut de la classe.
	 */
	@Test
	public void testConstructeurParDefaut() {
		final EtudiantEquipe etudiantEquipe = new EtudiantEquipe();

		assertNull("L'attribut n'est pas nul", etudiantEquipe.getIdEtudiant());
	}
	
	/**
	 * Teste la méthode public Long getIdEtudiant().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetIdEtudiant() throws NoSuchFieldException, IllegalAccessException {
		final EtudiantEquipe etudiantEquipe = new EtudiantEquipe();

		final Field idEtudiant = etudiantEquipe.getClass().getDeclaredField(ATT_ID_ETUDIANT);
		idEtudiant.setAccessible(true);
		
		final Long resultatAttendu = LONG_TEST;
		idEtudiant.set(etudiantEquipe, resultatAttendu);
		final Long resultatTrouve = etudiantEquipe.getIdEtudiant();
		
		assertEquals("Mauvais idEtudiant", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setIdEtudiant(Long idEtudiant).
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testSetIdEtudiant() throws NoSuchFieldException, IllegalAccessException {
		final EtudiantEquipe etudiantEquipe = new EtudiantEquipe();
		
		final Field idEtudiant = etudiantEquipe.getClass().getDeclaredField(ATT_ID_ETUDIANT);
		idEtudiant.setAccessible(true);
		
		final Long resultatAttendu = LONG_TEST;
		etudiantEquipe.setIdEtudiant(resultatAttendu);
		final Long resultatTrouve = (Long) idEtudiant.get(etudiantEquipe);

		assertEquals("Mauvais idEtudiant", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public String getIdEquipe().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetIdEquipe() throws NoSuchFieldException, IllegalAccessException {
		final EtudiantEquipe etudiantEquipe = new EtudiantEquipe();

		final Field idEquipe = etudiantEquipe.getClass().getDeclaredField(ATT_ID_EQUIPE);
		idEquipe.setAccessible(true);
		
		final String resultatAttendu = STRING_TEST;
		idEquipe.set(etudiantEquipe, resultatAttendu);
		final String resultatTrouve = etudiantEquipe.getIdEquipe();
		
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
		final EtudiantEquipe etudiantEquipe = new EtudiantEquipe();
		
		final Field idEquipe = etudiantEquipe.getClass().getDeclaredField(ATT_ID_EQUIPE);
		idEquipe.setAccessible(true);
		
		final String resultatAttendu = STRING_TEST;
		etudiantEquipe.setIdEquipe(resultatAttendu);
		final String resultatTrouve = (String) idEquipe.get(etudiantEquipe);

		assertEquals("Mauvais idEquipe", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public String toString().
	 */
	@Test
	public void testToString() {
		final EtudiantEquipe etudiantEquipe = new EtudiantEquipe();
		etudiantEquipe.setIdEtudiant(LONG_TEST);
		etudiantEquipe.setIdEquipe(STRING_TEST);

		final String resultatAttendu = "EtudiantEquipe [idEtudiant=" + LONG_TEST + ", idEquipe=" + STRING_TEST + "]";
		final String resultatTrouve = etudiantEquipe.toString();

		assertEquals("Mauvais toString()", resultatAttendu, resultatTrouve);
	}
	
}