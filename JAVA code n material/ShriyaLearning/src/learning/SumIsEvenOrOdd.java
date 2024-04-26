package learning;

import java.util.Scanner;

public class SumIsEvenOrOdd {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter Four Digit Number: ");
		int fourdigitnumber = scanner.nextInt();
		
		int seconddigit = (fourdigitnumber%1000)/100;
		int thirddigit = ((fourdigitnumber%1000)%100)/10;
		int sum = seconddigit + thirddigit;
		
		int remainder = sum%2;
		
		if (remainder==0) {
			System.out.println("Sum Is Even: " + sum);
		}
		else {
			System.out.println("Sum Is Odd: " + sum);
		}
	}

}
