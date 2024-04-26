package learning;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter any character: ");
		char ch = scanner.next ().charAt(0);
		
		if (ch=='a' && ch=='e' && ch=='i' && ch=='o' && ch=='u') {
			System.out.println("ch is vowel");
		}
		else if (ch=='A' && ch=='E' && ch=='I' && ch=='O' && ch=='U') {
			System.out.println("ch is vowel");
		}
		else {
			System.out.println("ch is consonant");
		}
	}

}
