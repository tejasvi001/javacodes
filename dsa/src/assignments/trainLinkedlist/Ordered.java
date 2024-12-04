package assignments.trainLinkedlist;

import java.util.Scanner;

public class Ordered {
	private int N;
	private int arr[];
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node head;
	private static Scanner input;
	static {
		input=new Scanner(System.in);
	}
	public Ordered(int N) {
		System.out.println("N:");
		this.N=input.nextInt();
		head=null;
	}
	public void createArray() {
		arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=input.nextInt();
		}
	}
	public void displayArray() {
		for(int i=0;i<N;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public void arrangell(int x) {
		head=new Node(x);
		for(int i=0;i<N;i++) {
			if(arr[i]<x) {
				head=addFirst(arr[i]);
			}else {
				head=addLast(arr[i]);
			}
		}
		
	}
	private Node addFirst(int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
		return head;
	}
	private Node addLast(int data) {
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		Node newNode=new Node(data);
		newNode.next=null;
		temp.next=newNode;
		return head;
	}
	public void displayll() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}
	public static void main(String[] args) {
		int N=0;
		Ordered obj=new Ordered(N);
		obj.createArray();
		obj.displayArray();
		System.out.println("Enter The value around which you want to arrange the linkedlist");
		int x=input.nextInt();
		obj.arrangell( x);
		obj.displayll();
	}

}
