package threads.producerconsuumerproblem;

public class Consumer extends Thread {
	private BurgerOrder burger;
	private int number;
	public Consumer(BurgerOrder burger,int number) {
		this.burger=burger;
		this.number=number;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int value =0;
		for(int i=0;i<5;i++) {
			value=burger.get();
			System.out.println("Burger Consumed for #"+ this.number+" got: "+value);
		}
	}

}
