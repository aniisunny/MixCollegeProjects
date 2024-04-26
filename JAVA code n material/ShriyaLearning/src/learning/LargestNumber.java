package learning;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter First Number: ");
		int a = scanner.nextInt();
		System.out.println("Enter Second Number: ");
		int b = scanner.nextInt();
        System.out.println("Enter Third Number: ");
        int c = scanner.nextInt();
        
        if (a > b && a > c) {
        	System.out.println("a");
        }
        else if (b > a && b > c) {
        	System.out.println("b");
        }
        else {
        	System.out.println("c");
        }
	}

}
