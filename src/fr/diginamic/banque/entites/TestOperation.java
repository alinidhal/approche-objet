package fr.diginamic.banque.entites;

public class TestOperation {

	
	public static void main(String[] args) {
		
		Operation[] operations = new Operation[4];
		operations[0] = new Credit("12/10/2022", 598.23);
		operations[1] = new Debit("10/10/2022", 234);
		operations[2] = new Credit("11/10/2022", 598.23);
		operations[3] = new Debit("09/10/2022", 234);
		
		double somme = 0;
		
		for (int i=0; i<operations.length; i++) {
			
			if(operations[i].getType()=="CREDIT") {
				somme= somme + operations[i].getMontant();
				
			} else {
				somme= somme - operations[i].getMontant();
			}
		
			System.out.println(operations[i]);
		}
		System.out.println("Total des opérations " + somme);
	}

}
