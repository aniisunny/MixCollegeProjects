package Regex;

import java.util.regex.Pattern;

public class RegularExpressionCharacterClass {

	public static void main(String[] args) {
		
		System.out.println ( Pattern.matches ( "[ amn ]", "abcd" ) ); // not a or m or n  
		System.out.println ( Pattern.matches ( "[ amn ]", "a" ) );  // among a or m or n
		System.out.println ( Pattern.matches ( "[amn]", "ammmna" ) ); // m and a comes more than once 

	}

}
