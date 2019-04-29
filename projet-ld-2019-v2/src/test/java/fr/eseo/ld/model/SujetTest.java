package fr.eseo.ld.model;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.lang.reflect.Field;

import org.junit.Test;

import com.model.EtatSujet;
import com.model.Sujet;

/**
 * Classe de tests unitaires JUnit 4 de la classe Sujet.
 *
 * <p>Utilisation de la réflexivité.</p>
 *
 * @version 1.0
 * @author Cecilia Pinsard, Renaud Descours et Maxime LENORMAND
 *
 * @see fr.eseo.ld.beans.Sujet
 * @see org.junit
 */
public class SujetTest {
	
	private static final Integer INTEGER_TEST = 1;
	private static final Long LONG_TEST = 1L;
	private static final Float FLOAT_TEST = 1f;
	private static final Boolean BOOLEAN_TEST = true;
	private static final String STRING_TEST = "test";
	private static final EtatSujet ETAT_TEST = EtatSujet.DEPOSE;
	
	private static final String ATT_ID_SUJET = "idSujet";
	private static final String ATT_TITRE = "titre";
	private static final String ATT_NBR_MIN_ELEVES = "nbrMinEleves";
	private static final String ATT_NBR_MAX_ELEVES = "nbrMaxEleves";
	private static final String ATT_CONTRAT_PRO = "contratPro";
	private static final String ATT_CONFIDENTIALITE = "confidentialite";
	private static final String ATT_ETAT = "etat";
	private static final String ATT_LIENS = "liens";
	private static final String ATT_INTERETS = "interets";
	private static final String ATT_NOTE_INTERET_TECHNO = "noteInteretTechno";
	private static final String ATT_NOTE_INTERET_SUJET = "noteInteretSujet";
	
	/**
	 * Teste le constructeur par défaut de la classe.
	 */
	@Test
	public void testConstructeurParDefaut() {
		final Sujet sujet = new Sujet();

		assertNull("L'attribut n'est pas nul", sujet.getIdSujet());
	}
	
