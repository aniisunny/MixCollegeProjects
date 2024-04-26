package JavaArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList3 {

	public static void main(String[] args) {
		
		Student s1 = new Student ( "17BCS3264", "Aniruddha M. Agrawal", 8.66 );
		Student s2 = new Student ( "17BCS3266", "Lovejeet Rathore", 7.92 );
		Student s3 = new Student ( "17BCS3267", "Rahul Bansal", 8.92 );
		
		ArrayList < Student > al = new ArrayList < Student > ();
		
		al.add ( s1 ); //add Student class object in arraylist
		al.add ( s2 ); //add Student class object in arraylist
		al.add ( s3 ); //add Student class object in arraylist
		
		for ( Student st : al ) 
			System.out.println ( st.uid + "  " + st.name + "  " + st.cgpa );
		
		Iterator itr = al.iterator ();
		
		while ( itr.hasNext () ) {
			Student st = (Student) itr.next ();
			System.out.println ( st.uid + "  " + st.name + "  " + st.cgpa );
			
		}
		
	}
	
}