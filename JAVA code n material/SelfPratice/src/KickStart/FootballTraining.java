package KickStart;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Pair {
	int n;
	int p;
	int rating[];
}

public class FootballTraining {
	static HashMap<Integer, Pair> map = new HashMap<Integer,Pair>();
	
	static void input(int k) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Pair p = new Pair();
		p.n = scan.nextInt();
		p.p = scan.nextInt();
		p.rating = new int[p.n];
		for(int i = 0; i < p.n; i++)
			p.rating[i] = scan.nextInt();
		map.put(k, p);
	}
	
	static void training(int k) {
		int hours = 0;
		if(map.containsKey(k)) {
			Pair p = map.get(k);
			int arr[] = new int[p.p];
			int j = 0;
			for(int i = 0; i < p.rating.length; i++) {
				if(j != p.p) {
					arr[j] = p.rating[i];
					j++;
				}
			}
			Arrays.sort(arr);
			for(int i = 0; i < arr.length - 1; i++) {
				hours += arr[arr.length - 1] - arr[i];
			}
		}
		System.out.println("Case #" + k + ": " + hours);
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int k = 1; k <= t; k++) {
			input(k);
		}
		for(int k = 1; k <= t; k++) 
			training(k);
	}

}
