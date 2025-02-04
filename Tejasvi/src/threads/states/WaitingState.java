package threads.states;

public class WaitingState implements Runnable {
	public static Thread t1;
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//System.out.println(Thread.currentThread().getState());
		Runnable runnable =new Demo();
		Thread t2=new Thread(runnable);
		
		t2.start();

		//System.out.println(Thread.currentThread().getState());
		System.out.println(t1.getState());
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnable =new WaitingState();
		 t1=new Thread(runnable);
		t1.start();
	}
}


class Demo implements Runnable{
	public void run() {
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
		System.out.println(WaitingState.t1.getState());
	}
}