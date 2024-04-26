package JavaList;

import java.util.ArrayList;
import java.util.ListIterator;

class Book {  
	
	int id;  
	String name,author,publisher;  
	int quantity;
	
	public Book ( int id, String name, String author, String publisher, int quantity ) {  
		
	    this.id = id;  
	    this.name = name;  
	    this.author = author;  
	    this.publisher = publisher;  
	    this.quantity = quantity;  
	    
	} 
	
}

public class JavaListExample {

	public static void main(String[] args) {
		
		ArrayList < String > al = new ArrayList < String > ();
		
		al.add ( "Aniruddha" );
		al.add ( "Divya" );
		al.add ( "Kushagra" );
		al.add ( 1, "Kriti " );
		
		System.out.println ( al );
		System.out.println ( al.get ( 2 ) );
		
		al.set ( 1, "Kriti Jaiswal" ) ;
		
		System.out.println ( al );
		System.out.println ( al.remove ( 3 ) );
		System.out.println ( al );
		
		al.set ( 2, "Divya Sharma" ) ;
		al.set ( 0, "Aniruddha M. Agrawal" ) ;
		
		System.out.println ( al );
		
		ArrayList < String > al1 = new ArrayList < String > ();
		
		al1.add ( "Kushagra" );
		al1.add ( "Hritik" );
		
		al.addAll ( 1, al1 );
		
		System.out.println ( al );
		System.out.println ( al1 );
		
		al1.addAll (0, al );
		
		System.out.println ( al1 );
		
		ListIterator < String > itr = al1.listIterator ();
		
		System.out.println ( "\nTraversing Elements in forward direction:-" );
		
		while ( itr.hasNext () ) 
			System.out.println ( itr.next () );
		
		System.out.println ( "\nTraversing Elements in backward direction:-" );
		
		while ( itr.hasPrevious () ) 
			System.out.println ( itr.previous () );
		
		System.out.println ( "\n" );

		ArrayList < Book > list = new ArrayList < Book > ();  
			    
		Book b1 = new Book ( 101, "Let us C", "Yashwant Kanetkar", "BPB", 8 );  
	    Book b2 = new Book ( 102, "Data Communications & Networking","Forouzan", "Mc Graw Hill", 4 );  
	    Book b3 = new Book ( 103, "Operating System", "Galvin", "Wiley", 6 );  
			     
		list.add ( b1 );  
	    list.add ( b2 );  
	    list.add ( b3 );  
	    
	    ListIterator < Book > itr1 = list.listIterator ();
	    
	    while ( itr1.hasPrevious () ) {
	    	
	    	Book b = ( Book ) itr1.previous ();
	    	System.out.println ( b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity ); 
	    	
	    }
			  
	}

}
