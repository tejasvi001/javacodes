//to print border values of a matrix
package arrays;

import java.util.Scanner;

public class Array6 {

	public Array6() {
		// TODO Auto-generated constructor stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter an odd value for n ");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("Please Enter any odd value");
		}
		else {
			int arr[][]=new int[n][n];
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					arr[i][j]=0;
				}
			}
			System.out.println("The value for the matrix is");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println("");
			}
			System.out.println("The border elements are:");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(i==0||i==n-1||j==0||j==n-1) {
						System.out.print(arr[i][j]+" ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.println("");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array6 obj=new Array6();
	}

}
