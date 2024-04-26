package DataStructure;

import java.util.*;

public class StackUsingQueues {
	
	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();
	int size = 0;
	
	public void push(int x) {
		size++;
		q2.add(x);
		
		while(!q1.isEmpty()) {
			q2.add(q1.peek());
			q1.remove();
		}
		
		Queue<Integer> q = q1;
		q1 = q2;
		q2 = q;
	}
	
	public void pop() {
		if(q1.isEmpty()) 
			return;
		q1.remove();
		size--;
	}
	
	public int top() {
		if(q1.isEmpty())
			return -1;
		return q1.peek();
	}
	
	public int size() {
		return size;
	}

	public static void main(String[] args) {
		
		StackUsingQueues stack = new StackUsingQueues();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println("current size: " + stack.size()); 
        System.out.println(stack.top()); 
        stack.pop(); 
        System.out.println(stack.top()); 
        stack.pop(); 
        System.out.println(stack.top()); 
  
        System.out.println("current size: " + stack.size());
	}

}
