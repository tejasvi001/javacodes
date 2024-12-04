package linkedlist.doublylinkedlist;

public class LinkedList01 {
	class Node{
		int data;
		Node previous,next;
		public Node(int data) {
			this.data = data;
			next = previous =null;
		}
	}
	Node head;
	public LinkedList01() {
		head=null;
	}
	
	public static void main(String[] args) {


	}

}
