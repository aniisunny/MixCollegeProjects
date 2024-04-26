package Problems;

import java.util.Scanner;

public class ContainerWithMostWater {
	
	static public int maxArea ( int [] height ) {
		
		int maxArea = 0;
		
		for ( int i = 0; i < height.length; i ++ )
			
			for ( int j = i + 1; j < height.length; j ++ ) {
				
				if ( height [ i ] <= height [ j ] ) {
					
					if ( height [ i ] * ( j - i ) > maxArea ) 
						
						maxArea = height [ i ] * ( j - i );
					
				}
				
				else {
					
					if ( height [ j ] * ( j - i ) > maxArea ) 
						
						maxArea = height [ j ] * ( j - i );
				
				}
				
			}
			
		
		return maxArea;
		
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner ( System.in );
		
		System.out.print ( "Enter the number of elements :- " );
		int n = scan.nextInt ();
		
		System.out.print ( "Enter the elements of array :- " );
		int height [] = new int [ n ];
		
		for ( int i = 0; i < n; i++ ) 
			height [ i ] =scan.nextInt ();
		
		//int height [] = new int [] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		
		System.out.println ( maxArea ( height ) );

	}

}
