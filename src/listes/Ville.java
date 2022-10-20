package listes;

/**
 * Reprsésente le concept de <strong>Ville</strong> avec un nom et un nombre d'habitants
 * @author nidhal
 *
 */


public class Ville {

	protected String nom;
	protected int nbHabitants;
	
	public Ville(String nom, int nbHabitants) {
		super();
		this.nom=nom;
		this.nbHabitants=nbHabitants;
	}
	
	@Override
	public String toString() {
		return "Ville [ "+ nom +", "  + nbHabitants + " hab ]\n";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Ville)) {
			return false;
		}
		
		Ville other = (Ville)obj;
		
		return other.getNom().equals(this.getNom()) && other.getNbHabitants()==this.getNbHabitants();
		}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	public String toUpperCase() {
		// TODO Auto-generated method stub
		return nom.toUpperCase() ;
	}


	


}
