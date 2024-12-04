package basics;

public class VariablesTypes {
/*
 * Variables are memory holders that hold any value according
 * to their data type
 * 
 * There are 4 types of variables that we can create in java.
 * 
 * Instance Variables - These are associated with the object of class.
 * Static/ Class Variables- These are associated with class 
 * 							Their value can not be modified or changed later.
 * Local Variables - Their scope is only within the block they are declared.
 * 					 We can not access them outside that block.
 * Parameters- These are arguments(values) we pass in the functions. 
 * 
 */
	int a;						//instance variable
	static int b=0;				//static or class
	void print(int x)		    //parameter
	{
		for(int i=1;i<=x;i++) {	//local variable
		System.out.println(i);
		}
	}
	public static void main(String[] args) {
		VariablesTypes obj=new VariablesTypes();
		//Accessing Instance variable
		System.out.println("The value is "+obj.a);
		//Accessing Static Variables
		System.out.println("The value of b is"+VariablesTypes.b);
		//Parameters
		obj.print(10);
		//local variables can not be accessed outside scope
	}
}

