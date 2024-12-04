package Calculator;

import java.util.Scanner;

public class MainCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc obj=new Calc();
		Scanner sc =new Scanner(System.in);
		String operator;
		int val;
		System.out.println("------CALCULATOR------");
		val=sc.nextInt();
		obj.input(val,"+");
	
		do {
			
			operator=sc.next();
			if(operator.equals("=")) {
				break;
			}
			val=sc.nextInt();
			obj.input( val, operator);
		}while(operator!="=");
		System.out.println(obj.result);
	}

}
