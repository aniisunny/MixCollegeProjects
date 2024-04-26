package Problems;

class Node {
	
	int val;
	Node next;
	Node head, tail;
	
	/*Node ( int x ) {
		
		val = x;
		
	}*/
	
	void insertion ( int x ) {
		
		Node ptr = new Node ();
		
		ptr.val = x;
		ptr.next = null;
		
		if ( head == null )
			head = tail = ptr;
		
		tail.next = ptr;
		tail = ptr;
		
	}
	
	void display () {
		
		Node ptr = head;
		
		while ( ptr != null ) {
			
			System.out.print ( ptr.val + " " );
			ptr = ptr.next;
			
		}
		
		System.out.println ();
		
	}
	
}

public class MergeTwoSortedLists {
	
	public static Node mergeTwoLists ( Node l1, Node l2 ) {
		
		Node l3 = new Node ();
		
		while ( l1 != null && l2 != null ) {

			if ( l1.val > l2.val ) {
				
				l3.insertion ( l2.val );
				l2 = l2.next;
				
			}
			
			else {
				
				l3.insertion ( l1.val );
				l1 = l1.next;
				
			}
			
		}
		
		while ( l1 != null ) {
			
			l3.insertion ( l1.val );
			l1 = l1.next;
			
		}
		
		while ( l2 != null ) {
			
			l3.insertion ( l2.val );
			l2 = l2.next;
			
		}
		
		return l3;
		
	}

	public static void main(String[] args) {
		
		Node l1 = new Node ();
		l1.insertion ( 1 );
		l1.insertion ( 2 );
		l1.insertion ( 4 );
		
		Node l2 = new Node ();
		l2.insertion ( 1 );
		l2.insertion ( 3 );
		l2.insertion ( 4 );
		
		l1.display ();
		l2.display ();
		 
		Node l3 = mergeTwoLists ( l1.head, l2.head );
		l3.display ();
		
	}

}