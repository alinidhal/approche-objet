package fr.diginamic.testenumeration;

public enum Saison {

	 	PRINTEMPS("PRINTEMPS", 1),
		ETE("ETE", 2),
		AUTOMNE("AUTOMNE", 3),
		HIVER("HIVER", 4);
		
		
	

		private String libelle;
		private int numeroOrdre;
		
		private Saison(String libelle, int numeroOrdre) {
			
			this.libelle = libelle;
			this.numeroOrdre = numeroOrdre;
		}
		
		
		@Override
		public String toString() {
			return super.toString();
			
		}
		
		
		public String getLibelle() {
			return libelle;
		}
		
		public int getNumeroOrdre() {
			return numeroOrdre;
		}
		
}
