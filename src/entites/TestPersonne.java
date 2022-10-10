package entites;

import entites2.Personne;

public class TestPersonne {
	
	public static void main (String[] args ) {

//		1ere personne
		
		AdressePostale adresse1 = new AdressePostale(8, "Rue de la rosaire", 34170, "Castelnau-le-Lez");
		
		Personne personne1 = new Personne("Naruto", "UZUMAKI");

// 		La 2eme personne		
		
		AdressePostale adresse2 = new AdressePostale(36, "Rue du jet d'eau", 13003, "Marseille");
		
		Personne personne2 = new Personne("Sasuke", "UCHIWA", adresse2);
		
	}
}
