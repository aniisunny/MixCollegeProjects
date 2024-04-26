package Problems;

public class ValidSudoku {
	
	static public boolean isValidSudoku(char[][] board) {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board.length; j++) {
				if(board[i][j] != '.') {
					Boolean rowFlag = isRow(board, i, j);
					Boolean columnFlag = isColumn(board, i, j);
					Boolean matrixFlag = isSubGrid(board, i, j);
					if(rowFlag == true || columnFlag == true || matrixFlag == true)
						return false;
				}
			}
		}
		return true;
	}
	
	static private boolean isRow(char[][] board, int i, int j) {
		for(int k = 0; k < board.length; k++) {
			if(k != j && board[i][k] == board[i][j])
				return true;
		}
		return false;
	}
	
	static private boolean isColumn(char[][] board, int i, int j) {
		for(int k = 0; k < board.length; k++) {
			if(k != i && board[k][j] == board[i][j])
				return true;
		}
		return false;
	}
	
	static private boolean isSubGrid(char[][] board, int i, int j) {
		int subGridSize = (int) Math.sqrt(board.length);
		int topLeftOfSubGridRow = i / subGridSize * subGridSize;
		int topLeftOfSubGridCol = j / subGridSize * subGridSize;
		
		for(int p = 0; p < subGridSize; p++) {
			for(int q = 0; q < subGridSize; q++) {
				if(p + topLeftOfSubGridRow != i && q + topLeftOfSubGridCol != j && board[i][j] == board[p + topLeftOfSubGridRow][q + topLeftOfSubGridCol])
					return true;
			}
		}
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
		System.out.println(isValidSudoku(board));

	}

}
