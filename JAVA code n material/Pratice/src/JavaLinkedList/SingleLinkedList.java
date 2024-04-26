package JavaLinkedList;

import java.util.Scanner;

public class SingleLinkedList {
	
	String Uid;
    float Cgpa;
    node head,tail;
    
    Scanner sc = new Scanner ( System.in );
	
	class node {
		
		String UID;
	    float CGPA;
	    node next;
		
	}
	
	SingleLinkedList () {
		
        head = tail = null;
        
    }
	
	void insertatBeg () {
		
        System.out.print ( "\nEnter the UID:-" );
        Uid = sc.next ();
        System.out.print ( "Enter the CGPA:-" );
        Cgpa = sc.nextFloat ();
        
        node ptr = new node ( );
 
        ptr.UID = Uid;
        ptr.CGPA = Cgpa;
        ptr.next = head;
        
        if( tail == null )
            tail = ptr;
        
        head = ptr;
        
       /* ptr->next= NULL;
        if( head==NULL )
        {
            head= temp= tail= ptr;
        }
        head= ptr;
        ptr->next= temp;
        temp= ptr;*/
        
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
        tail.next= ptr;
        tail = ptr;
        
        System.out.print ( "Record Inserted\n\n" );
        
    }
	
	void insertatRandom ()  {
		
        node ptr = new node ();
        
        node temp1= head;
        node temp2= head;
        int pos= 0,i;
        
        System.out.print ( "\nEnter the UID:-" );
        Uid = sc.next ();
        System.out.print ( "Enter the CGPA:-" );
        Cgpa = sc.nextFloat ();
        System.out.print ( "Enter the position of new node:-" );
        pos = sc.nextInt ();
        
        ptr.UID = Uid;
        ptr.CGPA = Cgpa;
        ptr.next = null;
        
        for ( i=1; i<pos; i++ )
            temp1 = temp1.next;
            
        ptr.next = temp1;
        
        for( i=1; i<pos-1; i++ )
            temp2 = temp2.next;
        
        temp2.next = ptr;
        
        System.out.print ( "Record Inserted\n\n" );
        
    }
	
	void deleteatBeg() {
		
        node ptr = head;
        head = ptr.next;
        
        System.out.print ( "Record Deleted\n\n" );
        
    }
	
    void deleteatLast() {
    	
      node ptr = head;
      
      while ( ptr.next != tail ) 
          ptr = ptr.next;
      
      tail = ptr;
      ptr = tail.next;
      tail.next = null;
      
      System.out.print ( "Record Deleted\n\n" );
      
    }
    
    void deleteatRandom() {
    	
        int pos,i;
        System.out.print ( "Enter the position of new node:-" );
        pos = sc.nextInt ();
        
        node ptr = head;
        node temp = null;
        
        /*for( i=1; i<pos-1; i++ )
            ptr= ptr.next;
            
        for( i=pos-1; i<pos; i++ )
            temp= ptr.next;*/
        
        for ( i=1; i<pos; i++ ) {
        	
        	temp = ptr;
        	ptr = ptr.next;
        	
        }
            
        temp.next = ptr.next;
        
        System.out.print ( "Record Deleted\n\n" );
        
    }
    
    void searchNode() {
    	
        String uid;
        int counter = 0, pos = 0;
        float cgpa;
        
        System.out.print ( "\nEnter the search UID:-" );
        uid = sc.next ();
        System.out.print ( "Enter the search CGPA:-" );
        cgpa = sc.nextFloat ();
        
        node ptr = head;
        
        while ( ptr!= null ) {
        	
            pos++;
            if ( ptr.UID == uid || ptr.CGPA == cgpa ) {
            	
                System.out.print ( "\nSearch UID and CGPA is found in a linked list at node " + pos );
                counter++;
                
            }
            
            ptr = ptr.next;
        }
        
        if ( counter == 0 )
        	System.out.print ( "Search UID and CGPA is not found in a linked list at node\n\n" );
        else
            System.out.println ( "\n" );
        
    }
    
