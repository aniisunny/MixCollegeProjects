package Problems;

import java.util.HashMap;

public class RotateImage {
	static public void rotate(int[][] matrix) {
		int i, j, k;
		/*HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(i = 0; i < matrix.length; i++) {
			for(j = 0; j < matrix.length; j++) {
				if(!map.containsKey(j)) {
					int temp = matrix[i][j];
					matrix[i][j] = matrix[j][i];
					matrix[j][i] = temp;
					map.put(i, j);
				}
			}
		}*/
		for(i = 0; i < matrix.length; i++) {
			for(j = i + 1; j < matrix.length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
				
			}
		}
		for(i = 0; i < matrix.length; i++) {
			for(j = 0, k = matrix.length - 1; j < matrix.length / 2; j++, k--) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][k];
				matrix[i][k] = temp;
			}
		}
		for(int num[] : matrix) {
			for(int var : num) 
				System.out.print(var + "  ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] matrix = {
				{5, 1, 9, 11},
				{2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
		};
		rotate(matrix);
	}

}