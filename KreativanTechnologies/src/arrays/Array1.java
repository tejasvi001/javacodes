//To swap the two halves of the array
package arrays;
import java.lang.reflect.Array;
import java.util.*;
public class Array1 {

	public Array1() {
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
		System.out.println(" \n the array  after opertaion is ");
		for(int x: arr) {
			System.out.print(x+ " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array1 obj=new Array1();
	}

}
