package Problems;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
	
	public static boolean isValid ( String s ) {
		
		HashMap < Character, Character > mapping = new HashMap < Character, Character > ();
		
		mapping.put ( ')', '(' );
		mapping.put ( ']', '[' );
		mapping.put ( '}', '{' );
		
		Stack < Character > parenthesis = new Stack < Character > ();
		
		for ( int i = 0; i < s.length (); i ++ ) {
			
			if ( mapping.containsKey ( s.charAt ( i ) ) ) {
				
				char topElement = parenthesis.isEmpty () ? '#' : parenthesis.pop ();

				if ( topElement != mapping.get ( s.charAt ( i ) ) ) 
					return false;
				
			}
			
			else 
				parenthesis.push ( s.charAt ( i ) );
			
		}
		
		return parenthesis.isEmpty ();
		
	}

	public static void main(String[] args) {
		
		String s = "{[[]{}]}";
		
		System.out.println ( isValid ( s ) );

	}

}
