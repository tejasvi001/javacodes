package assignments.reversearray;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ArrayToStack {
	private static Scanner input;
	static {
		input=new Scanner (System.in);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack=new Stack<>();
		int n;
		System.out.println("Enter the size of an array");
		n=input.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		for(int i=0;i<n;i++) {
			stack.push(arr[i]);
		}
		//printing the stack
		System.out.println("the stack is "+stack);
		//peek operation
		System.out.println("peek is "+stack.peek());
		int arr2[]=new int[n];
		for(int i=0;i<n;i++) {
			arr2[i]=stack.pop();
			System.out.println(arr2[i]);
		}
		
		if(!stack.isEmpty()) {
			System.out.println("peek is "+stack.peek());
		}
		addingagain: 
		for(int i=0;i<n;i++) {
			stack.push(arr[i]);
		}
		//searching
		System.out.println("The stack is "+stack);
		int position=stack.search(4);//index from top
		if(position!=-1) {
			System.out.println("The element is present in the stack");
		}else {
			System.out.println("The element not found");
		}
		//deletion of the element in the position index
		Integer result = null;
		if(position!=1) {
			
			for(int i=0;i<position;i++) {
				result=stack.pop();
			}
			System.out.println("result="+result);
		}
		//printing the stack using the iterator interface
		System.out.println(stack);
		Iterator<Integer> stackItr=stack.iterator();
		while(stackItr.hasNext()) {
			Integer x= stackItr.next();
			System.out.println(x);
		}
		
	}

}
