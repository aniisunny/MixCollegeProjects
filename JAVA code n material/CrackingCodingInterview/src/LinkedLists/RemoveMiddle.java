package LinkedLists;

import java.util.Scanner;

public class RemoveMiddle {
	
Node head, tail;
	
	class Node {
		char data;
		Node next;
		
		public Node(char data) {
			this.data = data;
		}
	}
	
	public RemoveMiddle() {
		head = tail = null;
	}
	
	public void insert(char data) {
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
	
	public void middle() {
		Node ptr = head;
		int size = 0;
		while(ptr != null) {
			size++;
			ptr = ptr.next;
		}
		ptr = head;
		int mid = size / 2;
		for(int i = 0; i < mid - 1; i++) {
			ptr = ptr.next;
		}
		ptr.next = ptr.next.next;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		RemoveMiddle ob = new RemoveMiddle();
		for(int i = 0; i < n; i++) {
			char data = sc.next().charAt(0);
			ob.insert(data);
		}
		ob.middle();
		ob.display();
		sc.close();

	}

}
