package JavaHashTable;

import java.util.Hashtable;
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
		
		Hashtable < Integer, String > hashTable = new Hashtable < Integer, String > ();
		
		hashTable.put ( 3264, "Aniruddha" );
		hashTable.put ( 3267, "Rahul" );
		hashTable.put ( 1312, "Santosh" );
		hashTable.put ( 3266, "Lovejeet" );
		//hashTable.put ( null, null );
		//hashTable.put ( null, "xyz" );
		hashTable.put ( 3235, "Santosh" );
		
		System.out.println ( hashTable );
		
		hashTable.remove( 3235 );
		//System.out.println( hashTable.remove ( null, null ) );
		//System.out.println( hashTable.remove ( null, "xyz" ) );
		System.out.println ( hashTable );
		
		System.out.println ( hashTable.clone () );
		System.out.println ( hashTable.containsKey ( 3235 ) );
		System.out.println ( hashTable.containsValue ( "santosh" ) );
		System.out.println ();
		
		Hashtable < Integer, Book > hashMap1 = new Hashtable < Integer, Book > ();
		
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
