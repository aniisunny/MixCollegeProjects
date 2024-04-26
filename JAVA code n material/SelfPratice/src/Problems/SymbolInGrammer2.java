package Problems;

import java.math.BigInteger;

public class SymbolInGrammer2 {
	
	static public int kthGrammar(int N, int K) { 
		if(K > Math.pow(2, N - 1))
			return -1;
		String oldString = "0";
		for(int i = 2; i <= N; i++) {
			String newString = "";
			if(oldString.charAt(oldString.length() - 1) == '0') {
				for(int j = oldString.length() - 1; j >= 0; j--) {
					if(oldString.charAt(j) == '0')
						newString += "1";
					if(oldString.charAt(j) == '1')
						newString += "0";
				}
			}
			if(oldString.charAt(oldString.length() - 1) == '1') {
				StringBuffer sb = new StringBuffer(oldString);
				newString = sb.reverse().toString();
			}
			oldString += newString;
		}
		return oldString.charAt(K - 1) - '0';
	}

	
	static public int kthGrammarN(int N, int K) { 
		if(K > Math.pow(2, N - 1))
			return -1;
		String oldString = "0";
		for(int i = 2; i <= N; i++) {
			String newString = "";
			if(oldString.charAt(oldString.length() - 1) == '0') {
				BigInteger b1 = new BigInteger(oldString, 2);
				System.out.println(b1.not());
				String str  = b1.not().toString(2);
				System.out.println(str);
				if (str.length() > oldString.length()) {
				    newString = str.substring(str.length() - oldString.length());
				}
				else {
					newString =  str;
				}
			}
			if(oldString.charAt(oldString.length() - 1) == '1') {
				StringBuffer sb = new StringBuffer(oldString);
				newString = sb.reverse().toString();
			}
			oldString += newString;
			System.out.println(i + " " + oldString);
			System.out.println(oldString.length());
		}
		return oldString.charAt(K - 1) - '0';
	}
	
	public static void main(String[] args) {
		
		//System.out.println(kthGrammarN(30, 434991989));
		//System.out.println(kthGrammarN(8, 96));
		System.out.println(~5 & 1);
	}

}
