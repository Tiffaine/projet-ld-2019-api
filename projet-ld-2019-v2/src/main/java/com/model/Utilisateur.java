package com.model;

/**
 * Classe du bean Utilisateur.
 * 
 * <p>Définition des attributs de l'objet Utilisateur ainsi que des accesseurs et des mutateurs.</p>
 */
public class Utilisateur {

	/* Attributs */ 
	private Long idUtilisateur;
	private String nom;
	private String prenom;
	private String identifiant;
	private String hash;
	private String email;
	private String valide;

	/**
	 * Constructeur par défaut.
	 */
	public Utilisateur() {
		super();
	}

	/* Accesseurs et Mutateurs */
	/**
	 * Accessseur pour récupérer l'ID de l'utilisateur
	 * @return idUtilisateur
	 */
	public Long getIdUtilisateur() {
		return this.idUtilisateur;
	}
	
	/**
	 * Mutateur pour modifier l'ID de l'utilisateur
	 * @param idUtilisateur
	 */
	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	
	/**
	 * Accessseur pour récupérer le nom de l'utilisateur
	 * @return nom
	 */
	public String getNom() {
		return this.nom;
	}
	
	/**
	 * Mutateur pour modifier le nom de l'utilisateur
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * Accessseur pour récupérer le prénom de l'utilisateur
	 * @return prenom
	 */
	public String getPrenom() {
		return this.prenom;
	}
	
	/**
	 * Mutateur pour modifier le prénom de l'utilisateur
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/**
	 * Accessseur pour récupérer l'identifiant de l'utilisateur
	 * @return identifiant
	 */
	public String getIdentifiant() {
		return this.identifiant;
	}
	
	/**
	 * Mutateur pour modifier l'identifiant de l'utilisateur
	 * @param identifiant
	 */
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	
	/**
	 * Accessseur pour récupérer le hash du mot de passe de l'utilisateur
	 * @return hash
	 */
	public String getHash() {
		return this.hash;
	}
	
	/**
	 * Mutateur pour modifier le hash du mot de passe de l'utilisateur
	 * @param hash
	 */
	public void setHash(String hash) {
		this.hash = hash;
	}
	
	/**
	 * Accessseur pour récupérer l'email de l'utilisateur
	 * @return email
	 */
	public String getEmail() {
		return this.email;
	}
	
	/**
	 * Mutateur pour modifier l'email de l'utilisateur
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Accessseur pour récupérer si le compte de l'utilisateur a été validé ou non
	 * @return valide
	 */
	public String getValide() {
		return this.valide;
	}

	/**
	 * Mutateur pour modifier si le compte de l'utilisateur a été validé ou non
	 * @param valide
	 */
	public void setValide(String valide) {
		this.valide = valide;
	}

	/**
	 * Redéfinition de la méthode toString().
	 */
	public String toString() {
		return "Utilisateur [idUtilisateur=" + this.idUtilisateur + ", nom=" + this.nom + ", prenom=" + this.prenom
				+ ", identifiant=" + this.identifiant + ", hash=" + this.hash + ", email=" + this.email + ", valide="
				+ this.valide + "]";
	}
	
}