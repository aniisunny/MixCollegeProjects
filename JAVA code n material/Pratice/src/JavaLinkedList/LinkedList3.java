package JavaLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList3 {
		
	public static void main(String[] args) {
		
		LinkedList < String > linkedList = new LinkedList < String > ();
		
		//many methods 
		linkedList.addFirst ( "Aniruddha M. Agrawal" );
		linkedList.add ( "Kushagra Agrawal" );
		linkedList.add ( "Muskan Gupta" );
		linkedList.add ( "Kriti Jaiswal" );
		linkedList.addLast ( "Muskan Gupta" );
		
		System.out.println ( linkedList );
		
		linkedList.add ( 1, "Srishti Lavania" );
		
		System.out.println ( linkedList );
		System.out.println ( linkedList.contains ( "Muskan " ) );
		System.out.println ( linkedList.contains ( "Muskan Gupta" ) );
		System.out.println ( linkedList.size () );
		
		linkedList.remove ( "Muskan Gupta");
		linkedList.add ( "Kushagra Agrawal" );
		linkedList.add ( 4, "Srishti Lavania" );
		linkedList.add ( "Ridhiama Guleria" );
		
		System.out.println ( linkedList );
		System.out.println ( linkedList.size () );
		System.out.println ( linkedList.getFirst () );
		System.out.println ( linkedList.getLast () );
		System.out.println ( linkedList.indexOf ( "Srishti Lavania") );
		System.out.println ( linkedList.lastIndexOf ( "Srishti Lavania" ) );
		System.out.println ( linkedList.indexOf ( "Srishti") );
		System.out.println ( linkedList.lastIndexOf ( "Srishti" ) );
		
	}

}