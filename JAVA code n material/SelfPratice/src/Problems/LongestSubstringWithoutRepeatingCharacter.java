package Problems;

import java.util.Scanner;

public final class LongestSubstringWithoutRepeatingCharacter {
	
	static public int lengthOfLongestSubstring ( String s ) { 
		
		String substring [] = new String [ s.length () ];
		int length = 0;
		
		for ( int i = 0; i < s.length (); i++ ) {
			
			substring [ i ] = s.charAt ( i ) + "";
			
			loop :
			
			for ( int j = i + 1; j < s.length (); j++ ) {
				
				if ( s.charAt ( i ) == s.charAt ( j ) )
					break;
				
				substring [ i ] += s.charAt ( j ); 
				int temp = substring [ i ].length ();
				
				for ( int k = j - 1; k > i; k-- ) 
					
					if ( s.charAt ( j ) == s.charAt ( k ) ) {
						
						StringBuffer sb = new StringBuffer ( substring [ i ] );
						substring [ i ] = sb.substring ( 0, temp - 1 ).toString (); 
						break loop;
						
					}
				
				if ( j < s.length () - 1 ) 
					if ( s.charAt ( j ) == s.charAt ( j + 1 ) )
						break;
				
			}
			
		}
		
		for ( String str : substring ) {
			
			System.out.println ( str );
			if ( length < str.length () )
				length = str.length ();
			
		}
		
		return length;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in );
		System.out.print ( "Enter the String:- " );
		String s = sc.nextLine ();
		
		System.out.print ( "Length of Substring:- " + lengthOfLongestSubstring ( s ) );

	}

}
