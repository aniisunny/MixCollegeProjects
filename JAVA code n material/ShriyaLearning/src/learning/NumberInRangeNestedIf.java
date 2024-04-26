package learning;

import java.util.Scanner;

public class NumberInRangeNestedIf {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter two digit number:");
		int n = scanner.nextInt();
		
		if (n>=15) {
			if (n<=50) {
				System.out.print("number is in range.");
			}
			else {
				System.out.print("number is not in range.");
			}
		}
		else {
			System.out.print("number is not in range.");
		}
	}

}
