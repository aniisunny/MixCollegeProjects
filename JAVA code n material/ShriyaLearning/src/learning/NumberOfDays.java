package learning;

import java.util.Scanner;

public class NumberOfDays {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter number of days: ");
		int numberofdays = scanner.nextInt();
		
		int numberofyears = numberofdays/365;
		int numberofmonths = numberofdays/30;
		int remainingdays = numberofdays%30;
		
		System.out.println("Number of Years: " + numberofyears);
		System.out.println("Number of Months: " + numberofmonths);
		System.out.println("Remaining Days: " + remainingdays);
	}
}
