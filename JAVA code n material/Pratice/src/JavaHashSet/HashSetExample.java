package JavaHashSet;

import java.util.HashSet;
import java.util.Iterator;

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

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet < String > set = new HashSet < String > ();
		
		set.add ( "Aniruddha" );
		set.add ( "Deepak" );
		set.add ( "Santosh" );
		set.add ( "Lovejeet" );
		
		System.out.println ( set );
		
		HashSet < Integer > hset = new HashSet < Integer > ();        
        
        hset.add ( 121 );   
        hset.add ( 111 );  
        hset.add ( 151 );    
        
        System.out.println ( "Hash set Elements: " + hset ); 
		
		Iterator <  String > itr = set.iterator ();
		
		while ( itr.hasNext () )
			System.out.println ( itr.next () );
		
		System.out.println ( set.clone () );
		
		HashSet < String > cloneSet = new HashSet < String > ();
		cloneSet = ( HashSet ) set.clone ();
		System.out.println ( cloneSet );
		
		cloneSet = set;
		System.out.println ( cloneSet );
		
		System.out.println ( set.contains ( "any chutiya" ) );
		
		System.out.println ( set.remove ( "koi" ) );
		System.out.println ( set.remove ( "Santosh" ) );
		System.out.println ( set );
		
		set.add ( "Santosh" );
		set.add ( "Santosh" );
		System.out.println ( set );
		System.out.println ( set.size () );
		
		set.clear ();
		System.out.println ( set );
		System.out.println( set.isEmpty () );
		
		System.out.println ("\n" );
		
		HashSet < Book > list = new HashSet < Book > ();  
	    
		Book b1 = new Book ( 101, "Let us C", "Yashwant Kanetkar", "BPB", 8 );  
	    Book b2 = new Book ( 102, "Data Communications & Networking","Forouzan", "Mc Graw Hill", 4 );  
	    Book b3 = new Book ( 103, "Operating System", "Galvin", "Wiley", 6 );  
			     
		list.add ( b1 );  
	    list.add ( b2 );  
	    list.add ( b3 );  
	    
	    Iterator < Book > itr1 = list.iterator ();
	    
	    while ( itr1.hasNext () ) {
	    	
	    	Book b = itr1.next ();
	    	System.out.println ( b.id + "  " + b.name + "  " + b.author + "  " + b.publisher + "  " + b.quantity ); 
	    	
	    }

	}

}
