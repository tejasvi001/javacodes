package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayeg {

	public Arrayeg() {
		// TODO Auto-generated constructor stub
		int arr[]=new int[10];
		Arrays.fill(arr,0);//set all values of the array to 0
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values for the array");
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++) {
			System.out.println(arr[i]);
		}
		int x=arr[arr.length/2];
		int y=arr[arr.length/2-1];
		if(x>y) {
			System.out.println(x+" is greater");
		}
		else {
			System.out.println(y+" is greater");
		}
	}
	public static void main(String args[]) {
		Arrayeg obj=new Arrayeg();
	}
}
