package JavaLinkedList;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedList1 {

	public static void main(String[] args) {
		
		//creating linked list
		LinkedList < String > linkedList = new LinkedList < String > ();
		
		//add data in linked list
		linkedList.add ( "Aniruddha M. Agrawal" );
		linkedList.add ( "Srishti Lavania" );
		linkedList.add ( "Deeksha Mathur" );
		
		//traversing the data in list
		Iterator itr = linkedList.iterator ();
		
		while ( itr.hasNext () )
			System.out.println ( itr.next () );

	}

}
