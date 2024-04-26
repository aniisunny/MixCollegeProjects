package Problems;

import java.util.Scanner;

public class RomanToInteger {
	
	static public int romanToInt ( String roman ) {
		
		int integer = 0, j;
		char ch, temp;
		
		for ( int i=0; i<roman.length(); i++ ) {
			
			ch = roman.charAt ( i );
			
			if ( ch == 'M' ) 
				integer += 1000;
			
			else if ( ch == 'D' ) {
				
				if ( i != roman.length() - 1 ) {
					
					temp = roman.charAt ( i + 1 );
					
					 if ( temp == 'M' )
						return integer;
					
					else 
						integer += 500;
					
				}
				
				else
					integer += 500;
				
			}
			
			else if ( ch == 'L' ) {
				
				if ( i != roman.length() - 1 ) {
					
					temp = roman.charAt ( i + 1 );
					
					 if ( temp == 'M' || temp == 'D' || temp == 'C' )
						return integer;
					
					else 
						integer += 50;
					
				}
				
				else
					integer += 50;
				
			}
			
			else if ( ch == 'V' ) {
				
				if ( i != roman.length() - 1 ) {
					
					temp = roman.charAt ( i + 1 );
					
					 if ( temp == 'I' )
						 integer += 5;
					
					else 
						return integer;
					
				}
				
				else
					integer += 5;
				
			}
			
			else if ( ch == 'C' ) {
				
				if ( i != roman.length() - 1 ) {
					
					temp = roman.charAt ( i + 1 );
					
					if ( temp == 'D' ) {
						
						integer += 400;
						i++;
						
					}
					
					else if ( temp == 'M' ) {
						
						integer += 900;
						i++;
						
					}
					
					else 
						integer += 100;
					
				}
				
				else
					integer += 100;
				
			}
			
			else if ( ch == 'X' ) {
				
				if ( i != roman.length() - 1 ) {
					
					temp = roman.charAt ( i + 1 );
					
					if ( temp == 'L' ) {
						
						integer += 40;
						i++;
						
					}
					
					else if ( temp == 'C' ) {
						
						integer += 90;
						i++;
						
					}
					
					else if ( temp == 'X' || temp == 'I' || temp == 'V' )
						integer += 10;
					
					else 
						return integer;
					
				}
				
				else
					integer += 10;
				
			}
			
			else if ( ch == 'I' ) {
				
				if ( i != roman.length() - 1 ) {
					
					temp = roman.charAt ( i + 1 );
					
					if ( temp == 'V' ) {
						
						integer += 4;
						i++;
						
					}
					
					else if ( temp == 'X' ) {
						
						integer += 9;
						i++;
						
					}
					
					else if ( temp == 'I' )
						integer += 1;
					
					else 
						return integer;
					
				}
				
				else 
					integer += 1;
				
			}
			
		}
		
		return integer;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in );
		System.out.print ( "Enter the Roman Number :- " );
		String roman = sc.nextLine ();
		
		System.out.print ( "Integer Number :- " );
		System.out.print ( romanToInt ( roman ) );

	}

}
