package String;

import java.util.*;

public class StringTokenizer {

	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer ( "My name is Aniruddha Agrawal", "" );
		while ( st.hasMoreTokens () )
			System.out.println ( st.nextToken () );
		
		StringTokenizer st1 = new StringTokenizer ( "My, name, is, Aniruddha, Agrawal" );
		System.out.println ( "Next Token is : " + st.nextToken ( "," ) );

	}

}
