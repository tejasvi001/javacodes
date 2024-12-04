package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinArray {

	public MaxMinArray() {
		// TODO Auto-generated constructor stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size for the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("The array is");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		Arrays.sort(arr);
		//size n=5
		// 1 2 4 5 99
		// 0 1 2 3 4
		System.out.println("\n Minimum is "+arr[0]);
		System.out.println("Maximum is "+arr[n-1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxMinArray obj=new MaxMinArray();
	}

}
