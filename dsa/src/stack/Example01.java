package stack;

import java.util.Iterator;
import java.util.Stack;

public class Example01 {
	public static void main(String... args) {
		Stack<String> stackOfCards=new Stack<>();
		stackOfCards.push("Jack");
		stackOfCards.push("Queen");
		stackOfCards.push("King");
		System.out.println("The Stack is :"+ stackOfCards);
		//peek
		System.out.println("peek"+stackOfCards.peek());
		//size
		System.out.println("Size is"+stackOfCards.size());
		//capacity
		System.out.println("Capacity "+stackOfCards.capacity());
		//isEmpty
		System.out.println("Checking if the Stack is Empty: "+stackOfCards.isEmpty());
		//search
		int pos=stackOfCards.search("Jacks");
		if(pos!=-1) {
			System.out.println("The value found");
		}
		else {
			System.out.println("The value is not found");
		}
		//pop
		System.out.println("Pop : "+stackOfCards.pop());
		//iterator
		Iterator<String> stackOfCardsIterator=stackOfCards.iterator();
		while(stackOfCardsIterator.hasNext()) {
			String name=stackOfCardsIterator.next();
			System.out.println(name);
		}
	}
}