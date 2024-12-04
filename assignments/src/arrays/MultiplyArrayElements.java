package arrays;

import java.util.Scanner;

public class MultiplyArrayElements {
	public static void main(String... args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of 1 D array");
		int n=sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		int prod=1;
		for(int i=0;i<n;i++) {
			arr2[i]=sc.nextInt();
			arr1[i]=1;
			prod*=arr2[i];
		}	
		
		for(int i=0;i<n;i++) {
			if(arr2[i]!=0){
			arr2[i]=prod/arr2[i];
			}else {
				int product=1;
				for(int j=0;j<n;j++) {
					if(i!=j)
					product*=arr2[j];
				}
				arr2[i]=product;
			}
		}
		
		 
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j!=i) {
					arr1[i]*=arr2[j];
				}
			}
		}
		
		for(int i=0;i<n;i++)
			System.out.print(arr2[i]+ " ");
		System.out.println();
		for(int i=0;i<n;i++)
			System.out.print(arr1[i]+ " ");
	}
}
