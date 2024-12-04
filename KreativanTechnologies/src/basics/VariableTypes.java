package basics;

public class VariableTypes {
	int a;						//instance variable
	static int b=0;				//static or class
	void print(int x)		    //parameter
	{
		for(int i=1;i<=x;i++) {	//local variable
		System.out.println(i);
		}
	}
	public static void main(String[] args) {
		VariableTypes obj=new VariableTypes();
		//Accessing Instance variable
		System.out.println("The value is "+obj.a);
		//Accessing Static Variables
		System.out.println("The value of b is"+b);
		//Parameters
		obj.print(10);
		//local variables can not be accessed outside scope
	}

}
