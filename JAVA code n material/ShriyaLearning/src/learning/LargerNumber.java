package learning;

import java.util.Scanner;

public class LargerNumber {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter First Number: ");
		int a = scanner.nextInt();
		System.out.print("Enter Second Number: ");
		int b = scanner.nextInt();
		
		if (a >= b) {
			System.out.println("a: " + a);
		}
		else {
			System.out.println("b: " + b);
		}
		
	}

}
