package learning;

import java.util.Scanner;

public class SquareAndCube {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		
		System.out.print ("Enter a number: ");
		int number = scanner.nextInt ();
		
		int square = number * number;
		int cube = square * number;
	
		System.out.println ("Sqaure of a number: " + square);
		System.out.println ("Cube of a number: " + cube);
	}

}
