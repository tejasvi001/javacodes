package searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	private static Scanner input;
	static {
		input=new Scanner(System.in);
	}
	public int binarySearch(int data[],int searchValue) {
		Arrays.sort(data);
		int low=0;
		int high=data.length-1;
		int index = -1;
		
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(searchValue>data[data.length-1]||searchValue<data[0]) {
				System.out.println("the value doesnt exist in array");
				return -1;
			}
			if(searchValue<data[mid]) {
				high=mid-1;
			}else if(searchValue>data[mid]) {
				low=mid+1;
			}else {
				index = mid;
				break;
			}
		}
		return index;
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
		BinarySearch obj=new BinarySearch();
		System.out.println("value " +x+" found at index "+obj.binarySearch(data,x));
	}

}
