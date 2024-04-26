package Problems;

import java.math.BigInteger;
import java.util.Scanner;

public class StringToInteger {

	/*static int myAtoi ( String str ) {
		
		int integer = 0;
		boolean flag1 = false;
		boolean flag2 = false;
		
		str = str.trim ();
		
		for ( int i = 0; i< str.length (); i++ ) {
			
			if ( str.charAt ( i ) == '-' )
				flag1 = true;
			
			else if ( str.charAt ( i ) == '+' )
				flag2 = true;
			
			else if ( flag1 == true && flag2 == true )
				break;
			
			else if ( Character.isDigit ( str.charAt ( i ) ) ) {
				
				if ( integer > Integer.MAX_VALUE / 10 ) {
					
					if ( flag1 == true )
						return Integer.MIN_VALUE;
					 
					else 
						return Integer.MAX_VALUE;
					
				}
		
				integer = ( integer * 10 ) + Integer.parseInt ( "" + str.charAt ( i ) );
				
			}
			
			else 
				break;
			
		}
		
		if ( flag1 == true )
			return -integer;
		
		return integer;
		
	}*/
	
	static int myAtoi ( String str ) {
		
		int temp = 0;
		BigInteger bi = new BigInteger ( "0" );
		
		str = str.trim();
		
		if ( str.length () == 0 || str == null )
			return temp;
		
		else if ( str.charAt ( 0 ) == '-') {

			for ( int i = 1; i<str.length(); i++ ) {
				
				if ( Character.isDigit ( str.charAt ( i ) ) ) {
					
					if ( bi.longValue ()  > Integer.MAX_VALUE ) 
						return Integer.MIN_VALUE;
					
					bi = new BigInteger ( String.valueOf ( ( bi.longValue () * 10 ) + Integer.parseInt ( "" + str.charAt ( i ) ) ) );
					
				}
				
				else 
					break;
				
			}
			
			if ( bi.longValue ()  > Integer.MAX_VALUE ) 
				return Integer.MIN_VALUE;
			 
			temp = -1 * bi.intValue();
				
		}  
		
		else if ( str.charAt ( 0 ) == '+') {
			for ( int i = 1; i < str.length(); i++ ) {
				
				if ( Character.isDigit ( str.charAt ( i ) ) ) {
					
					if ( bi.longValue () > Integer.MAX_VALUE )
						return Integer.MAX_VALUE;
					
					bi = new BigInteger ( String.valueOf ( ( bi.longValue () * 10 ) + Integer.parseInt ( "" + str.charAt ( i ) ) ) );
					
				}
					
				else 
					break;
				
			}
			
			if ( bi.longValue () > Integer.MAX_VALUE )
				return Integer.MAX_VALUE;
			
			temp = bi.intValue();
			
		}
		
		else  {
			
			for ( int i = 0; i < str.length(); i++ ) {
				
				if ( Character.isDigit ( str.charAt ( i ) ) ) {
					
					if ( bi.longValue () > Integer.MAX_VALUE )
						return Integer.MAX_VALUE;
					
					bi = new BigInteger ( String.valueOf ( ( bi.longValue () * 10 ) + Integer.parseInt ( "" + str.charAt ( i ) ) ) );
					
				}
					
				else 
					break;
				
			}	
			
			if ( bi.longValue () > Integer.MAX_VALUE )
				return Integer.MAX_VALUE;
			
			temp = bi.intValue ();
			
		}
		
		return temp;
		
	}
	
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner ( System.in );
		System.out.print ( "Enter the String :- " );
		String str = scan.nextLine ();
		//String str = "9223372036854775808";
		System.out.println ( myAtoi ( str ) );
		
		
		/*boolean flag = true;
		 
		for ( int i = 1; i <= 5; i++ ) {
			
			if ( flag )
			
				if ( 5*2 == 10 ) {
				
					flag = false;
					System.out.println("done");
				
			}
			
		}*/

	}

}
