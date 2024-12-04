package searching;

import java.util.Scanner;

public class LinearSearch {
	private static Scanner input;
	static {
		input=new Scanner(System.in);
	}
	public int linearSearch(int data[],int searchValue) {
		int length=data.length;
		if(length ==0) {
			return -1;
		}
		for(int i=0;i<length;i++) {
			if(data[i]==searchValue) {
				return i;
			}
		}
		return -1;
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
		System.out.println("Enter the value you want to search");
		int x=input.nextInt();
		LinearSearch obj=new LinearSearch();
		System.out.println(obj.linearSearch(data,x));
	}

}
