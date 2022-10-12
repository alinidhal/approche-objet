package fr.diginamic.banque.entites;

public class Cercle {

	protected double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	// METHODE qui retourne perimettre
	public double calculerPerimettre() {
		double perimettre = 2*3.14*rayon;
		return perimettre;
	}
	// METHODE qui retourne surface
	public double calculerSurface() {
		double surface = 3.14*(rayon*rayon);
		return surface;
	}


	@Override
	public String toString() {
		return "Cercle [rayon = " + rayon +" - Perimettre : " + calculerPerimettre()+ " - Surface : "+calculerSurface()+ " m2" +" ]";
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	
	

}
