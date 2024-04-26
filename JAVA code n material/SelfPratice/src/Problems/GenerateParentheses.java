package Problems;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses {
	
	public static Boolean validate(String temp) {
		
		Stack<Character> valid = new Stack<Character>();
		for(int i = 0; i < temp.length(); i++) {
			if(temp.charAt(i) == ')') {
				char topElement = valid.isEmpty() ? '#' : valid.pop();
				if(topElement != '(')
					return false;
			}
			else
				valid.push(temp.charAt(i));
		}
		return valid.isEmpty();
		
	}
	
	public static List<String> generateParenthesis(int n) {
		
		List<String> l1 = new LinkedList<String>();
		List<String> l2 = new LinkedList<String>();
		l1.add("(");
		for(int i = 1; i < n * 2; i++) {
			Iterator<String> itr = l1.iterator();
			while(itr.hasNext()) {
				String temp = (String)itr.next() + "(";
				l2.add(temp);
				if(temp.length() > n) {
					String s = temp.substring(0, n + 1);
					if(s.equals("(((("))
						l2.remove(temp);
				}
				temp = temp.substring(0, temp.length() - 1) + ")";
				l2.add(temp);
				System.out.println(l2);
			}
			l1.clear();
			l1.addAll(l2);
			l2.clear();
		}
		System.out.println(l1);
		List<String> generate = new LinkedList<String>();
		Iterator<String> itr = l1.iterator();
		while(itr.hasNext()) {
			String temp = (String)itr.next();
			if(temp.length() == n * 2) {
				if(validate(temp) == true)
					generate.add(temp);
			}
		}
		return generate;
		
	}

	public static void main(String[] args) {
		
		System.out.println("Parenthesis: " + generateParenthesis(3));

	}

}
