package sorting;

import java.util.Scanner;

public class InsertionSort {
	private int N;
	private int data[];
	private static Scanner input;
	static {
		input=new Scanner(System.in);
	}
	public void doInsertionSort() {
		int temp;
		if(N==1) {
			return;
		}
		for(int i=1;i<N;i++) {
			for(int j=i;j>0;j--) {
				if(data[j]<data[j-1]) {
					temp=data[j];
					data[j]=data[j-1];
					data[j-1]=temp;
				}
			}
		}
	}
	
	public void doInsertionSort2() {
		for(int i=1;i<data.length;i++) {
			int currentElement=data[i];
			int previousIndex=i-1;
			while(previousIndex>=0&&data[previousIndex]>currentElement) 
			{
				data[previousIndex+1]=data[previousIndex];
				previousIndex--;
			}
			data[previousIndex+1]=currentElement;
		}
	}
	public InsertionSort(int N) {
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
		System.out.println("Enter no. of elements in the array");
		int n=input.nextInt();
		InsertionSort obj=new InsertionSort(n);
     	obj.inputArray();
     	obj.display();
     	obj.doInsertionSort();
     	obj.display();
     	
	}
}
