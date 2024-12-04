package threads.states;

public class ThreadLifeCycleState implements Runnable {

	public ThreadLifeCycleState() {
		// TODO Auto-generated constructor stub
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnable =new ThreadLifeCycleState();
		Thread t=new Thread(runnable);
		System.out.println(	t.getState());
		t.start();
		System.out.println(	t.getState());
		
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
