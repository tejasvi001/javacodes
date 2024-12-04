package threads;

public class ThreadImplementation extends Thread{

	public void run() {
		System.out.println("Child Thread");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread obj=new ThreadImplementation();//up casting
		obj.start();//starting the child thread
		//Main Thread has higher priority so it will execute first
		System.out.println("Main Thread");
	}
}		
