package CollectionsProject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Card1 {
	String symbol;
	int number;
	HashSet<String> set = new HashSet<String>();
	@SuppressWarnings("rawtypes")
	HashMap<String, List> map = new HashMap<String, List>();
	
	@SuppressWarnings("unchecked")
	void input() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number of Cards :");
		int n = scan.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter card " + i + ":");
			symbol = scan.next();
			number = scan.nextInt();
			set.add(symbol);
			List<Integer> list = new LinkedList<Integer>();
			List<Integer> list1 = new LinkedList<Integer>();
			if(!map.containsKey(symbol)) {
				list.add(number);
				map.put(symbol, list);
			}
			else {
				list1.addAll(map.get(symbol));
				list1.add(number);
				map.put(symbol, list1);
				list.clear();
				list.addAll(list1);
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	void output() {
		System.out.println("Distinct Symbols are :");
		Iterator<String> itr = set.iterator();
		String arr[] = new String[set.size()];
		int i = 0;
		while(itr.hasNext()) {
			arr[i] = itr.next();
			i++;
		}
		Arrays.sort(arr);
		for(String s : arr)
			System.out.print(s + " ");
		System.out.println();
		for(String s : arr) {
			System.out.println("Cards in " + s + " Symbol");
			List<Integer> list = new LinkedList<Integer>();
			list.addAll(map.get(s));
			int sum = 0;
			Iterator<Integer> itr1 = list.iterator();
			while(itr1.hasNext()) {
				int x = itr1.next();
				sum += x;
				System.out.println(s + " " + x);
			}
			System.out.println("Number of cards : " + list.size());
			System.out.println("Sum of Numbers : " + sum);
		}
	}
}

public class CollectAndGroupCards {

	public static void main(String[] args) {
		
		Card1 card = new Card1();
		card.input();
		card.output();

	}

}
