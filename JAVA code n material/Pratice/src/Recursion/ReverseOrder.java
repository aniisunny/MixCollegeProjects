package Recursion;

import java.util.Scanner;

public class ReverseOrder {
	
	static public void reverse() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch != '\n') {
			reverse();
			System.out.print(ch + " ");
		}
	}

	public static void main(String[] args) {
		System.out.print("Enter the Character by Character: ");
		reverse();
	}

}
