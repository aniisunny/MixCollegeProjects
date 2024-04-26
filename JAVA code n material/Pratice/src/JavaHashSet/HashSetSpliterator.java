package JavaHashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Spliterator;

public class HashSetSpliterator {

	public static void main(String[] args) {
		
		HashSet < String > set = new HashSet < String > ();
		
		set.add ( "Aniruddha" );
		set.add ( "Deepak" );
		set.add ( "Santosh" );
		set.add ( "Lovejeet" );
		
		Spliterator < String > spl = set.spliterator ();
		
		spl.forEachRemaining ( System.out::println );
		System.out.println ();
		
		ArrayList < String > al = new ArrayList < String > ();
		
		al.add ( "Aniruddha" );
		al.add ( "Deepak" );
		al.add ( "Santosh" );
		al.add ( "Lovejeet" );
		
		Spliterator < String > spl1 = set.spliterator ();
		
		spl1.forEachRemaining ( System.out::println );
		System.out.println ();
		
		HashSet < Integer > set1 = new HashSet < Integer > ();
		
		set1.add ( 3264 );
		set1.add ( 1053 );
		set1.add ( 1312 );
		set1.add ( 3266 );
		
		//int s = set1.spliterator ();
		
		//System.out.println ("Spliterator of HashSet is :- " + s );
		
		List < String > list = Arrays.asList ( "Apple", "Banana", "Orange", "Graps" );
		
		Spliterator < String > spl2 = list.spliterator ();
		
		spl2.tryAdvance ( System.out::println );
		
		System.out.println("--Bulk List traversal---"); 
		spl2.forEachRemaining ( System.out::println );
		
		System.out.println(" --Attempting tryAdvance again---");
		boolean b = spl2.tryAdvance ( System.out::println );
		System.out.println ( "Element exists : " + b );

	}

}
