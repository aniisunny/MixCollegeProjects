package WrapperClass;

public class WrapperToPrimitive {

	public static void main(String[] args) {
		
		Integer i = new Integer ( 3264 );
		int a = i.intValue ();
		int j = i;
		System.out.println ( a + " " + i + " " + j );

	}

}