	/**
	 * Teste la méthode public Long getIdSujet().
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetIdSujet() throws Exception {
		final Sujet sujet = Sujet.class.getDeclaredConstructor().newInstance();

		final Field idSujet = sujet.getClass().getDeclaredField(ATT_ID_SUJET);
		idSujet.setAccessible(true);

		final Long resultatAttendu = LONG_TEST;
		idSujet.set(sujet, resultatAttendu);
		final Long resultatTrouve = sujet.getIdSujet();

		assertEquals("Mauvais idSujet", resultatAttendu, resultatTrouve);
	}

	/**
	 * Teste la méthode public void setIdSujet(Long idSujet).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSetIdSujet() throws Exception {
		final Sujet sujet = Sujet.class.getDeclaredConstructor().newInstance();

		final Field idSujet = sujet.getClass().getDeclaredField(ATT_ID_SUJET);
		idSujet.setAccessible(true);

		final Long resultatAttendu = LONG_TEST;
		sujet.setIdSujet(resultatAttendu);
		final Long resultatTrouve = (Long) idSujet.get(sujet);

		assertEquals("Mauvais idSujet", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public String getTitre().
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetTitre() throws Exception {
		final Sujet sujet = Sujet.class.getDeclaredConstructor().newInstance();

		final Field titre = sujet.getClass().getDeclaredField(ATT_TITRE);
		titre.setAccessible(true);

		final String resultatAttendu = STRING_TEST;
		titre.set(sujet, resultatAttendu);
		final String resultatTrouve = sujet.getTitre();

		assertEquals("Mauvais titre", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setTitre(String titre).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSetTitre() throws Exception {
		final Sujet sujet = Sujet.class.getDeclaredConstructor().newInstance();

		final Field titre = sujet.getClass().getDeclaredField(ATT_TITRE);
		titre.setAccessible(true);

		final String resultatAttendu = STRING_TEST;
		sujet.setTitre(resultatAttendu);
		final String resultatTrouve = (String) titre.get(sujet);

		assertEquals("Mauvais titre", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public Integer getNbrMinEleves().
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetNbrMinEleves() throws Exception {
		final Sujet sujet = Sujet.class.getDeclaredConstructor().newInstance();
		
        final Field nbrMinEleves = sujet.getClass().getDeclaredField(ATT_NBR_MIN_ELEVES);
        nbrMinEleves.setAccessible(true);
        
        final Integer resultatAttendu = INTEGER_TEST;
        nbrMinEleves.set(sujet, resultatAttendu);
        final Integer resultatTrouve = sujet.getNbrMinEleves();
		
		assertEquals("Mauvais nbrMinEleves", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setNbrMinEleves(Integer nbrMinEleves).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSetNbrMinEleves() throws Exception {
		final Sujet sujet = Sujet.class.getDeclaredConstructor().newInstance();
		
        final Field nbrMinEleves = sujet.getClass().getDeclaredField(ATT_NBR_MIN_ELEVES);
        nbrMinEleves.setAccessible(true);
        
        final Integer resultatAttendu = INTEGER_TEST;
        sujet.setNbrMinEleves(resultatAttendu);
        final Integer resultatTrouve = (Integer) nbrMinEleves.get(sujet);
		
		assertEquals("Mauvais nbrMinEleves", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public Integer getNbrMaxEleves().
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetNbrMaxEleves() throws Exception {
		final Sujet sujet = Sujet.class.getDeclaredConstructor().newInstance();
		
        final Field nbrMaxEleves = sujet.getClass().getDeclaredField(ATT_NBR_MAX_ELEVES);
        nbrMaxEleves.setAccessible(true);
        
        final Integer resultatAttendu = INTEGER_TEST;
        nbrMaxEleves.set(sujet, resultatAttendu);
        final Integer resultatTrouve = sujet.getNbrMaxEleves();
		
		assertEquals("Mauvais nbrMaxEleves", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setNbrMaxEleves(Integer nbrMaxEleves).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSetNbrMaxEleves() throws Exception {
		final Sujet sujet = Sujet.class.getDeclaredConstructor().newInstance();
		
        final Field nbrMaxEleves = sujet.getClass().getDeclaredField(ATT_NBR_MAX_ELEVES);
        nbrMaxEleves.setAccessible(true);
        
        final Integer resultatAttendu = INTEGER_TEST;
        sujet.setNbrMaxEleves(resultatAttendu);
        final Integer resultatTrouve = (Integer) nbrMaxEleves.get(sujet);
		
		assertEquals("Mauvais nbrMaxEleves", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public Boolean getContratPro().
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetContratPro() throws Exception {
		final Sujet sujet = Sujet.class.getDeclaredConstructor().newInstance();

		final Field contratPro = sujet.getClass().getDeclaredField(ATT_CONTRAT_PRO);
		contratPro.setAccessible(true);

		final Boolean resultatAttendu = BOOLEAN_TEST;
		contratPro.set(sujet, resultatAttendu);
		final Boolean resultatTrouve = sujet.getContratPro();

		assertEquals("Mauvais contratPro", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setContratPro(Boolean contratPro).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSetContratPro() throws Exception {
		final Sujet sujet = Sujet.class.getDeclaredConstructor().newInstance();

		final Field contratPro = sujet.getClass().getDeclaredField(ATT_CONTRAT_PRO);
		contratPro.setAccessible(true);

		final Boolean resultatAttendu = BOOLEAN_TEST;
		sujet.setContratPro(resultatAttendu);
		final Boolean resultatTrouve = (Boolean) contratPro.get(sujet);

		assertEquals("Mauvais contratPro", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public Integer getContratProInt().
	 */
	@Test
	public void testGetContratProInt() {
		final Sujet sujet = new Sujet();
		
		sujet.setContratPro(true);
		final Integer resultatAttenduTrue = 1;
		final Integer resultatTrouveTrue = sujet.getContratProInt();
		assertEquals("Mauvais contratPro", resultatAttenduTrue, resultatTrouveTrue);
		
		sujet.setContratPro(false);
		final Integer resultatAttenduFalse = 0;
		final Integer resultatTrouveFalse = sujet.getContratProInt();
		assertEquals("Mauvais contratPro", resultatAttenduFalse, resultatTrouveFalse);
	}
	
	/**
	 * Teste la méthode public Boolean getConfidentialite().
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetConfidentialite() throws Exception {
		final Sujet sujet = Sujet.class.getDeclaredConstructor().newInstance();

		final Field confidentialite = sujet.getClass().getDeclaredField(ATT_CONFIDENTIALITE);
		confidentialite.setAccessible(true);

		final Boolean resultatAttendu = BOOLEAN_TEST;
		confidentialite.set(sujet, resultatAttendu);
		final Boolean resultatTrouve = sujet.getConfidentialite();

		assertEquals("Mauvaise confidentialite", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setConfidentialite(Boolean confidentialite).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSetConfidentialite() throws Exception {
		final Sujet sujet = Sujet.class.getDeclaredConstructor().newInstance();

		final Field confidentialite = sujet.getClass().getDeclaredField(ATT_CONFIDENTIALITE);
		confidentialite.setAccessible(true);

		final Boolean resultatAttendu = BOOLEAN_TEST;
		sujet.setConfidentialite(resultatAttendu);
		final Boolean resultatTrouve = (Boolean) confidentialite.get(sujet);

		assertEquals("Mauvaise confidentialite", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public Integer getConfidentialiteInt().
	 */
	@Test
	public void testGetConfidentialiteInt() {
		final Sujet sujet = new Sujet();
		
		sujet.setConfidentialite(true);
		final Integer resultatAttenduTrue = 1;
		final Integer resultatTrouveTrue = sujet.getConfidentialiteInt();
		assertEquals("Mauvaise confidentialite", resultatAttenduTrue, resultatTrouveTrue);
		
		sujet.setConfidentialite(false);
		final Integer resultatAttenduFalse = 0;
		final Integer resultatTrouveFalse = sujet.getConfidentialiteInt();
		assertEquals("Mauvaise confidentialite", resultatAttenduFalse, resultatTrouveFalse);
	}
	
