package com.oop.abstraction;

public class BankApp extends Bank {


	public BankApp(String bankName) {
		super(bankName);
	}
	public void setBankAppCode(String bankCode) {
		setBankCode(bankCode);
	}
	public void setBankAppLocation(String bankLocation) {
		setBankLocation(bankLocation);
	}
	//@override
	public void show() {
		System.out.println(" Bank details");
		System.out.println(getBankName());
		System.out.println(getBankCode());
		System.out.println(getBankLocation());
	}
}
