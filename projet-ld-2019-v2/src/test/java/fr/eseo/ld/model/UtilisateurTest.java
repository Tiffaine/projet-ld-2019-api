package fr.eseo.ld.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.lang.reflect.Field;

import org.junit.Test;

import com.model.Utilisateur;

/**
 * Classe de tests unitaires JUnit 4 de la classe Utilisateur.
 *
 * <p>Utilisation de la réflexivité.</p>
 *
 * @version 1.0
 * @author Cecilia Pinsard
 *
 * @see fr.eseo.ld.beans.Utilisateur
 * @see org.junit
 */
public class UtilisateurTest {
	
	private static final String STRING_TEST = "test";
	private static final Long LONG_TEST = 1L;
	
	private static final String ATT_ID_UTILISATEUR = "idUtilisateur";
	private static final String ATT_NOM = "nom";
	private static final String ATT_PRENOM = "prenom";
	private static final String ATT_IDENTIFIANT = "identifiant";
	private static final String ATT_HASH = "hash";
	private static final String ATT_EMAIL = "email";
	private static final String ATT_VALIDE = "valide";
	
	/**
	 * Teste le constructeur par défaut de la classe.
	 */
	@Test
	public void testConstructeurParDefaut() {
		final Utilisateur utilisateur = new Utilisateur();

		assertNull("L'attribut n'est pas nul", utilisateur.getIdUtilisateur());
	}
	
