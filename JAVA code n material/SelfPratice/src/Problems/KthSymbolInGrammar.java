package Problems;

public class KthSymbolInGrammar {
	
	static public int kthGrammar( int N, int K) {
		Long s = (long)Math.pow(2, N - 1);
		int flips = 0;
		while(s > 2) {
			if(K > s / 2) {
				K -= s / 2;
				flips++;
			}
			s /= 2;
		}
		K--;
		if(flips % 2 == 1)
			K = 1 - K;
		return K;
	}
	
	static public int kthGrammar1( int N, int K) {
		if(N == 1)
			return 0;
		int grammar = kthGrammar1(N - 1, (K + 1) / 2);
		System.out.println(grammar);
		return getGrammar(grammar, (K + 1) % 2);
	}
	
	static private int getGrammar(int value, int index) {
		System.out.println(value + " " + index);
		if(value == 0)
			return "01".charAt(index) - '0';
		else
			return "10".charAt(index) - '0';
	}
	
	static public int kthGrammar2( int N, int K) {
		if(N == 1)
			return 0;
		return (~K & 1) ^ kthGrammar(N - 1, (K + 1) / 2);
	}

	public static void main(String[] args) {
		
		System.out.println(kthGrammar2(4, 5));

	}

}
