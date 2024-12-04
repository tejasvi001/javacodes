package sorting;

import java.util.Scanner;

public class BubbleSort {
	private int N;
	private int data[];
	private static Scanner input;
	static {
		input=new Scanner(System.in);
	}
	public void doBubbleSort() {
		int temp;
		if(N==1) {
			return;
		}
		for(int i=0;i<N-1;i++) {
			int swap=0;
			for(int j=0;j<N-1-i;j++) {
				if(data[j]>data[j+1]) {
					temp=data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
				}
			}
			if(swap==0){
				System.out.println("The array is sorted at pass "+(i+1));
				break;
			}
		}
	}
	public BubbleSort(int N) {
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
		BubbleSort obj=new BubbleSort(n);
     	obj.inputArray();
     	obj.display();
     	obj.doBubbleSort();
     	obj.display();
	}
}