//adding mid value to each value in an array with odd number of elements
package arrays;

import java.util.Scanner;

public class Array2 {

	public Array2() {
		// TODO Auto-generated constructor stub
		int arr[]=new int[9];
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter values for the array");
		for(int x=0;x<9;x++) {
			arr[x]=sc.nextInt();
		}
		System.out.println(" the array is ");
		for(int x: arr) {
			System.out.print(x+" ");
		}
		for(int i=0;i<arr.length;i++) {
			if(i!=arr.length/2) {
			arr[i]+=arr[arr.length/2];
			}
		}
		System.out.println(" \n the array after operation is ");
		for(int x: arr) {
			System.out.print(x+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array2 obj=new Array2();
	}

}
