package threads.producerconsuumerproblem;

public class BurgerOrder {
	private int contents;
	private boolean available=false;
	public synchronized void put(int value){
		while(available==true) {
			try {
				wait();
			}catch(InterruptedException e) { }
			
		}
		contents=value;
		available=true;
		notifyAll();
	}
	public synchronized int get() {
		while(available==false) {
			try {
				wait();
			}catch(InterruptedException e) { }
		}
		available=false;
		notifyAll();
		return contents;
	}
}