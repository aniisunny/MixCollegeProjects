package Problems;

import java.util.Arrays;
import java.util.HashSet;

public class ThreeSumClosest {
	
	 /*public static int threeSumClosest ( int [] nums, int target ) {
		 
		 int i, j, k, m = 0;
		 int [] closest = new int [ 500 ];
			
		for ( i = 0; i < nums.length - 2; i ++ ) {
				
			for ( j = i + 1; j < nums.length - 1; j ++ ) {
					
				for ( k = j + 1; k < nums.length; k ++ ) {
						
					closest [ m ] = nums [ i ] + nums [ j ] + nums [ k ];
					m ++;
						
				}
					
			}
				
		}
		
		for ( int var : closest )
			System.out.print ( var + " " );
		
		System.out.println ();
		
		int close = closest [ 0 ] - target;
		int pos = 0;
		
		if ( close < 0 )
			close = - close;
		
		for ( i = 1; i < m; i ++ ) {
			
			if ( closest [ i ] - target < 0 ) {
				
				if ( - ( closest [ i ] - target ) < close ) {
					
					close = - ( closest [ i ] - target );
					pos = i;
					
				}
				
			}
			
			else {
				
				if ( closest [ i ] - target < close ) {
					
					close = closest [ i ] - target ;
					pos = i;
					
				}
				
			}
			
		}
		 
		 return closest [ pos ];
	        
	 }*/
	
	public static int threeSumClosest ( int [] nums, int target ) {
		 
		 int i, j, k, var = 0;
		 
		 Arrays.sort ( nums );
		
		 HashSet < Integer > set = new HashSet < Integer > ();
		 
		 for ( i = 0; i < nums.length - 2; i ++ ) {
				
			 for ( j = i + 1; j < nums.length - 1; j ++ ) {
				 
				 for ( k = j + 1; k < nums.length; k ++ ) {
					
					 set.add ( nums [ i ] + nums [ j ] + nums [ k ] );
					
				}
					
			}
				
		}
		
		while ( true ) {
			
			if ( set.contains ( target - var ) ) 
				return target - var;
			
			else if ( set.contains ( target + var ) ) 
				return target + var;
			
			var ++;
			
		}
	        
	 }

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		/*Scanner scan = new Scanner ( System.in );
		
		System.out.print ( "Enter the number of elements :- " );
		int n = scan.nextInt ();
		
		System.out.print ( "Enter the elements of array :- " );
		int nums [] = new int [ n ];
		
		for ( int i = 0; i < n; i++ ) 
			nums [ i ] =scan.nextInt ();
			
		System.out.print ( " Enter the Target :- " );
		int target = scan.nextInt ();*/
		
		int nums [] = new int [] { 43,75,-90,47,-49,72,17,-31,-68,-22,-21,-30,65,88,
				-75,23,97,-61,53,87,-3,33,20,51,-79,43,80,-9,34,-89,-7,93,43,55,-94,
				29,-32,-49,25,72,-6,35,53,63,6,-62,-96,-83,-73,66,-11,96,-90,-27,78,
				-51,79,35,-63,85,-82,-15,100,-82,1,-4,-41,-21,11,12,12,72,-82,-22,37,
				47,-18,61,60,55,22,-6,26,-60,-42,-92,68,45,-1,-26,5,-56,-1,73,92,-55,
				-20,-43,-56,-15,7,52,35,-90,63,41,-55,-58,46,-84,-92,17,-66,-23,96,-19,
				-44,77,67,-47,-48,99,51,-25,19,0,-13,-88,-10,-67,14,7,89,-69,-83,86,
				-70,-66,-38,-50,66,0,-67,-91,-65,83,42,70,-6,52,-21,-86,-87,-44,8,49,
				-76,86,-3,87,-32,81,-58,37,-55,19,-26,66,-89,-70,-69,37,0,19,-65,38,7,3,
				1,-96,96,-65,-52,66,5,-3,-87,-16,-96,57,-74,91,46,-79,0,-69,55,49,-96,
				80,83,73,56,22,58,-44,-40,-45,95,99,-97,-22,-33,-92,-51,62,20,70,90 };
		
		System.out.println(nums.length);
		
		System.out.println ( threeSumClosest ( nums, 284 ) );

	}

}
