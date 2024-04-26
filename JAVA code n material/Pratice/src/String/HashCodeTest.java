package String;

public class HashCodeTest {

	public static void main(String[] args) {

		System.out.println ( "HashCode Test for String :- " );
		String s = "Java";
		System.out.println ( s.hashCode () );
		s = s + "Tpoint";
		System.out.println ( s.hashCode () );
		
		// StringBuffer holds same hashcode but string holds different hashcode
		System.out.println ( "\nHashCode Test for StringBuffer :- " );
		StringBuffer sb = new StringBuffer ( "Java" );
		System.out.println ( sb.hashCode () );
		sb.append ( "Tpoint" );
		System.out.println ( sb.hashCode () );
		

	}

}
