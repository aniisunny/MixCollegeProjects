package Problems;

import java.util.Scanner;

public class RestrictionOfVowels {
	
	static String restrictVowels ( String str ) {
		
		str = str.replaceAll ( "[aeiouAEIOU]", "" );
		
		return str;
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner ( System.in );
		
		System.out.print ( "Enter the String :- " );
		String str = sc.nextLine ();
		
		System.out.println ( restrictVowels ( str ) );

	}

}
