package practice;
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
public class LinkedListPractice {
    public static class Node{
    	int data;
    	Node next;
    	Node(int data){
    		this.data=data;
    		this.next=null;
    	}
    }
    Node head;
//    Node tail;
	public LinkedListPractice() {
		this.head=null;
//		this.tail=null;
	}
	public Node addFirst(int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
		return head;
	}
	public Node InsertAfter(int pos,int data) {
		int size=size();
		if(pos<1||pos>size) {
			System.out.println("Insertion Not Possible");
			return null;
		}else {
			Node newNode=new Node(data);
			Node temp=head;
			for(int i=0;i<pos-1;i++) {
			//while(--pos>0) {
				temp=temp.next;
			}
			newNode.next=temp.next;
			temp.next=newNode;
		}
		return  head;
	}
	public Node addLast(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
//			tail=newNode;
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
//			tail.next=newNode;
//			tail=tail.next;
		}
		return head;
	}
	public int deleteFirst() {
		if(head==null) {
			System.out.println("Deletion Not possible");
			return -1;
		}
		int data=head.data;
		head=head.next;
		return data;
	}
	public int deletePos(int pos) {
		int size=size();
		if(pos<1||pos>size) {
			System.out.println("Deletion Not possible");
			return -1;
		}
		Node temp=head;
		for(int i=0;i<pos-2;i++) {
		//while(pos-->0) {
			temp=temp.next;
		}
		int data=temp.next.data;
		temp.next=temp.next.next;
		return data;
	}
	public int deleteLast() {
		if(head==null) {
			System.out.println("Deletion Not possible");
			return -1;
		}
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		int data=temp.next.data;
		temp.next=null;
		return data;
	}
	public void deleteAllNodes() {
		while(head!=null) {
			head=head.next;
		}
	}
	public void deleteAllEvenNodes() {
		Node temp=head;
		int idx=0;
		
		while(temp!=null) {
			if(temp.data%2==0) {
				
			}
			{
				idx++;
			}
			temp=temp.next;
			
		}
	}
	public void reverseLinkedList() {
		if(this.head!=null) {
			Node prevNode=this.head;
			Node tempNode=this.head;
			Node currNode=this.head.next;
			prevNode.next=null;
			while(currNode!=null) {
				tempNode=currNode.next;
				currNode.next=prevNode;
				prevNode=currNode;
				currNode=tempNode;
			}
			this.head=prevNode;
		}
	}
	public void display() {
		Node temp=head;
		if(head==null) {
			System.out.println("The list is empty");
		}
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public int size() {
		Node temp=head;
		int size=0;
		while(temp!=null) {
			size++;
			temp=temp.next;
		}
		return size;
	}
	public static void main(String args[]) {
		LinkedListPractice obj=new LinkedListPractice();
		for(int i=1;i<=5;i++) {
			obj.addFirst(i);
		}
		obj.display();
		System.out.println();
		System.out.println(obj.size());
		obj.addLast(0);
		obj.display();
		System.out.println();
		obj.InsertAfter(3, 7);
		obj.display();
		System.out.println();
		System.out.println(obj.deleteFirst());
		obj.display();
		System.out.println();
		System.out.println(obj.deleteLast());
		obj.display();
		System.out.println();
		System.out.println(obj.deletePos(2));
		obj.display();
		System.out.println();
		//obj.deleteAllNodes();
		//obj.display();
		//System.out.println("All nodes deleted");
		obj.deleteAllEvenNodes();
		obj.display();
		System.out.println();
		obj.reverseLinkedList();
		obj.display();
	}
}