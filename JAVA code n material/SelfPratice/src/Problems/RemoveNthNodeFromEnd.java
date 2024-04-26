package Problems;

import java.util.Scanner;

class ListNode1 {
	
	int val;
	ListNode1 next;
	
	ListNode1 ( int x ) {
		
		val = x;
		
	}
	
}

public class RemoveNthNodeFromEnd {
	
	ListNode1 head, tail;
	
	void insertion ( int x ) {
		
		ListNode1 ptr = new ListNode1 ( x );
		
		if ( head == null )
			head = tail = ptr;
		
		else {
			
			tail.next = ptr;
			tail = ptr;
			
		}
		
	}
	
	void display ( ListNode1 ptr ) {
		
		while ( ptr != null ) {
			
			System.out.println ( ptr.val );
			ptr = ptr.next;
			
		}
		
	}
	
	ListNode1 removeNthNodeFromEnd ( ListNode1 head , int n ) {
		
		ListNode1 ptr = head;
		int count = 0;
		
		while ( ptr != null ) {
			
			count ++;
			ptr = ptr.next;
			
		}
		
		n = count - n + 1;
		
		if ( n == 1 ) {
			
			head = head.next;
			
		}
		
		else {
			
			ptr = head;
			ListNode1 temp = null;
			
			for ( int i = 1; i < n; i ++ ) {
				
				temp = ptr;
				ptr = ptr.next;
				
			}
			
			temp.next = ptr.next;
			
		}
		
		return head;
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner ( System.in );
		
		RemoveNthNodeFromEnd remove = new RemoveNthNodeFromEnd ();
		
		remove.insertion ( 1 );
		remove.insertion ( 2 );
		remove.insertion ( 3 );
		remove.insertion ( 4 );
		remove.insertion ( 5 );
		remove.display ( remove.head );
		
		System.out.print ( "Enter the Nth node :- " );
		int n = scan.nextInt ();
		
		remove.head = remove.removeNthNodeFromEnd ( remove.head, n );
		remove.display ( remove.head );

	}

}
