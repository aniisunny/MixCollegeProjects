package Problems;

import java.util.Scanner;

public class RemoveElement {
	
	static public int removeElement(int[] nums, int val) {
		
		int i, j, counter = 0;
		
		for ( i=0; i<nums.length; i++ )
			if ( nums[ i ] == val ) {
				
				counter ++;
				
				for ( j = i; j>0; j-- ) {
					
					nums [ j - 1 ] = nums [ j - 1 ] + nums [ j ];
					nums [ j ] = nums [ j - 1 ] - nums [ j ];
					nums [ j - 1 ] = nums [ j - 1 ] - nums [ j ];
					
				}
				
			}
		
		i = 0;
		while ( i != counter ) {
			
			for ( j=1; j<nums.length; j++ ) 
				nums [ j - 1 ] = nums [ j ];
			
			nums [ nums.length - 1 ] =0;	
			i ++;
			
		}
		
		return nums.length - counter ;
		
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
		
		System.out.print ( "Enter the Number which want to be deleted:- " );
		int val = sc.nextInt ();
		
		int length = removeElement ( nums, val );
		
		System.out.print ( "\nNew Array after deleted your number :- " );
		for ( i = 0; i<length; i++ )
			System.out.print ( nums [ i ] + " " );

	}

}
