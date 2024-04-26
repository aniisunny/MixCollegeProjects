package learning;

import java.util.Scanner;

public class MiddleDigitNumber {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter Three Digit Number: ");
		int threeDigitNumber = scanner.nextInt();
		
		int middleDigitNumber = (threeDigitNumber%100)/10;
		int squareOfMiddleDigitNumber = middleDigitNumber * middleDigitNumber;
		
		System.out.println("Square Of Middle Digit Number: " + squareOfMiddleDigitNumber);
	}

}
