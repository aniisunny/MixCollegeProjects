package String;

public class KnuthMorrisPrattPatternSearching {
	
	private static void computeLPS (String pattern, int[] lps) {
		
		int len = 0;
		int i = 1;
		lps[0] = 0;
		
		while (i < pattern.length ()) {
			if (pattern.charAt (i) == pattern.charAt (len)) {
				lps[i] = ++len;
				++i;
			}
			else {
				if (len != 0) {
					len = lps[len - 1];
				}
				else {
					lps[i] = len;
					i++;
				}
			}
		}
	}
	
	private static void kmpAlgorithm (String text, String pattern) {
		
		int[] lps = new int[pattern.length ()];
		computeLPS (pattern, lps);
		
		int i = 0, j = 0;
		
		while (i < text.length ()) {
			if (text.charAt (i) == pattern.charAt (j)) {
				i++;
				j++;
			}
			if (j == pattern.length ()) {
				System.out.println (i - j);
				j = lps[j - 1];
			}
			else if (i < text.length () && text.charAt (i) != pattern.charAt (j)) {
				if (j != 0) {
					j = lps[j - 1];
				}
				else {
					i++;
				}
			}
		}
	}

	public static void main(String[] args) {

		String text = "ABABDABACDABABCABAB";
		String pattern = "ABABCABAB";
		
		kmpAlgorithm(text, pattern);
	}

}
