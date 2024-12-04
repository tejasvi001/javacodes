package Cashback;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		// TODO Auto-generated constructor stub
		MaxCashback obj=new MaxCashback();
		Scanner sc=new Scanner(System.in);
		System.out.println("------WELCOME------");
		System.out.println("Enter cashback in percentage");
		System.out.print("Cashback By Gpay");
		int a=sc.nextInt();
		System.out.print("Cashback By Phonepe");
		int b=sc.nextInt();
		System.out.print("Cashback By Paytm");
		int c=sc.nextInt();
		obj.setgpay(a);
		obj.setphonepe(b);
		obj.setpaytm(c);
		String max_cashback=obj.maxcashback();
		System.out.println(max_cashback);
	}

}
