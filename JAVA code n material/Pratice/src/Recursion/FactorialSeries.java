package Recursion;

import java.util.Scanner;

public class FactorialSeries {
	static public int factorial(int n) {
		if(n == 1 || n == 2)
			return 1;
		return ((factorial(n - 1) + factorial(n - 2)) * (n - 2));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many number you want to be print: ");
		int n = sc.nextInt();
		System.out.println("Factorial Series: ");
		for(int i = 1; i <= n; i++) {
			System.out.print(factorial(i) + " ");
		}
	}

}
