package Problems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LetterCobinationOfAPhoneNumber {
	
	static List < String > letterCombinations ( String digits ) {
			
		List < String > combination =  new ArrayList < String > ();
		
		if ( digits.isEmpty() ) 
			return combination;
		
		ArrayList < String > al2 = new ArrayList < String > ();
		ArrayList < String > al3 = new ArrayList < String > ();
		
		String letter [] = new String [] { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
			
		for ( int j = 0; j < letter [ Integer.parseInt ( digits.charAt ( 0 ) + "" ) ].length (); j ++ ) {
			
			combination.add ( letter [ Integer.parseInt ( digits.charAt ( 0 ) + "" ) ].charAt ( j ) + "" );
				
		}
		
		for ( int i = 1; i < digits.length (); i ++ ) {
			
			for ( int j = 0; j < letter [ Integer.parseInt ( digits.charAt ( i ) + "" ) ].length (); j ++ ) {
				
				al2.add ( letter [ Integer.parseInt ( digits.charAt ( i ) + "" ) ].charAt ( j ) + "" );
				
			}
			
			Iterator < String > it1 = combination.iterator();
			
			while ( it1.hasNext () ) {
				
				String temp1 = "";
				temp1 += it1.next();
				Iterator < String > it2 = al2.iterator();
				
				while ( it2.hasNext () ) {
					
					String temp2 = "";
					temp2 += it2.next ();
					al3.add ( temp1 + temp2 );
					
				}
				
			}
			
			combination.clear ();
			al2.clear ();
			combination.addAll ( al3 );
			al3.clear ();
			
		}
		
		return combination;
		
	}

	public static void main(String[] args) {
		
		String digits = "234";
		
		System.out.println ( letterCombinations ( digits ) );

	}

}
