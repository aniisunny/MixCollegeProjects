package Problems;

import java.util.Scanner;
import java.util.ArrayList;

public class ZigZagConversion {
	
	static public String convert ( String s, int numRows ) {
		
		int numCols = 0;
		
		if ( numRows == 1 )
			return s;
		
		else if ( numRows <= s.length () / 2 )
			numCols = s.length () / 2 + 1;
		
		else if ( numRows > s.length () / 2 && numRows <= s.length () )
			numCols = s.length () - numRows + 1;
		
		else 
			return s;
			
		char arr [] [] = new char [ numCols ] [ numRows ];
		int m = 0, i, j, k;
		String str = "";
		
		
		loop :
		for ( i = 0; i < numCols; i++ )
			for ( j = 0; j < numRows; j++ ) {
				
				 if ( m == s.length () )
					 break loop;
				 
				arr [ i ] [ j ] = s.charAt ( m );
				m++;
				
				 if ( j == numRows - 1 ) 
					
					for ( k = numRows - 2; k > 0; k-- ) 
						
						if ( m < s.length () ) {
							
							i++;
							arr [ i ] [ k ] = s.charAt ( m );
							m++;
							
						}
				
			}
		
		System.out.println ();
		for ( char w [] : arr ) {
			for ( char t : w )
				System.out.print ( t + " " );
			System.out.println ();
		}
		
		System.out.println ();
		for ( i = 0; i < numRows ; i++ ) {
			
			for ( j = 0 ; j < numCols; j++ ) {

				if ( ( int ) arr [ j ] [ i ] != 0 )  //for whitespace int value is 0 for this questions
					str += arr [ j ] [ i ]; 
				
			}
			
		}
		
		return str;
		
	}

	public static void main ( String[] args ) {
		
		Scanner sc = new Scanner ( System.in );
		System.out.print ( "Enter the String :- " );
		String s = sc.next ();
		System.out.print ( "Enter the number of rows :- " );
		int numRows = sc.nextInt ();
		
		System.out.print ( "\nNew String obtain after ZigZag Conversion :- " );
		System.out.println ( convert ( s, numRows ) );

	}

}
