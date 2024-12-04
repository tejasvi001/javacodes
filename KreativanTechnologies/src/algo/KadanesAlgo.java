package algo;
import java.util.Scanner;

public class KadanesAlgo {
	
/*
 * Kadane's Algorithm is a dynamic programming algorithm
 * Time Complexity
 */
     
	
		private static Scanner input;
		static {
			input=new Scanner(System.in);
		}
		public static int bruteForceMax(int data[]) {
			int sum=0;
			for(int i=0;i<data.length;i++) {
				for(int j=i;j<data.length;j++) {
					int s=0;
					for(int k=i;k<=j;k++)
						s+=data[k];
						//System.out.print(data[k]);
					//System.out.print("   ");
					sum=Math.max(s, sum);
				}
				//System.out.println();
			}
			return sum;
		}
		public static int prefixmax(int data[]) {
			int prefix[]=new int[data.length];
			prefix[0]=data[0];
			for(int i=1;i<data.length;i++) {
				prefix[i]=prefix[i-1]+data[i];
			}
			int s=prefix[0];
			for(int start=0;start<prefix.length-1;start++) {
				for(int end=start+1;end<prefix.length;end++) {
					s=Math.max(prefix[end]-prefix[start],s);
				}
			}
			return s;
			
		}
		public static int kadanesAlgo(int data[]) {
			int localmax=0;
			int globalmax=0;
			for(int i=0;i<data.length;i++) {
				localmax=Math.max(localmax+data[i],data[i] );
				globalmax=Math.max(localmax, globalmax);
			}
			return globalmax;
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
			System.out.println("Brute Force");
			int sum=bruteForceMax(data);
			System.out.println(sum);
			System.out.println("Kadane's Algorithm");
			sum=kadanesAlgo(data);
			System.out.println(sum);
			System.out.println(prefixmax(data));
		}
}
