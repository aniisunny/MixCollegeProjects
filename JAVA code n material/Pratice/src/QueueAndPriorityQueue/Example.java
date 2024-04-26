package QueueAndPriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

class Book implements Comparable < Book > {  
	
	int id;  
	String name, author, publisher;  
	int quantity;  
	
	public Book ( int id, String name, String author, String publisher, int quantity ) {
		
		this.id = id;  
		this.name = name;  
		this.author = author;  
		this.publisher = publisher;  
		this.quantity = quantity;  
		
	}

	public int compareTo ( Book b ) {
		
		//System.out.println ( id );
		//System.out.println ( b.id );
		
		if ( id > b.id ) 
			return 1;  
		
		else if ( id < b.id ) 
			return -1;  
		
		else  
			return 0;  
		
	}
	
}

public class Example {

	public static void main(String[] args) {
		
		PriorityQueue < String > queue1 = new PriorityQueue < String > ();
		
		queue1.add ( "Aniruddha" );
		queue1.add ( "Anjali" );
		queue1.add ( "Deepak" );
		queue1.add ( "Santosh" );
		queue1.add ( "Lovejeet" );
		
		System.out.println ( queue1 );
		
		System.out.println ( queue1.element () );
		System.out.println ( queue1.peek () );
		
		System.out.println ( "\niterating the queue elements:" );  
		
		Iterator < String > itr = queue1.iterator (); 
		
		while ( itr.hasNext () )
			System.out.println ( itr.next () );  
		
		queue1.poll ();
		queue1.remove ();
		
		System.out.println ( "\nafter removing two elements:" );  
		
		Iterator < String > itr2 = queue1.iterator ();
		
		while ( itr2.hasNext () ) 
			System.out.println ( itr2.next () ); 
		
		Queue < Book > queue = new PriorityQueue < Book > ();  
	     
	    Book b1 = new Book ( 121, "Let us C", "Yashwant Kanetkar", "BPB", 8 );  
	    Book b2 = new Book ( 233, "Operating System", "Galvin", "Wiley", 6 );  
	    Book b3 = new Book ( 101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4 );  
	      
	    queue.add ( b1 );  
	    queue.add ( b2 );  
	    queue.add ( b3 ); 
	    
	    System.out.println ( "\nTraversing the queue elements:" );  
	      
	    for ( Book b : queue )   
	    	System.out.println ( b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity );  
	    
	    queue.remove ();
	    
	    System.out.println ( "\nAfter removing one book record:" );  
	    for ( Book b : queue )   
	        System.out.println ( b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity );    

	}

}
