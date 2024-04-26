package Problems;

import java.math.BigInteger;
import java.util.Scanner;

public class AdditionOfNumberInString {
	
	static int myAtoi ( String str ) {
		
		int temp = 0;
		BigInteger bi = new BigInteger ( "0" );
		
		str = str.trim();
		
		if ( str.length () == 0 || str == null )  {
			
			temp = 0;
			
		}
		
		else if ( str.charAt ( 0 ) == '-') {

			for ( int i = 1; i<str.length(); i++ ) {
				
				if ( Character.isDigit ( str.charAt ( i ) ) ) {
					
					bi = new BigInteger ( String.valueOf ( ( bi.longValue () * 10 ) + Integer.parseInt ( "" + str.charAt ( i ) ) ) );
					
				}
				
				else 
					break;
				
			}
			
			if ( bi.longValue ()  > Integer.MAX_VALUE || str.length () > 10 ) 
				temp = Integer.MIN_VALUE;
			
			else 
				temp = -1 * bi.intValue();
				
		}  
		
		else if ( str.charAt ( 0 ) == '+') {
			for ( int i = 1; i < str.length(); i++ ) {
				
				if ( Character.isDigit ( str.charAt ( i ) ) ) 
					
					bi = new BigInteger ( String.valueOf ( ( bi.longValue () * 10 ) + Integer.parseInt ( "" + str.charAt ( i ) ) ) );
					
				else 
					break;
				
			}
			
			if ( bi.longValue () > Integer.MAX_VALUE || str.length () > 10 ) 
				temp = Integer.MAX_VALUE;
			
			else 
				temp = bi.intValue();
			
		}
		
		else  {
			
			for ( int i = 0; i < str.length(); i++ ) {
				
				if ( Character.isDigit ( str.charAt ( i ) ) ) 
					
					bi = new BigInteger ( String.valueOf ( ( bi.longValue () * 10 ) + Integer.parseInt ( "" + str.charAt ( i ) ) ) );
					
				else 
					break;
				
			}	
			
			if ( bi.longValue () > Integer.MAX_VALUE || str.length () > 10 ) 
				temp = Integer.MAX_VALUE;
			
			else 
				temp = bi.intValue   ();
			
		}
		
		return temp;
		
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner ( System.in );
		System.out.print ( "Enter the String1 :- " );
		String str1 = scan.nextLine ();
		
		int n1 = myAtoi ( str1 );
		
		System.out.print ( "Enter the String2 :- " );
		String str2 = scan.nextLine ();
		
		int n2 = myAtoi ( str2 );
		
		System.out.println ( n1 + n2 );

	}

}
