package Semester6;

import java.util.Scanner;

public class FibonacciSeries {
	
	static public int fibonacci(int n) {
		if(n == 1)
			return 1;
		else if(n == 2)
			return 1;
		else 
			return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("How many number you want to print? ");
		int n = scan.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.print(fibonacci(i) + " ");
		}

	}

}
