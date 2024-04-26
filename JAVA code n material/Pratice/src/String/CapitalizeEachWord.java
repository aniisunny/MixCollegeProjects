package String;

import java.util.Scanner;

public class CapitalizeEachWord {
	
	static String capitalizeWord ( String str ) {
		
		String word [] = str.split ( " " );
		String capitalizeWord = "";
		for ( String w : word ) {
			
			String first = w.substring ( 0, 1 );
			capitalizeWord += first.toUpperCase () + w.substring ( 1 ) + " ";
			
		}
		
		return capitalizeWord;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in );
		System.out.print ( "Enter the string :- " );
		String str = sc.nextLine ();
		System.out.println ( "Capitalize String :- " + capitalizeWord ( str ) );
		//System.out.println ( StringFormatter.capitalizeWord ( "aniruddha agrawal" ) );

	}

}