	/**
	 * Teste la méthode public Long getIdUtilisateur().
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetIdUtilisateur() throws NoSuchFieldException, IllegalAccessException {
		final Utilisateur utilisateur = new Utilisateur();
		final long resultatAttendu = LONG_TEST;

		final Field field = utilisateur.getClass().getDeclaredField(ATT_ID_UTILISATEUR);
		field.setAccessible(true);
		field.set(utilisateur, resultatAttendu);

		final long resultatTrouve = utilisateur.getIdUtilisateur();
		assertEquals("Mauvais idUtilisateur", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setIdUtilisateur(Long idUtilisateur).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSetIdUtilisateur() throws NoSuchFieldException, IllegalAccessException {
		final Utilisateur utilisateur = new Utilisateur();
		final long idUtilisateur = LONG_TEST;
		utilisateur.setIdUtilisateur(idUtilisateur);

		final Field field = utilisateur.getClass().getDeclaredField(ATT_ID_UTILISATEUR);
		field.setAccessible(true);

		assertEquals("Mauvais idUtilisateur", idUtilisateur, field.get(utilisateur));
	}
	
	/**
	 * Teste la méthode public String getNom().
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetNom() throws NoSuchFieldException, IllegalAccessException {
		final Utilisateur utilisateur = new Utilisateur();
		final String resultatAttendu = STRING_TEST;

		final Field field = utilisateur.getClass().getDeclaredField(ATT_NOM);
		field.setAccessible(true);
		field.set(utilisateur, resultatAttendu);

		final String resultatTrouve = utilisateur.getNom();
		assertEquals("Mauvais nom", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setNom(String nom).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSetNom() throws NoSuchFieldException, IllegalAccessException {
		final Utilisateur utilisateur = new Utilisateur();
		final String nom = STRING_TEST;
		utilisateur.setNom(nom);

		final Field field = utilisateur.getClass().getDeclaredField(ATT_NOM);
		field.setAccessible(true);

		assertEquals("Mauvais nom", nom, field.get(utilisateur));
	}
	
	/**
	 * Teste la méthode public String getPrenom().
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetPrenom() throws NoSuchFieldException, IllegalAccessException {
		final Utilisateur utilisateur = new Utilisateur();
		final String resultatAttendu = STRING_TEST;

		final Field field = utilisateur.getClass().getDeclaredField(ATT_PRENOM);
		field.setAccessible(true);
		field.set(utilisateur, resultatAttendu);

		final String resultatTrouve = utilisateur.getPrenom();
		assertEquals("Mauvais prenom", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setPrenom(String prenom).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSetPrenom() throws NoSuchFieldException, IllegalAccessException {
		final Utilisateur utilisateur = new Utilisateur();
		final String prenom = STRING_TEST;
		utilisateur.setPrenom(prenom);

		final Field field = utilisateur.getClass().getDeclaredField(ATT_PRENOM);
		field.setAccessible(true);

		assertEquals("Mauvais prenom", prenom, field.get(utilisateur));
	}
	
	/**
	 * Teste la méthode public String getIdentifiant().
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetIdentifiant() throws NoSuchFieldException, IllegalAccessException {
		final Utilisateur utilisateur = new Utilisateur();
		final String resultatAttendu = STRING_TEST;

		final Field field = utilisateur.getClass().getDeclaredField(ATT_IDENTIFIANT);
		field.setAccessible(true);
		field.set(utilisateur, resultatAttendu);

		final String resultatTrouve = utilisateur.getIdentifiant();
		assertEquals("Mauvais identifiant", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setIdentifiant(String identifiant).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSetIdantifiant() throws NoSuchFieldException, IllegalAccessException {
		final Utilisateur utilisateur = new Utilisateur();
		final String identifiant = STRING_TEST;
		utilisateur.setIdentifiant(identifiant);

		final Field field = utilisateur.getClass().getDeclaredField(ATT_IDENTIFIANT);
		field.setAccessible(true);

		assertEquals("Mauvais identifiant", identifiant, field.get(utilisateur));
	}
	
	/**
	 * Teste la méthode public String getHash().
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetHash() throws NoSuchFieldException, IllegalAccessException {
		final Utilisateur utilisateur = new Utilisateur();
		final String resultatAttendu = STRING_TEST;

		final Field field = utilisateur.getClass().getDeclaredField(ATT_HASH);
		field.setAccessible(true);
		field.set(utilisateur, resultatAttendu);

		final String resultatTrouve = utilisateur.getHash();
		assertEquals("Mauvais hash", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setHash(String hash).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSetHash() throws NoSuchFieldException, IllegalAccessException {
		final Utilisateur utilisateur = new Utilisateur();
		final String hash = STRING_TEST;
		utilisateur.setHash(hash);

		final Field field = utilisateur.getClass().getDeclaredField(ATT_HASH);
		field.setAccessible(true);

		assertEquals("Mauvais hash", hash, field.get(utilisateur));
	}
	
	/**
	 * Teste la méthode public String getEmail().
	 * 
	 * @throws Exception
	 */
	@Test
	public void testEmail() throws NoSuchFieldException, IllegalAccessException {
		final Utilisateur utilisateur = new Utilisateur();
		final String resultatAttendu = STRING_TEST;

		final Field field = utilisateur.getClass().getDeclaredField(ATT_EMAIL);
		field.setAccessible(true);
		field.set(utilisateur, resultatAttendu);

		final String resultatTrouve = utilisateur.getEmail();
		assertEquals("Mauvais email", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setEmail(String email).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSetEmail() throws NoSuchFieldException, IllegalAccessException {
		final Utilisateur utilisateur = new Utilisateur();
		final String email = STRING_TEST;
		utilisateur.setEmail(email);

		final Field field = utilisateur.getClass().getDeclaredField(ATT_EMAIL);
		field.setAccessible(true);

		assertEquals("Mauvais email", email, field.get(utilisateur));
	}
	
	/**
	 * Teste la méthode public String getValide().
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetValide() throws Exception {
		final Utilisateur utilisateur = Utilisateur.class.getDeclaredConstructor().newInstance();

		final Field valide = utilisateur.getClass().getDeclaredField(ATT_VALIDE);
		valide.setAccessible(true);

		final String resultatAttendu = STRING_TEST;
		valide.set(utilisateur, resultatAttendu);
		final String resultatTrouve = utilisateur.getValide();

		assertEquals("Mauvais valide", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setValide(String valide).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSetValide() throws Exception {
		final Utilisateur utilisateur = Utilisateur.class.getDeclaredConstructor().newInstance();

		final Field valide = utilisateur.getClass().getDeclaredField(ATT_VALIDE);
		valide.setAccessible(true);

		final String resultatAttendu = STRING_TEST;
		utilisateur.setValide(resultatAttendu);
		final String resultatTrouve = (String) valide.get(utilisateur);

		assertEquals("Mauvais valide", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public String toString().
	 */
	@Test
	public void testToString() {
		final Utilisateur utilisateur = new Utilisateur();
		utilisateur.setIdUtilisateur(LONG_TEST);
		utilisateur.setNom(STRING_TEST);
		utilisateur.setPrenom(STRING_TEST);
		utilisateur.setIdentifiant(STRING_TEST);
		utilisateur.setHash(STRING_TEST);
		utilisateur.setEmail(STRING_TEST);
		utilisateur.setValide(STRING_TEST);

		final String resultatAttendu = "Utilisateur [idUtilisateur=" + LONG_TEST + ", nom=" + STRING_TEST + ", prenom="
				+ STRING_TEST + ", identifiant=" + STRING_TEST + ", hash=" + STRING_TEST + ", email=" + STRING_TEST
				+ ", valide=" + STRING_TEST + "]";
		final String resultatTrouve = utilisateur.toString();

		assertEquals("Mauvais toString()", resultatAttendu, resultatTrouve);
	}

}