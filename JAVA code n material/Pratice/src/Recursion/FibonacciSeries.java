package Recursion;

import java.util.Scanner;

public class FibonacciSeries {
	
	static public int fibo(int n) {
		if(n <= 2)
			return 1;
		else 
			return fibo(n - 1) + fibo(n - 2);
		/*else {
			int i = 2, temp, current = 1, last = 0;
			for( ; i <= n; i++) {
				temp = current;
				current += last;
				last = temp;
			}
			return current;
		}*/
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("How many numbers yot want to print: ");
		int n = scan.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.print(fibo(i) + " ");
		}
	}

}
