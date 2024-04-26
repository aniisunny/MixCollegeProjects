package Problems;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class SubStringWithConcentrationOfAllWords {
	
	 static public List < Integer > findSubstring ( String s, String [] words ) {
		 
		 HashMap < String, Character > map = new HashMap < String, Character > ();
		 
		 for ( int i = 0; i < words.length; i ++ ) {
			 
			 String concentrate = "";
			 
			 for ( int j = 0; j < words.length; j ++ ) {
				 
				 concentrate = "";
				  concentrate += words [ i ];    //word
				 
				 if ( i != j ) {   //true
					 
					 concentrate += words [ j ];
					 
					 for ( int k = 0; k < words.length; k ++ ) {
						 
						 if ( j != k && i != k ) {
							 
							 concentrate += words [ k ];
							 
						 }
						 
					 }
					 
					 map.put ( concentrate, concentrate.charAt ( 0 ) );
					 
				 }
				 
			 }
			 
		 }
		 
		 System.out.println ( map );
		 System.out.println ( map.size () );
		 
		 List < Integer > index = new LinkedList < Integer > ();
		
		for ( int i = 0; i < s.length (); i ++ ) {
			
			//if ( map.containsKey ( s.charAt ( i ) ) ) {
				
				for ( int j = i + 1; j <= s.length (); j ++ ) {
					
					String sub = new StringBuffer ( s ).substring ( i, j ).toString ();
					System.out.println ( sub );
						
					if ( map.containsKey(sub) ) {
						
						index.add ( i );
						break;
						
					}
						
				}
				
			//}
				
		}
			
		return index;
		 
	 }

	public static void main(String[] args) {
		
		String s = "barfoothefoobarman";
		String words [] = { "foo", "bar" };
		
		//String s = "wordgoodgoodgoodbestword";
		//String words [] = { "word", "good", "best", "word" };
		
		System.out.println ( findSubstring ( s, words ) );

	}

}
