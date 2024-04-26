package Problems;

import java.util.Scanner;

public class FactorialSeries {
	
	static public int fibo(int n) {
		if(n == 1 || n == 2)
			return 1;
		return ((fibo(n - 1) + fibo(n - 2)) * (n - 2));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many number you want to be print: ");
		int n = sc.nextInt();
		System.out.println("Fibonacci Series: ");
		for(int i = 1; i <= n; i++) {
			System.out.print(fibo(i) + " ");
		}
	}

}
