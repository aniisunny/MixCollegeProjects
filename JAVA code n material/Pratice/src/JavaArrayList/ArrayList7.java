package JavaArrayList;

import java.util.ArrayList;
import java.util.Iterator;

class Book {
	
	int id;
	String name, author, publisher;
	int quantity;
	int price;
	
	Book ( int id, String name, String author, String publisher, int quantity, int price ) {
		
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
		this.price = price;
		
	}
	
	/* int totalCost ( book b1, book b2, book b3 ) {
		
		return ( b1.price + b2.price + b3.price );
	} */
} 

public class ArrayList7 {

	public static void main(String[] args) {
		
		//creating of books
		Book b1 = new Book ( 101, "Let us C", "Yashwant Kanetkar", "BPB", 8, 260 );
		Book b2 = new Book ( 102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4, 450 );
		Book b3 = new Book ( 103, "Operating System", "Galvin", "Wiley", 6, 560 );
		
		//creating of list of books
		ArrayList < Book > list = new ArrayList < Book > ();
		
		//adding books in list
		list.add ( b1 ); 
		list.add ( b2 );
		list.add ( b3 );
		
		//display all books in list
		Iterator itr = list.iterator ();
		
		while ( itr.hasNext () ) {
			
			Book b = ( Book ) itr.next ();
			System.out.println ( "Book Id" + "          " + b.id );
			System.out.println ( "Book Name" + "        " + b.name );
			System.out.println ( "Book Author" + "      " + b.author );
			System.out.println ( "Book Publisher" + "   " + b.publisher );
			System.out.println ( "Book Quantity" + "    " + b.quantity );
			System.out.println ( "Book Price" + "       " + b.price );
			System.out.println ( );
			
		}
		
		System.out.println ( "Total cost of books is " + ( b1.price + b2.price + b3.price ) );
	}

}
