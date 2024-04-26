package String;

public class StringBuilderMethods {

	public static void main(String[] args) {
		
		String s1 = new StringBuilder().append ( 50 ).append ( 20.98 ).append ( "\nHello" ).append ( "Java\n" ).
				append ( 'A' ).append ( 100 ).append ( true ).toString();  //anydatatypes are concate with string
		System.out.println ( s1 );
		System.out.println ();
		
		StringBuilder sb1 = new StringBuilder  ( "Hello" );
		sb1.insert ( 1, "Java" );
		System.out.println ( sb1.toString () );
		sb1.insert ( 3, true );  //anydatatypes are used for insert a old string at any position
		System.out.println ( sb1.toString () );
		System.out.println ();
		
		//  used only string data types and all stringbuffers have written the one line 
		StringBuilder  sb2 = new StringBuilder  ( "Hello" );
		sb2.replace ( 1, 3, "Java" );  
		System.out.println ( sb2.toString () );
		System.out.println ();
		
		StringBuilder  sb3 = new StringBuilder  ( "Hello" );
		sb3.delete ( 1, 3);  
		System.out.println ( sb3.toString () );
		System.out.println ();
		
		StringBuilder  sb4 = new StringBuilder  ( "Hello" );
		sb4.reverse ();  
		System.out.println ( sb4.toString () );
		System.out.println ();
		
		//capacity is always increase by ( old capacity * 2 ) + 2
		
		StringBuilder  sb5 = new StringBuilder  ();
		System.out.println ( sb5.capacity () );  //default 16
		sb5.append ( "Hello Java" );
		System.out.println ( sb5.capacity () );  // hello java total takers only 10 less than is 16
		sb5.append ("Java is one of the my favorite language" ); // total now is 49 and output shows used capacity size
		System.out.println ( sb5.capacity () );
		System.out.println ();
		
		StringBuilder  sb6 = new StringBuilder  ();
		System.out.println ( sb6.capacity () ); //default 16
		sb6.append ( "Hell0" );
		System.out.println ( sb6.capacity () );  // hello java total takers only 10 less than is 16
		sb6.append ("Java is my favorite language" ); 
		System.out.println ( sb6.capacity () );
		sb6.ensureCapacity ( 10 );  // now no change under capacity 
		System.out.println ( sb6.capacity () );
		sb6.ensureCapacity ( 50 );  // now ( 34 * 2 ) + 2
		System.out.println ( sb6.capacity () );  // now 70
		System.out.println ();
		
		String s2 = new StringBuilder ( "Aniruddha Agrawal" ).substring ( 10 ).toString ();
		System.out.println ( s2 );
		String s3 = new StringBuilder ( "Aniruddha Agrawal" ).substring ( 0, 3 ).toString ();
		System.out.println ( s3 );
		String s4 = new StringBuilder ( "Aniruddha Agrawal" ).substring ( 1, 8 ).toString ();
		System.out.println ( s4 );
		
	}

}
