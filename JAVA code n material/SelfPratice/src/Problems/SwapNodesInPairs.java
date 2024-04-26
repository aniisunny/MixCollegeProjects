package Problems;

class SwapNode {
	
	int val;
	SwapNode next, head, tail;
	
	SwapNode ( int x ) {
		
		val = x;
		
	}
	
	void insertion (int x ) {
		
		SwapNode ptr = new SwapNode ( x );
		
		if ( head == null )
			head = tail = ptr;
		
		tail.next = ptr;
		tail = ptr;
		
	}
	
	void display () {
		
		SwapNode ptr = head;
		
		while ( ptr != null ) {
			
			System.out.print ( ptr.val + " " );
			ptr = ptr.next;
			
		}
		
	}
	
}

public class SwapNodesInPairs {
	
	 static public SwapNode swapPairs ( SwapNode head ) {
		 
		 SwapNode ptr = head;
		 
		 while ( ptr.next != null ) {
			 
			 int t = ptr.val;
			 SwapNode temp = ptr.next;
			 ptr.val = temp.val;
			 temp.val = t;
			 ptr = temp.next;
			 
		 }
		 
		 return head;
		 
	 }

	public static void main(String[] args) {
		
		SwapNode swap = new SwapNode ( 0 );
		swap.insertion ( 1 );
		swap.insertion ( 2 );
		swap.insertion ( 3 );
		swap.insertion ( 4 );
		swap.insertion ( 5 );
		
		swap.display ();
		System.out.println ();
		
		SwapNode swapNode = swapPairs ( swap );
		swapNode.display ();

	}

}
