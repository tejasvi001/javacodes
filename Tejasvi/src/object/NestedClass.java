package object;



class OuterClass{
	private  int a=10;

	 class InnerClass{
		public void show() {
			System.out.println("Innner Class");
			System.out.println(a);
		}
	}
}



public class NestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1st Way
		OuterClass.InnerClass obj = new OuterClass().new InnerClass();
		obj.show();

		//2nd Way
		OuterClass objout=new OuterClass();
		OuterClass.InnerClass objin = objout.new InnerClass();
		objin.show();
		
	}

}
