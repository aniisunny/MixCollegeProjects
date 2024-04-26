package ArraysAndStrings;

public class StringCompression {
	
	private static String compression(String s) {
		
		int counter = 1, i = 0;
		StringBuilder sb = new StringBuilder();
		for(i = 0; i < s.length() - 1; i++) {
				if(s.charAt(i) != s.charAt(i + 1)) {
					sb.append(s.charAt(i));
					sb.append(counter);
					counter = 1;
				}
				else {
					counter++;
				}
		}
		sb.append(s.charAt(i));
		sb.append(counter);
		if(sb.toString().length() > s.length())
			return s;
		return sb.toString();
	}

	public static void main(String[] args) {
		
		String s = "aabcccccaaa";
		System.out.println(compression(s));
	}

}
