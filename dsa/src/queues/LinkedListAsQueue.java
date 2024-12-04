package queues;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
public class LinkedListAsQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> obj=new LinkedList<>();
		obj.add("Cow");
		obj.addFirst("Dog");
		obj.addLast("Cat");
		System.out.println(obj);
		
	}

}
