package learning;

import java.util.Scanner;

public class FourDigitNumber {

	private static final String FirstDigitNumber = null;

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter Four Digit Number: ");
		int fourDigitNumber = scanner.nextInt();
		
		int firstDigitNumber = fourDigitNumber/1000;
		int secondDigitNumber = (fourDigitNumber%1000)/100;
		int thirdDigitNumber = (fourDigitNumber%100)/10;
		int lastDigitNumber = fourDigitNumber%10;
		
		System.out.println("First Digit Number: " + firstDigitNumber);
		System.out.println("Second Digit Number: " + secondDigitNumber);
		System.out.println("Third Digit Number: " + thirdDigitNumber);
		System.out.println("Last Digit Number: " + lastDigitNumber);
	}
}
