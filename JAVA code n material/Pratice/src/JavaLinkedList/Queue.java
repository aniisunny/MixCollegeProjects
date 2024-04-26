package JavaLinkedList;

import java.util.Scanner;

public class Queue {

	String Uid;
    String name;
    node front, rear;
    
    Scanner sc = new Scanner ( System.in );
	
	class node {
		
		String UID;
	    String NAME;
	    node next;
		
	}
	
	Queue () {
		
        front = rear = null;
        
    }
	
    void enqueue () {
    	
    	 System.out.print ( "\nEnter the UID:-" );
         Uid = sc.nextLine ();
         System.out.print ( "Enter the CGPA:-" );
         name = sc.nextLine ();
         
        node ptr = new node ();
        
        ptr.UID = Uid;
        ptr.NAME = name;
        
        if ( rear == null )
        	front = rear = ptr;
        
        else {
        	
        	rear.next = ptr;
            rear = ptr;
        	
        }
        
        System.out.print ( "Record Inserted\n\n" );
        
    }
    
    void dequeue () {
    	
        if ( front == null ) {
        	
        	System.out.print ( "Queue Underflow\n\n" );
        	
        }
        
        else {
        	
           node ptr = front;
           front = front.next;
           ptr.next = null;
        	
        }
        
        System.out.print ( "Record Deleted\n\n" );
        
    }
    
    void search () {
    	
        int pos = 1;
        boolean flag = false;
        
        System.out.print ( "\nEnter the UID:-" );
        Uid = sc.nextLine ();
        System.out.print ( "Enter the CGPA:-" );
        name = sc.nextLine ();
        
        node ptr = front;
        
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
    	
        node ptr = front;
        
        if ( ptr == null )
            System.out.print ( "\nEmpty Queue" );
        else {
        	
            System.out.print ( "\nElements of Queue :-" );
            
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
	    Queue queue = new Queue ();
	    
	    while ( ch != 5 ) {
	    	
	       System.out.print ( "\n\"**********Operation on Queue using linked list**********\"\n" );
	       System.out.print ( "\n1.Insert\n2.Delete\n3.Search\n4.Display\n5.Exit" );
	       System.out.print ( "\n\nEnter the choice:-" );
	       ch = sc.nextInt ();
	       
	       switch(ch) {
	       	
	       		case 1:
	       			queue.enqueue();
	       			break;
	       		case 2:
	       			queue.dequeue();
	       			break;
	       		case 3:
	       			queue.search();
	       			break;
	       		case 4:
	       			queue.display();
	       			break;
	       		case 5:
	       			System.exit ( 0 );
	       			break;
	       		default:System.out.print ( "\nPlease enter valid choice\n\n" );
	           
	       }
	       
	    }

	}

}
