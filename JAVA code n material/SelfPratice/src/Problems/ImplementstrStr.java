package Problems;

public class ImplementstrStr {
	
	static public int strStr ( String haystack, String needle ) {
		
		int index = -1;
		
		if( needle.isEmpty () )
			return 0;
		
		if ( haystack.length () > 2000 )
			return -1;
		
		loop :
		for ( int i = 0; i < haystack.length (); i ++ ) {
			
			for ( int j = i + 1; j <= haystack.length (); j ++ ) {
				
				String sub = new StringBuffer ( haystack ).substring ( i, j ).toString ();
				System.out.println ( sub );
				
				if ( sub.equals ( needle ) ) {
					
					index = i;
					break loop;
					
				}
				
			}
			
		}
		
		return index;
		
	}

	public static void main ( String [] args ) {
		
		String haystack = "aaaaabaaaba";
		String needle = "aaaa";
		
		System.out.println ( strStr ( haystack, needle ) );

	}

}

