package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		// Initialiser le chrono StringBuiler
		long debut = System.currentTimeMillis();
		
		StringBuilder builder = new StringBuilder();

		for(int i=1; i<100000; i++ ) {
			builder.append(i);
		}

		long fin = System.currentTimeMillis();
		
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut) +" ms");
		
		// Caractere +
		
		long start = System.currentTimeMillis();
		
		String ch = "";

		for(int i=1; i<100000; i++ ) {
			ch += i;
		}

		long end = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :" + (start - end) + " ms");
	}

}
