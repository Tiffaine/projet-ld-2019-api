package com.model;

public class Sujet {
	String codeCommune; 
	String nomCommune; 
	String codePostal; 
	String latitude; 
	String longitude; 
	
	public Sujet(String codeCommune,String nomCommune, String codePostal, String latitude, String longitude ) {
		super(); 
		this.codeCommune=codeCommune; 
		this.nomCommune=nomCommune;
		this.codePostal=codePostal; 
		this.latitude=latitude; 
		this.longitude=longitude; 
	}

	public String getCodeCommune() {
		return codeCommune;
	}

	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}

	public String getNomCommune() {
		return nomCommune;
	}

	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	

}
