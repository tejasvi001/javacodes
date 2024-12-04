package sorting;

import java.util.Scanner;

public class QuickSort {
	private static Scanner input;
	static {
		input=new Scanner(System.in);
	}
	private void doQuickSort(int[] data,int startindex,int endindex ) {
		if(startindex>=endindex) {
			return;
		}
		int pivot = data[endindex];
		int leftpointer=startindex;
		int rightpointer=endindex;
		while(leftpointer<rightpointer) {
			while(data[leftpointer]<=pivot && leftpointer<rightpointer) {
				leftpointer++;
			}
			while(data[rightpointer]>=pivot && rightpointer>leftpointer) {
				rightpointer--;
			}
			//for every while condition swap the values
			swap(data,leftpointer,rightpointer);
		}
		//when both the pointers reach at same index
		//swap the left pointer with the pivot
		swap(data,leftpointer,endindex);
		//quick sort at left part
		 doQuickSort(data,startindex,leftpointer-1);
		//quick sort at right part
		 doQuickSort(data,leftpointer +1,endindex);
	}
	private void swap(int[] data, int leftpointer, int rightpointer) {
		int temp=data[leftpointer];
		data[leftpointer]=data[rightpointer];
		data[rightpointer]=temp;
	}
	public static void main(String[] args) {
		System.out.println("Enter no. of elements in the array");
		int n=input.nextInt();
		int data[]=new int[n];
		System.out.println("Enter values for array");
		for(int i=0;i<n;i++) {
			data[i]=input.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
		QuickSort obj=new QuickSort();
		System.out.println("-----------------");
     	obj.doQuickSort(data,0,n-1);
     	System.out.println("Values after sorting");
     	for(int i=0;i<n;i++) {
			System.out.print(data[i]+" ");
		}
     	System.out.println();
	}
}
