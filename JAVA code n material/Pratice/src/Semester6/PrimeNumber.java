package Semester6;

import java.util.Scanner;

public class PrimeNumber {
	
	static public boolean primeNumber(int n) {
		for(int i = 2; i < Math.sqrt(n); i++) {
			if(n % i == 0) 
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scan.nextInt();
		System.out.println(primeNumber(n));

	}

}
