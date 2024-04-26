package JavaLinkedHashSet;

import java.util.LinkedHashSet;

class Book {  
int id;  
String name,author,publisher;  
int quantity;  
public Book(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
}  

public class Example {

	public static void main(String[] args) {
		
		LinkedHashSet < String > al = new LinkedHashSet < String > ();
		
		al.add ( "Ravi" );
		al.add ( "Ajay" );
		al.add ( "Ravi" );
		al.add ( "Vijay" );
		al.add ( "Ravi" );
		
		System.out.println ( al );
		
		LinkedHashSet<Book> hs=new LinkedHashSet<Book>();  
	    //Creating Books  
	    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
	    //Adding Books to hash table  
	    hs.add(b1);  
	    hs.add(b2);  
	    hs.add(b3);  
	    //Traversing hash table  
	    for(Book b:hs){  
	    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
	    }

	}

}
