package KickStart;

import java.util.Scanner;

public class XORWhat {

	public static void input() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		int t = 1;
		while(testCases != 0) {
			int n = scan.nextInt();
			int q = scan.nextInt();
			int arr[] = new int[n];
			for(int i = 0; i < arr.length; i++) {
				arr[i] = scan.nextInt();
			}
			int subInterval[] = new int[q];
			int k = 0;
			while(q != 0) {
				int index = scan.nextInt();
				int modificationElement = scan.nextInt();
				arr[index] = modificationElement;
				int largest = xorOperation(arr, n);
				subInterval[k] = largest;
				k++;
				q--;
			}
			output(subInterval, t);
			t++;
			testCases--;
		}
	}
	
	public static int xorOperation(int arr[], int n) {
		int xor = arr[0];
		if(n <= -1)
			return 0;
		for(int i = 1; i < n; i++) {
			xor = xor ^ arr[i];
		}
		String binary = Integer.toBinaryString(xor);
		int count = 0;
		for(int i = 0; i < binary.length(); i++) {
			if(binary.charAt(i) == '1') {
				count++;
			}
		}
		if(count % 2 == 0) {
			return n;
		}
		else {
			return xorOperation(arr, n - 1);
		}
	}
	
	public static void output(int subInterval[], int t) {
		System.out.print("Case #" + t + ": ");
		for(int var : subInterval)
			System.out.print(var + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		
		input();

	}

}
