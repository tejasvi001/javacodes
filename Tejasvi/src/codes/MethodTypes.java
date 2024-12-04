package codes;

public class MethodTypes {

	public MethodTypes() {
		// TODO Auto-generated constructor stub
		System.out.println("Method Types");
	}
	//no return type no arguments
	public void method_one() {
		System.out.println("Method Onee");
	}
	//return type with no args
	public int method_two() {
		int x,a=10,b=20;
		x=a+b;
		return x;
	}
	//no return with args
	public void method_three(int x,int y) {
		System.out.println("Method Threee says "+(x+y));
	}
	//return type and args
	public int  method_four(int a,int b) {
		return(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodTypes obj=new MethodTypes();
		obj.method_one();
		int x=obj.method_two();
		System.out.println("Method Two says the num  is "+ x);
		obj.method_three(5,10);
		int s=obj.method_four(10, 10);
		System.out.println("Method Four says The sum is"+s);
	}

}