	/**
	 * Teste la méthode public EtatSujet getEtat().
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetEtat() throws Exception {
		final Sujet sujet = Sujet.class.getDeclaredConstructor().newInstance();

		final Field etat = sujet.getClass().getDeclaredField(ATT_ETAT);
		etat.setAccessible(true);

		final EtatSujet resultatAttendu = ETAT_TEST;
		etat.set(sujet, resultatAttendu);
		final EtatSujet resultatTrouve = sujet.getEtat();

		assertEquals("Mauvais etat", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setEtat(EtatSujet etat).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSetEtat() throws Exception {
		final Sujet sujet = Sujet.class.getDeclaredConstructor().newInstance();

		final Field etat = sujet.getClass().getDeclaredField(ATT_ETAT);
		etat.setAccessible(true);

		final EtatSujet resultatAttendu = ETAT_TEST;
		sujet.setEtat(resultatAttendu);
		final EtatSujet resultatTrouve = (EtatSujet) etat.get(sujet);

		assertEquals("Mauvais etat", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setEtatString(String etat).
	 * @throws Exception 
	 */
	@Test
	public void testSetEtatString() throws Exception {
		final Sujet sujet = new Sujet();
		
		sujet.setEtatString("depose");
		final String resultatAttenduDepose = "déposé";
		final String resultatTrouveDepose = sujet.getEtat().getEtat();
		assertEquals("Mauvais etat", resultatAttenduDepose, resultatTrouveDepose);
		
		sujet.setEtatString("valide");
		final String resultatAttenduValide = "validé";
		final String resultatTrouveValide = sujet.getEtat().getEtat();
		assertEquals("Mauvais etat", resultatAttenduValide, resultatTrouveValide);
		
		sujet.setEtatString("attribue");
		final String resultatAttenduAttribue = "attribué";
		final String resultatTrouveAttribue = sujet.getEtat().getEtat();
		assertEquals("Mauvais etat", resultatAttenduAttribue, resultatTrouveAttribue);
		
		sujet.setEtatString("refuse");
		final String resultatAttenduRefuse = "refusé";
		final String resultatTrouveRefuse = sujet.getEtat().getEtat();
		assertEquals("Mauvais etat", resultatAttenduRefuse, resultatTrouveRefuse);
		
		sujet.setEtatString("publie");
		final String resultatAttenduPublie = "publié";
		final String resultatTrouvePublie = sujet.getEtat().getEtat();
		assertEquals("Mauvais etat", resultatAttenduPublie, resultatTrouvePublie);
	}
	
	
	
