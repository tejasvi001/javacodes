//To swap the two halves of the array
//1 2 3 4 5 6 7 8 9 10
// the array is 
//1 2 3 4 5 6 7 8 9 10  
// the array  after operation is 
//6 7 8 9 10 1 2 3 4 5 
package arrays;
import java.util.*;
public class Swap2HalvesOfArray {

	public Swap2HalvesOfArray() {
		// TODO Auto-generated constructor stub
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter values for the array");
		for(int x=0;x<10;x++) {
			arr[x]=sc.nextInt();
		}
		System.out.println(" the array is ");
		for(int x: arr) {
			System.out.print(x+" ");
		}
		
		for(int i=0;i<arr.length/2;i++) {
			int k=arr[i];
			arr[i]=arr[arr.length/2 +i];
			arr[arr.length/2 +i]=k;
			
		}
		System.out.println(" \n the array  after operation is ");
		for(int x: arr) {
			System.out.print(x+ " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swap2HalvesOfArray obj=new Swap2HalvesOfArray();
	}

}
