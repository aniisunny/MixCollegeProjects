package JavaLinkedList;

import java.util.Scanner;

public class Stack {
	
	String Uid;
    String name;
    node top;
    
    Scanner sc = new Scanner ( System.in );
	
	class node {
		
		String UID;
	    String NAME;
	    node next;
		
	}
	
	Stack() {
		
        top = null;
        
    }
	
    void push () {
    	
    	 System.out.print ( "\nEnter the UID:-" );
         Uid = sc.nextLine ();
         System.out.print ( "Enter the CGPA:-" );
         name = sc.nextLine ();
         
        node ptr = new node ();
        
        ptr.UID = Uid;
        ptr.NAME = name;
        
        if ( top == null )
        	ptr.next = null;
        
        else 
        	ptr.next = top;
        
        top = ptr;
        System.out.print ( "Record Pushed\n\n" );
        
    }
    
    void pop () {
    	
        if ( top == null ) {
        	
        	System.out.print ( "Stack Underflow\n\n" );
        	
        }
        
        else {
        	
           node ptr = top;
           top = top.next;
           ptr.next = null;
        	
        }
        
        System.out.print ( "Record Popped\n\n" );
        
    }
    
    void search () {
    	
        int pos = 1;
        boolean flag = false;
        
        System.out.print ( "\nEnter the UID:-" );
        Uid = sc.nextLine ();
        System.out.print ( "Enter the CGPA:-" );
        name = sc.nextLine ();
        
        node ptr = top;
        
        while ( ptr != null ) {
        	
            if ( ptr.UID == Uid || ptr.NAME == name ) {
            	
            	System.out.print ( "Searched UID and CGPA is found at " + pos + " in a Stack.\n" );
        		flag = true;
            	
            }
            
            pos ++;
            ptr = ptr.next;
            
        }
        
        if ( flag == false )
        	System.out.print ( "Searched UID and CGPA is not found in a Stack.\n" );
        System.out.println ();
        
    }
    
    void display () {
    	
        node ptr = top;
        
        if ( ptr == null )
            System.out.print ( "\nEmpty Stack" );
        else {
        	
            System.out.print ( "\nElements of Stack:-" );
            
            while ( ptr != null ) {
            	
                System.out.print ( "\nUID:-" + ptr.UID );
                System.out.print ( "\nName:-" + ptr.NAME );
                ptr = ptr.next;
                
            }
            
        }
        
        System.out.println("\n");
        
    }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in );
		int ch = 0;
	    Stack stack = new Stack ();
	    
	    while ( ch != 5 ) {
	    	
	       System.out.print ( "\n\"**********Operation on Stack using linked list**********\"\n" );
	       System.out.print ( "\n1.Push\n2.Pop\n3.Search\n4.Display\n5.Exit" );
	       System.out.print ( "\n\nEnter the choice:-" );
	       ch = sc.nextInt ();
	       
	       switch(ch) {
	       
	           case 1:
	               stack.push ();
	               break;
	           case 2:
	               stack.pop ();
	               break;
	           case 3:
	               stack.search ();
	               break;
	           case 4:
	               stack.display ();
	               break;
	           case 5:
	        	   System.exit ( 0 );
	               break;
	           default:System.out.print ( "\nPlease enter valid choice\n\n" );
	           
	       }
	       
	    }

	}

}