	/**
	 * Teste la méthode public String getLiens().
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetLiens() throws Exception {
		final Sujet sujet = Sujet.class.getDeclaredConstructor().newInstance();

		final Field liens = sujet.getClass().getDeclaredField(ATT_LIENS);
		liens.setAccessible(true);

		final String resultatAttendu = STRING_TEST;
		liens.set(sujet, resultatAttendu);
		final String resultatTrouve = sujet.getLiens();

		assertEquals("Mauvais liens", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setLiens(String liens).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSetLiens() throws Exception {
		final Sujet sujet = Sujet.class.getDeclaredConstructor().newInstance();

		final Field liens = sujet.getClass().getDeclaredField(ATT_LIENS);
		liens.setAccessible(true);

		final String resultatAttendu = STRING_TEST;
		sujet.setLiens(resultatAttendu);
		final String resultatTrouve = (String) liens.get(sujet);

		assertEquals("Mauvais liens", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public String getInterets().
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetInterets() throws Exception {
		final Sujet sujet = Sujet.class.getDeclaredConstructor().newInstance();

		final Field interets = sujet.getClass().getDeclaredField(ATT_INTERETS);
		interets.setAccessible(true);

		final String resultatAttendu = STRING_TEST;
		interets.set(sujet, resultatAttendu);
		final String resultatTrouve = sujet.getInterets();

		assertEquals("Mauvais interets", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setInterets(String interets).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSetInterets() throws Exception {
		final Sujet sujet = Sujet.class.getDeclaredConstructor().newInstance();

		final Field interets = sujet.getClass().getDeclaredField(ATT_INTERETS);
		interets.setAccessible(true);

		final String resultatAttendu = STRING_TEST;
		sujet.setInterets(resultatAttendu);
		final String resultatTrouve = (String) interets.get(sujet);

		assertEquals("Mauvais interets", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public Float getNoteInteretTechno().
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetNoteInteretTechno() throws Exception {
		final Sujet sujet = Sujet.class.getDeclaredConstructor().newInstance();

		final Field noteInteretTechno = sujet.getClass().getDeclaredField(ATT_NOTE_INTERET_TECHNO);
		noteInteretTechno.setAccessible(true);

		final Float resultatAttendu = FLOAT_TEST;
		noteInteretTechno.set(sujet, resultatAttendu);
		final Float resultatTrouve = sujet.getNoteInteretTechno();

		assertEquals("Mauvaise noteInteretTechno", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setNoteInteretTechno(Float noteInteretSujet).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSetNoteInteretTechno() throws Exception {
		final Sujet sujet = Sujet.class.getDeclaredConstructor().newInstance();

		final Field noteInteretTechno = sujet.getClass().getDeclaredField(ATT_NOTE_INTERET_TECHNO);
		noteInteretTechno.setAccessible(true);

		final Float resultatAttendu = FLOAT_TEST;
		sujet.setNoteInteretTechno(resultatAttendu);
		final Float resultatTrouve = (Float) noteInteretTechno.get(sujet);

		assertEquals("Mauvaise noteInteretTechno", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public Float getNoteInteretSujet().
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetNoteInteretSujet() throws Exception {
		final Sujet sujet = Sujet.class.getDeclaredConstructor().newInstance();

		final Field noteInteretSujet = sujet.getClass().getDeclaredField(ATT_NOTE_INTERET_SUJET);
		noteInteretSujet.setAccessible(true);

		final Float resultatAttendu = FLOAT_TEST;
		noteInteretSujet.set(sujet, resultatAttendu);
		final Float resultatTrouve = sujet.getNoteInteretSujet();

		assertEquals("Mauvaise noteInteretSujet", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public void setNoteInteretSujet(Float noteInteretSujet).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSetNoteInteretSujet() throws Exception {
		final Sujet sujet = Sujet.class.getDeclaredConstructor().newInstance();

		final Field noteInteretSujet = sujet.getClass().getDeclaredField(ATT_NOTE_INTERET_SUJET);
		noteInteretSujet.setAccessible(true);

		final Float resultatAttendu = FLOAT_TEST;
		sujet.setNoteInteretSujet(resultatAttendu);
		final Float resultatTrouve = (Float) noteInteretSujet.get(sujet);

		assertEquals("Mauvaise noteInteretSujet", resultatAttendu, resultatTrouve);
	}
	
	/**
	 * Teste la méthode public String toString().
	 */
	@Test
	public void testToString() {
		final Sujet sujet = new Sujet();
		sujet.setIdSujet(LONG_TEST);
		sujet.setIdentifiant(STRING_TEST);
		sujet.setTitre(STRING_TEST);
		sujet.setDescription(STRING_TEST);
		sujet.setNbrMinEleves(INTEGER_TEST);
		sujet.setNbrMaxEleves(INTEGER_TEST);
		sujet.setContratPro(BOOLEAN_TEST);
		sujet.setConfidentialite(BOOLEAN_TEST);
		sujet.setEtat(ETAT_TEST);
		sujet.setLiens(STRING_TEST);
		sujet.setInterets(STRING_TEST);
		sujet.setNoteInteretTechno(FLOAT_TEST);
		sujet.setNoteInteretSujet(FLOAT_TEST);
				
		final String resultatAttendu = "Sujet [idSujet=" + LONG_TEST + ", identifiant =" + STRING_TEST  +", titre=" + STRING_TEST + ", description="
				+ STRING_TEST + ", nbrMinEleves=" + INTEGER_TEST + ", nbrMaxEleves=" + INTEGER_TEST + ", contratPro="
				+ BOOLEAN_TEST + ", confidentialite=" + BOOLEAN_TEST + ", etat=" + ETAT_TEST + ", liens=" + STRING_TEST
				+ ", interets=" + STRING_TEST + ", noteInteretTechno=" + FLOAT_TEST + ", noteInteretSujet=" + FLOAT_TEST + "]";
		final String resultatTrouve = sujet.toString();

		assertEquals("Mauvais toString()", resultatAttendu, resultatTrouve);
	}

}