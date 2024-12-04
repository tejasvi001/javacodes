package stack;

import java.util.Iterator;
import java.util.Stack;

public class Examplee {
	public static void main(String[] args) {
        // Creating a Stack
        Stack<String> stackOfCards = new Stack<>();

        // Pushing new items to the Stack
        stackOfCards.push("Jack");
        stackOfCards.push("Queen");
        stackOfCards.push("King");
        stackOfCards.push("Ace");

        System.out.println("Stack => " + stackOfCards);

        
        // Check if the Stack is empty
        System.out.println("Is Stack empty? : " + stackOfCards.isEmpty());
        
        // Find the size of Stack
        System.out.println("Size of Stack : " + stackOfCards.size());
        
        
        
        // Popping items from the Stack
        String cardAtTop = stackOfCards.pop();  // Throws EmptyStackException if the stack is empty
        System.out.println("Stack.pop() => " + cardAtTop);
        System.out.println("Current Stack => " + stackOfCards);
        System.out.println();

        
        // Get the item at the top of the stack without removing it
        cardAtTop = stackOfCards.peek();
        System.out.println("Stack.peek() => " + cardAtTop);
        System.out.println("Current Stack => " + stackOfCards);

        
        
        // Search for an element
        // The search() method returns the 1-based position of the element from the top of the stack
        // It returns -1 if the element was not found in the stack
        int position = stackOfCards.search("Queen");

        if(position != -1) {
            System.out.println("Found the element \"Queen\" at position : " + position);
        } else {
            System.out.println("Element not found");
        }
        
        
        
        
        /*
         * Iterating over a Stack
         */
        
        Iterator<String> cardsIterator = stackOfCards.iterator();
        
        while (cardsIterator.hasNext()) {
        
        	String card = cardsIterator.next();
            System.out.println(card);
        }
        //Capacity of the stack 
       System.out.println("Stack Capacity"+ stackOfCards.capacity());
       
	}
}
