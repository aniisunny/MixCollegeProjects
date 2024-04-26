package String;

public class Substring {

	public static void main(String[] args) {

		String s1 = "Hello";
		System.out.println ( s1.substring ( 0, 2 ) );
		String s2 = "Aniruddha M. Agrawal";
		System.out.println ( s2.substring ( 10 ) );
		System.out.println ( s2.substring ( 9 ) );
		System.out.println ( s2.substring ( 13, 20 ) ); // only take 7 elements
		System.out.println ( s2.substring ( 0, 10 ) );  // only take 10 elements
		System.out.println ( s2.substring ( 9, 14 ) );  // only take 5 elements

	}

}
