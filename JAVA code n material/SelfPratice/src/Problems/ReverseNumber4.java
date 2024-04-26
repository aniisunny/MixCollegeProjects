package Problems;

public class ReverseNumber4 {
	
static public int reverse ( int x ) {
		
		int reverse = 0, remainder;
		
		while ( x != 0 ) { 
			
			remainder = x % 10;
			
			if ( reverse > Integer.MAX_VALUE / 10 )
				return 0;
			
			if ( reverse < Integer.MIN_VALUE / 10 )
				return 0;
			
			reverse = ( reverse * 10 ) + remainder;
			x /=10;
			
		}
		
		return reverse;
		
	}

		public static void main(String[] args) {
			
			System.out.println ( reverse ( 1534236469 ) );
			System.out.println ( reverse ( 1463847412 ) );
			System.out.println ( reverse ( -2147483648 ) );
			System.out.println ( reverse ( 153423646 ) );
			System.out.println ( reverse ( -2147483412 ) );

		}

}
