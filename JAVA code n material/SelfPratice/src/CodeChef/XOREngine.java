package CodeChef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XOREngine {
	
	static int[] bits = {0,1,1,2,1,2,2,3,1,2,2,3,2,3,3,4};
	
	static int countSetBits(int n) {
		
		int nibble = 0;
		if(n == 0) return bits[0];
		
		nibble = n & 0xf;
		return bits[nibble] + countSetBits(n >> 4);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		while(testCases-- != 0) {
			int n = sc.nextInt();
			int q = sc.nextInt();
			
			List<Integer> list = new ArrayList<Integer>();
			for(int i = 0; i < n; i++) list.add(sc.nextInt());
			
			List<Integer> p = new ArrayList<Integer>();
			for(int i = 0; i < q; i++) p.add(sc.nextInt());
			
			for(int i = 0; i < q; i++) {
				int temp = p.get(i);
				int evenCount = 0, oddCount = 0;
				for(int j = 0; j < n; j++) {
					//int xor = temp ^ list.get(j);
					int xor = (temp | list.get(j)) & (~temp | ~ list.get(j)); // it takes less time than xor operator
					//int count = Integer.bitCount(xor); 
					//System.out.println(xor + " " + count);
					int count = countSetBits(xor);
					if(count % 2 == 0) ++evenCount;
					else ++oddCount;
				}
				System.out.println(evenCount + " " + oddCount);
			}
		}
		sc.close();

	}

}
