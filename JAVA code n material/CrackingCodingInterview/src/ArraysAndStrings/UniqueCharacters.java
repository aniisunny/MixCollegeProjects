package ArraysAndStrings;

import java.util.HashMap;

public class UniqueCharacters {
	
	private static boolean uniqueCharacter(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ')
				continue;
			if(map.containsKey(s.charAt(i)))
				return false;
			map.put(s.charAt(i), 1);
		}
		return true;
	}

	public static void main(String[] args) {
		
		String s = "Aniruddha";
		System.out.println(uniqueCharacter(s));

	}

}
