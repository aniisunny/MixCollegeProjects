package JavaLinkedList;

import java.util.Scanner;

import JavaLinkedList.SingleLinkedList.node;

public class AverageofLinkedList {
	
	int data;
    node head,tail;
    int average;
    
    
    Scanner sc = new Scanner ( System.in );
	
	class node {
		
		int DATA;
	    node next;
		
	}
	
	AverageofLinkedList () {
		
        head = tail = null;
        average = 0;
        
    }
	
	void insertatLast ()  {
		
		System.out.print ( "\nEnter the data:-" );
        data = sc.nextInt ();
        
        node ptr = new node ();
        
        ptr.DATA = data;
        
        if( head == null )
            head = tail = ptr;
        
        tail.next= ptr;
        tail = ptr;
        
        System.out.print ( "Record Inserted\n\n" );
        
    }
	
	void averageAndUpdate () {
		
		int count = 0, sum = 0;
		
        node ptr = head;
       while ( ptr != null ) {
        	
        	sum += ptr.DATA;
            count++;
            ptr= ptr.next;
            
        }
       
        average = sum / count;
        
        ptr = head;
        while ( ptr != null ) {
        	
        	ptr.DATA += average;
        	System.out.println ( "\nDATA:-" + ptr.DATA );
            ptr= ptr.next;
            
        }
		
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner ( System.in );
		int ch = 0;
	    AverageofLinkedList averageofLinkedList = new AverageofLinkedList ();
	    
	    while ( ch!=12 ) {
	    	
	       System.out.print ( "\n***************Average of Single linked list***************\n" );
	       System.out.print ( "\n1.  Insertion at last\n2.  Average and update \n3.  Exit" );
	       System.out.print ( "\n\nEnter the choice:-" );
	       ch = sc.nextInt ();
	       
	       switch ( ch ) {
	       
	           case 1:
	        	   averageofLinkedList.insertatLast();
	               break;
	           case 2:
	        	   averageofLinkedList.averageAndUpdate();
	               break;
	           case 3:
	        	   System.exit ( 0 );
	               break;
	           default:System.out.print ( "\nPlease enter valid choice\n\n" );
	           
	       }
	       
	    }

	}

}
