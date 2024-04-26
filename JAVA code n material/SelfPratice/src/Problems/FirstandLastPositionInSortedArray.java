package Problems;

public class FirstandLastPositionInSortedArray {
	
	static public int [] searchRange ( int [] nums, int target ) {
		
		int [] position = { -1, -1 };
		int k = 0, i;
		
		for ( i = 0; i < nums.length; i ++ ) {
			
			if ( nums [ i ] == target ) {
				
				position [ k ] = i;
				k ++;
				break;
				
			}
			
		}
		
		for ( int j = nums.length - 1; j >= i; j -- ) {
			
			if ( nums [ j ] == target ) {
				
				position [ k ] = j;
				break;
				
			}
			
		}
		
		return position;
		
	}

	public static void main(String[] args) {
		
		int nums [] = { 1, 4 };
		
		int [] position = searchRange ( nums, 4 );
		
		for ( int var : position )
			System.out.print ( var + " " );

	}

}
