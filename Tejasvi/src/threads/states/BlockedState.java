package threads.states;

import threads.ProcessThreads;

public class BlockedState extends Thread {

	public BlockedState() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		commonResource();
	}
	public synchronized void commonResource() {
		while(true) {
			//System.out.println(Thread.currentThread().getName());
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new BlockedState());
		Thread t2=new Thread(new BlockedState());
		t1.start();
		t2.start();
		
		System.out.println(t1.getState());
		System.out.println(t2.getState());
		System.exit(0);
	}

}
