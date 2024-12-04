package assignments.arrays;

import java.util.Scanner;
/*
 * Given a 2D array
 * 1 2 3 4 5        1 2 3 4 5
 * 2 3 4 5 6		2  		6
 * 3 4 5 6 7		3		7
 * 4 5 6 7 8		4		8
 * 5 6 7 8 9		5 6 7 8 9 
 * Consider the Outer sub array (border)
 * Perform following operations on the sub array
 * 1. Count the number of elements
 * 2. Find the sum of elements
 * 3. Find the maximum or minimum out of the sub array
 * 4. Find the middle of the array 
 * 5. Display number of elements greater than mid value
 * 6. Display number of elements smaller than mid value 
 */
public class OuterSubArrays {
	private int R;
	private int C;
	private int data[][];
	static Scanner input;
	static {
		input=new Scanner(System.in);
	}
	OuterSubArrays(int R,int C){
		this.R=R;
		this.C=C;
		this.data=new int[R][C];
	}
	public void inputArray() {
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				data[i][j]=input.nextInt();
			}
		}
	}
	public void outputArray() {
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}
	}
	//count the number of elements by formula
	public int countByFormula() {
		int c=2*(R+C)-4;
		//we can also use this alternative formula
		//int c=2*C+2*(R-2);
		return c;
	}
	//we can also count the number by iteration
	public int countByIteration() {
		int c=0;
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				if(i==0||j==0||i==R-1||j==C-1) {
					c++;
				}
			}
		}
		return c;
	}
	public int sum() {
		int sum=0;
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				if(i==0||j==0||i==R-1||j==C-1) {
					sum+=data[i][j];
				}
			}
		}
		return sum;
	}
	public int min() {
		int min=data[0][0];
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				if(i==0||j==0||i==R-1||j==C-1) {
					min=Math.min(min,data[i][j] );
				}
			}
		}
		return min;
	}
	public int max() {
		int max=data[0][0];
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				if(i==0||j==0||i==R-1||j==C-1) {
					max=Math.max(max,data[i][j] );
				}
			}
		}
		return max;
	}
	public int middle() {
		return data[R/2][C/2];
	}
	public int greaterThanMiddle() {
		int mid=middle();
		int countGreat=0;
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				if(i==0||j==0||i==R-1||j==C-1) {
					if(data[i][j]>mid){
						countGreat++;
					}
				}
			}
		}
		return countGreat;
	}
	public int smallerThanMiddle() {
		int mid=middle();
		int countSmall=0;
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				if(i==0||j==0||i==R-1||j==C-1) {
					if(data[i][j]<mid){
						countSmall++;
					}
				}
			}
		}
		return countSmall;
	}
	public static void main(String args[]) {
		System.out.println("Enter Number of Rows");
		int r=input.nextInt();
		System.out.println("Enter Number of Columns");
		int c=input.nextInt();
		OuterSubArrays obj=new OuterSubArrays(r,c);
		obj.inputArray();
		obj.outputArray();
		System.out.println("Count By Formula "+obj.countByFormula());
		System.out.println("Count By Iteration "+obj.countByIteration());
		System.out.println("Sum "+obj.sum());
		System.out.println("Min "+obj.min());
		System.out.println("Max "+obj.max());
		System.out.println("Middle "+obj.middle());
		System.out.println("Values higher than mid are "+obj.greaterThanMiddle());
		System.out.println("Values lower than mid are "+obj.smallerThanMiddle());
	}
}