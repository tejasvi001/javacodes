package codes;

import java.util.Scanner;

public class SwitchCase {

	public SwitchCase() {
		// TODO Auto-generated constructor stub
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		a=sc.nextInt();
		switch(a) {
		case 1:
			System.out.println("You are a doctor");
			break;
		case 2:
			System.out.println(" You are a engineer");
			break;
		case 3:
			System.out.println("You are a CA");
			break;
		default:
			System.out.println("enter a valid no");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwitchCase obj =new SwitchCase();
		// syntax: classname objectname=new SwitchCase();
		//SwitchCase()-we are calling constructor of this class;
		//new : allocates memory for the object
		//SwitchCase: defines datatype of object
		//obj: the name of the object
	}

}
