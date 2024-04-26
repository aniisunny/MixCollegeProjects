package Problems;

import java.util.Scanner;

public class MissingNumber {
	
	static public int missingNumber(int[] nums) {
		
		int i, j, missingElement = 0;
		
		if ( nums [ 0 ] == 0 )
			missingElement = 1;
		
		for ( i=0; i<nums.length; i++ )
			for ( j = i + 1; j<nums.length; j++ )
				if ( nums [ i ] > nums [ j ] ) {
					
					nums [ i ] = nums [ i ] + nums [ j ]; 
					nums [ j ] = nums [ i ] - nums [ j ]; 
					nums [ i ] = nums [ i ] - nums [ j ]; 
					
				}
		
		for ( i = nums [ 0 ], j=0; j<nums.length; i ++, j ++ ) {
			
			if ( i != nums [ j ] ) {
				
				missingElement = i;
				break;
				
			}
			
			else if ( nums [ 0 ] == 1 ) 
				return missingElement;
			
			else if ( j == nums.length - 1 )
				missingElement = i + 1;
			
		}
		
		return missingElement;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print ( "Enter the size of the array:- " );
		int size = sc.nextInt ();
		int i;
		
		System.out.print ( "\nEnter the elements of array:- " );
		int nums [] = new int [size];
		for ( i=0; i<size; i++ )
			nums [ i ] = sc.nextInt ();

		System.out.print ( "Missing Number in an array :- " );
		System.out.println ( missingNumber ( nums ) );
		
	}

}
