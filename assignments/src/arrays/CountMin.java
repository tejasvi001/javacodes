package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CountMin {
	private static Scanner input;
	static {
		input=new Scanner(System.in);
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
		CountMin obj=new CountMin();
		System.out.println("using Approach 1: "+obj.countMin1(data));
		System.out.println("using Approach 2: "+obj.countMin2(data));
		System.out.println("using Approach 3: "+obj.countMin3(data));
		System.out.println("MAX : "+obj.countMax1(data));
	}
	public int countMax1(int[] data) {
		Arrays.sort(data);
		int c=1;
		for(int i=data.length-1;i>0;i--) {
			if(data[i]==data[i-1]) {
				c++;
			}
			else {
				break;
			}
		}
		return c;
	}
	public int countMin1(int[] data) {
		Arrays.sort(data);
		int c=1;
		for(int i=0;i<data.length-1;i++) {
			if(data[i]==data[i+1]) {
				c++;
			}
			else {
				break;
			}
		}
		return c;
	}
	public int countMin2(int[] data) {
		int min=data[0];
		for(int i=0;i<data.length;i++) {
			if(min>data[i])
				min=data[i];
		}
		int c=0;
		for(int i=0;i<data.length;i++) {
			if(data[i]==min) {
				c++;
			}
		}
		return c;
	}
	public int countMin3(int data[]) {
		int count=0;
		int min=data[0];
		for(int i=0;i<data.length;i++) {
			if(min>data[i]) {
				min=data[i];
				count=1;
			}
			if(min==data[i]) {
				count++;
			}
		}
		
		return count;
	}
}

