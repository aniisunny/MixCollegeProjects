package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2 {

	public static void main(String[] args) {
		
		/*Create a regular expression that accepts alphanumeric characters only.  
		Its length must be six characters long only.*/  

		
		System.out.println ( Pattern.matches ( "[ a-zA-Z0-9 ]{6}", "abc123" ) );
		System.out.println ( Pattern.matches ( "[ a-zA-Z0-9 ]{6}", "kkvarun32" ) );  //false (more than 6 char)  
		System.out.println ( Pattern.matches ( "[ a-zA-Z0-9 ]{6}", "JA2Uk2" ) );  //true  
		System.out.println ( Pattern.matches ( "[ a-zA-Z0-9 ]{6}", "arun$2" ) );  //false ($ is not matched)  
		
		System.out.println ();
		
		/*Create a regular expression that accepts 10 digit numeric characters 
		 starting with 7, 8 or 9 only.*/  
		
		System.out.println ( Pattern.matches ( "[ 789 ]{1}[ 0-9 ]{9}", "9149392552" ) );
		System.out.println ( Pattern.matches ( "[ 789 ][ 0-9 ]{9}", "9953038949" ) );  
		System.out.println ( Pattern.matches ( "[ 789 ][ 0-9 ]{9}", "99530389490" ) );  //false (11 characters)  
		System.out.println ( Pattern.matches ( "[ 789 ][ 0-9 ]{9}", "6953038949" ) );  //false (starts from 6)  
		System.out.println ( Pattern.matches ( "[ 789 ][ 0-9 ]{9}", "8853038949" ) );  //true 
		System.out.println ( Pattern.matches ( "[ 789 ]{1}\\d{9}", "8853038949" ) );  //true  
		System.out.println ( Pattern.matches ( "[ 789 ]{1}\\d{9}", "3853038949" ) ); //false (starts from 3) 
		
		System.out.println();
		
		String mydata = "some string with 'the data i want' inside";
		Pattern pattern = Pattern.compile ( "'(.*?)'" );
		Matcher matcher = pattern.matcher ( mydata );
		
		if ( matcher.find () ) 
			System.out.println ( matcher.group ( 1 ) );  // matcher start point 
		
		Pattern pattern2 = Pattern.compile ( ".*'([^']*)'.*" );
		matcher = pattern2.matcher ( mydata );
		
		if ( matcher.matches () )
			System.out.println ( matcher.group ( 0 ) );  //matcher start point 
		
		System.out.println ( matcher.groupCount () );
		
	}

}
