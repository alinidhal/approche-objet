package entites;

import entites2.Personne;

public class TestPersonne {
	
	public static void main (String[] args ) {

//		1ere personne
		
		AdressePostale adresse1 = new AdressePostale(8, "Rue de la rosaire", 34170, "Castelnau-le-Lez");
		
		Personne p1 = new Personne("Naruto", "Uzumaki", adresse1);
		p1.affciherIdentite();
		p1.setAdresse(adresse1);
		
		p1.setPrenom("Boruto");
		p1.setAdresse(adresse1);
		p1.affciherIdentite();
		
		String nom = p1.getNom();
		System.out.println(nom);
		
		
		
		
		
// 		La 2eme personne		
		
		AdressePostale adresse2 = new AdressePostale(36, "Rue du jet d'eau", 13003, "Marseille");
		Personne p2 = new Personne("Ushiwa", "Sasuke", adresse2);
		
		p2.setPrenom("Sarada");
		p2.setAdresse(adresse2);
		p2.affciherIdentite();
	}
}
