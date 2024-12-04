package codes;
public class Enc1 {
	int serialNo;
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public Enc1() {
		// TODO Auto-generated constructor stub
	}
	public void method() {
		System.out.println("Serial no"+serialNo);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enc1 obj=new Enc1();
		int serialNo =100;
		obj.setSerialNo(serialNo);
		obj.method();
		Enc1 obj1=new Enc1();
	}
}
