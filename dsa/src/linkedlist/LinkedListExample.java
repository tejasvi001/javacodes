package linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> linkedListObject = new LinkedList<>();
		//LinkedList<String> linkedListObject = new LinkedList<>();
		linkedListObject.add("Jack");
		linkedListObject.add("Queen");
		linkedListObject.add("King");
		linkedListObject.add("Ace");
		System.out.println(linkedListObject);
		//opeartions
		//add element
		//access
		//change
		//remove
		//add
		linkedListObject.add(2,"Tim");
		System.out.println(linkedListObject);
		//access
		String name=linkedListObject.get(0);
		System.out.println(name);
		//set
		linkedListObject.set(2,"Carl");
		System.out.println(linkedListObject);
		//remove
		String remove =linkedListObject.remove(2);
		System.out.println(remove);
		System.out.println(linkedListObject);
	}
	/*
	 * 
	 */
}
