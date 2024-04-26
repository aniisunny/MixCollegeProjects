package Problems;

public class Power {
	static public double myPow(double x, int n) {
		Long m = (long)n;
		if(m < 0) {
			m = -m;
			x = 1 / x;
		}
		double power = 1;
		while(m > 0) {
			if(m % 2 == 1)
				power *= x;
			x *= x;
			m /= 2;
		}
		return power;
	}

	public static void main(String[] args) {
		double x = 2.00000;
		int n = -2147483648;
		System.out.println(myPow(x, n));
	}

}
