package Problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class TwoSumZero {
	
	static public List < List < Integer > > twoSumZero ( int [] nums ) {
		
		List < List < Integer > > list = new LinkedList < List < Integer > > ();
		
		HashMap < Integer, Boolean > map = new HashMap < Integer, Boolean > ();
		
		for ( int i = 0; i < nums.length; i ++ ) {
			
			map.put ( nums [ i ], true );
			
		}
		
		System.out.println(map);
		
		Set set = map.entrySet ();
		Iterator itr = set.iterator ();
		
		while ( itr.hasNext () ) {
			
			Entry e = ( Entry ) itr.next ();
			int key = ( int ) e.getKey ();
			
			List < Integer > temp = new LinkedList < Integer > ();
			
			if ( map.containsKey ( -key ) && map.get ( key ) == true ) {
				
				temp.add ( key );
				temp.add ( -key );
				list.add ( temp );
				map.put ( -key, false );
				
				
			}
			
		}
		
		return list;
		
	}

	public static void main(String[] args) {
		
		int nums [] = { 9, 1, 5, -1, 2, 3, 8, -5 };
		
		System.out.println ( twoSumZero ( nums ) );

	}

}
