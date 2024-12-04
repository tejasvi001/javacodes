package queues;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String > waitingQueue=new LinkedList<>();
		System.out.println("size of queue"+waitingQueue.size());
		//adding an element to the queue
		waitingQueue.add("Jack");
		waitingQueue.add("Queen");
		waitingQueue.add("King");
		waitingQueue.add("Ace");
		System.out.println("The queue is "+waitingQueue);
		//removing an element form the queue
		System.out.println(waitingQueue.remove());
		System.out.println("The queue is "+waitingQueue);
		//checking if queue is empty
		System.out.println(waitingQueue.isEmpty());
		//checking if queue contains an element
		System.out.println(waitingQueue.contains("Jack"));
		System.out.println(waitingQueue.contains("Ace"));
		//returning first element of the queue
		System.out.println(waitingQueue.element());
		System.out.println(waitingQueue.peek());
		//Iterating over a queue
		Iterator<String> waitingQueueIterator=waitingQueue.iterator();
		while(waitingQueueIterator.hasNext()) {
			String name=waitingQueueIterator.next();
			System.out.println(name);
		}
		for(String name: waitingQueue) {
			System.out.println(name);
		}
	}

}
