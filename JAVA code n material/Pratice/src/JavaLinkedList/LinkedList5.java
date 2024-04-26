package JavaLinkedList;

import java.util.Scanner;


class node {
	
	int val;
	node next;
	
}
public class LinkedList5 {
	
	Scanner sc = new Scanner ( System.in );
	public int data ;
	public int data1 = 0;
	public int data2 = 0;
	node head,tail;

	
	void insertion () {
		
		node ptr = new node ();
		
		System.out.print ( "\nEnter the data:-" );
		data = sc.nextInt ();
		
		ptr.val = data;
		ptr.next = null;
		
		if ( head == null ) 
			head = tail = ptr;
		tail.next = ptr;
		tail = ptr;
		
	}
	
	public void reverse1 () {
		
		int info1 = 0, remainder;
		node ptr = head;
		
		while ( ptr != null ) {
			
			info1 = ( info1 * 10 ) + ptr.val;
			ptr = ptr.next;
			
		}
		
		while ( info1 != 0 ) {
			
			remainder = info1 % 10;
			data1 = ( data1 * 10 ) + remainder;
			info1 /= 10;
			
		}
		
		System.out.println ( data1 );
	}
	
   public void reverse2 () {
		
		int info2 = 0, remainder;
		node ptr = head;
		
		while ( ptr != null ) {
			
			info2 = ( info2 * 10 ) + ptr.val;
			ptr = ptr.next;
			
		}
		
		while ( info2 != 0 ) {
			
			remainder = info2 % 10;
			data2 = ( data2 * 10 ) + remainder;
			info2 /= 10;
			
		}
		
		System.out.println ( data2 );
	}

   public void addTwoNumbers (int a , int b) {
	   
	   data = a+b;
	   int remainder;

	   while ( data != 0 ) {
		   
		   node ptr = new node ();		  
		   
		   remainder = data % 10;
		   ptr.val = remainder;
		   ptr.next = null;
		   
		   if ( head == null ) 
				head = tail = ptr;
			
		   tail.next = ptr;
			tail = ptr;
			
			data /=10;
		   
	   }
		
   }
   
   public void display() {
   	
   	node ptr = head;
   	
       if ( ptr == null )
           System.out.print ( "\nEmpty List" );
       else {
       	
           System.out.print ( "\nNew Linked List:-" );
           
           while ( ptr!=null )
           {
           	
               System.out.print ( "\nValue:-" + ptr.val );
               ptr = ptr.next;
               
           }
           
       }
       
       System.out.println ();
       
   } 

	public static void main(String[] args) {
		
		int ch = 0;
		Scanner sc = new Scanner ( System.in );
		
		LinkedList5 linkedList1 = new LinkedList5 ();
		LinkedList5 linkedList2 = new LinkedList5 ();
		LinkedList5 linkedList3 = new LinkedList5 ();
		
		while ( ch != 7 ) {
			
			System.out.print ( "\n1. Insertion in linked list 1\n2. Insertion in linked list 2\n" );
			System.out.print ( "3. Reverse linked list 1\n4. Reverse linked list 2\n" );
			System.out.print ( "5. Addition of reverse linked list\n6. Display\n7. Exit\n\n" );
			System.out.print ( "Enter the choice:-" );
			ch = sc.nextInt ();
			
			switch ( ch ) {
			
			case 1 :
				linkedList1.insertion ();
				break;
			case 2 :
				linkedList2.insertion ();
				break;
			case 3 :
				linkedList1.reverse1 ();
				break;
			case 4 : 
				linkedList2.reverse2 ();
				break;
			case 5 :
				linkedList3.addTwoNumbers (linkedList1.data1,linkedList2.data2);
				break;
			case 6 :
				linkedList1.display ();
				linkedList2.display ();
				linkedList3.display ();
				break;
			case 7 :
				System.exit (0);
				break;
			default : System.out.print ("\n Wrong input\n");
					
			
			}
		
		}
		
	}

}
