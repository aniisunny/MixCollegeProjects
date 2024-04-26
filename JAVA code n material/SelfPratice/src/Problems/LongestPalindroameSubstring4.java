package Problems;

public class LongestPalindroameSubstring4 {
	
	static private int lo, maxLen;
	
	static public String longestPalindrome(String s) {
		
		if(s.length() < 2)
			return s;
	
		for(int i = 0; i < s.length() - 1; i++) {
			extendPalindroame(s, i, i);   //odd length
			extendPalindroame(s, i, i + 1);  //even length
		}
		return s.substring(lo, lo + maxLen);
	}
	
	static protected void extendPalindroame(String s, int j, int k) {
		while(j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
			j--;
			k++;
		}
		if(maxLen < k - j - 1) {
			lo = j + 1;
			maxLen = k - j - 1;
		}
	}
	
	public static void main(String[] args) {
		
		String s = "aacdefcaa";
		System.out.println("Longest Palindromic Substring :- " + longestPalindrome(s));

	}

}
