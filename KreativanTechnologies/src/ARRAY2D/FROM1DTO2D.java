package ARRAY2D;

import java.util.Scanner;

public class FROM1DTO2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of 1 D array");
		int n=sc.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<n;i++)
			arr1[i]=sc.nextInt();
		System.out.println("Enter No. of Rows");
		int r =sc.nextInt();
		System.out.println("Enter No. of Columns");
		int c=sc.nextInt();
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++) 
			for(int j=0;j<c;j++)
				arr[i][j]=0;
		
		int a=0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=arr1[a];
				a++;
				if(a>=n) {
					i=r;
					j=c;
				}
			}
		}
		
		System.out.println(" The one dimensional array is ");
		for(int i=0;i<n;i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.println("\n The two dimensional array is ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
