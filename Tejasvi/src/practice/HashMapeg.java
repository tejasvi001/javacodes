package practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapeg {
	public static void main(String args[]) {
		Map<Integer,String> obj =new HashMap<>();
		obj.put(6009,"Mansi");
		obj.put(6010,"Mohit");
		for(Map.Entry<Integer,String> obj1:obj.entrySet()) {
			System.out.println(obj1.getKey()+obj1.getValue());
		}
		for(Integer x:obj.keySet()) {
			System.out.println(x);
		}
		for(String name:obj.values()) {
			System.out.println(name);
		}
		System.out.println(obj);
		obj.clear();
		System.out.println(obj);
	}
}
