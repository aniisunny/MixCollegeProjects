package LinkedLists;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
	
	Node head, tail;
	
	class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public RemoveDuplicates() {
		head = tail = null;
	}
	
	public void insert(int data) {
		if(head == null) {
			head = tail = new Node(data);
		}
		else {
			Node ptr = new Node(data);
			tail.next = ptr;
			tail = ptr;
		}
	}
	
	public void display() {
		Node ptr = head;
		while(ptr != null) {
			System.out.print(ptr.data + " ");
			ptr = ptr.next;
		}
	}
	
	public void removeDuplicates() {
		HashSet<Integer> set = new HashSet<Integer>();
		Node ptr = head;
		Node previous = null;
		while(ptr != null) {
			if(set.contains(ptr.data)) {
				previous.next = ptr.next;
			}
			else {
				set.add(ptr.data);
				previous = ptr;
			}
			ptr = ptr.next;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		RemoveDuplicates ob = new RemoveDuplicates();
		for(int i = 0; i < n; i++) {
			int data = sc.nextInt();
			ob.insert(data);
		}
		ob.removeDuplicates();
		ob.display();
		sc.close();

	}

}
