package listes;

public class TestEquals {

	public static void main(String[] args) {
		Ville v1 = new Ville ("Marseille", 3452720);
		Ville v2 = new Ville ("Marseille", 3452720);
		
		System.out.println(v1.equals(v2));
		System.out.println(v1==v2);
		

		
		

	}

}
