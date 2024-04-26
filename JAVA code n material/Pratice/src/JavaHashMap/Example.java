package JavaHashMap;

import java.util.HashMap;

public class Example {

	public static void main(String[] args) {
		
		HashMap < Integer, String > hashMap = new HashMap < Integer, String > ();
		
		hashMap.put ( 3264, "Aniruddha" );
		hashMap.put ( 3267, "Rahul" );
		hashMap.put ( 1312, "Santosh" );
		hashMap.put ( 3266, "Lovejeet" );
		hashMap.put ( null, null );
		hashMap.put ( null, "xyz" );
		hashMap.put ( 3235, "Santosh" );
		
		System.out.println ( hashMap );
		
		hashMap.remove( 3235 );
		System.out.println( hashMap.remove ( null, null ) );
		System.out.println( hashMap.remove ( null, "xyz" ) );
		System.out.println ( hashMap );
		
		System.out.println ( hashMap.clone () );
		System.out.println ( hashMap.containsKey ( 3235 ) );
		System.out.println ( hashMap.containsValue ( "santosh" ) );

	}

}
