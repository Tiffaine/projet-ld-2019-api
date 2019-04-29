package fr.eseo.ld.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.lang.reflect.Field;

import org.junit.Test;

import com.model.PartageRole;

/**
 * Classe de tests unitaires JUnit 4 de la classe PartageRole.
 *
 * <p>Utilisation de la réflexivité.</p>
 *
 * @version 1.0
 * @author Thomas MENARD et Maxime LENORMAND
 *
 * @see fr.eseo.ld.beans.PartageRole
 * @see org.junit
 */
public class PartageRoleTest {

	private static final String STRING_TEST = "test";
	private static final Long LONG_TEST = 1L;
	
	private static final String ATT_ID_PARTAGE = "idPartageRole";
	private static final String ATT_ID_UTILISATEUR1 = "idUtilisateur1";
	private static final String ATT_ID_UTILISATEUR2 = "idUtilisateur2";
	private static final String ATT_ID_ROLE = "idRole";
	private static final String ATT_ID_OPTION = "idOption";
	private static final String ATT_DATE_DEBUT = "dateDebut";
	private static final String ATT_DATE_FIN = "dateFin";
	private static final String ATT_ACTIF = "actif";
	
	/**
	 * Teste le constructeur par défaut de la classe. 
	 */
	@Test
	public void testConstructeurParDefaut() {
		final PartageRole partageRole = new PartageRole();

		assertNull("L'attribut n'est pas nul", partageRole.getIdPartage());
	}
	
