package fr.diginamic.utils;

import fr.diginamic.banque.entites.Cercle;

public class CercleFactory {
	

	public static Cercle creerCercle(double rayon) {
		Cercle cercle = new Cercle(rayon);
		return cercle;
	}

	

}
