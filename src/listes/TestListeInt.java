package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



public class TestListeInt {

	public static void main(String[] args) {
		
		ArrayList<Integer> entier = new ArrayList<Integer>();
		entier.add(-1);
		entier.add(5);
		entier.add(7);
		entier.add(3);
		entier.add(-2);
		entier.add(4);
		entier.add(8);
		entier.add(5);
		
		System.out.println(entier);
		
		// Affichez la taille de la liste
		System.out.println("Taille de la liste : " + entier.size());
		
		// Recherchez et affichez le plus grand élément de la liste
		Object eltMax = Collections.max(entier);
		System.out.println("Le plus grand element de la liste : " + eltMax);
		
		// Supprimez le plus petit élément de la liste et affichez le résultat
		
		Object eltMin = Collections.min(entier);
		
		Iterator<Integer> it = entier.iterator();
		
		while (it.hasNext()) {
			Integer elt = it.next();
			if(elt == eltMin) {
				it.remove();
			}
			
		}
		System.out.println(entier);

		
		 for(int i=0; i<entier.size(); i++) {
			 int entierPos = Math.abs(entier.get(i));
			 System.out.println(entierPos);
		 }
		
		
	}

}
