package ArraysAndStrings;

public class RotationSubstring {
	
	private static boolean isSubstring(String s1, String s2) {
		if(s1.length() != s2.length())
			return false;
		
		StringBuffer sb = new StringBuffer(s1);
		s1 = sb.append(s1).toString();
		System.out.println(s1);
		if(s1.contains(s2))
			return true;
		return false;
	}

	public static void main(String[] args) {
		
		String s1 = "Waterbottle";
		String s2 = "erbottleWat";
		
		System.out.println(isSubstring(s1, s2));

	}

}
