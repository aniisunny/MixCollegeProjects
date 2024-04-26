package JavaLinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

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

public class Example {

	public static void main(String[] args) {
		
		LinkedHashMap < Integer, String > hashMap = new LinkedHashMap < Integer, String > ();
		
		hashMap.put ( 3264, "Aniruddha" );
		hashMap.put ( 3267, "Rahul" );
		hashMap.put ( 1312, "Santosh" );
		hashMap.put ( 3266, "Lovejeet" );
		hashMap.put ( null, null );
		hashMap.put ( null, "xyz" );
		hashMap.put ( 3235, "Santosh" );
		
		System.out.println ( hashMap );
		
		hashMap.remove( 3235 );
		System.out.println( hashMap.remove ( null, null ) );
		System.out.println( hashMap.remove ( null, "xyz" ) );
		System.out.println ( hashMap );
		
		System.out.println ( hashMap.clone () );
		System.out.println ( hashMap.containsKey ( 3235 ) );
		System.out.println ( hashMap.containsValue ( "santosh" ) );
		System.out.println ();
		
		LinkedHashMap < Integer, Book > hashMap1 = new LinkedHashMap < Integer, Book > ();
		
		Book b1 = new Book ( 101, "Let us C", "Yashwant Kanetkar", "BPB", 8 );    
	    Book b2 = new Book ( 102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4 );    
	    Book b3 = new Book ( 103, "Operating System","Galvin", "Wiley", 6 ); 
	    
	    hashMap1.put ( 1, b1 );
	    hashMap1.put ( 2, b2 );
	    hashMap1.put ( 3, b3 );
	    
	    System.out.println ( hashMap1 );
	    
	    for ( Map.Entry < Integer, Book > entry : hashMap1.entrySet () ) {
	    	
	    	int key = entry.getKey ();
	    	Book b = entry.getValue ();
	    	
	    	System.out.println ( key + " Details: " );  
	        System.out.println ( b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity );  
	    	
	    }

	}

}
