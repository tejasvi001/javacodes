package com.oop;

import java.util.Scanner;

public class ThisMethod {
	String name;
	int age;
	//Constructor which uses this keyword
	public ThisMethod(String name,int age) {
		this.name=name;
		this.age=age;
	}
	//we need to pass other values all values in this method
	public ThisMethod(int age) {
		this(null,age);
	}
	public ThisMethod(String name) {
		this(name,0);

	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}


	public static void main(String args[]) {
		int age;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name : ");
		name=sc.nextLine();
		System.out.print("Enter Your age:  ");
		age=sc.nextInt();
		
		ThisMethod obj=new ThisMethod(name,age);
		System.out.println("Name : "+obj.getName());

	}
}