package Problems;

public class SolveSudoku {
	
	 static public void solveSudoku(char[][] board) {
	        solve(board);
	        for(int row = 0; row < board.length; row++) {
	        	for(int col = 0; col < board.length; col++) 
	        		System.out.print(board[row][col] + " ");
	        	System.out.println();
	        }
	    }
	    
	    static private boolean solve(char[][] board) {
	        for(int row = 0; row < board.length; row++) 
	            for(int col = 0; col < board.length; col++) 
	                if(board[row][col] == '.') {
	                    for(int number = 1; number <= board.length; number++) {
	                        if(isValid(board, row, col, number)) {
	                            board[row][col] = (char) number;
	                            if(solve(board)) 
	                                return true;
	                            else
	                                board[row][col] = '.';
	                        }
	                    }
	                    return false;
	                }
	        return true;
	    }
	    
	    static private boolean isValid(char[][] board, int row, int col, int number) {
	        return !isRow(board, row, number) && !isCol(board, col, number) && !isGridBox(board, row, col, number);
	    }
	    
	    static private boolean isRow(char[][] board, int row, int number) {
	        for(int i = 0; i < board.length; i++) 
	            if(board[row][i] == (char) number)
	                return true;
	        return false;
	    }
	    
	    static private boolean isCol(char[][] board, int col, int number) {
	        for(int i = 0; i < board.length; i++) 
	            if(board[i][col] == (char) number)
	                return true;
	        return false;
	    }
	    
	    static private boolean isGridBox(char[][] board, int row, int col, int number) {
	        int r = row - row % 3;
	        int c = col - col % 3;
	        for(int i = 0; i < r + 3; i++) 
	            for(int j = c; j < c + 3; c++) 
	                if(board[i][j] == (char) number)
	                    return true;
	        return false;
	    }

	public static void main(String[] args) {
		
		char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'}, 
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, 
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, 
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, 
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, 
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, 
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, 
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, 
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
              };
		solveSudoku(board);

	}

}
