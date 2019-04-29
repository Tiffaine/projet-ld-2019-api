package fr.eseo.ld.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.lang.reflect.Field;

import org.junit.Test;

import com.model.Equipe;
import com.model.Semestre;

/**
 * Classe de tests unitaires JUnit 4 de la classe Equipe.
 *
 * <p>Utilisation de la réflexivité.</p>
 *
 * @version 1.0
 * @author Cecilia Pinsard
 *
 * @see fr.eseo.ld.beans.Equipe
 * @see org.junit
 */
public class EquipeTest {
	
	private static final String STRING_TEST = "test"; 
	private static final Long LONG_TEST = 1L;
	private static final Integer INTEGER_TEST = 1;
	private static final Semestre SEMESTRE_TEST = new Semestre();
	
	private static final String ATT_ID_EQUIPE = "idEquipe";
	private static final String ATT_SEMESTRE = "semestre";
	private static final String ATT_TAILLE = "taille";
	private static final String ATT_ID_SUJET = "idSujet";
	private static final String ATT_VALIDE = "valide";
	
	/**
	 * Teste le constructeur par défaut de la classe.
	 */
	@Test
	public void testConstructeurParDefaut() {
		final Equipe equipe = new Equipe();

		assertNull("L'attribut n'est pas nul", equipe.getIdEquipe());
	}
	
	/**
	 * Teste la méthode public String getIdEquipe().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetIdEquipe() throws NoSuchFieldException, IllegalAccessException {
		final Equipe equipe = new Equipe();

		final Field idEquipe = equipe.getClass().getDeclaredField(ATT_ID_EQUIPE);
		idEquipe.setAccessible(true);
		
		final String resultatAttendu = STRING_TEST;
		idEquipe.set(equipe, resultatAttendu);
		final String resultatTrouve = equipe.getIdEquipe();
		
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
		final Equipe equipe = new Equipe();

		final Field idEquipe = equipe.getClass().getDeclaredField(ATT_ID_EQUIPE);
		idEquipe.setAccessible(true);
		
		final String resultatAttendu = STRING_TEST;
		equipe.setIdEquipe(resultatAttendu);
		final String resultatTrouve = (String) idEquipe.get(equipe);

		assertEquals("Mauvais idEquipe", resultatAttendu, resultatTrouve);
	}
	
	
	/**
	 * Teste la méthode public Integer getAnnee().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetSemestre() throws NoSuchFieldException, IllegalAccessException {
		final Equipe equipe = new Equipe();

		final Field semestre = equipe.getClass().getDeclaredField(ATT_SEMESTRE);
		semestre.setAccessible(true);
		
		final Semestre resultatAttendu = SEMESTRE_TEST;
		semestre.set(equipe, resultatAttendu);
		final Semestre resultatTrouve = equipe.getSemestre();
		
		assertEquals("Mauvaise année", resultatAttendu, resultatTrouve);
	}

	/**
	 * Teste la méthode public void setAnnee(Integer annee).
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testSetSemestre() throws NoSuchFieldException, IllegalAccessException {
		final Equipe equipe = new Equipe();
		
		final Field semestre = equipe.getClass().getDeclaredField(ATT_SEMESTRE);
		semestre.setAccessible(true);
		
		final Semestre resultatAttendu = SEMESTRE_TEST;
		equipe.setSemestre(resultatAttendu);
		final Semestre resultatTrouve = (Semestre) semestre.get(equipe);

		assertEquals("Mauvaise année", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public Integer getTaille().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetTaille() throws NoSuchFieldException, IllegalAccessException {
		final Equipe equipe = new Equipe();

		final Field taille = equipe.getClass().getDeclaredField(ATT_TAILLE);
		taille.setAccessible(true);
		
		final Integer resultatAttendu = INTEGER_TEST;
		taille.set(equipe, resultatAttendu);
		final Integer resultatTrouve = equipe.getTaille();
		
		assertEquals("Mauvaise taille", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setTaille(Integer taille).
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testSetTaille() throws NoSuchFieldException, IllegalAccessException {
		final Equipe equipe = new Equipe();

		final Field taille = equipe.getClass().getDeclaredField(ATT_TAILLE);
		taille.setAccessible(true);
		
		final Integer resultatAttendu = INTEGER_TEST;
		equipe.setTaille(resultatAttendu);
		final Integer resultatTrouve = (Integer) taille.get(equipe);

		assertEquals("Mauvaise taille", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public Long getIdSujet().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetIdSujet() throws NoSuchFieldException, IllegalAccessException {
		final Equipe equipe = new Equipe();
		
		final Field idSujet = equipe.getClass().getDeclaredField(ATT_ID_SUJET);
		idSujet.setAccessible(true);
		
		final Long resultatAttendu = LONG_TEST;
		idSujet.set(equipe, resultatAttendu);
		final Long resultatTrouve = equipe.getIdSujet();
		
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
		final Equipe equipe = new Equipe();

		final Field idSujet = equipe.getClass().getDeclaredField(ATT_ID_SUJET);
		idSujet.setAccessible(true);
		
		final Long resultatAttendu = LONG_TEST;
		equipe.setIdSujet(resultatAttendu);
		final Long resultatTrouve = (Long) idSujet.get(equipe);
		
		assertEquals("Mauvais idSujet", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public Long getIdSujet().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetValide() throws NoSuchFieldException, IllegalAccessException {
		final Equipe equipe = new Equipe();
		
		final Field valide = equipe.getClass().getDeclaredField(ATT_VALIDE);
		valide.setAccessible(true);
		
		final String resultatAttendu = STRING_TEST;
		valide.set(equipe, resultatAttendu);
		final String resultatTrouve = equipe.getValide();
		
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
		final Equipe equipe = new Equipe();

		final Field valide = equipe.getClass().getDeclaredField(ATT_VALIDE);
		valide.setAccessible(true);
		
		final String resultatAttendu = STRING_TEST;
		equipe.setValide(resultatAttendu);
		final String resultatTrouve = (String) valide.get(equipe);

		assertEquals("Mauvais valide", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public String toString().
	 */
	@Test
	public void testToString() {
		final Equipe equipe = new Equipe();
		equipe.setIdEquipe(STRING_TEST);
		equipe.setSemestre(SEMESTRE_TEST);
		equipe.setTaille(INTEGER_TEST);
		equipe.setIdSujet(LONG_TEST);
		equipe.setValide(STRING_TEST);

		final String resultatAttendu = "Equipe [idEquipe=" + STRING_TEST + ", semestre=" + SEMESTRE_TEST + ", taille="
				+ INTEGER_TEST + ", idSujet=" + LONG_TEST + ", valide=" + STRING_TEST + "]";
		final String resultatTrouve = equipe.toString();

		assertEquals("Mauvais toString()", resultatAttendu, resultatTrouve);
	}

}