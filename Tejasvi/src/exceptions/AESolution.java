package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AESolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		try {
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		catch(NumberFormatException e) {
			System.out.println("Number Format Exception");
		}
		catch(InputMismatchException e) {
			System.out.println("Number Format Exception");
		}
		finally {
			System.out.println("Finally Block");
			sc.close();
			}
	}
}
