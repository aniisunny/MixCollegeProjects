package learning;

import java.util.Scanner;

public class EvenOrOddUsingSwitch {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);

		System.out.print("Enter any number: ");
		int n = scanner.nextInt();
		
		int remainder = n%2;
			
		switch(remainder) {
		   case 0:
			   System.out.println("number is even");
			   break;
		   default :
			   System.out.println("number is odd");
		}
	}

}