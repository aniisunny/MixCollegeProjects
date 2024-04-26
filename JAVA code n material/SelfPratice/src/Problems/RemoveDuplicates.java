package Problems;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicates {
	
	static public int removeDuplicates ( int [] nums ) {
		
		HashSet <Integer > unique = new HashSet < Integer > ();
		for ( int i = 0; i < nums.length; i ++ )
			unique.add ( nums [ i ] );
		
		Iterator < Integer > itr = unique.iterator ();
		
		int i = 0;
		
		while ( itr.hasNext () ) {
			
			nums [ i ] = ( int ) itr.next ();
			i ++;
			
		}
		
		for ( i = 0; i < unique.size (); i ++ ) 
			
			for ( int j = i + 1; j < unique.size (); j ++ )
				
				if ( nums [ i ] > nums [ j ] ) {
					
					int t = nums [ i ];
					nums [ i ] = nums [ j ];
					nums [ j ] = t;
					
				}
		
		return unique.size ();
		
	}

	public static void main(String[] args) {
		
		int nums [] = { -3, -1, 0, 0, 0, 3, 3 };
		
		int length = removeDuplicates ( nums );
		
		for ( int i = 0; i < length; i ++ ) 
			System.out.print ( nums [ i ] + " " );

	}

}
