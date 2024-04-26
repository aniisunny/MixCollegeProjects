package Recursion;

import java.util.Scanner;
// This function suggested by Wilhelm Ackermann in 1928 and later modified by Rozsa Peter
public class WAFunction {
	
	static public int A(int n, int m) {
		if(n == 0)
			return m + 1;
		if(n > 0 && m == 0)
			return A(n - 1, 1);
		else {
			//return A(n - 1, A(n, m - 1));
			int temp = A(n, m - 1);
			return A(n - 1, temp);
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the two values for the function: ");
		int n = scan.nextInt();
		int m = scan.nextInt();
		System.out.println(A(n, m));
	}

}
