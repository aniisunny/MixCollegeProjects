package String;

public class StringVsStringBuffer {
	
	public static String concatWithString () {
		
		String s = "Java";
		for ( int i=0; i<1000; i++ )
			s = s + "Tpoint";
		return s;
		
	}
	
	public static String concatWithStringBuffer () {
		
		StringBuffer sb = new StringBuffer ( "Java" );
		for ( int i=0; i<1000; i++ )
			sb.append ( "Tpoint" );
		return sb.toString ();
		
	}

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis ();
		System.out.println ( "Start system time: " + startTime );
		concatWithString ();
		System.out.println ( "Time taken by Concating with String: "+ ( System.currentTimeMillis() - startTime ) + " ms" );
		startTime = System.currentTimeMillis ();
		System.out.println ( "Now System time: " + startTime );
		concatWithStringBuffer ();
		System.out.println ( "Time taken by Concating with StringBuffer: "+ ( System.currentTimeMillis() - startTime ) + " ms" );

	}

}
