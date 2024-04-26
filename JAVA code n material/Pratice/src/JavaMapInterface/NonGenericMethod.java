package JavaMapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NonGenericMethod {

	public static void main(String[] args) {
		
		Map map = new HashMap ();
		
		map.put ( 3264, "Aniruddha" );
		map.put ( 3267, "Rahul" );
		map.put ( 1312, "Santosh" );
		map.put ( 3266, "Lovejeet" );
		
		System.out.println ( map );
		
		System.out.println ( map.keySet () );
		System.out.println ( map.values () );
		
		System.out.println ( map.entrySet () );
		
		/*for ( Map.Entry m : map.entrySet () ) 
			System.out.println ( m.getKey () + " " + m.getValue () );*/
		
		Set set = map.entrySet ();
		System.out.println ( set );
		
		Iterator itr = set.iterator ();
		
		while ( itr.hasNext () ) 
			System.out.println ( itr.next () );
		
		itr = set.iterator ();
		
		while ( itr.hasNext () ) {
			
			Map.Entry entry = ( Map.Entry ) itr.next ();
			System.out.println ( entry.getKey () + " " + entry.getValue () );
			
		}

	}

}
