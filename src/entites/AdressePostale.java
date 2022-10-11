package entites;

public class AdressePostale {

	int numeroRue;
	String libelléRue;
	int codePostal;
	String ville;
	
	public AdressePostale(int numeroRue, String libelléRue, int codePostal, String ville) {
		
		this.numeroRue = numeroRue;
		this.libelléRue = libelléRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public int getNumeroRue() {
		return numeroRue;
	}

	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}

	public String getLibelléRue() {
		return libelléRue;
	}

	public void setLibelléRue(String libelléRue) {
		this.libelléRue = libelléRue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
	
	
	
}
