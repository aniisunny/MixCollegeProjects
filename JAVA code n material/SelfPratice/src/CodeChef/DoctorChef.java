package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DoctorChef {
	
	private static int binarySearch (long[] populations, long cures) {
		
		int low = 0;
		int high = populations.length;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			if (populations[mid] == cures) {
				return mid;
			}
			else if (populations[mid] > cures) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		
		return high;
	}

	public static void main(String[] args) throws IOException {
		
		try (BufferedReader read = new BufferedReader (new InputStreamReader (System.in))) {
			int testCases = Integer.valueOf (read.readLine ());
			
			while (testCases-- != 0) {
				String[] str = read.readLine ().split (" ");
				
				int n = Integer.valueOf (str[0]);
				long cures = Long.valueOf (str[1]);
				
				str = read.readLine ().split (" ");
				long[] populations = new long[n];
				
				for (int i = 0; i < n; i++) {
					populations[i] = Long.valueOf (str[i]);
				}
				
				Arrays.sort (populations);
			
				int days = 0;
				
				while (cures < populations[n - 1]) {
					++days;
					int index = binarySearch (populations, cures);
					if (index != -1 && populations[index] * 2 >= cures) {
						cures = populations[index] * 2;
						populations[index] = 0;
					}
					else {
						long changes = (populations[n - 1] - cures) * 2;
						if (changes < populations[n - 1]) {
							populations[n - 1] = changes;
						}
						cures *= 2;
					}
				}
				
				for (int i = 0; i < n; i++) {
					if (populations[i] != 0) {
						++days;
					}
				}
				
				System.out.println (days);
			}
		}

	}

}
