package JavaArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList5 {

	public static void main(String[] args) {
		
        ArrayList < String > al1 = new ArrayList < String > ();
		
		al1.add ( "Aniruddha M. Agrawal" );
		al1.add ( "Hritik Rajput" );
		al1.add ( "Kushagra Agrawal" );
		
		ArrayList < String > al2 = new ArrayList < String > ();
		
		al2.add ( "Aniruddha M. Agrawal" );
		al2.add ( "Muskan Gupta" );
		al2.add ( "Kriti Jaiswal" );
		al2.add ( "Rishipa Sharma" );
		al2.add ( "Ridhiama Guleria" );
		al2.add ( "Divya Sharma" );
		
		al1.removeAll ( al2 );
		al2.removeAll ( al1 );
		
		System.out.println ( "Iterating the elements after removing the elements of al2..." );  
		
		Iterator itr = al1.iterator ();
		
		while ( itr.hasNext () )
			System.out.println ( itr.next () );
		
		System.out.println();
		itr = al2.iterator ();
		
		while ( itr.hasNext () )
			System.out.println ( itr.next () );
		
	}

}
