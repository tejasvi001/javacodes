package Calculator;

import java.util.Scanner;

public class Calculator {
	
	public Calculator() {
		// TODO Auto-generated constructor stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		int _num1=sc.nextInt();
		int _num2=sc.nextInt();
		System.out.println("Enter The operation");
		String _opr=sc.next();
		int _result;
		switch(_opr) {
		case "+":
			_result=sum(_num1,_num2);
			System.out.println(_num1+" "+_opr+" "+_num2+" = "+_result);
			break;
		case "-":
			_result=difference(_num1,_num2);
			System.out.println(_num1+" "+_opr+" "+_num2+" = "+_result);
			break;
		case "*":
			_result=multiplication(_num1,_num2);
			System.out.println(_num1+" "+_opr+" "+_num2+" = "+_result);
			break;
		case "/":
			_result=division(_num1,_num2);
			System.out.println(_num1+" "+_opr+" "+_num2+" = "+_result);
			break;
		default:
			System.out.println("Please Enter a valid operation");
		}
		
	}
	int sum(int a,int b) {
		return a+b;
	}
	int difference(int a,int b) {
		return a-b;
	}
	int multiplication(int a,int b) {
		return a*b;
	}
	int division(int a,int b) {
		return a/b;
	}
}
