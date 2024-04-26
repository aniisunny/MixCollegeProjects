package learning;

import java.util.Scanner;

public class SwapValuesUsing3rdVariable {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter First Number(a): ");
		int firstNumber = scanner.nextInt();
		System.out.print("Enter Second Number(b): ");
		int secondNumber = scanner.nextInt();
		
	    int c = firstNumber;
	        firstNumber = secondNumber;
	        secondNumber = c;
	    
	    System.out.println("First Number: " + firstNumber);
	    System.out.println("Second Number: " + secondNumber);
	    

	}

}
