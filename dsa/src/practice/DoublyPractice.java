package practice;

import practice.LinkedListPractice.Node;

public class DoublyPractice {
	public static class Node{
    	int data;
    	Node next;
    	Node prev;
    	Node(int data){
    		this.data=data;
    		this.next=null;
    		this.prev=null;
    	}
    }
    Node head;
	public DoublyPractice() {
		this.head=null;
	}
	public Node addFirst(int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		newNode.prev=null;
		if(head!=null) {
			head.prev=newNode;
		}
		head=newNode;
		return head;
	}
	public void display() {
		Node head_node=head;
		Node tail_node=null;
		System.out.println("IN FORWARD DIRECTION");
		while(head_node!=null) {
			System.out.print(head_node.data+" ");
			tail_node=head_node;
			head_node=head_node.next;
		}
		System.out.println("\nIN REVERSE DIRECTION");
		while(tail_node!=null) {
			System.out.print(tail_node.data+" ");
			tail_node=tail_node.prev;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		DoublyPractice obj=new DoublyPractice();
		obj.addFirst(10);
		obj.addFirst(20);
		obj.addFirst(30);
		obj.addFirst(40);
		obj.addFirst(50);
		obj.display();
	}

}
