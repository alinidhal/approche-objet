package fr.diginamic.banque.entites;

import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		Cercle cercle1 = new Cercle(2);
		Cercle cercle2 = new Cercle(3);
		Cercle cercle3 = CercleFactory.creerCercle(4);
	
		System.out.println(cercle1.toString()+ 
				"\n"+ cercle2.toString() + "\n"+ cercle3.toString());

	}

}
