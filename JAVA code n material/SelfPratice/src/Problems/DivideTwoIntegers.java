package Problems;

public class DivideTwoIntegers {
	
	static public int divide ( int dividend, int divisor ) {
		
		if ( dividend == -2147483648 && divisor == -1 )
			return Integer.MAX_VALUE;
		
		return ( dividend / divisor );
		
	}

	public static void main(String[] args) {
		
		int dividend = -2147483648;
		int divisor = -1;
		
		System.out.println ( divide ( dividend, divisor ) );
		
	}

}
