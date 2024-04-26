package JavaLinkedList;

import java.util.Scanner;

public class DoublyLinkedList {
	
	String Uid;
    float Cgpa;
    node head, tail;
    
    Scanner sc = new Scanner ( System.in );
	
	class node {
		
		node previous;
		String UID;
	    float CGPA;
	    node next;
		
	}
	
	DoublyLinkedList () {
		
        head = tail = null;
        
    }
	
	void insertatBeg () {
		
        System.out.print ( "\nEnter the UID:-" );
        Uid = sc.next ();
        System.out.print ( "Enter the CGPA:-" );
        Cgpa = sc.nextFloat ();
        
        node ptr = new node();
        
        ptr.previous = null;
        ptr.UID = Uid;
        ptr.CGPA = Cgpa;
        
        if ( head == null )
        	head = tail = ptr;
        
        else {
        	
        	 head.previous = ptr;
             ptr.next = head;
             head = ptr;
        	
        }
        
        System.out.println ( head.previous );
        System.out.println ( head.next );
        System.out.println ( head.UID );
        System.out.println ( head.CGPA );
        System.out.println ( head );
        System.out.println ( ptr );
        
        System.out.print ( "Record Inserted\n\n" );
        
    }
	
	void insertatLast ()  {
		
		System.out.print ( "\nEnter the UID:-" );
        Uid = sc.next ();
        System.out.print ( "Enter the CGPA:-" );
        Cgpa = sc.nextFloat ();
        
        node ptr = new node ();
        
        ptr.UID = Uid;
        ptr.CGPA = Cgpa;
        ptr.next = null;
        
        ptr.previous = tail;
        tail.next = ptr;
        tail = ptr;
        
        System.out.print ( "Record Inserted\n\n" );
        
    }
	
	void insertatRandom ()  {
        node ptr = new node ();
        node temp = head;
        
        System.out.print ( "\nEnter the UID:-" );
        Uid = sc.next ();
        System.out.print ( "Enter the CGPA:-" );
        Cgpa = sc.nextFloat ();
        System.out.print ( "Enter the position of new node:-" );
        int pos = sc.nextInt ();
        
        ptr.UID = Uid;
        ptr.CGPA = Cgpa;
        
        for ( int i = 1; i < pos; i++ )
        	temp = temp.next;
        
        ptr.previous = temp.previous;
        ptr.next = temp;
        temp.previous.next = ptr;
        temp.previous = ptr;
      
        System.out.print ( "Record Inserted\n\n" );
        
    }
	
	void deleteatBeg() {
        
		node ptr = head;
		ptr.next.previous = null;
		head = ptr.next;
		ptr.next = null;
		
        System.out.print ( "Record Deleted\n\n" );
        
    }
	
    void deleteatLast() {
    	
    	node ptr = tail;
    	ptr.previous.next = null;
    	tail = ptr.previous;
    	ptr.previous = null;
    	
    	
      System.out.print ( "Record Deleted\n\n" );
      
    }
    
    void deleteatRandom() {
    	
        System.out.print ( "Enter the position of new node:-" );
        int pos = sc.nextInt ();
        
        node ptr = head;
        
        for ( int i = 1; i < pos; i++ )
        	ptr = ptr.next;
        
        ptr.previous.next = ptr.next;
        ptr.next.previous = ptr.previous;
        ptr.previous = ptr.next = null;
        
        System.out.print ( "Record Deleted\n\n" );
        
    }
    
    void searchNode() {
    	
        System.out.print ( "\nEnter the search UID:-" );
        Uid = sc.next ();
        System.out.print ( "Enter the search CGPA:-" );
        Cgpa = sc.nextFloat ();
        
        int pos = 1;
        boolean flag = false;
        node ptr = head;
        
        while ( ptr != null ) {
        	
        	if ( ptr.UID == Uid || ptr.CGPA == Cgpa ) {
        		
        		System.out.print ( "Searched UID and CGPA is found at " + pos + " in a list.\n" );
        		flag = true;
        		
        	}
        	
        	pos++;
        	ptr = ptr.next;
        	
        }
        
        if ( flag == false )
        	System.out.print ( "Searched UID and CGPA is not found in a list.\n" );
        System.out.println ();
        
    }
    
