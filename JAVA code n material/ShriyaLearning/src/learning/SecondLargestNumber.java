package learning;

import java.util.Scanner;

public class SecondLargestNumber {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		
		
		System.out.print("Enter first number:");
		int a = scanner.nextInt();
		System.out.print("Enter second number:");
		int b = scanner.nextInt();
		System.out.print("Enter third number:");
		int c = scanner.nextInt();
		
		if (a>b && a<c) {
			System.out.println("a is the second largest number.");
		}
		else if (b>c && b<a) {
			System.out.println("b is the second largest number.");
		}
		else  {
			System.out.println("c is the second largest number.");
		}
	}

}
