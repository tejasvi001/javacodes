package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public HashMapExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String> data=new HashMap<>();
		//ADD OR UPDATE vALUE
		data.put(101,"Mercury");
		data.put(102,"Venus");
		data.put(103,"Earth");
		data.put(104,"Mars");
		data.put(105,"Jupiter");
		data.put(106,"Saturn");
		data.put(107,"Uranus");
		data.put(108,"Pluto");//wrong value
		data.put(108,"Neptune");//updates
		
		
		//size
		System.out.println("size is "+data.size());
		
		//retrieve -get()
		//if key is found
		System.out.println("data.get(101) "+data.get(101));
		//if key is not found
		System.out.println("data.get(100) "+data.get(100));
		//containsKey
		System.out.println("contains key" +data.containsKey(100));
		//remove 
		System.out.println(data.remove(108));
		//printing values by 5 ways 
		//1. print statements
		System.out.println(data);
		//2. entrySet()
		for(Map.Entry<Integer,String> entry : data.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		//3. KeySet()
		for(Integer key: data.keySet()) {
			System.out.println(key);
		}
		//4. Values()
		for(String value: data.values()) {
			System.out.println(value);
		}
		//5. ForEach()
		
		//get hashcode of the keys
		for(Integer key: data.keySet()) {
			System.out.println("HASHCODE OF KEY :"+key +" : "+key.hashCode());
		}
		//System.out.println(Integer.SIZE);
	}

}
