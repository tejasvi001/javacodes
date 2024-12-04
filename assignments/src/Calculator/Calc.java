package Calculator;

public class Calc {
	static int result=0;
	
	void input(int value, String Operation) {
		switch(Operation) {
		case "+":
			Add sum=new Add();
			result=sum.add(result, value);
			break;
		case "-":
			Sub diff=new Sub();
			result=diff.sub(result, value);
			break;
		case "*":
			Multi prod=new Multi();
			result=prod.multi(result, value);
			break;
		case "/":
			Divide div=new Divide();
			result=div.divide(result, value);
			break;
		case "=":
			break;
		default:
			System.out.println("Invalid Operation Selected");
		}
	}
}
