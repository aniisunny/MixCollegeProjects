package learning;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter a Number: ");
		int number = scanner.nextInt();
		
	    int remainder = number%2;
	    
	    if (remainder == 0)  {
	    	System.out.print("number is even");
	    } 
	    else {
			System.out.print("number is odd");
	    }
	}

}
