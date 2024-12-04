package stack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class StackExample {
	private static Scanner input;
	private int N;
	private boolean isStackCreated;
	private boolean isDataEntered;
	private ArrayList <Integer> iListData;
	private Stack<Integer> stack;
	static {
		input=new Scanner(System.in);
	}
	public StackExample(int N) {
		// TODO Auto-generated constructor stub
		N=input.nextInt();
		this.N=N;
	}
	public void createStack() {
		stack=new Stack<>();
		System.out.println(stack.capacity());  //default 0
		System.out.println(stack.size());	//initial 0
		this.isStackCreated=true;
	}
	public boolean isStackCreated() {
		return isStackCreated;
	}
	public void addData(int[] data) {
		data=new int[N];
		<Integer>iListData=new ArrayList<>();
		System.out.println("Data: ");
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
	private int getN() {
		// TODO Auto-generated method stub
		return N;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=0;
		int[] data= {};
		StackExample obj=new StackExample(N);
		obj.createStack();
		if(obj.isStackCreated()) {
			System.out.println("Stack is Created");
			obj.addData(data);
			if(obj.isDataEntered()) {
				System.out.println("Data is entered Successfully");
				obj.addDataToStack(obj.getListData());
			}
		}
	}
	private boolean isDataEntered() {
		// TODO Auto-generated method stub
		return isDataEntered;
	}

}
