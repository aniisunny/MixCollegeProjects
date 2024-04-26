package String;

public class StringFormat1 {

	public static void main(String[] args) {
		
		String name = "Aniruddha M. Agrawal";
		
		String sf1 = String.format ( "Name is %s" , name );
		String sf2 = String.format ( "Value is %a" , 32.33434 ); //return hex output of floating point number
		String sf3 = String.format ( "Value is %20.12f" , 32.33434 );
		
		System.out.println ( sf1 );
		System.out.println ( sf2 );
		System.out.println ( sf3 );
		System.out.println ( String.format ( "Value is %e" , 32.33434 ) ); //in scientic notation
		System.out.println ( String.format ( "Value is %f" , 32.33434 ) );
		System.out.println ( String.format("%x", 101) ); // hexadeimal value
		System.out.println ( String.format("|%10d|", 101) ); //specify the length of integer
		System.out.println ( String.format("|%-10d|", 101) ); //left justification within the specified width
		System.out.println ( String.format("|%010d|", 101) ); //filling with zero
		System.out.println ( String.format("|%d|", 101) );
		//System.out.println ( String.format("|%-010d|", 101) ); //IllegalFormatFlagsException

	}

}
