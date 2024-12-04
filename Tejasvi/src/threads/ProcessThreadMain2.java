package threads;
//With Join
public class ProcessThreadMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1=new Thread(new ProcessThreads(),"Thread 1");
		Thread thread2=new Thread(new ProcessThreads(),"Thread 2");
		Thread thread3=new Thread(new ProcessThreads(),"Thread 3");
		thread1.start();
		try {
			thread1.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread2.start();
		try {
			thread2.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread3.start();
		try {
			thread3.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
