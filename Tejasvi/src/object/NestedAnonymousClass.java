package object;

public class NestedAnonymousClass {
	interface HelloWorld{
		public void greetings(String greet);
	}
	void sayHello() {
		//local class
		class EnglishGreeting implements HelloWorld{
			public void greetings(String egreet) {
				System.out.println("English :"+egreet);
			}
		}
		HelloWorld obj=new EnglishGreeting();
		obj.greetings(" Hello");
		//anonymous class
		HelloWorld obj2=new HelloWorld() 
										{
											public void greetings(String greet) {
												System.out.println("Hindi :"+greet);
												}
										};
		
		obj2.greetings(" Namaste");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedAnonymousClass obj=new NestedAnonymousClass();
		obj.sayHello();
		
	}

}
