package exceptions.voting;


import java.util.Scanner;

import exceptions.logincredentials.CredentialVerificationException;

public class VotingApp {
	
	private int age;
	private int country;//0: indian and others NRI
	public boolean eligibilty(int age,int country) {
		try{
			if(age>17&&country==0) {
				return true;
			}
			throw new Voting("NOT ELIGIBLE");
		}
		catch(Voting obj) {
			System.out.println(obj.getMessage());
		}
		return false;
	}

	public static void main(String[] args) {
		VotingApp obj=new VotingApp();
		System.out.print("Please Enter Your Age: ");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		System.out.println("Enter Your country");
		int country=sc.nextInt();
		if(obj.eligibilty(age, country)) {
			System.out.println("Verified");
		}
	}

}
