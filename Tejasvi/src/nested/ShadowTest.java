package nested;

public class ShadowTest {
	int x=0;
	public class InnerClass{
		int x=1;
		void show(int x) {
			System.out.println("x is = "+x);
			System.out.println("this.x = "+this.x);
			System.out.println("ShadowTest.this.x = "+ShadowTest.this.x);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShadowTest obj=new ShadowTest();
		ShadowTest.InnerClass objIn=obj.new InnerClass();
		objIn.show(22);
	}

}
