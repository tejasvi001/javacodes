package com.oopinheritance;

public class BankApp extends Bank {
	private String bankLocation;
	private String bankCode;
	public String getBankLocation() {
		return bankLocation;
	}
	public void setBankLocation(String bankLocation) {
		this.bankLocation = bankLocation;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public BankApp(String bankName) {
		super(bankName);
		System.out.println("child constructor");
		//
	}
}








