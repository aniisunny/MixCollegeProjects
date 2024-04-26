package Problems;

public class ReverseNumber3 {
	
static public int reverse ( int x ) {
		
		Long l = new Long ( x );
		String s = "";
		boolean flag = false;
		
		if ( x > 0 ) 
			 s = l.toString ();
		
		else {
			
			s = l.toString ();
			s = s.substring ( 1 );
			flag = true;
			
		}
		
		StringBuffer sb = new StringBuffer ( s );
		String str = sb.reverse ().toString ();
		long reverse = 0;
		reverse = Long.parseLong ( str );
		
		if ( reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE ) {
			reverse = 0;
		}
		if( flag == true ) {
			reverse *= -1;
		}
		return ( int ) reverse; 
		
	}

		public static void main(String[] args) {
			
			System.out.println ( reverse ( 1534236469 ) );
			System.out.println ( reverse ( 1463847412 ) );
			System.out.println ( reverse ( -2147483648 ) );
			System.out.println ( reverse ( 153423646 ) );
			System.out.println ( reverse ( -2147483412 ) );

		}

}
