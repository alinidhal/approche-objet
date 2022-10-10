package entites;


public class TestAdressePostale {
	
	public static void main (String[] args) {

		AdressePostale adresse1 = new AdressePostale();
		
		adresse1.numeroRue = 8;
		adresse1.libelléRue = "Rue de la rosaire";
		adresse1.codePostal = 34170;
		adresse1.ville = "Castelnau-le-Lez";
		
		AdressePostale adresse2 = new AdressePostale();
		
		adresse2.numeroRue = 36;
		adresse2.libelléRue = "Rue du jet d'eau";
		adresse2.codePostal = 13003;
		adresse2.ville = "Marseille";
	}
	
}
