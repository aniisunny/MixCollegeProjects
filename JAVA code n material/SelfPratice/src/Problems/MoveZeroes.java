package Problems;

import java.util.Scanner;

public class MoveZeroes {
	
	static public void moveZeroes ( int [] nums ) {
		
		for(int i=0; i<nums.length; i++) 
			
			for ( int j=i+1; j<nums.length; j++ ) {
				
				if ( nums [ i ] == 0 ) {
					
					nums [ i ] = nums [ i ] + nums [ j ];
					nums [ j ] = nums [ i ] - nums [ j ];
					nums [ i ] = nums [ i ] - nums [ j ];
					
				}
				
				else 
					break;
				
			}
	
		System.out.print ("\nMove all zeroes:- " );
		for ( int var : nums )
				System.out.print ( var + "\n" );
		
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.print ( "Enter the size of the array:- " );
		int size = sc.nextInt ();
		int i;
		
		System.out.print ( "\nEnter the elements of array:- " );
		int nums [] = new int [ size ];
		
		for ( i=0; i<size; i++ )
			nums [ i ] = sc.nextInt ();
		
		moveZeroes ( nums );

	}

}
