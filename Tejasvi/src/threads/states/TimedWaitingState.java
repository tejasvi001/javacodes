package threads.states;

public class TimedWaitingState {

	public TimedWaitingState() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		Runnable runnable =new DemoWaiting();
		Thread t1=new Thread(runnable);
		
		
		t1.start();
		Thread.sleep(1000);
		System.out.println(t1.getState());
		System.out.println(t1.isAlive());
	}
}
class DemoWaiting implements Runnable{
	public void run() {
		
		try {
			Thread.sleep(5000);
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
	}
}