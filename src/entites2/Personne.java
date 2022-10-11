package entites2;

import entites.AdressePostale;

public class Personne {
	
	private String nom;
	private String prenom;
	private AdressePostale adresse;
	
	public Personne(String nvPrenom, String nvNom) {
		
		nom = nvNom;
		prenom = nvPrenom;

	}

	public Personne( String prenom, String nom, AdressePostale adresse) {
	
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	public void affciherIdentite(){
		System.out.println(prenom + " " + nom.toUpperCase() + " " + adresse.getNumeroRue() + " "+ adresse.getLibelléRue() +" "+ adresse.getCodePostal());
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	
	public void setAdresse(AdressePostale adresse){
		this.adresse = adresse;
		
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public AdressePostale getAdresse() {
		return adresse;
	}
	
	
}
