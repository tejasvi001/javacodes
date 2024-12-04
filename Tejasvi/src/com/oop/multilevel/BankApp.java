package com.oop.multilevel;

public class BankApp extends Employee{
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
	}
}
