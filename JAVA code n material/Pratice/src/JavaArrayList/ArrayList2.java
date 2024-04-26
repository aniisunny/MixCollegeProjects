package JavaArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList < String > al = new ArrayList < String > ();
		al.add ( "Aniruddha M. Agrawal" );
		al.add ( "Lakshya M. Agrawal" );
		al.add ( "Shriya Agrawal" );
		//Traversing list through iterator  
		Iterator itr = al.iterator ();
		while ( itr.hasNext () )
			System.out.println ( itr.next () );
		
	}
	
}