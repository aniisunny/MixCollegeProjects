package Problems;

import java.util.Scanner;

public class MedianofTwoSortedArrays {
	
	static public double findMedianSortedArrays ( int [] nums1, int [] nums2 ) {
		
		int arr [] = new int [ nums1.length + nums2.length ];
		int i = 0, j = 0, k = 0;
		double median = 0;
		
		while ( i<nums1.length && j<nums2.length ) {
			
			if ( nums1 [ i ] > nums2 [ j ] ) {
				
				arr [ k ] = nums2 [ j ];
				j++;
				
			}
			
			else {
				
				arr [ k ] = nums1 [ i ];
				i++;
				
			}
			
			k++;
			
		}
		
		while ( i<nums1.length ) {
			
			arr [ k ] = nums1 [ i ];
			i++;
			k++;
			
		}
		
		while ( j<nums2.length ) {
			
			arr [ k ] = nums2 [ j ];
			j++;
			k++;
			
		}
		
		if ( arr.length % 2 == 0 ) 
			median = ( arr [ ( arr.length / 2 ) - 1 ] + arr [ arr.length / 2 ] ) / 2.0;
		else 
			median = arr [ arr.length / 2 ];
		
		return median;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in );
		int i;
		System.out.print ( "Enter the size of array 1 :- " );
		int size1 = sc.nextInt ();
		int nums1 [] = new int [ size1 ];
		
		System.out.print ( "Enter the elements of array 1 :- " );
		for ( i=0; i<size1; i++ )
			nums1 [ i ] = sc.nextInt ();
		
		System.out.print ( "\nEnter the size of array 2 :- " );
		int size2 = sc.nextInt ();
		int nums2 [] = new int [ size2 ];
		
		System.out.print ( "Enter the elements of array 2 :- " );
		for ( i=0; i<size2; i++ )
			nums2 [ i ] = sc.nextInt ();
		
		System.out.print ( "\nThe median of two sorted arrays :- " );
		System.out.print ( findMedianSortedArrays ( nums1, nums2 ) );
		
	}

}
