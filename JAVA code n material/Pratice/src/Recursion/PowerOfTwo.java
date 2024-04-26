package Recursion;

public class PowerOfTwo {
	
	static public int two(int n) {
		if(n == 0)
			return 1;
		return (2 * two(n - 1));
	}

	public static void main(String[] args) {
		System.out.println(two(5));
	}

}
