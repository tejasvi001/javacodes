package codes;

import java.util.Scanner;

public class TableApp {

	public TableApp() {
		System.out.println("Table App");
		Scanner sc=new Scanner (System.in);
		int tableof;
		System.out.print("Table :");
		tableof=sc.nextInt();
		if(tableof>1) {
		for(int i=1;i<=10;i++) {
			System.out.println(tableof+" * "+i+" = "+ (i*tableof));
		}
		}
		else {
			System.out.println("enter correct value");
		}
	}
	public static void main(String args[])
	{
		TableApp obj=new TableApp();
	}
}
