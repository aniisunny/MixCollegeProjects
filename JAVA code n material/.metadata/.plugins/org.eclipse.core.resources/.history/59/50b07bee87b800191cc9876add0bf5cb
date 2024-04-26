package Problems;

import java.util.HashMap;

public class NonRepeatingCharacter {
	
	static public char firstNonRepeatingCharacter(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				int value = map.get(s.charAt(i));
				map.put(s.charAt(i), value + 1);
			}
			else
				map.put(s.charAt(i), 1);
		}
		
		for(int i = 0; i < s.length(); i++) {
			if(map.get(s.charAt(i)) == 1)
				return s.charAt(i);
		}
		return 0;
	}

	public static void main(String[] args) {
		
		String str = "GeeksQuiz";
		System.out.println(firstNonRepeatingCharacter(str));
	}

}
