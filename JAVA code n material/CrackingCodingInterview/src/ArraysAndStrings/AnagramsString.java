package ArraysAndStrings;

import java.util.HashMap;

public class AnagramsString {
	
	private static boolean anagramStrings(String s1, String s2) {
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		for(int i = 0; i < s1.length(); i++) {
			if(map1.containsKey(s1.charAt(i))) {
				int t = map1.get(s1.charAt(i));
				map1.put(s1.charAt(i), t + 1);
			}
			else {
				map1.put(s1.charAt(i), 1);
			}
		}
		
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		for(int i = 0; i < s2.length(); i++) {
			if(map2.containsKey(s2.charAt(i))) {
				int t = map2.get(s2.charAt(i));
				map2.put(s2.charAt(i), t + 1);
			}
			else {
				map2.put(s2.charAt(i), 1);
			}
		}
		
		System.out.println(map1);
		System.out.println(map2);
		for(int i = 0; i < s2.length(); i++) {
			if(map1.containsKey(s2.charAt(i))) {
				if(map1.get(s2.charAt(i)) != map2.get(s2.charAt(i)))
					return false;
			}
			else 
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		String s1 = "TRIANGLET";
		String s2 = "INTEGTRAL";
		System.out.println(anagramStrings(s1, s2));

	}

}
