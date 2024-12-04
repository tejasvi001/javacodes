package exceptions;

import java.util.Scanner;

public class NFESoltution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		String age=sc.next();
		try {
			int agee=Integer.parseInt(age);
			System.out.println(agee);
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException");
		}
	}
}
