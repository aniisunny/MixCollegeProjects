package learning;

import java.util.Scanner;

public class Inches {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter a inches: ");
		int inches = scanner.nextInt();
		
		int feet = inches/12;
		int remainingInches = inches%12;
		
		System.out.println("Feet: " + feet);
		System.out.println("RemainingInches: " + remainingInches);	
	}

}
