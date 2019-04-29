/**
 * 
 */
package fr.eseo.ld.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.model.Epreuve;
import com.model.Equipe;
import com.model.Jury;
import com.model.Utilisateur;

/**
 * @author Lilian BRAUD
 *
 */
public class JuryTest {

	private static final Long LONG_TEST = 1L;
	private static final Date DATE_TEST = new Date(398000000);
	private static final String DATE_STRING_TEST = "1970-01-05 03:33";
	private static final Equipe EQUIPE_TEST = new Equipe();
	private static final Epreuve EPREUVE_TEST = new Epreuve();
	private static final List<Utilisateur> PROFESSEURS_TEST = new ArrayList<>();
		
	private static final String ATT_ID_JURY = "idJury";
	private static final String ATT_DATE = "date";
	private static final String ATT_EPREUVE = "epreuve";
	private static final String ATT_EQUIPE = "equipe";
	private static final String ATT_PROFESSEURS = "professeurs";
	
	@BeforeClass
	public static void beforeClass() {
		EQUIPE_TEST.setIdEquipe("2018_022");
		EPREUVE_TEST.setIdEpreuve(LONG_TEST);
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setIdUtilisateur(LONG_TEST);
		PROFESSEURS_TEST.add(utilisateur);
	}
	
	@Test
	public void test_Constructeur() {
		final Jury jury = new Jury();

		assertNull("L'attribut n'est pas nul", jury.getIdJury());
	}
	
	@Test
	public void test_getIdJury() throws Exception {
		final Jury jury = Jury.class.getDeclaredConstructor().newInstance();

		final Field idJury = jury.getClass().getDeclaredField(ATT_ID_JURY);
		idJury.setAccessible(true);

		final Long resultatAttendu = LONG_TEST;
		idJury.set(jury, resultatAttendu);
		final Long resultatTrouve = jury.getIdJury();

		assertEquals("Mauvais idJury", resultatAttendu, resultatTrouve);
	}
	
	@Test
	public void test_getDate() throws Exception {
		final Jury jury = Jury.class.getDeclaredConstructor().newInstance();

		final Field idJury = jury.getClass().getDeclaredField(ATT_DATE);
		idJury.setAccessible(true);

		final Date resultatAttendu = DATE_TEST;
		idJury.set(jury, resultatAttendu);
		final Date resultatTrouve = jury.getDate();

		assertEquals("Mauvais date", resultatAttendu, resultatTrouve);
	}
	
	@Test
	public void test_getDateString() throws Exception {
		final Jury jury = Jury.class.getDeclaredConstructor().newInstance();

		final Field idJury = jury.getClass().getDeclaredField(ATT_DATE);
		idJury.setAccessible(true);

		idJury.set(jury, DATE_TEST);
		final String resultatTrouve = jury.getDateString();

		assertEquals("Mauvais dateString", DATE_STRING_TEST, resultatTrouve);
	}
	
	@Test
	public void test_getEquipe() throws Exception {
		final Jury jury = Jury.class.getDeclaredConstructor().newInstance();

		final Field idJury = jury.getClass().getDeclaredField(ATT_EQUIPE);
		idJury.setAccessible(true);

		idJury.set(jury, EQUIPE_TEST);
		final String resultatAttendu = EQUIPE_TEST.getIdEquipe();
		final String resultatTrouve = jury.getEquipe().getIdEquipe();

		assertEquals("Mauvaise Equipe", resultatAttendu, resultatTrouve);
	}
	
	@Test
	public void test_getProfesseurs() throws Exception {
		final Jury jury = Jury.class.getDeclaredConstructor().newInstance();

		final Field idJury = jury.getClass().getDeclaredField(ATT_PROFESSEURS);
		idJury.setAccessible(true);

		idJury.set(jury, PROFESSEURS_TEST);
		
		assertEquals("Mauvaise taille de la liste des professeurs", 1, jury.getProfesseurs().size());
		final Long resultatAttendu = PROFESSEURS_TEST.get(0).getIdUtilisateur();
		final Long resultatTrouve = jury.getProfesseurs().get(0).getIdUtilisateur();

		assertEquals("Mauvais idProfesseur", resultatAttendu, resultatTrouve);
	}
	
