package Problems;

import java.util.Stack;

public class DinnerPlateStacks {
	
	Stack<Stack<Integer>> stack;
    int capacity;

    public DinnerPlateStacks(int capacity) {
        this.capacity = capacity;
        stack = new Stack<Stack<Integer>>();
    }
    
    public void push(int val) {
        boolean flag = false;
        //System.out.println(stack);
        if(!stack.isEmpty()) {
            for(int i = 0; i < stack.size(); i++) {
            	//System.out.println(stack.get(i));
                if(stack.get(i).size() < capacity) {
                	//System.out.println(val);
                    flag = true;
                    stack.get(i).push(val);
                    break;
                }
            }
        }
        if(flag == false) {
            Stack<Integer> s = new Stack<Integer>();
            s.push(val);
            stack.push(s);
        }
    }
    
    public int pop() {
        if(stack.isEmpty())
            return -1;
        
        int t = stack.size();
        while(t > 1 && stack.get(t - 1).isEmpty()) {
        	t--;
        }
        
        return popAtStack(t - 1);
    }
    
    public int popAtStack(int index) {
        if(stack.isEmpty() || stack.size() <= index)
            return -1;
        
        if(stack.get(index).isEmpty())
        	return -1;
        
        int t = stack.get(index).pop();
        
        return t;
    }

	public static void main(String[] args) {
		
		DinnerPlateStacks ob = new DinnerPlateStacks(2);
		
		ob.push(1);
		ob.push(2);
		ob.push(3);
		ob.push(4);
		ob.push(5);
		ob.push(6);
		ob.push(7);
		
		System.out.println(ob.stack);
		
		System.out.println(ob.popAtStack(2));
		System.out.println(ob.stack);
		
		System.out.println(ob.popAtStack(2));
		System.out.println(ob.stack);
		
		System.out.println(ob.popAtStack(1));
		System.out.println(ob.stack);
		
		System.out.println(ob.popAtStack(1));
		System.out.println(ob.stack);
		
		System.out.println(ob.popAtStack(0));
		System.out.println(ob.stack);
		
		ob.push(8);
		ob.push(9);
		
		System.out.println(ob.stack);
		
		System.out.println(ob.pop());
		System.out.println(ob.stack);
		
		System.out.println(ob.pop());
		System.out.println(ob.stack);
		
		System.out.println(ob.pop());
		System.out.println(ob.stack);
		
		System.out.println(ob.pop());
		System.out.println(ob.stack);
		
		System.out.println(ob.pop());
		System.out.println(ob.stack);
		
		/*
		 * System.out.println(ob.popAtStack(0));
		 * 
		 * System.out.println(ob.stack); System.out.println(ob.s);
		 * 
		 * ob.push(20); ob.push(21);
		 * 
		 * System.out.println(ob.stack); System.out.println(ob.s);
		 * 
		 * System.out.println(ob.popAtStack(0));
		 * 
		 * System.out.println(ob.stack); System.out.println(ob.s);
		 * 
		 * System.out.println(ob.popAtStack(2));
		 * 
		 * System.out.println(ob.stack); System.out.println(ob.s);
		 * 
		 * System.out.println(ob.pop());
		 * 
		 * System.out.println(ob.stack); System.out.println(ob.s);
		 * 
		 * System.out.println(ob.pop());
		 * 
		 * System.out.println(ob.stack); System.out.println(ob.s);
		 * 
		 * System.out.println(ob.pop());
		 * 
		 * System.out.println(ob.stack); System.out.println(ob.s);
		 * 
		 * System.out.println(ob.pop());
		 * 
		 * System.out.println(ob.stack); System.out.println(ob.s);
		 * 
		 * System.out.println(ob.pop());
		 * 
		 * System.out.println(ob.stack); System.out.println(ob.s);
		 */

	}

}
