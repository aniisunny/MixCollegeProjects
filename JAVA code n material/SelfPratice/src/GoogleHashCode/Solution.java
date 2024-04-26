package GoogleHashCode;

import java.util.HashMap;

public class Solution {
	
	public static int solution(int[] x, int[] y) {
		
		HashMap<Integer, Boolean> map = new HashMap<>();
		for(int num : x) map.put(num, true);
		
		for(int num : y) {
			if(map.containsKey(num)) map.put(num, false);
			else map.put(num, true);
		}
		
		for(int key : map.keySet())
			if(map.get(key) == true) return key;
		return 0;
	}

	public static void main(String[] args) {
		
		int[] x = {14,27,1,4,2,50,3,1};
		int[] y = {2,4,-4,3,1,1,14,27,50};
		
		System.out.println(solution(x, y));
	}

}
