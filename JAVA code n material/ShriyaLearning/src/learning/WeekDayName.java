package learning;

import java.util.Scanner;

public class WeekDayName {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter any number: ");
		int n = scanner.nextInt();
		
		switch (n) {
			case 1: 
				System.out.println ("Monday");
				break;
			case 2: 
				System.out.println ("Tuesday");
				break;
			case 3: 
				System.out.println ("Wednesday");
				break;
			case 4:
				System.out.println ("Thursday");
				break;
			case 5:
				System.out.println ("Friday");
				break;
			case 6:
				System.out.println ("Saturday");
				break;
			case 7:
				System.out.println ("Sunday");
				break;
			default:
				System.out.println ("Not Valid Number");
		}
		
//		if (n==1) {
//			System.out.print("Monday");
//		}
//		else if (n==2) {
//			System.out.print("Tuesday");
//		}
//		else if (n==3) {
//			System.out.print("Wednesday");
//		}
//		else if (n==4) {
//			System.out.print("Thursday");
//		}
//		else if (n==5) {
//			System.out.print("Friday");
//		}
//		else if (n==6) {
//			System.out.print("Saturday");
//		}
//		else if (n==7) {
//			System.out.print("Sunday");
//		}
//		else {
//			System.out.print("Not Valid Number");
//		}
	}

}
