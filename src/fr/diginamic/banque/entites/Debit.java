package fr.diginamic.banque.entites;

public class Debit extends Operation {
	
	
	
	public Debit(String date, double montant) {
		super(date, montant);
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "DEBIT";
	}

	

	

}
