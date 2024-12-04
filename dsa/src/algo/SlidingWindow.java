package algo;

import java.util.Scanner;

import org.w3c.dom.Node;

public class SlidingWindow {
	private int N;
	private int data[];
	private static Scanner input;
	static {
		input=new Scanner(System.in);
	}
	public SlidingWindow(int N) {
		this.N=N;
		data=new int[N];
	}
	public void inputArray() {
		System.out.println("Enter values for array");
		for(int i=0;i<N;i++) {
			data[i]=input.nextInt();
		}
	}
	public void display() {
		for(int i=0;i<N;i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[]= {2,1,5,1,3,2};
		int k=3;
		int maxSum=maxSubArraySum(arr,k);
		System.out.println(maxSum);
	}
	private static int maxSubArraySum(int[] arr, int k) {
		// TODO Auto-generated method stub
		if(arr==null||arr.length==0||arr.length<k) {
			return -1;
		}
		int maxSum=0;
		int currSum=0;
		//Calculate sum of first k elements
		for(int i=0;i<k;i++) {
			currSum+=arr[i];
		}
		maxSum=currSum;
		int idx=0;
		for(int i=k;i<arr.length;i++) {
			currSum-=arr[i-k];
			currSum+=arr[i];
			//maxSum=Math.max(maxSum, currSum);
			if(currSum>maxSum) {
				maxSum=currSum;
				idx=i-2;
			}
		}
		return maxSum;
	}
	void sum0(int arr[],int k) {
		int idx=0;
		int f=0;
		int s=0;
		for(int i=0;i<k;i++) {
			s+=arr[i];
		}
		if(s==0) {
			System.out.println(idx);
			f=1;
			}
		for(int i=k;i<arr.length;i++) {
			idx++;
			s-=arr[i-k];
			s+=arr[i];
			if(s==0) {
				System.out.println(idx);
			}
		}
		if(f==0) {
			System.out.println("No such pair found");
		}
	}
	public boolean hasCycle(Node head) {
		if(head==null) {
			return false;
		}
		Node slow=head;
		Node fast=head;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				return true;
			}
		}
		return false;
	}
}
