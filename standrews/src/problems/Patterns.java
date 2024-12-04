package problems;

import java.util.ArrayList;

import com.sun.tools.javac.util.List;

public class Patterns {
//			*
//			*
//			*
//			*
//			* * * * *
	public void printPattern1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==n-1||j==0) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	//convert a number to different base
	public static void convertNumber(int n,int base) {
		ArrayList<Integer>getNumber=new ArrayList<Integer>();
		while(n>0)
		{
			int reminder=n%base;
			getNumber.add(reminder);
			n=n/base;
			
		}
		for(int i=getNumber.size()-1;i>=0;i--)
		{
			System.out.print(getNumber.get(i));
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" CONVERTING TO A DIFFERENT BASE");
		int number=17,base=2;
		convertNumber(number,base);
	}

}

//  Convert Decimal number in any base format.

//  Create an Counter. counter will increment 
//  by one after some delay.

//  EXAMPLE : 37478300000  --- OUTPUT -> 5



