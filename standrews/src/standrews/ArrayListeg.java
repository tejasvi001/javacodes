package standrews;

import java.util.ArrayList;

public class ArrayListeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];
		
		ArrayList<Integer> arrayList=new ArrayList<>();
		
		arrayList.add(1);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		
		System.out.println(arrayList);
		for(Integer x: arrayList) {
			System.out.println(x);
		}
		arrayList.add(1,100);
		for(Integer x: arrayList) {
			System.out.println(x);
		}
		arrayList.remove(1);
		for(Integer x: arrayList) {
			System.out.println(x);
		}
		System.out.println(arrayList.contains(2));
		//a[0]
		System.out.println(arrayList.get(0));
		//a[0]=4000
		arrayList.set(0, 4000);
		//array.length
		System.out.println(arrayList.size());
		}
}







//    Problem-1 --- Reverse the ArrayList: - without using Reversed Fun.
//    Input : [ 3,45,6,7,8]
//    OUTPUT: [ 8,7,6,45,3]

//	   Problem-2 --- find duplicate numbers: --- LEET_CODE - 442
//	   Input : [ 3,9,8,7,5,3,8,1,8,7]
//	   OUTPUT: [ 3,8,7]

//		Problem-3 --- Check the ArrayList is sorted or not:
//		Input : [ 3,45,6,7,8]
//		OUTPUT: false
//		Input : [10,12,15,18,20]
//		OUTPUT: true

//		Problem 4- Transform the Matrix
//		1 2 3		1	2	3
//		4 5 6		41  52  63
// 		7 8 9		741 852 963

//		Problem 5- Find first name out of full name
//		Input: 		Sachin Tendulkar
//		Output:		Sachin















