package codes;

public class Oop1 {
	int serialNo;
	
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public Oop1() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor");
	}
	static {
		System.out.println("static block");
	}
	{
		System.out.println("init");
	}
	static void method()
	{
		System.out.println("static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oop1 obj=new Oop1();
		System.out.println("object is "+ obj );
		Oop1.method();
	}
}
