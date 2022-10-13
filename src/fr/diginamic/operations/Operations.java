package fr.diginamic.operations;

public class Operations {
	
	protected double a;
	protected double b;
	protected char operateur;
	
	
//	Constructeur
	public Operations(double a, char operateur, double b ) {
		super();
		this.a = a;
		this.b = b;
		this.operateur = operateur;
		
	}
//	METHODE qui renvoit un String de la methode calcul
	@Override
	public String toString() {
		return calcul(a, operateur, b );
	}
	
//	METHODE qui renvoit un type String
	public String calcul(double a, char operateur, double b ) {
		
// 		Ici, je crée un variable et je l'initialise avec une chaine vide
//		Afin de mettre le resultat du return des conditions
		String ope = "";

//		Je crée ma condition pour les 4 figures
		if ((operateur == '+')||(operateur == '+')||(operateur == '*')||(operateur == '/')){
			ope = a + " " + operateur + " " + b;
			return ope;
		} else {
			ope = "---- PAS DE CALCUL ----";
			return ope;
		}
		
	}
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public char getOperateur() {
		return operateur;
	}

	public void setOperateur(char operateur) {
		this.operateur = operateur;
	}
	

}
