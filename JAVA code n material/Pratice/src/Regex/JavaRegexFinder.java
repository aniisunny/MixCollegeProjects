package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegexFinder {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner ( System.in );
		
		while ( true ) {
			
			System.out.print ( "Enter the pattern :- " );
			Pattern pattern = Pattern.compile ( scan.nextLine () );
			
			System.out.print ( "Enter the matcher :- " );
			Matcher matcher = pattern.matcher ( scan.nextLine () );
			
			while ( matcher.find () )
				
				System.out.println ("I found the text " + matcher.group () + " at index " + matcher.start () + " and ending at index "
						+ matcher.end () );
			
			System.out.println ();
			
		}
		
		//System.out.println ( "Not found" );   while loop work infinite time 
		
	}

}
