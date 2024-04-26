package String;

public class StringBufferVsStringBuilder {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis ();
		System.out.println ( "Start system time: " + startTime );
		
		StringBuffer buffer = new StringBuffer ( "Java" );
		
		for ( int i=0; i<1000; i++ )
			buffer.append ( "Tpoint" );
		
		System.out.println ( "Time taken by StringBuffer: "+ ( System.currentTimeMillis() - startTime ) + " ms" );
		
		startTime = System.currentTimeMillis ();
		System.out.println ( "\nStart system time: " + startTime );
		
		StringBuffer builder = new StringBuffer ( "Java" );
		
		for ( int i=0; i<1000; i++ )
			builder.append ( "Tpoint" );
		
		System.out.println ( "Time taken by StringBuilder: "+ ( System.currentTimeMillis() - startTime ) + " ms" );
		
	}

}
