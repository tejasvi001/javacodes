package collectionframework;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetExample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//Set<String> obj=new Set<String>();
		//Because Set is an interface and we can not instantiate it 
		HashSet<String> obj=new HashSet<String>();
		//adding values to the set
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Grapes");
		obj.add("Orange");
		obj.add("Plum");
		//displaying values
		System.out.println(obj);
		//adding duplicate value to the set
		obj.add("Plum");
		//displaying values
		System.out.println(obj);
		//Addition of null values
		obj.add(null);
		obj.add(null);
		//displaying values
		System.out.println(obj);
		//using iterator
		System.out.println("using Iterator");
		Iterator<String> It=obj.iterator();
		while(It.hasNext()) {
				System.out.println(It.next());
		}
		//using for each loop
		System.out.println("Using for each loop");
		for(String _str: obj) {
			System.out.println(_str);
		}
		//remove
		obj.remove("Grapes");
		//obj.remove(0) 
		//it does not execute and does not give error but we can not see it effect
		//it takes the 0 as value not a index
		//displaying values
		System.out.println(obj);
		
	}

}
