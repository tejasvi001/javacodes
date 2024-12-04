package linkedlist.doublylinkedlist;
public class LinkedList02 {
	class Node{
		int data;
		Node previous,next;
		public Node(int data) {
			this.data = data;
			next = previous =null;
		}
	}
	Node head;
	public LinkedList02() {
		head=null;
	}
	public Node insertNodeAtStart(int data) {
		Node newNode=new Node(data);
		//current head becomes this new node's next
		newNode.next=head;
		newNode.previous=null;
		if(head!=null) {
			head.previous=newNode;
		}
		head=newNode;
		return head;
	}
	public void deleteNode() {
		Node temp=head;
		if(head==null) {
			System.out.println("Nothing to delete");
			return;
		}
		//if ll has only one node
		if(temp.next==null) {
			System.out.println(" item deleted: "+temp.data);
			head=null;
			return;
		}
		//move head to the next node
		head=head.next;
		//assign head node's previous to null
		head.previous=null;
		System.out.println(temp.data+" deleted");
	}
	public void showLinkedList() {
		Node node=head;
		Node tail=null;
		System.out.println("\n In forward direction ");
		while(node!=null) {
			System.out.print(node.data + " ");
			tail=node;
			node=node.next;
		}
		System.out.println("\n In Backward direction ");
		while(tail!=null) {
			System.out.print(tail.data + " ");
			tail=tail.previous;
		}
		System.out.println("\n");
	}
	public static void main(String[] args) {
		LinkedList02 obj=new LinkedList02();
		for(int i=10;i<=100;i+=10) {
			obj.insertNodeAtStart(i);
		}
		obj.showLinkedList();
		obj.deleteNode();
		obj.showLinkedList();
	}
}
