package CodeChef;

public class NumbersOfDivisor {
	
	static private int countDivisors(int n) {
        int count = 2;
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                if(n / i == i) ++count;
                else count += 2;
            }
        }
        
        return count;
    }

	public static void main(String[] args) {
		
		int[] divisors = new int[1000000000];
	    divisors[0] = 0;
	    divisors[1] = 1;
	    for(int i = 2; i < divisors.length; i++) {
	        divisors[i] = countDivisors(i);
	        //System.out.println(i + " " + divisors[i]);
	    }
	    
	}

}
