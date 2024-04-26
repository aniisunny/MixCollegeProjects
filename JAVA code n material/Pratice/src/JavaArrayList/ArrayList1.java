package JavaArrayList;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList < String > al = new ArrayList < String > ();
		al.add ( "Aniruudha M. Agrawal" );
		al.add ( "Srishti Lavania" );
		al.add ( "Deeksha Mathur" );
		//Traversing list through for-each loop 
		for ( String str : al )
			System.out.println ( str );
		
	}
	
}