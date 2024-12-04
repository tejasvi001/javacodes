package standrews;
/* operations to perform on linked list
 * create a node structure
 * add node
 * show node
 * add a node at first
 * add a node at last
 * add a node at a position
 * delete a node from front
 * delete a node from last
 * delete a node from position
 * count no of nodes
 * delete all nodes
 * delete all even nodes
 * delete all odd nodes
 * swap nodes values
 * reverse a linked list
 * search an element
 * remove duplicates
 * concatenation of two lists
 * connect the lists
 */
public class LinkedList {
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node head;
	public LinkedList(){
		head=null;
	}
	public Node addNode(int data) {
		Node temp=new Node(data);
		temp.next=head;
		head=temp;
		return head;
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String args[]) {
		LinkedList obj=new LinkedList();
		obj.addNode(0);
		obj.display();
		for(int i=10;i<100;i+=5) {
			obj.addNode(i);
			obj.display();
		}
	}
}
