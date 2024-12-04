package linkedlist;

public class SinglyLinkedList {
	class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	Node head;
	public SinglyLinkedList() {
		head=null;
	}
	public Node insertNode(int data) {
		Node new_node=new Node(data);
		new_node.next=head;
		head=new_node;
		return head;
	}
	public void delete() {
		if(head==null) {
			System.out.println("The linked List is empty");
			return;
		}
		System.out.println("Deleted: "+head.data);
		head=head.next;
	}
	public Node insertBegining(int data) {
		Node new_node=new Node(data);
		new_node.next=head;
		head=new_node;
		return head;
	}
	public int size(Node node) {
		int size=0;
		while(node!=null) {
			node=node.next;
			size++;
		}
		return size;
	}
	public Node addlast(int data) {
		Node newNode=new Node(data);
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
		newNode.next=null;
		return head;
	}
	private void display() {
		// TODO Auto-generated method stub
		Node node=head;
		while(node!=null) {
			System.out.print(node.data+" ");
			node=node.next;
		}
		System.out.println();
	}
	public static void main(String args[]) {
		SinglyLinkedList obj=new SinglyLinkedList();
		obj.insertNode(25);
		obj.insertNode(20);
		obj.insertNode(15);
		obj.insertNode(10);
		obj.insertNode(5);
		obj.display();
	}
}
