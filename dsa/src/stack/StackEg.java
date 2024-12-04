package stack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class StackEg {
	private static Scanner input;
	ArrayList <Integer> iListData;
	private int data[];
	private int N;
	private Stack <Integer> stack;
	private boolean isStackCreated;
	private boolean isDataEntered;
	static {
		input=new Scanner(System.in);
	}
	public StackEg(int N) {
		System.out.println("Enter Size");
		N=input.nextInt();
		this.N=N;
	}
	public int getN() {
		return N;
	}
	public int[] getData() {
		return data;
	}
	public List<Integer> getListData(){
		return iListData;
	}
	public void createStack() {
		stack=new Stack<Integer>();
		System.out.println(stack.capacity());
		System.out.println(stack.size());
		isStackCreated=true;
	}
	public boolean isStackCreated() {
		return isStackCreated;
	}
	public boolean isDataEntered() {
		return isDataEntered;
	}
	public void addData(int[] data) {
		data=new int[N];
		iListData=new ArrayList<Integer>();
		System.out.println("Data :");
		System.out.println(getN());
		for(int i=0;i<getN();i++) {
			data[i]=input.nextInt();
		}
		this.data=data;
		for(int value:data) {
			iListData.add(Integer.valueOf(value));
		}
		this.isDataEntered=true;
	}
	public void addDataToStack(List<Integer> data) {
		this.isDataEntered=false;
		stack.addAll(data);
		this.isDataEntered=true;
	}
	private int pop() {
		return stack.pop();
	}
	private void push() {
		System.out.println("Push");
		int value=input.nextInt();
		stack.push(Integer.valueOf(value));
	}
	private int peek() {
		return stack.peek();
	}
	public void showAllValuesInStack() {
		System.out.println("Size :"+stack.size());
		Iterator itr=stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public static void main(String[] args) {
		int data[]= {	};
		int N=0;
		StackEg obj=new StackEg(N);
		obj.createStack();
		if(obj.isStackCreated()) {
			System.out.println("The Stack is Created");
			obj.addData(data);
			if(obj.isDataEntered()) {
				System.out.println(" The data has been entered Successfully");
				obj.addDataToStack(obj.getListData());
				if(obj.isDataEntered()) {
					obj.showAllValuesInStack();
				}
			}else {
				System.out.println("The data has not been entered ");
			}
		}else {
			System.out.println("Cannot Create a Stack");
		}
	}
}
