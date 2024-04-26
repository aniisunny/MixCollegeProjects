package Problems;

import java.util.Scanner;

public class SearchInsertPosition {
	
public int searchInsert ( int[] nums, int target ) {
	
	int i, index = 0;
	
	for ( i=0; i<nums.length; i++ ) {
		
		if ( nums [ i ] == target ) {
			
			index = i;
			break;
		}
		
		else if ( target < nums [ i ] ) {
			
			index = i;
			break;
			
		}
		
		else if ( target > nums [ nums.length - 1 ] )
			index = i+1;
		
	}
	
	return index;
	
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
		
		System.out.print ( "Enter the target:- " );
		int target = sc.nextInt ();
		
		SearchInsertPosition searchInsertPosition = new SearchInsertPosition ();
		System.out.print ( "\nSearch insert position:- " + searchInsertPosition.searchInsert ( nums, target ) );

	}

}
