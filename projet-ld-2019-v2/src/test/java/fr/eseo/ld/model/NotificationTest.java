package fr.eseo.ld.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.lang.reflect.Field;

import org.junit.Test;

import com.model.Notification;

/**
 * Classe de tests unitaires JUnit 4 de la classe Notification.
 *
 * <p>Utilisation de la réflexivité.</p>
 *
 * @version 1.0
 * @author Hugo Menard
 *
 * @see fr.eseo.ld.beans.Notification
 * @see org.junit
 */
public class NotificationTest {
	
	private static final String STRING_TEST = "test";
	private static final Long LONG_TEST = 1L;
	private static final Integer INTEGER_TEST = 1;
	
	private static final String ATT_ID_NOTIFICATION = "idNotification";
	private static final String ATT_ID_UTILISATEUR = "idUtilisateur";
	private static final String ATT_COMMENTAIRE = "commentaire";
	private static final String ATT_LIEN = "lien";
	private static final String ATT_VUE = "vue";
	
	/**
	 * Teste le constructeur par défaut de la classe. 
	 */
	@Test
	public void testConstructeurParDefaut() {
		final Notification notification = new Notification();

		assertNull("L'attribut n'est pas nul", notification.getIdNotification());
	}
	
	/**
	 * Teste la méthode public Long getIdNotification().
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetIdNotification() throws Exception {
		final Notification notification = Notification.class.getDeclaredConstructor().newInstance();

		final Field idNotification = notification.getClass().getDeclaredField(ATT_ID_NOTIFICATION);
		idNotification.setAccessible(true);

		final Long resultatAttendu = LONG_TEST;
		idNotification.set(notification, resultatAttendu);
		final Long resultatTrouve = notification.getIdNotification();

		assertEquals("Mauvais idNotification", resultatAttendu, resultatTrouve);
	}

	/**
	 * Teste la méthode public void setIdNotification(Long idNotification).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSetIdNotification() throws Exception {
		final Notification notification = Notification.class.getDeclaredConstructor().newInstance();

		final Field idNotification = notification.getClass().getDeclaredField(ATT_ID_NOTIFICATION);
		idNotification.setAccessible(true);

		final Long resultatAttendu = LONG_TEST;
		notification.setIdNotification(resultatAttendu);
		final Long resultatTrouve = (Long) idNotification.get(notification);

		assertEquals("Mauvais idNotification", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public Long getIdUtilisateur().
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetIdUtilisateur() throws Exception {
		final Notification notification = Notification.class.getDeclaredConstructor().newInstance();

		final Field idUtilisateur = notification.getClass().getDeclaredField(ATT_ID_UTILISATEUR);
		idUtilisateur.setAccessible(true);

		final Long resultatAttendu = LONG_TEST;
		idUtilisateur.set(notification, resultatAttendu);
		final Long resultatTrouve = notification.getIdUtilisateur();

		assertEquals("Mauvais idUtilisateur", resultatAttendu, resultatTrouve);
	}

	/**
	 * Teste la méthode public void setIdUtilisateur(Long idUtilisateur).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSetIdUtilisateur() throws Exception {
		final Notification notification = Notification.class.getDeclaredConstructor().newInstance();

		final Field idUtilisateur = notification.getClass().getDeclaredField(ATT_ID_UTILISATEUR);
		idUtilisateur.setAccessible(true);

		final Long resultatAttendu = LONG_TEST;
		notification.setIdUtilisateur(resultatAttendu);
		final Long resultatTrouve = (Long) idUtilisateur.get(notification);

		assertEquals("Mauvais idUtilisateur", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public String getCommentaire().
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetCommentaire() throws Exception {
		final Notification notification = Notification.class.getDeclaredConstructor().newInstance();

		final Field commentaire = notification.getClass().getDeclaredField(ATT_COMMENTAIRE);
		commentaire.setAccessible(true);

		final String resultatAttendu = STRING_TEST;
		commentaire.set(notification, resultatAttendu);
		final String resultatTrouve = notification.getCommentaire();

		assertEquals("Mauvais commentaire", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setCommentaire(String commentaire).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSetCommentaire() throws Exception {
		final Notification notification = Notification.class.getDeclaredConstructor().newInstance();

		final Field commentaire = notification.getClass().getDeclaredField(ATT_COMMENTAIRE);
		commentaire.setAccessible(true);

		final String resultatAttendu = STRING_TEST;
		notification.setCommentaire(resultatAttendu);
		final String resultatTrouve = (String) commentaire.get(notification);

		assertEquals("Mauvais commentaire", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public String getLien().
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetLien() throws Exception {
		final Notification notification = Notification.class.getDeclaredConstructor().newInstance();

		final Field lien = notification.getClass().getDeclaredField(ATT_LIEN);
		lien.setAccessible(true);

		final String resultatAttendu = STRING_TEST;
		lien.set(notification, resultatAttendu);
		final String resultatTrouve = notification.getLien();

		assertEquals("Mauvais lien", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setLien(String lien).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSetLien() throws Exception {
		final Notification notification = Notification.class.getDeclaredConstructor().newInstance();

		final Field lien = notification.getClass().getDeclaredField(ATT_LIEN);
		lien.setAccessible(true);

		final String resultatAttendu = STRING_TEST;
		notification.setLien(resultatAttendu);
		final String resultatTrouve = (String) lien.get(notification);

		assertEquals("Mauvais lien", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public Integer getVue().
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetVue() throws Exception {
		final Notification notification = Notification.class.getDeclaredConstructor().newInstance();

		final Field vue = notification.getClass().getDeclaredField(ATT_VUE);
		vue.setAccessible(true);

		final Integer resultatAttendu = INTEGER_TEST;
		vue.set(notification, resultatAttendu);
		final Integer resultatTrouve = notification.getVue();

		assertEquals("Mauvaise vue", resultatAttendu, resultatTrouve);
	}

	/**
	 * Teste la méthode public void setVue(Integer vue).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSetVue() throws Exception {
		final Notification notification = Notification.class.getDeclaredConstructor().newInstance();

		final Field vue = notification.getClass().getDeclaredField(ATT_VUE);
		vue.setAccessible(true);

		final Integer resultatAttendu = INTEGER_TEST;
		notification.setVue(resultatAttendu);
		final Integer resultatTrouve = (Integer) vue.get(notification);

		assertEquals("Mauvaise vue", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public String toString().
	 */
	@Test
	public void testToString() {
		final Notification notification = new Notification();
		notification.setIdNotification(LONG_TEST);
		notification.setIdUtilisateur(LONG_TEST);
		notification.setCommentaire(STRING_TEST);
		notification.setLien(STRING_TEST);
		notification.setVue(INTEGER_TEST);

		final String resultatAttendu = "Notification [idNotification=" + LONG_TEST + ", idUtilisateur=" + LONG_TEST
				+ ", commentaire=" + STRING_TEST + ", lien=" + STRING_TEST + ", vue=" + INTEGER_TEST + "]";
		final String resultatTrouve = notification.toString();

		assertEquals("Mauvais toString()", resultatAttendu, resultatTrouve);
	}
	
}