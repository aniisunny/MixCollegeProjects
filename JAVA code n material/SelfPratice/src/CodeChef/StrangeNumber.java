package CodeChef;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

class Pair {
	int divisors, primes;
	
	public Pair(int divisors, int primes) {
		this.divisors = divisors;
		this.primes = primes;
	}
}

public class StrangeNumber {
	
	private static Pair divisorPrime(long n) {
		
		int countPrimes = 0, countDivisors = 0;
		for(long i = 1; i * i <= n; i++) {
			if(n % i == 0) {
				BigInteger b = new BigInteger(String.valueOf(i));
				if(n / i == i) {
					++countDivisors;
					if(b.isProbablePrime(1)) ++countPrimes;
				}
				else {
					countDivisors += 2;
					if(b.isProbablePrime(1)) ++countPrimes;
					b = new BigInteger(String.valueOf(n / i));
					if(b.isProbablePrime(1)) ++countPrimes;
				}
			}
		}
		
		return new Pair(countDivisors, countPrimes);
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("deprecation")
		Long range = new Long("1000000000");
		HashMap<Long, Pair> map = new HashMap<Long, Pair>();
		
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		
		while(testCases-- != 0) {
			int X = sc.nextInt();
			int K = sc.nextInt();
			
			if(K >= X) {
				System.out.println(0);
				continue;
			}
			long A = 1;
			for(; A <= range; A++) {
				Pair pair;
				if(map.containsKey(A)) {
					pair = map.get(A);
				}
				else {
					pair = divisorPrime(A);
					map.put(A, pair);
				}
				if(pair.divisors == X && pair.primes == K) {
					System.out.println(1);
					break;
				}
			}
			
			if(A > range) System.out.println(0);
		}
		sc.close();
	}

}
