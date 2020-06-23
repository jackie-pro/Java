

public class ex6 {

	public static void main(String[] args) {

		String s1 = "Java";
		String s2 = "Java";
		System.out.println("s1 == s2 : "+  (s1 == s2) +" ; "+"s1 equals s2 : "+ (s1.equals(s2)) +"¡C");
	    s1 = new String("Java");
		s2 = new String("Java");
		System.out.println("s1 == s2 : "+ (s1 == s2) +" ; "+"s1 equals s2 : "+ (s1.equals(s2)) +"¡C");
		s1 = new String("Javaf"); 
		s2 = new String("Java");
		System.out.println("s1 == s2 : "+ (s1 == s2) +" ; "+"s1 equals s2 : "+ (s1.equals(s2)) +"¡C");
	}
	
		
	

}
