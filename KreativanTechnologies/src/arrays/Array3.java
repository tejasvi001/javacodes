//adding larger of 2 mid values to each element in an even element array
package arrays;

import java.util.Scanner;

public class Array3 {

	public Array3() {
		// TODO Auto-generated constructor stub
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter values for the array");
		for(int x=0;x<10;x++) {
			arr[x]=sc.nextInt();
		}
		System.out.println(" the array is ");
		for(int x: arr) {
			System.out.print(x+" ");
		}
		int x=arr[arr.length/2];
		int y=arr[(arr.length/2)-1];
		if(x>y) {
			System.out.println("\n"+x+"is the greater among mid two ");
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=x) {
				   arr[i]+=x;
				}
			}
		}
		else {
			System.out.println("\n"+y+"is the greater among mid two ");
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=y) {
				   arr[i]+=y;
				}
			}
		}
		System.out.println(" \n the array after operation is ");
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array3 obj=new Array3();
	}

}
