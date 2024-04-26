package Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class LetterCombination {
	
	/*static List < String > letterCombinations ( String digits ) {
		
		HashMap < Integer, String > hm = new HashMap < Integer, String > ();
		
		hm.put ( 2, "abc" );
		hm.put ( 3, "def" );
		hm.put ( 4, "ghi" );
		hm.put ( 5, "jkl" );
		hm.put ( 6, "mno" );
		hm.put ( 7, "pqrs" );
		hm.put ( 8, "tuv" );
		hm.put ( 9, "wxyz" );
		
		System.out.println( hm );
		
		ArrayList < List < String > > list = new ArrayList < List < String > > ();
		
		for ( int i = 0; i < digits.length (); i ++ ) {
			
			List < String > temp = new ArrayList < String > ();
			
			if ( hm.containsKey ( Integer.parseInt ( "" + digits.charAt ( i ) ) ) ) {
				
				temp.add ( hm.get ( Integer.parseInt ( "" + digits.charAt ( i ) ) ) );
				
			}
			
			list.add ( temp );
			
		}
		
		System.out.println ( list );
		
		Iterator itr = list.iterator ();
		
		while ( itr.hasNext () ) {
			
			
			
		}
		
		List < String > combination =  new ArrayList < String > ();
		
		return combination;
		
	}*/
	
	/*static List < String > letterCombinations ( String digits ) {
		
		List < String > combination =  new ArrayList < String > ();
		int i, j;
		ArrayList < List < Character > > list = new ArrayList < List < Character > > ();
		
		String letter [] = new String [] { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		
		for ( i = 0; i < digits.length (); i ++ ) {
			
			List < Character > temp = new ArrayList < Character > ();
			
			String str = letter [ Integer.parseInt ( digits.charAt ( i ) + "" ) ];
			
			for ( j =  0; j < str.length (); j ++ ) {
				
				temp.add ( str.charAt ( j ) );
				
			}
			
			list.add ( temp );
			
		}
		
		System.out.println ( list );
		
		Iterator itr = list.iterator ();
		
		while ( itr.hasNext () ) {
			
			List < Character > temp = new ArrayList < Character > ();
			
			temp = ( List < Character > ) itr.next ();
			
			
		}
		
		return combination;
		
	}*/
	
	static List < String > letterCombinations ( String digits ) {
		
		List < String > combination =  new ArrayList < String > ();
		int i, j, t;
		
		char letter [] [] = { 
				{ }, { }, { 'a', 'b', 'c' } ,
				{ 'd', 'e', 'f' } , { 'g', 'h', 'i' } , { 'j', 'k', 'l' } ,
				{ 'm', 'n', 'o' } , { 'p', 'q', 'r', 's' } , { 't', 'u', 'v' } ,
				{ 'w', 'x', 'y', 'z' } ,
				};
		
		for ( i = 0; i < digits.length (); i ++ ) {
			
			int k = 0;
			char temp [] = new char [ 3 ];
			for ( char ch : letter [ Integer.parseInt ( digits.charAt ( i ) + "" ) ] ) {
				
				temp [ k ] = ch;
				k ++;
				
				
			}
			
			for ( t = i + 1 ; t < digits.length (); t ++ ) {
				
				for ( j = 0; j < temp.length; j ++ ) {
					
					for ( char ch1 : letter [ Integer.parseInt ( digits.charAt ( t ) + "" ) ] ) {
						
						String str = "";
						str += ( temp [ j ] + "" ) + ( ch1 + "" );
						combination.add ( str );
						
					}
					
				}
				
			}
			
		}
		
		/*int k = 0;
		
		for ( i = digits.length () - 1; i >= 0; i -- ) {
			
			for ( char ch : letter [ Integer.parseInt ( digits.charAt ( i ) + "" ) ] ) {
				
				String str = "";
				
				for ( j = 0; j < i; j ++ ) {
					
					str += letter [ Integer.parseInt ( digits.charAt ( j ) + "" ) ] [ k ];
					
				}
				
				str += ch;
				combination.add ( str );
				
			}
			
			k ++;
			
		}*/
		
		return combination;
		
	}

	public static void main ( String [] args ) {
		
		String digits = "23";
		
		System.out.println ( letterCombinations ( digits ) );

	}

}
