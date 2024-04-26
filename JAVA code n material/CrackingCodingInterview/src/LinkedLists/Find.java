package LinkedLists;

import java.util.Scanner;

public class Find {
	
Node head, tail;
	
	class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public Find() {
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
	
	public void find(int pos) {
		Node ptr = head;
		int size = 0;
		while(ptr != null) {
			size++;
			ptr = ptr.next;
		}
		int t = size - pos + 1;
		ptr = head;
		if(t < size)
			System.out.println("Not possible");
		else {
			for(int  i = 0; i < t - 1; i++) {
				ptr = ptr.next;
			}
			System.out.println(ptr.data);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Find ob = new Find();
		for(int i = 0; i < n; i++) {
			int data = sc.nextInt();
			ob.insert(data);
		}
		int pos = sc.nextInt();
		ob.find(pos);
		sc.close();

	}

}
