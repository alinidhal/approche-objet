package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		
		Compte monCompte = new Compte(902203456, 10000);
		System.out.println("Mon solde est : "+monCompte.getSoldeCompte()+" €"+ "\nMon numéro de compte est : "+ monCompte.getNumeroCompte());
	}

}
