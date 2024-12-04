package com.oopinheritance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer age=10;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Bank Name : ");
		String bankName=sc.nextLine();
		BankApp obj=new BankApp(bankName);
		System.out.print("Enter Bank Location : ");
		String bankLocation=sc.nextLine();
		obj.setBankLocation(bankLocation);
		System.out.print("Enter Bank Code : ");
		String bankCode=sc.nextLine();
		obj.setBankCode(bankCode);
		System.out.println("Bank Name : "+obj.getBankName());
		System.out.println("Bank Code : "+obj.getBankCode());
		System.out.println("Bank Location : "+obj.getBankLocation());
	}

}
