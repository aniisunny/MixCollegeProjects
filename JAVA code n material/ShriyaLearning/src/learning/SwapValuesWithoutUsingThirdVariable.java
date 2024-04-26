package learning;

import java.util.Scanner;

public class SwapValuesWithoutUsingThirdVariable {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter First Number(a): ");
		int firstNumber = scanner.nextInt();
		System.out.print("Enter Second Number(b): ");
		int secondNumber = scanner.nextInt();
		
		firstNumber = firstNumber + secondNumber;
	    secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;
		
		System.out.println("FirstNumber : " + firstNumber);
		System.out.println("SecondNumber : " + secondNumber);
	}

}
