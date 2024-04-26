package Problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SubstringWithConcatenationOfAllWords2 {
	
	static public List<Integer> findSubstring(String s, String[] words) {
		List<Integer> list = new LinkedList<Integer>();
		if(s == null || words.length == 0)
            return list;
		if(s.length() % words[0].length() != 0)
			return list;
		int nums[] = new int[words.length];
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < words.length; i++) {
			if(!map.containsKey(words[i])) {
				map.put(words[i], i + 1);
				nums[i] = i + 1;
			}
			else {
				nums[i] = i + 1;
			}
		}
		List<String> l1 = new LinkedList<String>();
		l1 = permute(nums);
		System.out.println(map);
		System.out.println(l1);
		String s1 = "";
		for(int i = 0; i < s.length(); i = i + words[0].length()) {
			String str = s.substring(i, i + words[0].length());
			System.out.println(str);
			if(map.containsKey(str)) {
				s1 += String.valueOf(map.get(str));
			}
			else {
				s1 += "0";
			}
		} 
		System.out.println(s1);
		for(int i = 0; i < s1.length() - words.length  + 1; i++) {
			String str = s1.substring(i, i + words.length);
			System.out.println(str);
			if(l1.contains(str)) {
				list.add(i * words[0].length());
			}
		}
		return list;
	}
	
	static public List<String> permute(int[] nums) {
		List<String> l1 = new LinkedList<String>();
		for(int i = 0; i < nums.length; i++) {
			l1.add(String.valueOf(nums[i]));
		}
		for(int k = 1; k < nums.length; k++) {
			List<String> l2 = new LinkedList<String>();
			Iterator<String> itr1 = l1.iterator();
			while(itr1.hasNext()) {
				String x = (String)itr1.next();
				for(int i = 0; i < nums.length; i++) {
					if(Integer.parseInt(x) != nums[i]) {
						String str = x + "" + nums[i] + "";
						String s = nums[i] + "";
						Boolean flag = true;
						for(int j = 0; j < str.length() - 1; j++) {
							if(str.charAt(j) == s.charAt(0)) {
								flag = false;
							}
						}
						if(flag == true)
							l2.add(str);
					}
				}
			}
			l1 = l2;
		}
		return l1;
	}


	public static void main(String[] args) {
		
		//String s = "barfoothefoobarman";
		//String words[] = { "foo", "bar" };
		//String s = "aaa";
		//String words[] = { "aa", "aa" };
		String s = "wordgoodgoodgoodbestword";
		String words[] = { "word", "good", "best", "good" };
		
		System.out.println(findSubstring(s, words));

	}

}
