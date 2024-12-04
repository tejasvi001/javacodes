//to print mid value of a matrix
//1 2 3 4 5
//2 3 4 5 6
//3 4 5 6 7
//4 5 6 7 8
//5 6 7 8 9
//The value for the matrix is
//1 2 3 4 5 
//2 3 4 5 6 
//3 4 5 6 7 
//4 5 6 7 8 
//5 6 7 8 9 
//The mid value is5
package arrays;

import java.util.Scanner;

public class MidOfMatrix {

	public MidOfMatrix() {
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
					arr[i][j]=sc.nextInt();
				}
			}
			System.out.println("The value for the matrix is");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println("");
			}
			System.out.println("The mid value is"+arr[n/2][n/2]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MidOfMatrix obj=new MidOfMatrix();
	}

}
