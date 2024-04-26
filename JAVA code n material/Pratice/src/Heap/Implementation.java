package Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Implementation {
	
	static List<Integer> heap;
	
	public Implementation() {
		heap = new ArrayList<Integer>();
	}
	
	private void insertion(int value) {
		
		heap.add(value);
		int index = heap.size() - 1; 
		while(index > 0 && heap.get((index - 1) / 2) > value) {   //Min Heap
			int temp = heap.get((index - 1) / 2);
			heap.remove((index - 1) / 2);
			heap.add((index - 1) / 2, value);
			heap.remove(index);
			heap.add(index, temp);
			index = (index - 1) / 2;
		}
		
		System.out.println("Inserted successfully.");
	}
	
	private void deletion(int value) {
		
		int index = heap.indexOf(value);
		heap.remove(index);
		heap.add(index, heap.get(heap.size() - 1));
		heap.remove(heap.size() - 1);
		int left = 2 * index + 1;
		int right = 2 * index + 2;
		
		while(left < heap.size() && heap.get(index) > heap.get(left)
				|| right < heap.size() && heap.get(index) > heap.get(right)) {
			if(left < heap.size() && right < heap.size()) {
				if(heap.get(left) < heap.get(right)) {
					int temp = heap.get(index);
					heap.remove(index);
					heap.add(index, heap.get(left));
					heap.remove(left);
					heap.add(left, temp);
					index = left;
				}
				else {
					int temp = heap.get(index);
					heap.remove(index);
					heap.add(index, heap.get(right));
					heap.remove(right);
					heap.add(right, temp);
					index = right;
				}
			}
			else if(left < heap.size()) {
				int temp = heap.get(index);
				heap.remove(index);
				heap.add(index, heap.get(left));
				heap.remove(left);
				heap.add(left, temp);
				index = left;
			}
			else {
				int temp = heap.get(index);
				heap.remove(index);
				heap.add(index, heap.get(right));
				heap.remove(right);
				heap.add(right, temp);
				index = right;
			}
		}
	}
	
	private void display() {
		System.out.println(heap);
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int ch = 0;
		Implementation i = new Implementation();
		
		while(ch != 4) {
			System.out.print("\n***************Operation on Heap***************\n");
		    System.out.print("\n1. Insertion\n2. Deletion\n3. Traversal\n4. Exit");
		    System.out.print("\n\nEnter the choice:-");
		    ch = scan.nextInt();
		    
		    switch(ch) {
		    	case 1:
		    		System.out.print("Enter the inserted element: ");
		    		int value = scan.nextInt();
		    		i.insertion(value);
		    		break;
		    	case 2:
		    		System.out.print("Enter the deleted element: ");
		    		value = scan.nextInt();
		    		i.deletion(value);
		    		break;
		    	case 3:
		    		i.display();
		    		System.out.println("\n");
		    		break;
		    	case 4:
		    		System.exit(0);
		    		break;
		    	default: System.out.print("\nPlease enter valid choice\n\n");
		    }
		}
	}

}
