package DequeAndArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

class Book {  
	
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
	
}

public class Example {

	public static void main(String[] args) {
		
		Deque < String > deque = new ArrayDeque < String > ();
		
		deque.add ( "Aniruddha" );
		deque.add ( "Anjali" );
		deque.add ( "Deepak" );
		deque.add ( "Santosh" );
		deque.add ( "Lovejeet" );
		
		System.out.println ( deque );
		
		deque.offerFirst ( "Kriti" );
		deque.offerLast ( "Divya" );
		
		System.out.println ( deque );
		
		deque.poll ();
		deque.pollFirst ();   // same as poll 
		deque.pollLast ();
		
		System.out.println ( deque );
		System.out.println ();
		
		Deque < Book > set = new ArrayDeque < Book > ();    
	    
	    Book b1 = new Book ( 101, "Let us C", "Yashwant Kanetkar", "BPB", 8 );    
	    Book b2 = new Book ( 102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4 );    
	    Book b3 = new Book ( 103, "Operating System", "Galvin", "Wiley", 6 );    
	    
	    set.add ( b1 );    
	    set.add ( b2 );    
	    set.add ( b3 );    
	      
	    for ( Book b : set )     
	    	System.out.println ( b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity );        

	}

}
