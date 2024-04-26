package Recursion;

public class Power {
	
	static public double power(double x, int n) {
		if(n == 0)
			return 1;
		return x * power(x, n - 1);
	}

	public static void main(String[] args) {
		System.out.println(power(5.6, 2));
	}

}
