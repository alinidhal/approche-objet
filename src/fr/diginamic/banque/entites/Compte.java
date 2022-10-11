package fr.diginamic.banque.entites;

public class Compte {

	protected long numeroCompte;
	protected double soldeCompte;
	
	public Compte(long numeroCompte, double soldeCompte) {
		
		this.numeroCompte =  numeroCompte;
		this.soldeCompte =  soldeCompte;
		
	}
	
	

	@Override
	public String toString() {
		return "Compte [numeroCompte=" + numeroCompte + ", soldeCompte=" + soldeCompte + "]";
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
