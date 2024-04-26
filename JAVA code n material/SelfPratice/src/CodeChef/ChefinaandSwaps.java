package CodeChef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ChefinaandSwaps {

	public static void main(String[] args) throws Exception {
		
		try (BufferedReader read = new BufferedReader (new InputStreamReader (System.in))) {
			int testCases = Integer.valueOf (read.readLine ());
			
			while (testCases-- != 0) {
				int n = Integer.valueOf (read.readLine ());
				
				String[] str = read.readLine ().split (" ");
				
				HashMap<Long, Integer> map = new HashMap <> ();
				HashMap<Long, Integer> mapA = new HashMap <>();
				HashMap<Long, Integer> mapB = new HashMap <>();
				
				long[] arrayA = new long[n];
				long[] arrayB = new long[n];
				
				long peakMinimum = Integer.MAX_VALUE;
				
				for (int i = 0; i < n; i++) {
					arrayA[i] = Integer.valueOf (str[i]);
					peakMinimum = Math.min (peakMinimum, arrayA[i]);
					map.put (arrayA[i], map.getOrDefault (arrayA[i], 0) + 1);
					mapA.put (arrayA[i], mapA.getOrDefault (arrayA[i], 0) + 1);
				}
				
				str = read.readLine ().split (" ");
				
				for (int i = 0; i < n; i++) {
					arrayB[i] = Integer.valueOf (str[i]);
					peakMinimum = Math.min (peakMinimum, arrayB[i]);
					map.put (arrayB[i], map.getOrDefault (arrayB[i], 0) + 1);
					mapB.put (arrayB[i], mapB.getOrDefault (arrayB[i], 0) + 1);
				}
				
				if (mapA.equals (mapB)) {
					System.out.println (0);
					continue;
				}
				
				boolean flag = false;
				for (long key : map.keySet ()) {
					if (map.get (key) % 2 != 0) {
						flag = true;
						break;
					}
				}
				
				if (flag) {
					System.out.println (-1);
					continue;
				}
				
				for (long num : arrayA) {
					mapB.put (num, mapB.getOrDefault (num, 0) - 1);
				}
				
				for (long num : arrayB) {
					mapA.put (num, mapA.getOrDefault (num, 0) - 1);
				}
				
				List<Long> listA = new ArrayList <>();
				List<Long> listB = new ArrayList <>();
				
				for (long key : mapA.keySet ()) {
					int value = mapA.get (key) / 2;
					while (value-- > 0) {
						listA.add (key);
					}
				}
				
				for (long key : mapB.keySet ()) {
					int value = mapB.get (key) / 2;
					while (value-- > 0) {
						listB.add (key);
					}
				}
				
				Collections.sort (listA);
				Collections.sort (listB, Collections.reverseOrder ());
				
				int i = -1;
				long minimumCost = 0;
				
				while (++i < listA.size ()) {
					long minimum = Math.min (listA.get (i), listB.get (i));
					minimum = Math.min (minimum, 2 * peakMinimum);
					minimumCost += minimum;
				}
				
				System.out.println (minimumCost);
			}
		}
	}

}
