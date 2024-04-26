package Problems;

public class LongestPalindroameSubstring3 {
	
	static public String longestPalindrome(String s) {
		
		if(s.length() < 2)
			return s;
		
		int longest = 0;
		String palindroame = "";
		
		for(int i = 0; i < s.length(); i++) {
			for(int j = s.length() - 1; j > i ; j--) {
				if(s.charAt(i) == s.charAt(j)) {
					String str = s.substring(i, j + 1);
					String reverse = new StringBuffer(str).reverse().toString();
					if(str.equals(reverse)) {
						if(str.length() > s.length() / 2)
							return str;
						if(str.length() > longest) {
							longest = str.length();
							palindroame = str;
						}
					}
				}
			}
		}
		
		if(palindroame.isEmpty())
			return s.charAt(0) + "";
		
		return palindroame;
	}
	
	public static void main(String[] args) {
		
		String s = "aacdefcaa";
		System.out.println("Longest Palindromic Substring :- " + longestPalindrome(s));

	}

}
