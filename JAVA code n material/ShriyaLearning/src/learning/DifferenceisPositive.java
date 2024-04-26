package learning;

import java.util.Scanner;

public class DifferenceisPositive {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter First Number: ");
		int a = scanner.nextInt();
		
		System.out.print("Enter Second Number: ");
		int b = scanner.nextInt();
		
		if ( a >= b) {
			 a = a - b;
			System.out.print("a: " + a);
		}
		else {
			 b = b - a;
			 System.out.print("b: " + b);
		}
	}
}


