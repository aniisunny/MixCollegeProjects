package Problems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	
	static boolean isMatch ( String s, String p ) {
		
		Pattern pattern = Pattern.compile ( p );
		Matcher matcher = pattern.matcher ( s );	
		
		if ( matcher.matches () )
			return true;
		
		return false;
		
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner ( System.in );
		
		System.out.print ( "Enter the String :- " );
		String s = scan.nextLine ();
		
		System.out.print ( "Enter the pattern :- " );
		String p = scan.nextLine ();
		
		System.out.println ( isMatch ( s, p ) );
		

	}

}
