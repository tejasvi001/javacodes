package assignments.reversearray;

import java.util.Scanner;
import java.util.Stack;

public class ReverseArrayUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack=new Stack<>();
		int n;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		n=input.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println(" The original array is");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<n;i++) {
			stack.push(arr[i]);
		}
		System.out.println("the stack is "+stack);
		for(int i=0;i<n;i++) {
			arr[i]=stack.pop();
		}
		System.out.println(" The reversed array is");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
