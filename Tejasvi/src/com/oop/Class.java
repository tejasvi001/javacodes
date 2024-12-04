package com.oop;

import java.util.*;

public class Class {
	static {
		System.out.println("this is static block");
		getName();
	}
	static void getName(){
		
	}
	//init block
	{
		System.out.println("this is init block");
	}
	public Class() {
		// TODO Auto-generated constructor stub
		System.out.println("hello");
	}
	/*
	 * While creating object of a class we need to 
	 * declare the object and new keyword is used to 
	 * allocate the memory to the object and 
	 * Class() is calling the constructor of the class.
	 * Java creates a default constructor on its own so we need not 
	 * to declare default constructor until we want to perform 
	 * some tasks.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("this is main");
		Class object=new Class();
		Class object2=new Class();
	}

}








