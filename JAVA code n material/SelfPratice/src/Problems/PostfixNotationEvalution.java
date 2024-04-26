package Problems;

import java.util.Scanner;

public class PostfixNotationEvalution {
	
	int oppend1;
	int oppend2;
	node top = null;
	
	class node {
		
		int data;
	    node next;
		
	}
	
	void push ( int value ) {
		
		node ptr = new node ();
        
        ptr.data = value;
        
        if ( top == null )
        	ptr.next = null;
        
        else 
        	ptr.next = top;
        
        top = ptr;
		
	}
	
	int pop () {
		
		node ptr = top;
        top = top.next;
        return ptr.data;
		
	}
	
	void display () {
    	
        node ptr = top;
        
        while ( ptr != null ) {
        	
        	System.out.println ( ptr.data );
        	ptr = ptr.next;
        	
        }
        
    }
	
	 void evalution ( String expression ) {
		
		for ( int i = 0; i< expression.length(); i++ ) {
			 
			if ( expression.charAt ( i ) == '+' ) {

				oppend2 = pop ();
				oppend1 = pop ();
				push ( oppend1 + oppend2 );
				
			}
			
			else if ( expression.charAt ( i ) == '-' ) {
				
				oppend2 = pop ();
				oppend1 = pop ();
				push ( oppend1 - oppend2 );
				
			}
			
			else if ( expression.charAt ( i ) == '*' ) {
				
				oppend2 = pop ();
				oppend1 = pop ();
				push ( oppend1 * oppend2 );
				
			}
			
			else if ( expression.charAt ( i ) == '/' ) {
				
				oppend2 = pop ();
				oppend1 = pop ();
				push ( oppend1 / oppend2 );
				
			}
			
			else if ( expression.charAt ( i ) == ' ' ) {
				
				String s = "";
				boolean numeric = true;
				
				for ( int j = i - 1; j >= 0; j-- ) {
					
				
					if ( expression.charAt ( j ) == ' ' || expression.charAt ( j ) == '+' || expression.charAt ( j ) == '-' || expression.charAt ( j ) == '*' || expression.charAt ( j ) == '/' )
						break; 
					
					s = expression.charAt ( j ) + s;
					
					
				}
				
				if ( numeric )
					push ( Integer.parseInt( s ) );	
			}	
		}
	}
	 

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner ( System.in );
		System.out.print ( "Enter the String :- " );
		String expression = scan.nextLine ();
		
		PostfixNotationEvalution postfixNotation = new PostfixNotationEvalution ();
		postfixNotation.evalution ( expression );
		postfixNotation.display ();

	}

}
