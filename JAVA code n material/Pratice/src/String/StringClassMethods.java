package String;

public class StringClassMethods {

	public static void main(String[] args) {

		String s1 = "Aniruddha M. Agrawal";
		System.out.println ( s1.toUpperCase () );
		System.out.println ( s1.toLowerCase () );
		System.out.println ( s1 );
		
		String s2 = "     Aniruddha M. Agrawal ";
		System.out.println ( s2 );
		System.out.println ( s2.trim () );
		System.out.println ( s2 );
		
		System.out.println ( s1.length () );
		System.out.println ( s2.length () );
		
		s2 = s2.trim ();
		System.out.println ( s2 );
		
		System.out.println ( s1.startsWith ( "An" ) );
		System.out.println ( s1.endsWith ( "An" ) );
		System.out.println ( s1.endsWith ( "al" ) );
		System.out.println ( s1.endsWith ( "l" ) );
		
		System.out.println ( s1.charAt ( 8 ) );
		
		String s3 = s1.intern ();
		System.out.println ( s3 );
		
		int a = 10;
		String s4 = String.valueOf ( a );
		System.out.println ( s4 + s4 );
		
		String s5 = "Kava is a programming language. Kava is a platform. Kava is an Island.";
		String replace = s5.replace ( "kava", "Java" ); // difference in 'k' and 'K'
		System.out.println ( replace );
		String replaceString = s5.replace ( "Kava", "Java" ); 
		System.out.println ( replaceString );

	}

}
