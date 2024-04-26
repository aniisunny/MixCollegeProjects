package DataStructure;

import java.util.Stack;

public class QueueUsingStacks {
	
	Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    
    
    public void push(int x) {
        s2.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        int t = s1.pop();
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return t;
    }
    
    /** Get the front element. */
    public int peek() {
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        int t = s1.peek();
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return t;
    }

	public static void main(String[] args) {
		
		QueueUsingStacks queue = new QueueUsingStacks();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		
		System.out.println(queue.peek());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		

	}

}
