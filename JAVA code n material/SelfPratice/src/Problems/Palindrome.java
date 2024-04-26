package Problems;

import java.util.Scanner;

public class Palindrome {
	
public boolean isPalindrome(int x) {
        
        int remainder, reverse = 0, original = x;
        
        if ( x > 0 ) {
        	
        	while ( x != 0 ) {
                
                remainder = x % 10;
                reverse = ( reverse * 10 ) + remainder;
                x /= 10;
                
            }
        	  
        }
        
        if ( reverse == original )
            return true;
        else 
            return false;
        
    }

	public static void main(String[] args) {
		
		Palindrome palindrome = new Palindrome ();
		Scanner sc = new Scanner ( System.in );
		
		System.out.print ( "Enter the number:-" );
		int x = sc.nextInt ();
		
		System.out.print ( palindrome.isPalindrome (x) );

	}

}
