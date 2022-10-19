package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestVille {

	public static void main(String[] args) {
		
		ArrayList<Ville> liste = new ArrayList<Ville>();
		
		
		liste.add(new Ville("Nice", 343000));
		liste.add(new Ville("Carcassonne", 47800));
		liste.add(new Ville("Narbonne", 53400));
		liste.add(new Ville("Lyon", 484000));
		liste.add(new Ville("Foix", 9700));
		liste.add(new Ville("Pau", 77200));
		liste.add(new Ville("Marseille", 850700));
		liste.add(new Ville("Tarbes", 40600));
		
		
		// Trouver la taille de ArrayList
		int tL = liste.size();
		
		for (int i = 0; i < tL; i++) {
			System.out.println(liste.get(i) + " ");
		}
		
		
		// Trouver la ville la plus peuplée de la liste. 
		// Chercher le max 
		int nbHabitantsMax = Integer.MIN_VALUE;
		String villeMaxName = "";
		
		for (Ville v: liste) {
			if (v.getNbHabitants()>nbHabitantsMax) {
				nbHabitantsMax=v.getNbHabitants();
				villeMaxName=v.getNom();
			}
		}
		System.out.println("Ville la plus peuplée : [ " + villeMaxName + ", "+ nbHabitantsMax + " hab.]\n");
		
		// Trouver et supprimer la ville la moins peuplée de la liste
		int nbHabitantsMin = Integer.MAX_VALUE;
		
		String villeMinName = "";	
		
		Iterator<Ville> it = liste.iterator();
		
		while (it.hasNext()) {
			Ville v = it.next();
			if (v.getNbHabitants()<nbHabitantsMin) {
				nbHabitantsMin=v.getNbHabitants();
				villeMinName=v.getNom();
				it.remove();
				
			}
			
			
		}
		
		System.out.println(liste + "LISTE");
		System.out.println("La ville de " + villeMinName + " a été supprimée, c'est la moins peuplée avec " + nbHabitantsMin + " hab.]\n");
		
		int minVille = 100000;
		
		for(int i=minVille; i<liste.size(); i++) {
			if(i<minVille) {}
		}
	
	}

}
