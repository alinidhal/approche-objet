package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
	
	double tauxRemuneration;
	
	public CompteTaux(long numero, double solde, double tauxRemuneration) {
		super(numero, solde);
		this.tauxRemuneration = tauxRemuneration;
	}

	@Override
	public String toString() {
		return super.toString() + " taux de rémunération = "+ tauxRemuneration + " %";
	}

	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
