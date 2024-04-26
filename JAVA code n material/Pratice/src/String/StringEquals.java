package String;

import java.util.ArrayList;

public class StringEquals {

	public static void main(String[] args) {
		
		String str = "Aniruddha M. Agrawal";
		
		ArrayList < String > list = new ArrayList < String > ();
		
		list.add ( "Kriti Jaiswal" );
		list.add ( "Divya Sharma" );
		list.add ( "Aniruddha M. Agrawal" );
		list.add ( "Ridhiama Guleria" );
		
		for ( String s : list ) 
			
			if ( s.equals ( str ) )
				
				System.out.println ( str + " is present in a list" );

	}

}
