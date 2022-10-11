package fr.diginamic.banque.entites;

public class Compte {

	private long numeroCompte;
	private double soldeCompte;
	
	public Compte(long numeroCompte, double soldeCompte) {
		
		this.numeroCompte =  numeroCompte;
		this.soldeCompte =  soldeCompte;
		
	}

	public long getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(long numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	
	

}
