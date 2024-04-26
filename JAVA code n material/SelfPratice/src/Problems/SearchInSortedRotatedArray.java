package Problems;

public class SearchInSortedRotatedArray {
	
	static public int search ( int [] nums, int target ) {
        
        int index = -1;
        
        for ( int i = 0; i < nums.length; i ++ ) 
            if ( nums [ i ] == target ) {
            	
            	index = i;
            	break;
            	
            }
        
        return index;
        
    }

	public static void main(String[] args) {
		
		int nums [] = { 4,5,6,7,0,1,2 };
		
		System.out.println ( search ( nums, 0 ) );

	}

}