	/**
	 * Teste la méthode public Long getIdPartage().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetIdPartage() throws NoSuchFieldException, IllegalAccessException {
		final PartageRole partageRole = new PartageRole();
		
        final Field idPartage = partageRole.getClass().getDeclaredField(ATT_ID_PARTAGE);
        idPartage.setAccessible(true);

        final Long resultatAttendu = LONG_TEST;
        idPartage.set(partageRole, resultatAttendu);
        final Long resultatTrouve = partageRole.getIdPartage();
        
		assertEquals("Mauvais idPartage", resultatAttendu, resultatTrouve);
	}

	/**
	 * Teste la méthode public void setIdPartage(Long idPartage).
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testSetIdPartage() throws NoSuchFieldException, IllegalAccessException {
		final PartageRole partageRole = new PartageRole();

		final Field idPartage = partageRole.getClass().getDeclaredField(ATT_ID_PARTAGE);
		idPartage.setAccessible(true);

		final Long resultatAttendu = LONG_TEST;
		partageRole.setIdPartage(resultatAttendu);
		final Long resultatTrouve = (Long) idPartage.get(partageRole);

		assertEquals("Mauvais idPartage", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste les méthodes public Long getIdUtilisateur1() et public Long getIdUtilisateur2().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetIdUtilisateur() throws NoSuchFieldException, IllegalAccessException {
		final PartageRole partageRole = new PartageRole();
		
        final Field idUtilisateur1 = partageRole.getClass().getDeclaredField(ATT_ID_UTILISATEUR1);
        idUtilisateur1.setAccessible(true);
        final Field idUtilisateur2 = partageRole.getClass().getDeclaredField(ATT_ID_UTILISATEUR2);
        idUtilisateur2.setAccessible(true);
       
        final Long resultatAttendu = LONG_TEST;
        idUtilisateur1.set(partageRole, resultatAttendu);
        idUtilisateur2.set(partageRole, resultatAttendu);
        final Long resultatTrouve1 = partageRole.getIdUtilisateur1();
	    final Long resultatTrouve2 = partageRole.getIdUtilisateur2();
	    
		assertEquals("Mauvais idUtilisateur1", resultatAttendu, resultatTrouve1);
		assertEquals("Mauvais idUtilisateur2", resultatAttendu, resultatTrouve2);
	}
	
	/**
	 * Teste les méthodes public void setIdUtilisateur1(Long idUtilisateur1)
	 * et public void setIdUtilisateur2(Long idUtilisateur2).
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testSetIdUtilisateur() throws NoSuchFieldException, IllegalAccessException {
		final PartageRole partageRole = new PartageRole();

		final Field idUtilisateur1 = partageRole.getClass().getDeclaredField(ATT_ID_UTILISATEUR1);
		idUtilisateur1.setAccessible(true);
		final Field idUtilisateur2 = partageRole.getClass().getDeclaredField(ATT_ID_UTILISATEUR2);
		idUtilisateur2.setAccessible(true);

		final Long resultatAttendu = LONG_TEST;
		partageRole.setIdUtilisateur1(resultatAttendu);
		partageRole.setIdUtilisateur2(resultatAttendu);
		final Long resultatTrouve1 = (Long) idUtilisateur1.get(partageRole);
		final Long resultatTrouve2 = (Long) idUtilisateur2.get(partageRole);

		assertEquals("Mauvais idUtilisateur1", resultatAttendu, resultatTrouve1);
		assertEquals("Mauvais idUtilisateur2", resultatAttendu, resultatTrouve2);
	}

	/**
	 * Teste la méthode public Long getIdRole().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetIdRole() throws NoSuchFieldException, IllegalAccessException {
		final PartageRole partageRole = new PartageRole();
		
        final Field idRole = partageRole.getClass().getDeclaredField(ATT_ID_ROLE);
        idRole.setAccessible(true);
        final Long resultatAttendu = LONG_TEST;
        idRole.set(partageRole, resultatAttendu);

        final Long resultatTrouve = partageRole.getIdRole();
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
		final PartageRole partageRole = new PartageRole();
	
		final Field idRole = partageRole.getClass().getDeclaredField(ATT_ID_ROLE);
		idRole.setAccessible(true);
		final Long resultatAttendu = LONG_TEST;
		partageRole.setIdRole(resultatAttendu);
		final Long resultatTrouve = (Long) idRole.get(partageRole);
	
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
		final PartageRole partageRole = new PartageRole();
		
        final Field idOption = partageRole.getClass().getDeclaredField(ATT_ID_OPTION);
        idOption.setAccessible(true);
        final Long resultatAttendu = LONG_TEST;
        idOption.set(partageRole, resultatAttendu);

        final Long resultatTrouve = partageRole.getIdOption();
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
		final PartageRole partageRole = new PartageRole();
	
		final Field idOption = partageRole.getClass().getDeclaredField(ATT_ID_OPTION);
		idOption.setAccessible(true);
		final Long resultatAttendu = LONG_TEST;
		partageRole.setIdOption(resultatAttendu);
		final Long resultatTrouve = (Long) idOption.get(partageRole);
	
		assertEquals("Mauvais idOption", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste les méthodes public Long getDateDebut() et public Long getDateFin().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetDate() throws NoSuchFieldException, IllegalAccessException {
		final PartageRole partageRole = new PartageRole();
		
        final Field dateDebut = partageRole.getClass().getDeclaredField(ATT_DATE_DEBUT);
        dateDebut.setAccessible(true);
        final Field dateFin = partageRole.getClass().getDeclaredField(ATT_DATE_FIN);
        dateFin.setAccessible(true);
        
        final String resultatAttendu = STRING_TEST;
        dateDebut.set(partageRole, resultatAttendu);
        dateFin.set(partageRole, resultatAttendu);
        final String resultatTrouve1 = partageRole.getDateDebut();
        final String resultatTrouve2 = partageRole.getDateFin();
        
		assertEquals("Mauvaise date de début", resultatAttendu, resultatTrouve1);
		assertEquals("Mauvaise date de fin", resultatAttendu, resultatTrouve2);
	}
	
	/**
	 * Teste les méthodes public void setDateDebut(String dateDebut)
	 * et public void setDateFin(String dateFin).
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testSetDate() throws NoSuchFieldException, IllegalAccessException {
		final PartageRole partageRole = new PartageRole();
	
		final Field dateDebut = partageRole.getClass().getDeclaredField(ATT_DATE_DEBUT);
		dateDebut.setAccessible(true);
		final Field dateFin = partageRole.getClass().getDeclaredField(ATT_DATE_FIN);
		dateFin.setAccessible(true);
		
		final String resultatAttendu = STRING_TEST;
		partageRole.setDateDebut(resultatAttendu);
		final String resultatTrouve1 = (String) dateDebut.get(partageRole);
		partageRole.setDateFin(resultatAttendu);
		final String resultatTrouve2 = (String) dateFin.get(partageRole);	
		
		assertEquals("Mauvaise dateDebut", resultatAttendu, resultatTrouve1);
		assertEquals("Mauvaise dateFin", resultatAttendu, resultatTrouve2);
	}
	
	/**
	 * Teste la méthode public Long getActif().
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testGetActif() throws NoSuchFieldException, IllegalAccessException {
		final PartageRole partageRole = new PartageRole();
		
        final Field actif = partageRole.getClass().getDeclaredField(ATT_ACTIF);
        actif.setAccessible(true);
        final Long resultatAttendu = LONG_TEST;
        actif.set(partageRole, resultatAttendu);

        final Long resultatTrouve = partageRole.getActif();
		assertEquals("Mauvais actif", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setActif(Long actif).
	 * 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void testSetActif() throws NoSuchFieldException, IllegalAccessException {
		final PartageRole partageRole = new PartageRole();
	
		final Field actif = partageRole.getClass().getDeclaredField(ATT_ACTIF);
		actif.setAccessible(true);
		final Long resultatAttendu = LONG_TEST;
		partageRole.setActif(resultatAttendu);
		final Long resultatTrouve = (Long) actif.get(partageRole);
	
		assertEquals("Mauvais actif", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public String toString().
	 */
	@Test
	public void testToString() {
		final PartageRole partageRole = new PartageRole();
		partageRole.setIdPartage(LONG_TEST);
		partageRole.setIdUtilisateur1(LONG_TEST);
		partageRole.setIdUtilisateur2(LONG_TEST);
		partageRole.setIdOption(LONG_TEST);
		partageRole.setActif(LONG_TEST);
		partageRole.setIdRole(LONG_TEST);
		partageRole.setDateDebut(STRING_TEST);
		partageRole.setDateFin(STRING_TEST);

		final String resultatAttendu = "PartageRole [idPartage=" + LONG_TEST + ", idUtilisateur1=" + LONG_TEST
				+ ", idUtilisateur2=" + LONG_TEST + ", idRole=" + LONG_TEST + ", idOption=" + LONG_TEST + ", dateDebut="
				+ STRING_TEST + ", dateFin=" + STRING_TEST + ", actif=" + LONG_TEST + "]";
		final String resultatTrouve = partageRole.toString();

		assertEquals("Mauvais toString()", resultatAttendu, resultatTrouve);
	}
	
}