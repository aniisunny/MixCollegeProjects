package lab2018;

public class NestedTry {

	public static void main(String[] args) {
		
		try {
			try {
				System.out.println("Going to divide");
				int a = 39 / 0;
			}
			catch(ArithmeticException ae) {
				System.out.println(ae);
			}
			
			try {
				int a[] = new int[5];
				a[5] = 4;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			System.out.println("other statement");
		}
		catch(Exception e) {
			System.out.println("handled");
		}
		System.out.println("normal flow...");
		
	}

}
