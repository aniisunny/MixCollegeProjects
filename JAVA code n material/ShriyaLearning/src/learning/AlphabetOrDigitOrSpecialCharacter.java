package learning;

import java.util.Scanner;

public class AlphabetOrDigitOrSpecialCharacter {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter any character: ");
		char ch = scanner.next ().charAt (0);
		
		if (ch>='A' && ch<='Z') {
			System.out.println("ch is an alphabet");
		}
		else if (ch>='a' && ch<='z') {
			System.out.println("ch is an alphabet");
		}
		else if (ch>='0' && ch<='9') {
			System.out.println("ch is an digit");
		}
		else {
			System.out.println("ch is an special symbol ");
		}
	}

}
