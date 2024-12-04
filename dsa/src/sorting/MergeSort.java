package sorting;

import java.util.Scanner;

public class MergeSort {
	private static Scanner input;
	static {
		input=new Scanner(System.in);
	}
	public void doMergeSort(int[] data) {
		int inputLength=data.length;
		if(inputLength<=1) {
			return;
		}
		int mid=inputLength/2;
		int left[]=new int[mid];
		int right[]=new int[inputLength-mid];
		for(int i=0;i<mid;i++) {
			left[i]=data[i];
		}
		for(int i=mid;i<inputLength;i++) {
			right[i-mid]=data[i];
		}
		//divide left array
		doMergeSort(left);//return
		//divide right array
		doMergeSort(right);
		//merge two half  arrays together
		merge(data,left,right);
	}
	public void merge(int data[],int left[],int right[]) {
		int leftSide=left.length;
		int rightSide=right.length;
		int i=0,j=0,k=0;
		while(i<leftSide&&j<rightSide) {
			if(left[i]<=right[j]) {
				data[k]=left[i];
				i++;
			}else {
				data[k]=right[j];
				j++;
			}
			k++;
		}
		//if any element is left in the leftHalf 
		while(i<leftSide) {
			data[k]=left[i];
			k++;
			i++;
		}
		//if any element is left in the rightHalf 
		while(j<rightSide) {
			data[k]=right[j];
			k++;
			j++;
		}
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
		MergeSort obj=new MergeSort();
     	obj.doMergeSort(data);
     	System.out.println("Values after sorting");
     	for(int i=0;i<n;i++) {
			System.out.print(data[i]+" ");
		}
     	System.out.println();
	}
}