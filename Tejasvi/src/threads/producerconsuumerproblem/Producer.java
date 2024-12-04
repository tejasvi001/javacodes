package threads.producerconsuumerproblem;

public class Producer extends Thread {
	private BurgerOrder burger;
	private int number;
	public Producer(BurgerOrder burger,int number) {
		this.burger=burger;
		this.number=number;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			for(int i=0;i<4;i++)
			{
				burger.put(i);
				System.out.println("Burger Produced for #"+this.number +" ordered : "+i);
			try {
			 
				sleep((int)Math.random()*100);
			}catch(InterruptedException e) { }
		}
	}

}
