package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
	/*
	 * WRAPPER CLASSES
	 * Integer -int(Wrapper Class)
	 * int a;
	 * Integer a=new Integer();
	 * Integer a=10;
	 * 
	 * Integer a=Integer.valueOf(10);
	 * ARRAYLIST -1.2
	 */
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Integer> obj=new ArrayList<>();
		for(int i=0;i<10;i++) {
			obj.add(i);
		}
		System.out.println(obj);
		obj.add(2,13);//add(index,value)
		System.out.println(obj);
		obj.remove(0);
		System.out.println(obj);
		obj.remove(3);
		System.out.println(obj);
		obj.set(1, 20);//set(index,value) arr[index]=value
		System.out.println(obj);
		//for each
		for(Integer a: obj) {
			System.out.print(a+", ");
		}
		//user input to array lists
		System.out.println("\n how many no.s");
		int a=sc.nextInt();
		for(int i=0;i<a;i++) {
		
			obj.add(sc.nextInt());
		}
		System.out.println(obj);
	}

}
