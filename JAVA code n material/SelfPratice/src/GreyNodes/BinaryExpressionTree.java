package GreyNodes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Stack;

class BinaryTree {
	String nodeData;
	BinaryTree left;
	BinaryTree right;
	
	public BinaryTree (String nodeData) {
		this.nodeData = nodeData;
		left = null;
		right = null;
	}
}

public class BinaryExpressionTree {
	
	static BinaryTree root;
	static boolean flagParenthesis = false;
	
	public static BinaryTree buildBinaryTree (String expression) {
		
		Stack<BinaryTree> stack = new Stack <>();
		
		for (int i = 0, start = 0; i < expression.length (); i++) {
			char c = expression.charAt (i);
			if (c == '?') {
				String s = expression.substring (start, i);
				BinaryTree node = new BinaryTree (s);
				stack.push (node);
				start = i + 1;
			}
			else if (isOperator (c)) {
				BinaryTree root = new BinaryTree (c + "");
				root.right = !stack.isEmpty () ? stack.pop () : null;
				root.left = !stack.isEmpty () ? stack.pop () : null;
				stack.push (root);
				start = i + 1;
			}
		}
		
		return stack.pop ();
	}
	
	public static void infixTraversal (BinaryTree root) {
		
		if (root != null) {
			infixTraversal (root.left);
			System.out.print (root.nodeData);
			infixTraversal (root.right);
		}
	}
	
	public static void prefixTraversal (BinaryTree root) {
		
		if (root != null) {
			System.out.print (root.nodeData);
			prefixTraversal (root.left);
			prefixTraversal (root.right);
		}
	}
	
	public static void postfixTraversal (BinaryTree root) {
		
		if (root != null) {
			postfixTraversal (root.left);
			postfixTraversal (root.right);
			System.out.print (root.nodeData);
		}
	}
	
	public static void checkOperator (Stack<Character> stack, StringBuilder postfixExpression, char c, int priority) {
		
		while (!stack.isEmpty ()) {
			char operator = stack.peek () != '(' ? stack.pop () : '#';
			if (operator == '#') {
				break;
			}
			
			int newPriority = 0;
			
			// assign priority
			if (operator == '+' || operator == '-') {
				newPriority = 2;
			}
			else {
				newPriority = 1;
			}
			
			//check priority
			if (newPriority > priority) {
				stack.push (operator);
				break;
			}
			else {
				postfixExpression.append (operator);
			}
		}
	}
	
	public static void checkParenthesis (Stack<Character> stack, StringBuilder postfixExpression) {
		
		while (!stack.isEmpty ()) {
			char operator = stack.pop ();
			if (operator == '(') {
				flagParenthesis = true;
				break;
			}
			postfixExpression.append (operator);
		}
	}
	
	public static boolean isOperator (char c) {
		
		return c == '+' || c == '-' || c == '*' || c == '/';
	}
	
	public static String infixToPostfixExpression (String expression) {
		
		StringBuilder postfixExpression = new StringBuilder ();
		Stack<Character> stack = new Stack <>();
		
		for (int i = 0; i < expression.length (); i++) {
			char c = expression.charAt (i);
			
			// check operator and operand 
			if (c == '+' || c == '-') {
				if (!isOperator (postfixExpression.charAt (postfixExpression.length () - 1))) {
					postfixExpression.append ("?");
				}
				checkOperator (stack, postfixExpression, c, 2);
				stack.push (c);
			}
			else if (c == '*' || c == '/') {
				if (!isOperator (postfixExpression.charAt (postfixExpression.length () - 1))) {
					postfixExpression.append ("?");
				}
				checkOperator (stack, postfixExpression, c, 1);
				stack.push (c);
			}
			else if (c == '(') {
				stack.push ('(');
			}
			else if (c == ')') {
				postfixExpression.append ("?");
				flagParenthesis = false;
				checkParenthesis (stack, postfixExpression);
				if (!flagParenthesis) {
					return "";
				}
			}
			else {
				postfixExpression.append (c);
			}
		}
		
		if (!isOperator (postfixExpression.charAt (postfixExpression.length () - 1))) {
			postfixExpression.append ("?");
		}
		
		while (!stack.isEmpty ()) {
			if (stack.peek () == '(') {
				return "";
			}
			postfixExpression.append (stack.pop ());
		}
		
		return postfixExpression.toString ();
	}
	
	public static double evaluateExpression (BinaryTree root) {
		
		if (root == null) {
			return 0.0;
		}
		else if (root.left == null && root.right == null) {
			return Double.parseDouble (root.nodeData);
		}
		
		double left = evaluateExpression (root.left);
		double right = evaluateExpression (root.right);
		
		if (root.nodeData.equals ("/")) {
			return left / right;
		}
		else if (root.nodeData.equals ("*")) {
			return left * right;
		}
		else if (root.nodeData.equals ("+")) {
			return left + right;
		}
		else {
			return left - right;
		}
	}
	
	public static boolean checkBinaryTree (BinaryTree root) {
		
		if (root == null) {
			return true;
		}
		else if (root.left == null && root.right == null) {
			char c = root.nodeData.length () > 0 ? root.nodeData.charAt (0) : '(';
			if (isOperator (c) || c == ')' || c == '(') {
				return false;
			}
			return true;
		}
		else if (root.left == null || root.right == null) {
			return false;
		}
		
		return checkBinaryTree(root.left) && checkBinaryTree (root.right);
	}

	public static void main (String[] args) throws Exception {
		
		try (BufferedReader reader = new BufferedReader (new FileReader ("D:\\JAVA code n material\\SelfPratice\\src\\GreyNodes\\Read.txt"))) {
			String expression;
			
			while ((expression = reader.readLine ()) != null) {
				System.out.println ("Infix Expression: ");
				System.out.println (expression);
				
				String postfixExpression = infixToPostfixExpression (expression);
				
				if (postfixExpression.length () == 0) {
					System.out.print ("\nResult of Expression: Wrong Expression");
					System.out.println ("\n--------------------------------------\n");
					continue;
				}
				
				root = buildBinaryTree (postfixExpression);
				
				if (!checkBinaryTree (root)) {
					System.out.print ("\nResult of Expression: Wrong Expression");
					System.out.println ("\n--------------------------------------\n");
					continue;
				}
				
				System.out.println ("\nPrefix Traversal: ");
				prefixTraversal (root);
				System.out.println ();
				
				System.out.println ("\nInfix Traversal: ");
				infixTraversal (root);
				System.out.println ();
				
				System.out.println ("\nPostfix Traversal: ");
				postfixTraversal (root);
				System.out.println ();
				
				System.out.print ("\nResult of Expression: " + String.format ("%.3f", evaluateExpression (root)));
				System.out.println ("\n------------------------------\n");
			}
		}
	}

}

//(10.24+5.4*2.5)/6.7+(12.5*20.67+10)*25