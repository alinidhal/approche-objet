package entites;

import entites2.Personne;

public class TestPersonne {
	
	public static void main (String[] args ) {

//		1ere personne
		
		AdressePostale adresse1 = new AdressePostale();
		
		adresse1.numeroRue = 8;
		adresse1.libelléRue = "Rue de la rosaire";
		adresse1.codePostal = 34170;
		adresse1.ville = "Castelnau-le-Lez";
		
		Personne personne1 = new Personne();
		
		personne1.nom = "Ali";
		personne1.prenom = "Nidhal";
		personne1.adresse = adresse1;

// 		La 2eme personne		
		
		AdressePostale adresse2 = new AdressePostale();
		
		adresse2.numeroRue = 36;
		adresse2.libelléRue = "Rue du jet d'eau";
		adresse2.codePostal = 13003;
		adresse2.ville = "Marseille";
		
		Personne personne2 = new Personne();
		
		personne2.nom = "Ali";
		personne2.prenom = "Nidhal";
		personne2.adresse = adresse2;
		
	}
}
