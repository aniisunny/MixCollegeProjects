package String;

public class StringCompare {

	public static void main(String[] args) {

		String s1 = "Aniruddha";
		String s2 = "Aniruddha";
		String s3 = new String ( "Aniruddha" );
		String s4 = "ANIRUDDHA";
		String s5 = "deepak";
		String s6 = "Rahul";
		
		System.out.println ( s1.equals ( s2 ) );
		System.out.println ( s1.equals ( s4 ) );
		System.out.println ( s1.equalsIgnoreCase ( s4 ) );
		System.out.println ( s1.equals ( s3 ) );
		System.out.println ( s1.equals ( s5 ) );
		System.out.println ( s1 == s2 );
		System.out.println ( s1 == s3 );
		System.out.println ( s1 == s4 );
		System.out.println ( s1.compareTo ( s2 ) );  // s1 == s2
		System.out.println ( s1.compareTo ( s4 ) );  // s1 > s4 bcz n = 111 and N = 79 and difference 32 as a output
		System.out.println ( s1.compareTo ( s3 ) );  // s1 == s3
		System.out.println ( s1.compareTo ( s5 ) );  // s1 < s5 bcz A = 65 and d = 100 
		System.out.println ( s6.compareTo ( s5 ) );  // s6 < s5 bcz R = 82 and d = 100 

	}

}
