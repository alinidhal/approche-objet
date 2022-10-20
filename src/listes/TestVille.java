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
		
		// J'initialise le nombre d'habitants minimal
		// Le nom de la ville minimal 
		// Et l'index minimu de 0
		int nbHabitantsMin = (liste.get(0)).getNbHabitants();
		String villeMinName = (liste.get(0)).getNom();
		int iVilleMin = liste.indexOf(0);
		
		// Je fais ma boucle 
		for (int i = 0; i < liste.size(); i++) {
			if ((liste.get(i)).getNbHabitants() < nbHabitantsMin) {
				nbHabitantsMin = (liste.get(i)).getNbHabitants();
				villeMinName = (liste.get(i)).getNom();
				iVilleMin = (liste.indexOf(liste.get(i)));
			}
		}
		// Suppression de la ville la moins peuplée 
		liste.remove(iVilleMin);
		
		System.out.println("Liste des villes après suppression de " +villeMinName+ 
				", ville la moins peuplée avec "+ nbHabitantsMin + " hab. \n" + liste);
		
		// Mettre les villes de plus de 100_000 habitants en MAJ
		for (int i = 0; i < liste.size(); i++) {
			if ((liste.get(i)).getNbHabitants() > 100000){		
				(liste.get(i)).setNom((liste.get(i).getNom()).toUpperCase());
			}
		}

		System.out.println("Mettre en MAJ les villes avec plus de 100_000 habitants \n" +liste);
	
	}

}
