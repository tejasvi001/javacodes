package codes;


public class Class {
	//constructor
	public Class() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor");
	}
	//static block
	static {
		System.out.println("This is static block");
	}
	//init block
	{
		System.out.println("init");
	}
	static void method() {
		System.out.println("staticmethod");
	}
	public void method1() {
		System.out.println("method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main");
		Class obj=new Class();
		Class.method();
		obj.method1();
		Class obj1=new Class();
	}
}
