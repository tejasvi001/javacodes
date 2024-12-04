package threads;

public class Counter extends Thread {
	private int count=0;
	public synchronized void increment() {
		count++;
		if(count>0) {
			System.out.println("Rising Up");
		}
		System.out.println(Thread.currentThread().getName()+" --> "+count);
	}
	public synchronized void decrement() {
		count--;
		if(count<0) {
			System.out.println("Setting Down");
		}
		System.out.println(Thread.currentThread().getName()+" --> "+count);
	}
	public synchronized  int getCount() {
		return count;
	}
}
