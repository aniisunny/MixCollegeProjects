package learning;

import java.util.Scanner;

public class ThreeDigitNumber {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter Three Digit Number: ");
		int threeDigitNumber = scanner.nextInt();
		
		int firstDigitNumber = threeDigitNumber/100;
		
		int lastDigitNumber = threeDigitNumber%10;
		
		int SumOffirstDigitAndlastDigitNumber = firstDigitNumber + lastDigitNumber;
		
		System.out.print("Sum Of First Digit And Last Digit Number: " + SumOffirstDigitAndlastDigitNumber);
		
	}

}