package arrays;

import java.util.Scanner;

public class UnionArray {

	public UnionArray() {
		// TODO Auto-generated constructor stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size for the array 1");
		int n=sc.nextInt();
		int arr1[]=new int[n];
		
		for(int i=0;i<n;i++){
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the size for the array 2");
		int n2=sc.nextInt();
		int arr2[]=new int[n2];
		
		for(int i=0;i<n2;i++){
			arr2[i]=sc.nextInt();
		}
		System.out.println("The array 1 is");
		for(int i=0;i<n;i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.println("The array 2 is");
		for(int i=0;i<n2;i++){
			System.out.print(arr2[i]+" ");
		}
		int arr3[]=new int[n+n2];
		int x=0;
		for(int i=0;i<n;i++) {
			int f=0;
			for(int j=0;j<x;j++) {
				if(arr3[j]==arr1[i]) {
					f=1;
				}
			}
			if(f==0) {
				arr3[x]=arr1[i];
				x++;
			}           
			else {
				continue;
			}
		}
		int c=x;
		for(int i=0;i<n2;i++) {
			int f=0;
			for(int j=0;j<x;j++) {
				if(arr3[j]==arr2[i]) {
					f=1;
				}
			}
			if(f==0) {
				arr3[x]=arr2[i];
				x++;
			}
			else {
				continue;
			}
		}
		System.out.println("The array 3 is");
		for(int i=0;i<x;i++){
			System.out.print(arr3[i]+" ");
		}
		System.out.println("\n The total elements in union are "+x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	UnionArray obj=new UnionArray();
	}

}
