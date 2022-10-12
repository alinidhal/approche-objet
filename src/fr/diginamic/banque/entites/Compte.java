package fr.diginamic.banque.entites;

public class Compte {

	protected long numero;
	protected double solde;
	
	public Compte(long numero, double solde) {
		super();
		this.numero =  numero;
		this.solde =  solde;
		
	}
	
	

	@Override
	public String toString() {
		return "Compte [numero = " + numero + ", solde = " + solde + " €"+"]";
	}



	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSoldeCompte(double solde) {
		this.solde = solde;
	}

	
	

}
