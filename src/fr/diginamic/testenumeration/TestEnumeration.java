/**
 * 
 */
package fr.diginamic.testenumeration;

/**
 * @author nidhal
 *
 */
public class TestEnumeration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Saison[] saisons = Saison.values();
		
		for (Saison s : saisons) {
			System.out.println(s);
		}
		
		Saison saisonEte = Saison.valueOf("ETE"); // Recherche et affiche libelle "ETE"
		System.out.println(saisonEte);

		String nom = "HIVER";
		System.out.println(Saison.valueOf(nom));
	}

}
