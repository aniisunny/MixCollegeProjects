package ArraysAndStrings;

import java.util.HashMap;

public class PermutationPalindrome {
	
	private static boolean isPalindrome(String s) {
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		s = s.toLowerCase();
		
		for(int i = 0; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))) 
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			else 
				map.put(s.charAt(i), 1);
		}
		
		int oddCount = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ')
				continue;
			if(map.get(s.charAt(i)) % 2 != 0)
				oddCount++;
		}
		
		if(oddCount > 1)
			return false;
		return true;
	}

	public static void main(String[] args) {
		
		String s = "Tact Coa";
		System.out.println(isPalindrome(s));
	}

}
