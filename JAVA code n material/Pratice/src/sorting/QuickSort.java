package sorting;

import java.util.Scanner;

public class QuickSort {
	
	/*static void quickSort ( int [] arr ) {
		
		 
		
	}*/
	
	static void partition ( int [] arr ) {
		 
		int i = -1, j, pivot = arr [ arr.length - 1 ];
		System.out.println(pivot);
		for ( j = 0; j < arr.length - 1; j++ ) {
			
			if ( arr [ j ] < pivot ) {
				
				i ++;
				
				if ( i != j ) {
					
					arr [ i ] = arr [ i ] + arr [ j ];
					arr [ j ] = arr [ i ] - arr [ j ];
					arr [ i ] = arr [ i ] - arr [ j ];
					
				}
				
			}
			
		}
		
		arr [ i + 1 ] = arr [ i + 1 ] + pivot;
		arr [ arr.length - 1 ] = arr [ i + 1 ] - pivot;
		arr [ i + 1 ] = arr [ i + 1 ] - arr [ arr.length - 1 ];
		
		for ( int var : arr ) 
			System.out.print ( var + " " ); 
		
		System.out.println();
		int left [] = new int [ i + 1 ];
		int right [] = new int [ arr.length - ( i + 2 ) ];
		
		for ( j = 0; j <= i; j++ )
			left [ j ] = arr [ j ];
		
		for ( j = 0; j < right.length; j++ ) {
			
			right [ j ] = arr [ i + 2 ];
			//System.out.print(right[j] + " ");
			i++;
			
		}
		
		if ( left.length != 0 )
			partition ( left );
		
		if ( right.length != 0 )
			partition ( right );
		
	}

	public static void main(String[] args) {
		
		/*Scanner scan = new Scanner ( System.in );
		System.out.print ( "Enter the size of array :- " );
		int n = scan.nextInt ();
		int arr [] = new int [ n ];
		System.out.print ( "\nEnter the elements of array :- " );
		
		for ( int i = 0; i < n; i++ ) {
			arr [ i ] = scan.nextInt ();
			System.out.print(" ");
		}*/
		
		int arr [] = { 30, 11, 15, 25, 19, 5, 21, 32, 28, 27, 26 };
		//int arr [] = { 10, 80, 30, 90, 70, 50, 70 };
		
		partition ( arr );
		
	}

}
