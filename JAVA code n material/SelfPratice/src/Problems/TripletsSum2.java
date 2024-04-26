package Problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class TripletsSum2 {
	
	static List < List < Integer > > threeSum ( int [] nums ) {
		
		List < List < Integer > > list = new LinkedList < List < Integer > > ();
		
		HashMap < Integer, Boolean > map = new HashMap < Integer, Boolean > ();
		
		for ( int i = 0; i < nums.length; i ++ ) 
			map.put ( nums [ i ], true );
		
		System.out.println ( map );
		
		Set set = map.entrySet ();
		Iterator itr = set.iterator ();
		
		while ( itr.hasNext () ) {
			
			Entry e = ( Entry ) itr.next ();
			int x = ( int ) e.getKey ();
			
			Iterator itr1 = set.iterator ();
			
			while ( itr1.hasNext () ) {
				
				Entry e1 = ( Entry ) itr1.next ();
				int y = ( int ) e1.getKey ();
				int z = x + y  ;
				
				List < Integer > temp = new LinkedList < Integer > ();
				
				if ( map.containsKey ( -z ) && map.get ( -z ) == true ) {
					
					temp.add ( x );
					temp.add ( y );
					temp.add ( -z );
					list.add ( temp );
					map.put ( -z , false );
					map.put ( y, false );
					
				}
				
			}
			
		}
		
		return list;
		
	}

	public static void main(String[] args) {
		
		int nums [] = { 1,2,-2,-1 };
		
		System.out.println ( threeSum ( nums ) );

	}

}
