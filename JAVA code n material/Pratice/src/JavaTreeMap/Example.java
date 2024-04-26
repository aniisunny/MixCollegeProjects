package JavaTreeMap;

import java.util.Map;
import java.util.TreeMap;

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
		
		TreeMap < Integer, String > treeMap = new TreeMap < Integer, String > ();
		
		treeMap.put ( 3264, "Aniruddha" );
		treeMap.put ( 3267, "Rahul" );
		treeMap.put ( 1312, "Santosh" );
		treeMap.put ( 3266, "Lovejeet" );
		//treeMap.put ( null, null );
		treeMap.put ( 1234, null );
		treeMap.put ( 3235, "Santosh" );
		
		System.out.println ( treeMap );
		
		treeMap.remove( 3235 );
		//System.out.println( treeMap.remove ( null, null ) );
		//System.out.println( treeMap.remove ( null, "xyz" ) );
		System.out.println ( treeMap );
		
		System.out.println ( treeMap.clone () );
		System.out.println ( treeMap.containsKey ( 3235 ) );
		System.out.println ( treeMap.containsValue ( "santosh" ) );
		System.out.println ();
		
		TreeMap < Integer, Book > treeMap1 = new TreeMap < Integer, Book > ();
		
		Book b1 = new Book ( 101, "Let us C", "Yashwant Kanetkar", "BPB", 8 );    
	    Book b2 = new Book ( 102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4 );    
	    Book b3 = new Book ( 103, "Operating System","Galvin", "Wiley", 6 ); 
	    
	    treeMap1.put ( 3, b1 );
	    treeMap1.put ( 1, b2 );
	    treeMap1.put ( 2, b3 );
	    
	    System.out.println ( treeMap1 );
	    
	    for ( Map.Entry < Integer, Book > entry : treeMap1.entrySet () ) {
	    	
	    	int key = entry.getKey ();
	    	Book b = entry.getValue ();
	    	
	    	System.out.println ( key + " Details: " );  
	        System.out.println ( b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity );  
	    	
	    }


	}

}
