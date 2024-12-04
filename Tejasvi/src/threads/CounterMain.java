package threads;

public class CounterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter obj=new Counter();
		Thread objAT=new Thread(() ->{
										obj.increment();
										} , "POSITIVE"
									);
		objAT.setName("+ve");
		Thread objBT=new Thread(() ->{
			obj.decrement();
			} , "NEGATIVE"
		);
		objBT.setName("-ve");
		objAT.start();
		objBT.start();
	}

}
