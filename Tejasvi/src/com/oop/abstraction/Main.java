package com.oop.abstraction;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Bank Name : ");
		String bankName=sc.nextLine();
		BankApp obj=new BankApp(bankName);
		System.out.print("Enter Bank Location : ");
		String bankLocation=sc.nextLine();
		obj.setBankAppLocation(bankLocation);
		System.out.print("Enter Bank Code : ");
		String bankCode=sc.nextLine();
		obj.setBankAppCode(bankCode);
		obj.show();
	}

}
