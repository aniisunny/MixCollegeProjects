package Problems;

import java.util.HashSet;
import java.util.Iterator;

public class UniqueString {
	
	public static String uniqueString(String str) {
		HashSet<String> set = new HashSet<String>();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			set.add(ch+"");
		}
		System.out.println(set);
		String s = "";
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			s+= itr.next();
		}
		return s;
	}

	public static void main(String[] args) {
		
		String str = "1122333";
		System.out.println(uniqueString(str));

	}

}
