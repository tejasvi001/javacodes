package threads;

public class ProcessThreads implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		System.out.println("Thread Started "+ t.getName()+" ----------------------------");
		for(int i = 0;i<5;i++) {
			System.out.println("Thread Runing "+(i+1)+"th time : "+ t.getName());
		}
		System.out.println("Thread Ended"+ t.getName()+" ----------------------------");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1=new Thread(new ProcessThreads(),"Thread 1");
		Thread thread2=new Thread(new ProcessThreads(),"Thread 2");
		Thread thread3=new Thread(new ProcessThreads(),"Thread 3");
		
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(5);
		thread3.setPriority(Thread.MAX_PRIORITY);
		thread1.start();
		thread2.start();
		thread3.start();
	}
}


//try {
//	Thread.sleep(5000);
//}catch(InterruptedException e) {
//	e.printStackTrace();
//}