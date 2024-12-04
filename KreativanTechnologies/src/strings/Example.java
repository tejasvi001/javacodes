package strings;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str1="ashish";//literal
       String str2=new String("ashish");//object
       System.out.println(str1);
       Scanner sc=new Scanner(System.in);
       str2=sc.nextLine();//input
       System.out.println(str2);//output 
       System.out.println(str2.length());//length
	}

}
