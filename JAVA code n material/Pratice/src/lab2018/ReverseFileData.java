package lab2018;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReverseFileData {

	public static void main(String[] args) throws IOException {
		
		String str = "Aniruddha M. Agrawal";
		byte b [] = str.getBytes ();
		
		OutputStream os = new FileOutputStream ( "lab.txt " );
		
		os.write ( b );
		os.close ();
		System.out.println ( "File Created..." );
		
		InputStream is = new FileInputStream ( "lab.txt" );
		
		String s = "";
		System.out.print ( "String :- " );
		
		int num = is.read ();
		
		while ( num != -1 ) {
			
			System.out.print ( ( char ) num );
			s += ( char ) num ;
			num = is.read ();
			
		}
		
		is.close ();
		
		System.out.println ();
		
		StringBuffer sb = new StringBuffer ( s );
		String reverse = sb.reverse().toString ();
		System.out.println ( "Reverse String :- " + reverse );

	}

}
