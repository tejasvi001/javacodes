package collectionframework;

import java.util.ArrayList;

public class ArrayListExample {

	public ArrayListExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList object = new ArrayList();
		ArrayList<String> _arrayList=new ArrayList<String>();
		_arrayList.add("Ram");
		_arrayList.add("Manish");
		_arrayList.add("Tushar");
		_arrayList.add("Rahul");
		_arrayList.add("Paras");
		_arrayList.add("Arsh");
		//displaying elements
		System.out.println("All Initial values "+_arrayList);	
		//Adding "Steve" to the 4th position
		//shifts elements to the right
		_arrayList.add(3,"Steve");
		//displaying elements
		System.out.println("After adding Steve "+_arrayList);
		//removing elements
		_arrayList.remove("Ram");//check for values
		_arrayList.remove(1);//check for index
		//displaying elements
		System.out.println("After Removing values "+_arrayList);
		//set- used for updation
		_arrayList.set(2,"Tom");
		//displaying elements
		System.out.println("After setting values "+_arrayList);
		//getting Values
		String str=_arrayList.get(2);
		System.out.println(" value at 2 is "+ str);
		//indexof
		System.out.println("Index of Manish is "+_arrayList.indexOf("Manish"));
		//size
		int sizeOfList=_arrayList.size();
		System.out.println("size is "+ sizeOfList);
		//searches element in a ArrayList
		boolean search=_arrayList.contains("Shyam");
		if(search) //equivalent as search==true
		{
			System.out.println("Yes I do have it");
		}else {
			System.out.println("Pardon I do not have it");
		}
		//for each removes the []
		for(String _str: _arrayList) {
			System.out.println(_str);
		}
		//clear
		_arrayList.clear();
		System.out.println(_arrayList);
	}

}
