package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		
		
		Compte[] comptes = new Compte[2];
		comptes[0] = new Compte(902203456, 10000);
		comptes[1] = new CompteTaux(90223456, 1000, 12);
		
		for (int i=0; i<comptes.length; i++) {
			System.out.println(comptes[i]);
		}
		
	}
	
	
	
	
	


}
