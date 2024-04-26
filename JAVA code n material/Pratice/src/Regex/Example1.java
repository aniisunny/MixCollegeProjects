package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile ( ".s" );  //pattern class methods
		Matcher m = p.matcher ( "as" );  // pattern class methods
		boolean b1 = m.matches ();  // matcher class methods
		
		boolean b2 = Pattern.compile ( ".s" ).matcher ( "as" ).matches ();
		
		boolean b3 = Pattern.matches ( ".s" , "as" );
		
		System.out.println ( b1 );
		System.out.println ( b2 );
		System.out.println ( b3 );
		
		System.out.println ( Pattern.matches ( ".s", "mk" ) );  // 2nd char is not s
		System.out.println ( Pattern.matches ( ".s", "mst" ) ); // has more than 2 char  
		System.out.println ( Pattern.matches ( ".s", "amms" ) ); // has more than 2 char  
		System.out.println ( Pattern.matches ( "..s", "mas" ) ); // 3rd char is s  

	}

}
