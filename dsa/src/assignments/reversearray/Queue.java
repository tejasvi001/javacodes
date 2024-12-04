package assignments.reversearray;

public class Queue {
	private int capacity;
	private int[] array;
	private int front;
	private int rear;
	private int size;
	public Queue() {
		System.out.println("Queue using Arrays");
		this.capacity=100;
		
		this.array = new int[capacity];
		this.front=0;
		this.rear=-1;
		this.size=0;
	}
	public void enqueue(int item) {
		if(isFull()) {
			System.out.println(" The queue is full");
			return;
		}
		++rear;
		array[rear]=item;
		size++;
	}
	public int dequeue() {
		if(isEmpty()) {
			System.out.println(" The queue is empty");
			return -1;
		}
		int item=array[front];
		front++;
		size--;
		return item;
	}
	public boolean isEmpty() {
		return rear==-1;
	}
	public boolean isFull() {
		return front==capacity-1;
	}
	public int size() {
		return size;
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println(" The queue is empty");
			return -1;
		}
		return array[front];
	}
}
