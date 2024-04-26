package Problems;

import java.util.Scanner;

public class IntegertoRoman {
	
	static public String intToRoman(int num) {
		
		String roman = "";
		int quotient = 0, i;
		
		while ( num != 0 ) {
			
			if ( num >= 1000 && num < 4000 ) {
				
				quotient = num / 1000;
				for ( i=1; i<=quotient; i++ )
					roman = roman + "M";
				num %= 1000;
				
			}
			
			else if ( num >= 500 && num < 1000 ) {
				
				if ( num >= 900 ) {
					
					roman = roman + "CM";
					num %= 900;
					
				}
				
				else {
					
					quotient = num / 500;
					for ( i=1; i<=quotient; i++ )
						roman = roman + "D";
					num %= 500;
					
				}
				
			}
			
			else if ( num >= 100 && num < 500 ) {
				
				if ( num >= 400 ) {
					
					roman = roman + "CD";
					num %= 400;
					
				}
				
				else {
					
					quotient = num / 100;
					for ( i=1; i<=quotient; i++ )
						roman = roman + "C";
					num %= 100;
					
				}
				
			}
			
			else if ( num >= 50 && num < 100 ) {
				
				if ( num >= 90 ) {
					
					roman = roman + "XC";
					num %= 90;
					
				}
				
				else {
					
					quotient = num / 50;
					for ( i=1; i<=quotient; i++ )
						roman = roman + "L";
					num %= 50;
					
				}
				
			}
			
			else if ( num >= 10 && num < 50 ) {
				
				if ( num >= 40 ) {
					
					roman = roman + "XL";
					num %= 40;
					
				}
				
				else {
					
					quotient = num / 10;
					for ( i=1; i<=quotient; i++ )
						roman = roman + "X";
					num %= 10;
					
				}
				
			}
			
			else if ( num >= 5 && num < 10 ) {
				
				if ( num == 9 ) {
					
					roman = roman + "IX";
					num %= 9;
					
				}
				
				else {
					
					quotient = num / 5;
					for ( i=1; i<=quotient; i++ )
						roman = roman + "V";
					num %= 5;
					
				}
				
			}
			
			else if ( num >= 1 && num < 5 ) {
				
				if ( num == 4 ) {
					
					roman = roman + "IV";
					num %= 4;
					
				}
				
				else {
						
					quotient = num / 1;
					for ( i=1; i<=quotient; i++ )
						roman = roman + "I";
					num %= 1;
					
				}
				
			}
			
		}
		
		
		return roman;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in );
		System.out.print ( "Enter the Integer :- " );
		int num = sc.nextInt ();
		
		System.out.print ( "Roman Number :- " );
		System.out.print ( intToRoman ( num ) );

	}

}
