package String;

public class StringConcatenation {

	public static void main(String[] args) {

		String s1 = "Aniruddha" + " M. " + "Agrawal";
		System.out.println ( s1 );
		String s2 = new StringBuffer ().append ( "Aniruddha" ).append ( " M. " ).append ("Agarwal").toString ();
		System.out.println ( s2 );
		String s3 = 50 + 30 + " Aniruddha " + 3 + 8 + 1999;
		System.out.println ( s3 );
		String s4 = "Aniruddha";
		String s5 = " M. ";
		String s6 = "Agrawal";
		System.out.println ( s4.concat ( s5 ).concat ( s6 ) );
		System.out.println ( s6.concat ( s5 ).concat ( s4 ) );

	}

}
