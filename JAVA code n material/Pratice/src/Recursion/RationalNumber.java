package Recursion;

import java.util.Scanner;

public class RationalNumber {
	
	static public float rational(int n) {
		if(n == 1)
			return 1;
		return (rational(n - 1) + 1 / rational(n - 1));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many number you want to be print: ");
		int n = sc.nextInt();
		System.out.println("Fibonacci Series: ");
		for(int i = 1; i <= n; i++) {
			System.out.print(rational(i) + "  ");
		}

	}

}
