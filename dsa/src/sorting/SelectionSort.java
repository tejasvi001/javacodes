package sorting;

import java.util.Scanner;

public class SelectionSort {
	private int N;
	private int data[];
	private static Scanner input;
	static {
		input=new Scanner(System.in);
	}
	public void doSelectionSort() {
		int temp;
		if(N==1) {
			return;
		}
		for(int i=0;i<N-1;i++) {
			int index=i;
			for(int j=i+1;j<N;j++) {
				if(data[index]>data[j]) {
					index=j;
				}
			}
			if(index!=i) {
			temp=data[index];
			data[index]=data[i];
			data[i]=temp;
			}
		}
	}
	public SelectionSort(int N) {
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
		SelectionSort obj=new SelectionSort(n);
     	obj.inputArray();
     	obj.display();
     	obj.doSelectionSort();
     	obj.display();
	}
}