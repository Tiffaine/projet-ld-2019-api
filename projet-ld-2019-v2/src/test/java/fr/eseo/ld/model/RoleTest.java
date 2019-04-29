package fr.eseo.ld.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.lang.reflect.Field;

import org.junit.Test;

import com.model.Role;

/**
 * Classe de tests unitaires JUnit 4 de la classe Role.
 *
 * <p>Utilisation de la réflexivité.</p>
 *
 * @version 1.0
 * @author Maxime LENORMAND
 *
 * @see fr.eseo.ld.beans.Role
 * @see org.junit
 */
public class RoleTest {

	private static final String STRING_TEST = "test";
	private static final Long LONG_TEST = 1L;
	
	private static final String ATT_ID_ROLE = "idRole";
	private static final String ATT_NOM_ROLE = "nomRole";

	/**
	 * Teste le constructeur par défaut de la classe.
	 */
	@Test
	public void testConstructeurParDefaut() {
		final Role role = new Role();

		assertNull("L'attribut n'est pas nul", role.getIdRole());
	}
	
	/**
	 * Teste la méthode public Long getIdRole().
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetIdRole() throws Exception {
		final Role role = Role.class.getDeclaredConstructor().newInstance();

		final Field idRole = role.getClass().getDeclaredField(ATT_ID_ROLE);
		idRole.setAccessible(true);

		final Long resultatAttendu = LONG_TEST;
		idRole.set(role, resultatAttendu);
		final Long resultatTrouve = role.getIdRole();

		assertEquals("Mauvais idRole", resultatAttendu, resultatTrouve);
	}

	/**
	 * Teste la méthode public void setIdRole(Long idRole).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSetIdRole() throws Exception {
		final Role role = Role.class.getDeclaredConstructor().newInstance();

		final Field idRole = role.getClass().getDeclaredField(ATT_ID_ROLE);
		idRole.setAccessible(true);

		final Long resultatAttendu = LONG_TEST;
		role.setIdRole(resultatAttendu);
		final Long resultatTrouve = (Long) idRole.get(role);

		assertEquals("Mauvais idRole", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public String getNomRole().
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetNomRole() throws Exception {
		final Role role = Role.class.getDeclaredConstructor().newInstance();

		final Field nomRole = role.getClass().getDeclaredField(ATT_NOM_ROLE);
		nomRole.setAccessible(true);

		final String resultatAttendu = STRING_TEST;
		nomRole.set(role, resultatAttendu);
		final String resultatTrouve = role.getNomRole();

		assertEquals("Mauvais nomRole", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setNomRole(String nomRole).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSetNomRole() throws Exception {
		final Role role = Role.class.getDeclaredConstructor().newInstance();

		final Field nomRole = role.getClass().getDeclaredField(ATT_NOM_ROLE);
		nomRole.setAccessible(true);

		final String resultatAttendu = STRING_TEST;
		role.setNomRole(resultatAttendu);
		final String resultatTrouve = (String) nomRole.get(role);

		assertEquals("Mauvais nomRole", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public String toString().
	 */
	@Test
	public void testToString() {
		final Role role = new Role();
		role.setIdRole(LONG_TEST);
		role.setNomRole(STRING_TEST);

		final String resultatAttendu = "Role [idRole=" + LONG_TEST + ", nomRole=" + STRING_TEST + "]";
		final String resultatTrouve = role.toString();

		assertEquals("Mauvais toString()", resultatAttendu, resultatTrouve);
	}

}