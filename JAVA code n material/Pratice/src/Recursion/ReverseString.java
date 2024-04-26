package Recursion;

public class ReverseString {
	
	static private void reverse(char[] str) {
		helper(str, 0, str.length - 1);
	}
	
	static private void helper(char[] str, int first, int last) {
		if(first >= last)
			return;
		char ch = str[first];
		str[first] = str[last];
		str[last] = ch;
		helper(str, first + 1, last - 1);
	}
	
	/*static private void reverseString(char []str) {
		helper(0, str);
	}
	
	static private void helper(int index, char []str) {
		if(str == null || index >= str.length)
			return;
		helper(index + 1, str);
		System.out.print(str[index]);
	}*/

	public static void main(String[] args) {
		
		char []str = { 'H', 'e', 'l', 'l', 'o'};
		//reverseString(str);
		reverse(str);
		for(char c : str)
			System.out.print(c + " ");
		
	}

}
