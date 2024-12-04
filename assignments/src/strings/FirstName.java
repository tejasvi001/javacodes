/* A java progran to find first name out of the full name */
package strings;

import java.util.Scanner;

public class FirstName {
	public FirstName() {
		// TODO Auto-generated constructor stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Full Name");
		String s=sc.nextLine();
		int a=s.indexOf(" ");
		String s1=s.substring(0,a);
		System.out.println("Your First Name is "+s1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstName obj=new FirstName();
	}
}
