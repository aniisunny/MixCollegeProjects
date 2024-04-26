package CollectionsProject;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class Box {
	double length;
	double width;
	double height;
	double volume;
}

public class SetOfBoxes {
	static HashSet<Box> set = new HashSet<Box>();
	
	static public void insert(int i) {
		Box box = new Box();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Length");
		box.length = scan.nextDouble();
		System.out.println("Enter Width");
		box.width = scan.nextDouble();
		System.out.println("Enter Height");
		box.height = scan.nextDouble();
		box.volume = box.length * box.width * box.height;
		set.add(box);
		System.out.println(set);
		Iterator<Box> itr = set.iterator();
		int k = 1;
		while(itr.hasNext()) {
			Box b = (Box)itr.next();
			if(b != box && i != k) {
				if(b.volume == box.volume) {
					set.remove(box);
				}
				k++;
			}
		}
	}
	
	static public void display() {
		Iterator<Box> itr = set.iterator();
		System.out.println("Unique Boxes in the Set are");
		while(itr.hasNext()) {
			Box box = (Box)itr.next();
			System.out.print("Length = " + box.length);
			System.out.print(" Width = " + box.width);
			System.out.print(" Height = " + box.height);
			System.out.printf(" Volume = " + "%.2f\n", box.volume);
		}
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Box");
		int n = scan.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter the Box " + i + " details");
			insert(i);
		}
		display();
	}

}
