package Recursion;

import java.util.Scanner;

public class PascalTriangle {
	
	static public int pascalTriangle(int i, int j) {
		if(j == 1 || j == i)
			return 1;
		return pascalTriangle(i - 1, j - 1) + pascalTriangle(i - 1, j);
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("How many rows you want to print: ");
		int n = scan.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int spaces = i; spaces < n; spaces++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print(pascalTriangle(i, j) + " ");
			}
			System.out.println();
		}

	}

}
