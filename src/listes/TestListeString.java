package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		
		ArrayList<String> villes = new ArrayList<String>();
		villes.add("Nice");
		villes.add("Carcassonne");
		villes.add("Narbonne");
		villes.add("Lyon");
		villes.add("Foix");
		villes.add("Pau");
		villes.add("Marseille");
		villes.add("Tarbes");
		
		
		// Rechercher la ville qui a le + Gd nbre de lettre
			
		int maxLength = villes.get(0).length();
		
		String maxVille = villes.get(0);
		
		for (int i = 0; i < villes.size(); i++) {
			
			if (villes.get(i).length() > maxLength) {
				
				maxLength = villes.get(i).length();
				maxVille = villes.get(i);
			}
		}
		System.out.println("la ville qui a le plus grand nombre de lettrer : " + maxVille);
		
		
		// Mettre les noms des villes en Majuscules
		for (int i = 0; i < villes.size(); i++) {
			villes.set(i, (villes.get(i)).toUpperCase());
		}

		System.out.println(villes);
			
		
		// Supprimer les villes dont le prefixe est N
		Iterator<String> it = villes.iterator();
		
		while (it.hasNext()) {
			String ville = it.next();
			if(ville.startsWith("N") ) {
				it.remove();
				
			}
			
		}
			System.out.println(villes);
	}

	

}
