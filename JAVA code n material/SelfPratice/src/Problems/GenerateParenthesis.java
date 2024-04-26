package Problems;

import java.util.LinkedList;
import java.util.List;

public class GenerateParenthesis {
	
	static public List<String> generateParenthesis(int n) {
		List<String> generate = new LinkedList<String>();
		backtrack(generate, "", 0, 0, n);
		return generate;
	}
	
	static private void backtrack(List<String> generate, String cur, int open, int close, int max) {
		if(cur.length() == max * 2) {
			System.out.println("3 " + cur);
			generate.add(cur);
			return;
		}
		if(open < max) {
			System.out.println("1 " + cur);
			backtrack(generate,cur + "(", open + 1, close, max);
			System.out.println("1 update " + cur);
		}
		if(open <= max && close < open) {
			System.out.println("2 " + cur);
			backtrack(generate, cur + ")", open, close + 1, max);
			System.out.println("2 update " + cur);
		}
	}

	public static void main(String[] args) {
		
		System.out.println(generateParenthesis(3));

	}

}
