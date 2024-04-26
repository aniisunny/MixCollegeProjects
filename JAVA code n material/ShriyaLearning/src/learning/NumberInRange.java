package learning;

import java.util.Scanner;

public class NumberInRange {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);

		System.out.print("Enter any two digit number: ");
		int n = scanner.nextInt();
		
		if (n>=15 && n<=50) {
		    System.out.print("number in range.");
		}
		else {
			System.out.print("number is not in range.");
		}
	}

}
