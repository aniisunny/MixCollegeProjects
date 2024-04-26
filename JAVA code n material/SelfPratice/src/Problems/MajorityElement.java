package Problems;

import java.util.Scanner;

public class MajorityElement {
	
	 static public int majorityElement(int[] nums) {
		 
		 int i, j, element = -1;
		 
		 for ( i=0; i<nums.length; i++ ) {
			 
			int temp = nums [ i ];
			int counter = 1;
			
			for ( j = i + 1; j<nums.length; j++ )
				if ( nums [ j ] == temp ) 
					counter ++;
			
			if ( counter > nums.length / 2 )		
				return temp;
			
		 }
		 
		 return element;
		 
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

	System.out.print ( "Majority element in an array :- " );
		System.out.print ( majorityElement ( nums ) );

	}

}
