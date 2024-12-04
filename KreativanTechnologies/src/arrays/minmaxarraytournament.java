package arrays;

import java.util.Scanner;

public abstract class minmaxarraytournament {
	public static class minmax{
		public int min,max;
	}
	static minmax getminmax(int arr[],int low, int high) {
		if(low==high) {
			min=arr[low];
			max=arr[low];
		}
	}
	public int min(int arr[],int N) {
		if(N==1)
			return arr[N-1];
		return(min());	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
	}
}

