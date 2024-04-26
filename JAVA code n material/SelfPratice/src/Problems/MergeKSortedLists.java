package Problems;

import java.util.Scanner;

class Listnode {
	
	@SuppressWarnings("resource")
	Scanner scan = new Scanner ( System.in );
	
	int val;
	Listnode next, head, tail;
	
	Listnode ( int x ) {
		
		val = x;
		
	}
	
	void insertion () {
		
		System.out.print ( "Enter the insertion element :-" );
		int ins = scan.nextInt ();
		
		Listnode ptr = new Listnode ( ins );
		
		if ( head == null ) 
			head = tail = ptr;
		
		tail.next = ptr;
		tail = ptr;
		
	}
	
	void display () {
		
		Listnode ptr = head;
		
		while ( ptr != null ) {
			
			System.out.print ( ptr.val + " " );
			ptr = ptr.next;
			
		}
		
		System.out.println ();
		
	}
	
}

public class MergeKSortedLists {
	
	 static public Listnode mergeKLists ( Listnode [] lists ) {
		 
		 Listnode head1 = null;
		 
		 if ( lists == null )
			 return head1;
		 
		 else {
			 
			 Listnode merge, head = null, tail = null, tail1 = null;
			 head1 = lists [ 0 ];
			 
				for ( int i = 0; i < lists.length - 1; i ++ ) {
					
					while ( lists [ i ] != null && lists [ i + 1 ] != null ) {

						if ( lists [ i ].val > lists [ i + 1 ].val ) {
							
							merge = new Listnode ( lists [ i + 1 ].val );
							lists [ i + 1 ] = lists [ i + 1 ].next;
							
						}
						
						else {
							
							merge = new Listnode ( lists [ i ].val );
							lists [ i ] = lists [ i ].next;
							
						}
						
						if ( head == null )
							head = tail = merge;
						
						else {
							
							tail.next = merge;
							tail = merge;
							
						}
						
					}
					
					while ( lists [ i ] != null ) {
						
						merge = new Listnode ( lists [ i ].val );
						lists [ i ] = lists [ i ].next;
						
						if ( head == null )
							head = tail = merge;
						
						else {
							
							tail.next = merge;
							tail = merge;
							
						}
						
					}
					
					while ( lists [ i + 1 ] != null ) {
						
						merge = new Listnode ( lists [ i + 1 ].val );
						lists [ i + 1 ] = lists [ i + 1 ].next;
						
						if ( head == null )
							head = tail = merge;
						
						else {
							
							tail.next = merge;
							tail = merge;
							
						}
						
					}
					
					head1 = null;
					
					while ( head != null ) {
						
						lists [ i + 1 ] = new Listnode ( head.val );
						
						if ( head1 == null ) 
							head1 = tail1 = lists [ i + 1 ];
						
						else { 
							
							tail1.next = lists [ i + 1 ];
							tail1 = lists [ i + 1 ];
							
						}
						
						head = head.next;
						
					}
					
					lists [ i + 1 ] = head1;
					
				}
					
				return head1;
			 
		 }
		 
	 }

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner ( System.in );
		
		System.out.print ( "Enter the size of lists :- " );
		int k = scan.nextInt ();
		
		Listnode [] lists = new Listnode [ k ];
		
		for ( int i = 0; i < k; i ++ ) {
			
			System.out.print ( "you are insert node in list ( Y / N ) :- " );
			char ch = scan.next ().charAt ( 0 );
			
			while ( ch != 'n' ) {
				
				lists[0].insertion ();
				
			}
			
		}
		
		for ( int i = 0; i < k; i ++ ) 
			lists [ i ].display ();
		
		Listnode merge = mergeKLists ( lists );
		merge.display ();
		
	}

}