    void insertafterSearch() {
    	
    	 System.out.print ( "\nEnter the search UID:-" );
         String uid = sc.next ();
         System.out.print ( "Enter the search CGPA:-" );
         float cgpa = sc.nextFloat ();
         
         boolean flag = false;
         node ptr = head;
         
         while ( ptr != null ) {
         	
         	if ( ptr.UID == uid || ptr.CGPA == cgpa ) {
         		
         		System.out.print ( "\nEnter the UID:-" );
                Uid = sc.next ();
                System.out.print ( "Enter the CGPA:-" );
                Cgpa = sc.nextFloat ();
                
                node ptr1 = new node ();
                
                ptr1.UID = Uid;
                ptr1.CGPA = Cgpa;
                
                ptr1.next = ptr.next;
                ptr.next.previous = ptr1;
                ptr.next = ptr1;
                ptr1.previous = ptr;
                
                System.out.print ( "Record Inserted\n" );
         		flag = true;
         		
         	}
         	
         	ptr = ptr.next;
         	
         }
         
         if ( flag == false )
         	System.out.print ( "Searched UID and CGPA is not found in a list.\n" );
         System.out.println ();
       
    }
    
    void deleteafterSearch() {
    	
    	 System.out.print ( "\nEnter the search UID:-" );
         String uid = sc.next ();
         System.out.print ( "Enter the search CGPA:-" );
         float cgpa = sc.nextFloat ();
         
         boolean flag = false;
         node ptr = head;
         
         while ( ptr != null ) {
         	
         	if ( ptr.UID == uid || ptr.CGPA == cgpa ) {
                
               ptr.next = ptr.next.next;
               ptr.next.previous.next = null;
               ptr.next.previous.previous = null;
               ptr.next.previous = ptr;
                
               System.out.print ( "Record Deleted\n" );
               flag = true;
         		
         	}
         	
         	ptr = ptr.next;
         	
         }
         
         if ( flag == false )
         	System.out.print ( "Searched UID and CGPA is not found in a list.\n" );
         System.out.println ();
        
    }
    
    void countNode() {
        
    	node ptr = head;
    	int count = 0;
    	
    	while ( ptr != null ) {
    		
    		count ++;
    		ptr = ptr.next;
    		
    	}
        
    	System.out.print ( "Total nodes in a linked list:-" + count + "\n\n" );
        
    } 
    
    void display() {
    	
    	node ptr = head;
    	
        if ( ptr == null )
            System.out.print ( "\nEmpty List" );
        else {
        	
            System.out.print ( "\nElements of Linked List:-" );
            
            while ( ptr != null ) {
            	
                System.out.print ( "\nUID:-" + ptr.UID );
                System.out.print ( "\nCGPA:-" + ptr.CGPA);
                ptr = ptr.next;
                
            }
            
        }
        
        System.out.println("\n");
        
    } 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in );
		int ch = 0;
	    DoublyLinkedList doublyLinkedList = new DoublyLinkedList ();
	    
	    while ( ch!=12 ) {
	    	
	       System.out.print ( "\n***************Operation on Doubly linked list***************\n" );
	       System.out.print ( "\n1.  Insertion at beginning\n2.  Insertion at last node\n3.  Insertion at random position" );
	       System.out.print ( "\n4.  Deletion at beginning\n5.  Deletion at last node\n6.  Deletion at random position\n7.  Search Node" );
	       System.out.print ( "\n8.  Insertion after Searching\n9.  Deletion after Searching\n10. Count Node\n11. Display List\n12. Exit" );
	       System.out.print ( "\n\nEnter the choice:-" );
	       ch = sc.nextInt ();
	       
	       switch ( ch ) {
	       
	           case 1:
	               doublyLinkedList.insertatBeg();
	               break;
	           case 2:
	        	   doublyLinkedList.insertatLast();
	               break;
	           case 3:
	        	   doublyLinkedList.insertatRandom();
	               break;
	           case 4:
	        	   doublyLinkedList.deleteatBeg();
	               break;
	           case 5:
	        	   doublyLinkedList.deleteatLast();
	               break;
	           case 6:
	        	   doublyLinkedList.deleteatRandom();
	               break;
	           case 7:
	        	   doublyLinkedList.searchNode();
	               break;
	           case 8:
	        	   doublyLinkedList.insertafterSearch();
	               break;
	           case 9:
	        	   doublyLinkedList.deleteafterSearch();
	               break;
	           case 10:
	        	   doublyLinkedList.countNode();
	               break; 
	           case 11:
	        	   doublyLinkedList.display();
	               break; 
	           case 12:
	               System.exit ( 0 );
	               break;
	           default:System.out.print ( "\nPlease enter valid choice\n\n" );
	           
	       }
	       
	    }
		
	}

}
