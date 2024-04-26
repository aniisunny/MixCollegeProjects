package Problems;

import java.util.LinkedList;
import java.util.Scanner;

class ListNode {
	
	int val;
	ListNode next;
	
}

public class addTwoNumbers {
	
	Scanner sc = new Scanner ( System.in );
	public int data;
	ListNode head,tail;

	
	void insertion () {
		
		ListNode ptr = new ListNode ();
		
		System.out.print ( "\nEnter the data:-" );
		data = sc.nextInt ();
		
		ptr.val = data;
		ptr.next = null;
		
		if ( head == null ) 
			head = tail = ptr;
		tail.next = ptr;
		tail = ptr;
		
	}
   
   public void display() {
   	
   	ListNode ptr = head;
   	
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
	
	 public ListNode addTwoNumber ( ListNode listNode1, ListNode listNode2 ) {
		
		 ListNode listNode3;
		 int temp1 = 0, temp2 = 0, remainder1, remainder2, val1 = 0, val2 = 0;
		
		while ( listNode1 != null && listNode2 != null ) {
			
			temp1 = ( temp1 * 10 ) + listNode1.val;
			temp2 = ( temp2 * 10 ) + listNode2.val;
			listNode1 = listNode1.next;
			listNode2 = listNode2.next;
			
		}
		
		while ( temp1 != 0 && temp2 != 0 ) {
			
			remainder1 = temp1 % 10;
			remainder2 = temp2 % 10;
			val1 = ( val1 * 10 ) + remainder1;
			val2 = ( val2 * 10 ) + remainder2;
			temp1 /= 10;
			temp2 /= 10;
			
		}
		
		System.out.println ( val1 + " " + val2 );
		
		int temp = val1 + val2;

		   while ( temp != 0 ) {
			   
			   listNode3 = new ListNode ();		  
			   
			   int remainder = temp % 10;
			   listNode3.val = remainder;
			   listNode3.next = null;
			   
			   if ( head == null ) 
					head = tail = listNode3;
				
			   tail.next = listNode3;
				tail = listNode3;
				
				temp /=10;
				
		   }
		   
		   return listNode3;
				
	}

	public static void main ( String[] args ) {
		
		int ch = 0;
		Scanner sc = new Scanner ( System.in );
		
		addTwoNumbers listNode1 = new addTwoNumbers ();
		addTwoNumbers listNode2 = new addTwoNumbers ();
		addTwoNumbers listNode3 = new addTwoNumbers ();
		
		while ( ch != 7 ) {
			
			System.out.print ( "\n1. Insertion in linked list 1\n2. Insertion in linked list 2\n" );
			System.out.print ( "3. Addition of two linked list\n4. Display\n5. Exit\n\n" );
			System.out.print ( "Enter the choice:-" );
			ch = sc.nextInt ();
			
			switch ( ch ) {
			
			case 1 :
				listNode1.insertion ();
				break;
			case 2 :
				listNode2.insertion ();
				break;
			case 3 :
				listNode3.addTwoNumber ( listNode1, listNode2 );
				break;
			case 4 :
				listNode3.display ();
				break;
			case 5 :
				System.exit (0);
				break;
			default : System.out.print ("\n Wrong input\n");
					
			
			}
		
		}

	}

}
