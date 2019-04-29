package fr.eseo.ld.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.lang.reflect.Field;

import org.junit.Test;

import com.model.RoleUtilisateur;

/**
 * Classe de tests unitaires JUnit 4 de la classe RoleUtilisateur.
 *
 * <p>Utilisation de la réflexivité.</p>
 *
 * @version 1.0
 * @author Maxime LENORMAND
 *
 * @see fr.eseo.ld.beans.RoleUtilisateur
 * @see org.junit
 */
public class RoleUtilisateurTest {
	
	private static final Long LONG_TEST = 1L;
	
	private static final String ATT_ID_UTILISATEUR = "idUtilisateur";
	private static final String ATT_ID_ROLE = "idRole";
	private static final String ATT_ID_OPTION = "idOption";
	
	/**
	 * Teste le constructeur par défaut de la classe.
	 */
	@Test
	public void testConstructeurParDefaut() {
		final RoleUtilisateur roleUtilisateur = new RoleUtilisateur();

		assertNull("L'attribut n'est pas nul", roleUtilisateur.getIdUtilisateur());
	}
	
	/**
	 * Teste la méthode public Long getIdUtilisateur().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetIdUtilisateur() throws NoSuchFieldException, IllegalAccessException {
		final RoleUtilisateur roleUtilisateur = new RoleUtilisateur();
		
        final Field idUtilisateur = roleUtilisateur.getClass().getDeclaredField(ATT_ID_UTILISATEUR);
        idUtilisateur.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        idUtilisateur.set(roleUtilisateur, resultatAttendu);
        final Long resultatTrouve = roleUtilisateur.getIdUtilisateur();
		
		assertEquals("Mauvais idUtilisateur", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setIdUtilisateur(Long idUtilisateur).
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testSetIdUtilisateur() throws NoSuchFieldException, IllegalAccessException {
		final RoleUtilisateur roleUtilisateur = new RoleUtilisateur();
		
        final Field idUtilisateur = roleUtilisateur.getClass().getDeclaredField(ATT_ID_UTILISATEUR);
        idUtilisateur.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        roleUtilisateur.setIdUtilisateur(resultatAttendu);
        final Long resultatTrouve = (Long) idUtilisateur.get(roleUtilisateur);
		
		assertEquals("Mauvais idUtilisateur", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public Long getIdRole().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetIdRole() throws NoSuchFieldException, IllegalAccessException {
		final RoleUtilisateur roleUtilisateur = new RoleUtilisateur();
		
        final Field idRole = roleUtilisateur.getClass().getDeclaredField(ATT_ID_ROLE);
        idRole.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        idRole.set(roleUtilisateur, resultatAttendu);
        final Long resultatTrouve = roleUtilisateur.getIdRole();
		
		assertEquals("Mauvais idRole", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setIdRole(Long idRole).
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testSetIdRole() throws NoSuchFieldException, IllegalAccessException {
		final RoleUtilisateur roleUtilisateur = new RoleUtilisateur();
		
        final Field idRole = roleUtilisateur.getClass().getDeclaredField(ATT_ID_ROLE);
        idRole.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        roleUtilisateur.setIdRole(resultatAttendu);
        final Long resultatTrouve = (Long) idRole.get(roleUtilisateur);
		
		assertEquals("Mauvais idRole", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public Long getIdOption().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetIdOption() throws NoSuchFieldException, IllegalAccessException {
		final RoleUtilisateur roleUtilisateur = new RoleUtilisateur();
		
        final Field idOption = roleUtilisateur.getClass().getDeclaredField(ATT_ID_OPTION);
        idOption.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        idOption.set(roleUtilisateur, resultatAttendu);
        final Long resultatTrouve = roleUtilisateur.getIdOption();
		
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
		final RoleUtilisateur roleUtilisateur = new RoleUtilisateur();
		
        final Field idOption = roleUtilisateur.getClass().getDeclaredField(ATT_ID_OPTION);
        idOption.setAccessible(true);
        
        final Long resultatAttendu = LONG_TEST;
        roleUtilisateur.setIdOption(resultatAttendu);
        final Long resultatTrouve = (Long) idOption.get(roleUtilisateur);
		
		assertEquals("Mauvais idOption", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public String toString().
	 */
	@Test
	public void testToString() {
		final RoleUtilisateur roleUtilisateur = new RoleUtilisateur();
		roleUtilisateur.setIdUtilisateur(LONG_TEST);
		roleUtilisateur.setIdRole(LONG_TEST);
		roleUtilisateur.setIdOption(LONG_TEST);

		final String resultatAttendu = "RoleUtilisateur [idUtilisateur=" + LONG_TEST + ", idRole=" + LONG_TEST
				+ ", idOption=" + LONG_TEST + "]";
		final String resultatTrouve = roleUtilisateur.toString();

		assertEquals("Mauvais toString()", resultatAttendu, resultatTrouve);
	}
	
}