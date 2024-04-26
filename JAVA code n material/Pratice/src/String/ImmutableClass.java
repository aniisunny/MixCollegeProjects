package String;

// create immutable class for any data types
public final class ImmutableClass {   // never create a subclass bcz this class is final class
	
	final int pancardNumber;   // never change the value of pancardnumber so it is immutable by using final 
	
	public ImmutableClass ( int pancardNumber ) {
		
		this.pancardNumber = pancardNumber;
		
	}
	
	public int getPancardNumber () {
		
		return pancardNumber;
		
	}
	

	public static void main(String[] args) {

		ImmutableClass ob = new ImmutableClass ( 123456789 );
		System.out.println ( ob.getPancardNumber () );

	}

}
