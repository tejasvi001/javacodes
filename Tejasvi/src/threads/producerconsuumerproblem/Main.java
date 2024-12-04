package threads.producerconsuumerproblem;
//Producer class - to produce
//Consumer class - to consume
//main class - to run producer and consumer
//utility class - to perform wait and notify operations
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BurgerOrder obj=new BurgerOrder();
		Producer thread1 = new Producer(obj,1);
		Consumer thread2 = new Consumer(obj,1);
		thread1.start();
		thread2.start();
	}

}
