package practice;
import java.util.HashSet;
import java.util.Iterator;
public class HashSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> obj=new HashSet<>();
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Grapes");
		obj.add("Orange");
		obj.add("Plum");
		System.out.println(obj);
		obj.add("Apple");
		System.out.println(obj);
		obj.remove("plum");
		System.out.println(obj);
		Iterator itr=obj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
