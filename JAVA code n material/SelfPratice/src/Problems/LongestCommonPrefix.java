package Problems;

import java.util.Scanner;

public class LongestCommonPrefix {
	
	static String longestCommonPrefix ( String strs [] ) {
		
		String temp = "";
		
		if ( strs.length == 0 )
			return temp;
		
		String common = strs [ 0 ];
		int length = strs [ 0 ].length ();
		
		if ( common.isEmpty () )
			return common;
		
		
		for ( int i = 1; i < strs.length; i++ ) {
			
			temp = "";
			
			for ( int j = 0; j < strs [ i ].length (); j++ ) {
				
				
				if ( common.charAt ( j ) == strs [ i ].charAt ( j ) ) {
					
					temp += strs [ i ].charAt ( j );
					
					
					if ( common.length () == temp.length () ) 
						break;
					
				}
				
				else 
					break;
				
			}
			
			if ( temp.isEmpty () ) 
				return temp;
			
			else {
				
				common = temp;
				length = common.length ();
				
			}
			
		}
		
		return common;
		
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner ( System.in );
		
		System.out.print ( "Enter the total number of string :- " );
		int num = scan.nextInt ();
		
		String strs [] = new String [ num ];
		
		System.out.println ( "Enter the String :- " );
		
		for ( int i = 0; i < num; i++ )
			
			strs [ i ] = scan.next ();
		
		System.out.println ( "Longest Common Prefix :- " + longestCommonPrefix ( strs ) );

	}

}
