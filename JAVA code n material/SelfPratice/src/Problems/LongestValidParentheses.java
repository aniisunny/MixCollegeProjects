package Problems;

import java.util.HashMap;
import java.util.Stack;

public class LongestValidParentheses {
	
	static public int longestValidParentheses(String s) {
		
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put(')', '(');
		map.put('}', '{');
		map.put(']', '[');
		
		Stack<Character> valid = new Stack<Character>();
		int longest = 0, counter = 0;
		char topElement = '!';
		for(int i = 0; i < s.length (); i++) {
			if(map.containsKey(s.charAt(i))) {
				topElement = valid.isEmpty() ? '#': valid.pop();
				if(topElement == map.get(s.charAt(i)))
					counter += 2;
				else {
					if(counter >= longest) {
						longest = counter;
					}
					counter = 0;
				}
			}
			else {	
				valid.push(s.charAt(i));
			}
		}
		if(counter > longest) 
			longest = counter;
		
		return longest;
	}

	public static void main(String[] args) {
		
		String s = "()(()";
		
		System.out.println(longestValidParentheses(s));

	}

}
