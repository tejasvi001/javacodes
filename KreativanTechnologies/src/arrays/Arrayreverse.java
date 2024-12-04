//reverse an array
//The array is
//1 2 3 4 56 67 3 12 0 9 
// The reversed array is
//9 0 12 3 67 56 4 3 2 1 

package arrays;

import java.util.Scanner;

public class Arrayreverse {

	public Arrayreverse() {
		// TODO Auto-generated constructor stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size for the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("The array is");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<n/2;i++) {
			int c=arr[i];
			arr[i]=arr[n-1-i];
			arr[n-1-i]=c;
		}
		System.out.println("\n The reveresed array is");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrayreverse obj=new Arrayreverse();
	}

}
