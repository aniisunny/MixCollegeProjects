package CodeChef;

import java.util.HashMap;
import java.util.Scanner;

public class SquaredSequences {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		while(testCases-- != 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; i++) {
				int input = sc.nextInt();
				if(input % 4 == 0) arr[i] = 2;
				else if(input % 2 == 0) arr[i] = 1;
				else arr[i] = 0;
			}
			
			HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
			map.put(0, 1);
			int result = 0, sum = 0;
			for(int i = 0; i < n; i++) {
				sum += arr[i];
				if(map.containsKey(sum - 1)) result += map.get(sum - 1);
				if(map.containsKey(sum)) map.put(sum, map.get(sum) + 1);
				else map.put(sum, 1);
			}
			
			System.out.println((n * (n + 1) / 2) - result);
		}
		sc.close();
	}

}
