package lab2018;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileIO {

	public static void main(String[] args) throws IOException {
		
		String s = "This is file content";
		byte b [] = s.getBytes();
		OutputStream os = new FileOutputStream ( "CSE22.txt" );
		
		os.write ( b );
		os.close ();
		System.out.println ( "File Created..." );
		
		InputStream is = new FileInputStream ( "CSE22.txt" );
		
		int num = is.read ();
		while ( num != -1 ) {
			
			System.out.print ( ( char ) num );
			num = is.read ();
			
		}
		
		is.close ();

	}

}
