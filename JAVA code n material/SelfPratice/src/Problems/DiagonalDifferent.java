package Problems;

import java.util.Scanner;

public class DiagonalDifferent {
	
	static int diagonalDifference ( int [][] nums ) {
		
		int i, j, temp1 = 0, temp2 = 0;
		
		for ( i=0; i<nums.length; i++ )
			for ( j=0; j<nums.length; j++ ) {
				
				if ( i == j ) 
					temp1 += nums [ i ] [ j ];
				
				if ( i + j == nums.length - 1 )
					temp2 += nums [ i ] [ j ];
				
			}
		
		return ( Math.abs ( temp1 - temp2 ) );
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in );
		System.out.print ( "Enter the size of 2-D Matrix :- " );
		int size = sc.nextInt ();
		int nums [][] = new int [ size ][ size ];
		
		System.out.println ( "Enter the elements of array :- " );
		
		for ( int i=0; i<size; i++ )
			for ( int j=0; j<size; j++ )
				nums [ i ] [ j ] = sc.nextInt ();
		
		System.out.print ( "\nThe difference of diagonals in 2-D matrix :- " );
		System.out.print ( diagonalDifference ( nums ) );

	}

}
