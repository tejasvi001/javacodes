package nested;

public class NestedStaticClass {
	private static String name="Tejas";
	
	 static class InnerClass{
		
		public void show() {
			System.out.println("Innner Class");
			System.out.println(name);
	   
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClass obj = new InnerClass();
		obj.show();

		
		
	}

}
