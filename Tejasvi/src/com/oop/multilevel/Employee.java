package com.oop.multilevel;

public class Employee extends Bank{
	private int totalEmployee;
	
	public int getTotalEmployee() {
		return totalEmployee;
	}

	public void setTotalEmployee(int totalEmployee) {
		this.totalEmployee = totalEmployee;
	}

	public Employee(String bankName) {
		super(bankName);
	}

}
