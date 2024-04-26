package media.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BiggestSquare {
	
	public static void prefixSumMatrix (int[][] matrix, int rowLength, int colLength) {
		
		for (int row = 1; row < rowLength; row++) {
			matrix[row][0] += matrix[row - 1][0];
		}
		
		for (int col = 1; col < colLength; col++) {
			matrix[0][col] += matrix[0][col - 1];
		}
		
		for (int row = 1; row < rowLength; row++) {
			for (int col = 1; col < colLength; col++) {
				matrix[row][col] += matrix[row - 1][col] + matrix[row][col - 1] - matrix[row - 1][col - 1];
			}
		}
	}
	
	public static boolean valid (int[][] matrix, int row, int col, int d, int k) {
		
		if (row - d < 0 || row + d >= matrix.length || col - d < 0 || col + d >= matrix[0].length) {
			return false;
		}
		
		int sum = matrix[row + d][col + d];
		sum -= row - d == 0 ? 0 : matrix[row - d - 1][col + d];
		sum -= col - d == 0 ? 0 : matrix[row + d][col - d - 1];
		sum += row - d == 0 || col - d == 0 ? 0 : matrix[row - d - 1][col - d - 1];
		
		return sum <= k;
	}
	
	public static int[] solve (int[][] matrix, int[] x, int[] y, int[] k) {
		
		int rowLength = matrix.length;
		int colLength = rowLength == 0 ? 0 : matrix[0].length;
		int[] ans = new int[x.length];
		
		prefixSumMatrix (matrix, rowLength, colLength);
		
		for (int i = 0; i < x.length; i++) {
			--x[i];
			--y[i];
			int low = 0;
			int high = Math.min (x[i], colLength - 1 - y[i]);
			
			while (low <= high) {
				int mid = low + (high - low) / 2;
				if (valid (matrix, x[i], y[i], mid, k[i])) {
					low = mid + 1;
				}
				else {
					high = mid - 1;
				}
			}
			
			--low;
			low += low + 1;
			ans[i] = low * low;
		}
		
		return ans;
	}

	public static void main(String[] args) throws IOException {

		try (BufferedReader read = new BufferedReader (new InputStreamReader (System.in))) {
			
			String[] s = read.readLine ().split (" ");
			int rowLength = Integer.parseInt (s[0]);
			int colLength = Integer.parseInt (s[1]);
			
			int[][] matrix = new int[rowLength][colLength];
			
			for (int i = 0; i < rowLength; i++) {
				s = read.readLine ().split (" ");
				for (int j = 0; j < colLength; j++) {
					matrix[i][j] = Integer.parseInt (s[j]);
				}
			}
			
			s = read.readLine ().split (" ");
			int[] x = new int[s.length];
			
			for (int i = 0; i < x.length; i++) {
				x[i] = Integer.parseInt (s[i]);
			}
			
			s = read.readLine ().split (" ");
			int[] y = new int[s.length];
			
			for (int i = 0; i < y.length; i++) {
				y[i] = Integer.parseInt (s[i]);
			}
			
			s = read.readLine ().split (" ");
			int[] k = new int[s.length];
			
			for (int i = 0; i < k.length; i++) {
				k[i] = Integer.parseInt (s[i]);
			}
			
			System.out.println (Arrays.toString (solve (matrix, x, y, k)));
		}
	}

}


// testcase 1
//4 7
//0 1 0 1 1 0 1
//0 1 0 1 0 1 0
//0 1 0 1 0 1 1
//0 1 1 1 1 1 0
//3
//6
//5
//[9]
