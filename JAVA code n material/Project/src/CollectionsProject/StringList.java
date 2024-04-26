package CollectionsProject;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class StringList {
	
	LinkedList<String> list = new LinkedList<String>();
	void insert() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the item to be inserted:");
		String str = scan.nextLine();
		list.add(str);
		System.out.println("Inserted successfully");
	}
	
	void search() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the item to search:");
		String str = scan.nextLine();
		boolean flag = true;
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			if(str.equals(s)) {
				flag = false;
				System.out.println("Item are found in the list.");
			}
		}
		if(flag == true)
			System.out.println("Item are not found in the list.");
	}
	
	void delete() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the item to delete:");
		String str = scan.nextLine();
		boolean flag = true;
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			if(str.equals(s)) {
				flag = false;
				list.remove(s);
				System.out.println("Deleted successfully");
			}
		}
		if(flag == true)
			System.out.println("Item does not exist.");
	}
	
	void display() {
		System.out.println("The items in the list are :");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		StringList stringList = new StringList();
		
		while(true) {
			System.out.println("1. Insert");
			System.out.println("2. Search");
			System.out.println("3. Delete");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			System.out.println("Enter the choice :");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1: 
				stringList.insert();
				break;
			case 2:
				stringList.search();
				break;
			case 3:
				stringList.delete();
				break;
			case 4:
				stringList.display();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Wrong Input");
			}
		}
		
	}

}
