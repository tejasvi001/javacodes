package assignments.reversearray;

import java.util.Scanner;

public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue=new Queue();
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
		for(int i=n-1;i>=0;i--) {
			queue.enqueue(arr[i]);
		}
		for(int i=0;i<n;i++) {
			arr[i]=queue.dequeue();
		}
		System.out.println(" The reversed array is");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
