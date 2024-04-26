package Problems;

public class ReverseNumber {
	
public int reverse ( int x ) {
        
        int remainder;
        long reverse = 0;
        
        if ( x > 0 && x < Integer.MAX_VALUE ) {
        	
        	while ( x != 0 ) {
                
                remainder = x % 10;
                reverse = ( reverse * 10 ) + remainder;
                x /= 10;
                
            }
        	
        }
        
        else if ( x < 0 && x > Integer.MIN_VALUE ) {
        	
        	x = -x;
            while ( x != 0 ) {
                
                remainder = x % 10;
                reverse = ( reverse * 10 ) + remainder;
                x /= 10;
                
            }
            
            reverse = -reverse;
            
        }
        
        if ( reverse == 0 && reverse > Integer.MAX_VALUE && reverse < Integer.MIN_VALUE )
        	return 0;
        else 
        	return ( int ) reverse;
        
    }

	public static void main(String[] args) {
		
		ReverseNumber reverseNumber = new ReverseNumber ();
		System.out.println ( reverseNumber.reverse ( 1534236469 ) );
		System.out.println ( reverseNumber.reverse ( 1463847412 ) );
		System.out.println ( reverseNumber.reverse ( -2147483648 ) );
		System.out.println ( reverseNumber.reverse ( 153423646 ) );
		System.out.println ( reverseNumber.reverse ( -2147483412 ) );

	}
	
}