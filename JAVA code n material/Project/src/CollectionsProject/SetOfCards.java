package CollectionsProject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class Card {
	String str;
	int number;
	int counter = 0;
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	HashSet<String> set = new HashSet<String>();
	
	void input() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a card :");
		str = scan.nextLine();
		number = scan.nextInt();
		set.add(str);
		if(!map.containsKey(str)) {
			map.put(str, number);
		}
		counter++;
	}
	
	void display() {
		System.out.println("Cards in Set are :");
		Iterator<String> itr = set.iterator();
		String arr[] = new String[set.size()];
		int i = 0;
		while(itr.hasNext()) {
			arr[i] = itr.next();
			i++;
		}
		Arrays.sort(arr);
		for(String s : arr)
			System.out.println(s + " " + map.get(s));
	}
}

public class SetOfCards {

	public static void main(String[] args) {
		
		Card card = new Card();
		while(card.set.size() != 4) {
			card.input();
		}
		System.out.println("Four symbols gathered in " + card.counter + " cards.");
		card.display();
	}

}
