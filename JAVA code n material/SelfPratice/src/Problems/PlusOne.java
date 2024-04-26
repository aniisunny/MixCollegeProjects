package Problems;

import java.util.Scanner;

public class PlusOne {
	
	public int [] plusOneFun ( int [] digits ) {
		
		int i, j, k, counter = 0, digit = 0;
		
		for ( i=0; i<digits.length; i++ ) 
			digit = ( digit * 10 ) + digits [ i ];
		
		digit = digit + 1;
		int originalDigit = digit;
		
		while ( digit != 0 ) {
			
			counter ++;
			digit /= 10;
			
		}
		
		int tempDigits [] = new int [ counter ];
		i = 0;
		int temp;
		
		while ( originalDigit != 0 ) {
			
			tempDigits [ i ] =  originalDigit % 10;
			i ++;
			originalDigit /= 10;
			
		}
		
		for ( j=0, k=i-1 ; j<i/2; j++, k-- ) {
			
			tempDigits [ j ] = tempDigits [ j ] + tempDigits [ k ];
			tempDigits [ k ] = tempDigits [ j ] - tempDigits [ k ];
			tempDigits [ j ] = tempDigits [ j ] - tempDigits [ k ];
			
		}
		
		return tempDigits;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print ( "Enter the size of the array:- " );
		int size = sc.nextInt ();
		int i;
		
		System.out.print ( "\nEnter the elements of array:- " );
		int digits [] = new int [size];
		for ( i=0; i<size; i++ )
			digits [ i ] = sc.nextInt ();
		
		PlusOne plusOne = new PlusOne ();
		int newDigits [] = plusOne.plusOneFun (digits);
		
		System.out.print ("New array after add one in old array:- " );
		for ( int var : newDigits )
			System.out.print ( var + " " );
		
	}

}
