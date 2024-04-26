package Trees;

public class LevelOrderQueue {
	
	queue front, rear;
	
	class queue {
		int value;
		queue next;
	}
	
	LevelOrderQueue() {
		front = rear = null;
	}
	
	public void insertion(int data) {
		queue ptr = new queue();
		ptr.value = data;
		ptr.next = null;
		if(rear == null) 
			front = rear = ptr;
		else {
			rear.next = ptr;
			rear = ptr;
		}
	}
	
	public int deletion() {
		int temp = 0;
		if(front == null)
			return -1;
		else {
			temp = front.value;
			front = front.next;
		}
		return temp;
	}
}