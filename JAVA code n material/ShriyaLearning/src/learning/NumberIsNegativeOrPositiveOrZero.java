package learning;

import java.util.Scanner;

public class NumberIsNegativeOrPositiveOrZero {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		if (number > 0) {
			System.out.print("number is positive");
		}
		else if (number < 0)  {
			System.out.print("number is negative");
		}
		else  {
			System.out.print("number is zero");
		}
	}

}