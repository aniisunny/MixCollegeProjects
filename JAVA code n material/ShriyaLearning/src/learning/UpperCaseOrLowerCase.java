package learning;

import java.util.Scanner;

public class UpperCaseOrLowerCase {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter any character:");
		char ch = scanner.next ().charAt(0);
		
		if (ch>='A' && ch<= 'Z') {
			System.out.println("ch is uppercase");
		}
		else {
			System.out.println("ch is lowercase");
		}
	}

}