    void insertafterSearch() {
    	
        String uid;
        int counter = 0;
        float cgpa;
        
        System.out.print ( "\nEnter the search UID:-" );
        uid = sc.next ();
        System.out.print ( "Enter the search CGPA:-" );
        cgpa = sc.nextFloat ();
        
        node ptr = head;
        
        while ( ptr != null ) {
        	
            if ( ptr.UID == uid || ptr.CGPA == cgpa ) {
            	
                node ptr1 = new node ();
                
                System.out.print ( "\nEnter the UID:-" );
                Uid = sc.next ();
                System.out.print ( "Enter the CGPA:-" );
                Cgpa = sc.nextFloat ();
                
                ptr1.UID = Uid;
                ptr1.CGPA = Cgpa;
                ptr1.next = null;
                ptr1.next = ptr.next;
                ptr.next = ptr1;
                counter++;
                
                System.out.print ( "Record Inserted" );
                
            }
            
            ptr = ptr.next;
            
        }
        
        if ( counter == 0 )
            System.out.print ( "Search UID and CGPA is not found in a linked list so Insertion is not possible\n\n" );
        else
        	System.out.print ( "\n\n" );
    }
    
    void deleteafterSearch() {
    	
        String uid;
        int counter = 0;
        float cgpa;
        
        System.out.print ( "\nEnter the search UID:-" );
        uid = sc.next ();
        System.out.print ( "Enter the search CGPA:-" );
        cgpa = sc.nextFloat ();
        
        node  ptr = head;
        
        while ( ptr != null ) {
        	
            if ( ptr.UID == uid || ptr.CGPA == cgpa ) {
            	
                node temp1 = ptr;
                node temp2 = ptr.next;
                temp1.next = temp2.next;
                counter++;
                
                System.out.print ( "Record Deleted" );
            }
            
            ptr = ptr.next;
            
        }
        
        if( counter == 0 )
            System.out.print ( "Search UID and CGPA is not found in a linked list so Deletion is not possible\n\n" );
        else
        	System.out.println ("\n" );
        
    }
    
    void countNode() {
    	
        int count= 0;
        node ptr = head;
        while ( ptr!= null ) {
        	
            count++;
            ptr= ptr.next;
            
        }
        
        System.out.print ( "Total nodes in a linked list:-" + count + "\n\n" );
        
    } 
    
    void display() {
    	
    	node ptr = head;
    	
        if ( ptr == null )
            System.out.print ( "\nEmpty List" );
        else {
        	
            System.out.print ( "\nElements of Linked List:-" );
            
            while ( ptr!=null )
            {
            	
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
	    SingleLinkedList singleLinkedList = new SingleLinkedList ();
	    
	    while ( ch!=12 ) {
	    	
	       System.out.print ( "\n***************Operation on Single linked list***************\n" );
	       System.out.print ( "\n1.  Insertion at beginning\n2.  Insertion at last node\n3.  Insertion at random position" );
	       System.out.print ( "\n4.  Deletion at beginning\n5.  Deletion at last node\n6.  Deletion at random position\n7.  Search Node" );
	       System.out.print ( "\n8.  Insertion after Searching\n9.  Deletion after Searching\n10. Count Node\n11. Display List\n12. Exit" );
	       System.out.print ( "\n\nEnter the choice:-" );
	       ch = sc.nextInt ();
	       
	       switch ( ch ) {
	       
	           case 1:
	               singleLinkedList.insertatBeg();
	               break;
	           case 2:
	               singleLinkedList.insertatLast();
	               break;
	           case 3:
	               singleLinkedList.insertatRandom();
	               break;
	           case 4:
	               singleLinkedList.deleteatBeg();
	               break;
	           case 5:
	               singleLinkedList.deleteatLast();
	               break;
	           case 6:
	               singleLinkedList.deleteatRandom();
	               break;
	           case 7:
	               singleLinkedList.searchNode();
	               break;
	           case 8:
	               singleLinkedList.insertafterSearch();
	               break;
	           case 9:
	               singleLinkedList.deleteafterSearch();
	               break;
	           case 10:
	               singleLinkedList.countNode();
	               break; 
	           case 11:
	               singleLinkedList.display();
	               break; 
	           case 12:
	               System.exit ( 0 );
	               break; 
	           default:System.out.print ( "\nPlease enter valid choice\n\n" );
	           
	       }
	       
	    }
		
	}

}
