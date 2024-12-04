package com.oop.abstraction;
/*
 *Bank name
 *bank code
 *bank location 
 *
 */
public abstract class Bank {
	private String bankName;
	private String bankLocation;
	private String bankCode;
	
	
	public Bank(String bankName) {
		this.bankName=bankName;
   }	
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
	public String getBankName() {
		return bankName;
	}
	public abstract void show();
}                        
