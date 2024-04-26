package ParasBhai;

import java.util.Scanner;

public class Question2 {
	
	static public int minimumHour(int rows, int columns, int[][] grid) {
		
		int[][] helperGrid = new int[rows][columns];
		int minHour = 0;
		boolean terminateFlag = true;
		
		while(terminateFlag) {
			for(int i = 0; i < rows; i++) {
				for(int j = 0; j < columns; j++) {
					if(grid[i][j] == 0) {
						if(j != columns - 1 && grid[i][j + 1] == 1) helperGrid[i][j] = 1;
						else if(i != rows - 1 && grid[i + 1][j] == 1) helperGrid[i][j] = 1;
						else if(i != 0 && grid[i - 1][j] == 1) helperGrid[i][j] = 1;
						else if(j != 0 && grid[i][j - 1] == 1) helperGrid[i][j] = 1;
						else helperGrid[i][j] = 0;
					}
					else helperGrid[i][j] = 1;
				}
			}
			minHour++;
			boolean flag = false;
			loop:
			for(int m = 0; m < rows; m++) {
				for(int n = 0; n < columns; n++) {
					if(helperGrid[m][n] == 0) {
						flag = true;
						break loop;
					}
				}
			}
			if(flag == true) {
				for(int m = 0; m < rows; m++) {
					for(int n = 0; n < rows; n++) {
						grid[m][n] = helperGrid[m][n];
					}
				}
			}
			else terminateFlag = false;
		}
		return minHour;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		int[][] grid = new int[rows][columns];
		
		for(int i = 0; i < rows; i++) 
			for(int j = 0; j < columns; j++)
				grid[i][j] = sc.nextInt();
		
		System.out.println(minimumHour(rows, columns, grid));
		sc.close();

	}

}
