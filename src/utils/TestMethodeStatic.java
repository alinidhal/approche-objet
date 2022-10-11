package utils;

public class TestMethodeStatic {

	public static void main(String[] args) {
		
		String entier = "20";
		
//		int nombre = Integer.valueOf(entier);
        int nombre = Integer.parseInt(entier);
 
        System.out.println(nombre+" mon entier"); 
        
        int a = 30; 
        int b = 31;
        
        int max = Integer.max(a, b);
        System.out.println(max+" le nombre maximum");

	}
}
