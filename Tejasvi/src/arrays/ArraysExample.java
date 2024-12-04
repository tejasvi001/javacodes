package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExample {
	public ArraysExample(){
		int marks[]=new int[5];//array-marks of size 5
		Arrays.fill(marks, 0);//fills 0 in each element of the 1d array
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<marks.length;i++) {
			marks[i]=sc.nextInt();
		}
		System.out.println("The marks are : ");
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
