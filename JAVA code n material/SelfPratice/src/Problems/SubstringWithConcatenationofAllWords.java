package Problems;

import java.util.LinkedList;
import java.util.List;

public class SubstringWithConcatenationofAllWords {
	
	static public List<Integer> findSubstring(String s, String[] words) {
		List<Integer>index = new LinkedList<Integer>();
		if(s.isEmpty() || words.length == 0)
			return index;
		String str = "";
		int counter = 0, counter1 = 0, i, j, length = words [ 0 ].length ();
		
		for(i = 0; i < s.length (); i++) {
			if(i + length > s.length())
				break;
			String temp = new StringBuilder(s).substring(i, i+length).toString();
			System.out.println(temp);
			counter1++;
			for(j = 0; j < words.length; j++) {
				if(words[j].equals(temp)) {
					str += j+"";
					counter++;
					break;	
				}
			}
			if(counter != counter1) {
				str += "x";
				counter++;
			}
			i = i+length-1;
			System.out.println(str);
		}
		for(i = 0; i < str.length (); i++) {
			if(str.charAt(i) == 'x') {
				for(j = i - 1; j >= 0; j--) {
					if(str.charAt(j) == 'x') {
						break;
					}
					if(j != 0) {
						if(str.charAt (j) == str.charAt (j-1)) {
							j--; 
							break;
							
						}
					}
				}
				index.add((j+1)*3);
			}
		}
		return index;
		
	}

	public static void main(String[] args) {
		
		//String s = "aaa";
		//String words[] = {"aa", "aa"};
		String s = "barfoofoobarthefoobarman";
		String words[] = {"bar","foo","the"};
		//String s = "barbarfoothefooqwebarman";
		//String words [] = { "foo", "bar" };
		
		//String s = "wordgoodgoodgoodbestword";
		//String words [] = { "word", "good", "best", "word" };
		
		System.out.println ( findSubstring ( s, words ) );

	}

}
