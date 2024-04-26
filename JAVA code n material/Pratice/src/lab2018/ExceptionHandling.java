package lab2018;

import java.util.Scanner;

public class ExceptionHandling {
	
	static void func() throws NumberFormatException {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner ( System.in );
		System.out.print ( "Enter the string1 :- " );
		String str1 = scan.nextLine ();
		
		System.out.print ( "Enter the String2 :- " );
		String str2 = scan.nextLine ();
		
		int n1 = Integer.parseInt ( str1 );
		int n2 = Integer.parseInt ( str2 );
		
		System.out.println ( n1 + n2 );
		
	}

	public static void main(String[] args) {
		
		try {
			
			func();
			
		}
		
		catch ( NumberFormatException E ) {
			
			System.out.println ( "Exception Occur..." );
			System.out.println ( "Exception type: " + E );
			
		}

	}

}