	@Test
	public void test_getEpreuve() throws Exception {
		final Jury jury = Jury.class.getDeclaredConstructor().newInstance();

		final Field idJury = jury.getClass().getDeclaredField(ATT_EPREUVE);
		idJury.setAccessible(true);

		idJury.set(jury, EPREUVE_TEST);
		final Long resultatAttendu = EPREUVE_TEST.getIdEpreuve();
		final Epreuve resultatTrouve = jury.getEpreuve();

		assertEquals("Mauvais idEpreuve", resultatAttendu, resultatTrouve.getIdEpreuve());
	}
	
	@Test
	public void test_setIdJury() throws Exception {
		final Jury jury = Jury.class.getDeclaredConstructor().newInstance();

		final Field idJury = jury.getClass().getDeclaredField(ATT_ID_JURY);
		idJury.setAccessible(true);

		final Long resultatAttendu = LONG_TEST;
		jury.setIdJury(resultatAttendu);
		final Long resultatTrouve = (Long) idJury.get(jury);

		assertEquals("Mauvais idJury", resultatAttendu, resultatTrouve);
	}
	
	@Test
	public void test_setDate() throws Exception {
		final Jury jury = Jury.class.getDeclaredConstructor().newInstance();

		final Field idJury = jury.getClass().getDeclaredField(ATT_DATE);
		idJury.setAccessible(true);

		final Date resultatAttendu = DATE_TEST;
		jury.setDate(resultatAttendu);
		final Date resultatTrouve = (Date) idJury.get(jury);

		assertEquals("Mauvais date", resultatAttendu, resultatTrouve);
	}
	
	@Test
	public void test_setEpreuve() throws Exception {
		final Jury jury = Jury.class.getDeclaredConstructor().newInstance();

		final Field epreuve = jury.getClass().getDeclaredField(ATT_EPREUVE);
		epreuve.setAccessible(true);

		final Epreuve resultatAttendu = EPREUVE_TEST;
		jury.setEpreuve(resultatAttendu);
		final Epreuve resultatTrouve = (Epreuve) epreuve.get(jury);

		assertEquals("Mauvais idEpreuve", resultatAttendu, resultatTrouve);
	}
	
	@Test
	public void test_setEquipe() throws Exception {
		final Jury jury = Jury.class.getDeclaredConstructor().newInstance();

		final Field equipe = jury.getClass().getDeclaredField(ATT_EQUIPE);
		equipe.setAccessible(true);

		final Equipe resultatAttendu = EQUIPE_TEST;
		jury.setEquipe(resultatAttendu);
		final Equipe resultatTrouve = (Equipe) equipe.get(jury);

		assertEquals("Mauvais idEquipe", resultatAttendu, resultatTrouve);
	}
	
	@Test
	public void test_setProfesseurs() throws Exception {
		final Jury jury = Jury.class.getDeclaredConstructor().newInstance();

		final Field professeurs = jury.getClass().getDeclaredField(ATT_PROFESSEURS);
		professeurs.setAccessible(true);

		final List<Utilisateur> resultatAttendu = PROFESSEURS_TEST;
		jury.setProfesseurs(resultatAttendu);
		final List<Utilisateur> resultatTrouve = (List<Utilisateur>) professeurs.get(jury);

		assertEquals("Mauvaise taille de la liste des professeurs", 1, jury.getProfesseurs().size());

		assertEquals("Mauvais idProfesser", PROFESSEURS_TEST.get(0).getIdUtilisateur(), resultatTrouve.get(0).getIdUtilisateur());
	}
	
	@Test
	public void test_toString() throws Exception {
		final Jury jury = Jury.class.getDeclaredConstructor().newInstance();
		jury.setIdJury(LONG_TEST);
		jury.setDate(DATE_TEST);
		jury.setEpreuve(EPREUVE_TEST);
		jury.setEquipe(EQUIPE_TEST);
		jury.setProfesseurs(PROFESSEURS_TEST);
		final String resultatAttendu = "Jury [idJury=1, professeurs=[Utilisateur [idUtilisateur="+ LONG_TEST +", nom=null, prenom=null, "
				+ "identifiant=null, hash=null, email=null, valide=null]], epreuve=Epreuve [idEpreuve="+ LONG_TEST +", option=null, typeEpreuve=null, "
				+ "semestre=, dateIndicative=null, coefficient=null], "
				+ "equipe=Equipe [idEquipe=2018_022, semestre=null, taille=null, idSujet=null, valide=null], date="+ DATE_STRING_TEST +"]";
		assertEquals("Mauvais string", resultatAttendu, jury.toString());
	}

}
