package assignments.reversearray;

public class Stack {
	private int capacity;
	private int[] array;
	private int top;
	private int size;
	public Stack() {
		System.out.println("STACK USING ARRAY");
		this.capacity=100;
		this.top=-1;
		this.array = new int[capacity];
	}
	public void push(int item) {
		if(isFull()) {
			System.out.println(" The stack is empty");
			return;
		}
		array[++top]=item;
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println(" The stack is empty");
			return -1;
		}
		return array[top--];
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println(" The stack is empty");
			return -1;
		}
		return array[top];
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==capacity-1;
	}
}
