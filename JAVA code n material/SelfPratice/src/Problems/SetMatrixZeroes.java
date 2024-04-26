package Problems;

import java.util.HashMap;

public class SetMatrixZeroes {
	
	static private class ZeroesIndex {
	    int row;
	    int col;
	    
	    public ZeroesIndex(int i, int j) {
	    	row = i;
	    	col = j;
	    }
	}
	
    static public void setZeroes(int[][] matrix) {
    	HashMap<ZeroesIndex, Integer> map = new HashMap<ZeroesIndex, Integer>();
    	
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
            	ZeroesIndex index = new ZeroesIndex(i, j);
            	if(map.containsKey(index)) {
            		
            	}
            	else {
            		
            	}
                if(matrix[i][j] == 0) {
                    
                    
                    for(int k = 0; k < matrix.length; k++) {
                		matrix[i][index.col] = 0;
                	}
                	for(int k = 0; k < matrix[0].length; k++) {
                		matrix[index.row][j] = 0;
                	}
                }
            }
        }
        
        for(int[] arr : matrix) {
        	for(int var : arr)
        		System.out.print(var + " ");
        	System.out.println();
        }
    }

	public static void main(String[] args) {
		
		int[][] matrix = {
		                  {0,1,2,0},
		                  {3,4,5,2},
		                  {1,3,1,5}
		};
		
		setZeroes(matrix);
	}

}
