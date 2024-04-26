package Problems;

import java.util.Scanner;

public class RotateArray {
	
 static public void rotate (int[] nums, int k) {
 
	
	int i = 0, j;
	while ( i != k ) {
		
		int temp = nums [ nums.length - 1 ];
		for ( j=nums.length - 1; j>0; j-- )
			nums[ j ] = nums [ j-1 ];
		nums [ 0 ] = temp;
		i++;
		
	}
	
	System.out.print ( "\nRotate Array is :- " );
	for ( i=0; i<nums.length; i++ )
		System.out.print ( nums [ i ] + " " );
        
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
		
		System.out.print ( "Enter the Number of rotate:- " );
		int k = sc.nextInt ();
		
		rotate ( nums, k );

	}

}
