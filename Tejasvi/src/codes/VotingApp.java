package codes;

import java.util.Scanner;

public class VotingApp {
	
	private int age;
	private int country;//0: indian and others NRI
	public VotingApp() {
		System.out.println("VOTING APP");
		System.out.print("Please Enter Your Age: ");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		System.out.println("Enter Your country");
		country=sc.nextInt();
		if(age>17&&country==0) {
			System.out.println("Eligible to vote");
		}
		else if(age<18 &&country==0) {
			System.out.println("Eligible after "+(18-age)+" years");
		}else {
			System.out.println("Not Eligible to vote");
		}
		
	}

	public static void main(String[] args) {
		VotingApp obj=new VotingApp();
		
	}

}
