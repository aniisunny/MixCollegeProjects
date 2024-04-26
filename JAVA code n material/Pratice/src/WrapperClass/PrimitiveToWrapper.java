package WrapperClass;

public class PrimitiveToWrapper {

	public static void main(String[] args) {

		int a = 3264;
		Integer i = Integer.valueOf ( a );
		Integer j = a;
		System.out.println ( a + " " + i + " " + j );

	}

}
